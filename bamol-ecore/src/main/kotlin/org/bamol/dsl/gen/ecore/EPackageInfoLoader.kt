package org.bamol.dsl.gen.ecore

import com.google.common.collect.Sets
import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl
import org.eclipse.xtext.xtext.wizard.EPackageInfo
import java.io.File


object EPackageInfoLoader {

  /**
   * Find the EPackageInfo given a name. This function is usually used to
   * set the [org.eclipse.xtext.xtext.wizard.Ecore2XtextConfiguration.defaultEPackageInfo]
   *
   * @param infos The list of [EPackageInfo] to search through
   * @param name The name of the [EPackageInfo] to look for.
   * @return The [EPackageInfo] with the given name or `null` if not found.
   */
  fun findEPackageInfoByName(infos: Set<EPackageInfo>, name: String): EPackageInfo? {
    for (info in infos) {
      if (info.ePackage.name == name) {
        return info
      }
    }

    return null
  }

  /**
   * Finds the [EClass] given its name in the [EPackageInfo]. This function is usually used to
   * set the [org.eclipse.xtext.xtext.wizard.Ecore2XtextConfiguration.rootElementClass].
   *
   * @param info The [EPackageInfo] to look into.
   * @param name The name of the [EClass] to look for.
   * @return The [EClass] with the given name or `null` if not found.
   */
  fun findEClassByName(info: EPackageInfo, name: String): EClass? {
    for (classifier in info.ePackage.eClassifiers) {
      if (classifier is EClass && classifier.name == name) {
        return classifier
      }
    }

    return null
  }

  /**
   * Loads and creates the EPackageInfos from a GenModel. Note that the .genmodel
   * and the related .ecore file should be in the root, this is to prevent a bug
   * that the .ecore file is not found.
   *
   * @param genModel The genmodel file to load.
   * @return A list of [EPackageInfo] loaded.
   */
  fun createEPackageInfosFromGenModel(genModel: File): Set<EPackageInfo> {
    val resourceSet: ResourceSet = createResourceSet()
    val genModelURI = URI.createFileURI(genModel.absolutePath)
    val resource = resourceSet.getResource(genModelURI, true)
    val ePackageInfos: MutableSet<EPackageInfo> = Sets.newHashSet()
    val i = resource.allContents
    while (i.hasNext()) {
      val next = i.next()
      if (next is GenPackage) {
        val genPackage: GenPackage = next
        val ePackage: EPackage = genPackage.ecorePackage
        val importURI: URI = if (ePackage.eResource() == null) {
          URI.createURI(ePackage.nsURI)
        } else {
          ePackage.eResource().uri
        }
        val ePackageInfo = EPackageInfo(
            ePackage, importURI, genModelURI, genPackage
            .qualifiedPackageInterfaceName, genPackage.genModel.modelPluginID
        )
        ePackageInfos.add(ePackageInfo)
      } else if (next !is GenModel) {
        i.prune()
      }
    }
    return ePackageInfos
  }

  private fun createResourceSet(): ResourceSet {
    val resourceSet = ResourceSetImpl()
    val ecoreFactory = EcoreResourceFactoryImpl()

    val registry = resourceSet.resourceFactoryRegistry
    val map = registry.extensionToFactoryMap
    map["ecore"] = ecoreFactory
    map["genmodel"] = ecoreFactory

    //Inits the GenModelPackage
    GenModelPackage.eINSTANCE
    return resourceSet
  }
}