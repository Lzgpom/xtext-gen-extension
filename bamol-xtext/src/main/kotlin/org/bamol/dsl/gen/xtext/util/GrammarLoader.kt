package org.bamol.dsl.gen.xtext.util

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl
import org.eclipse.xtext.Grammar
import org.eclipse.xtext.GrammarUtil
import org.eclipse.xtext.XtextStandaloneSetup
import org.eclipse.xtext.resource.XtextResourceSet
import java.io.File
import java.net.URL

/**
 * Utils object for loading [Grammar] from a xtext file.
 */
object GrammarLoader {

    private val resourceSet = XtextResourceSet()

    init {
        XtextStandaloneSetup.doSetup()
        Resource.Factory.Registry.INSTANCE.protocolToFactoryMap["classpath"] =
            object : ResourceFactoryImpl() {
                override fun createResource(uri: URI): Resource? {
                    val resource: URL? = this.javaClass.getResource(uri.path())
                    return XtextResourceSet().createResource(URI.createURI(resource!!.toExternalForm()))
                }
            }
    }

    /**
     * Loads the Xtext [Grammar] given the xtext file definition.
     *
     * @param file The xtext file
     * @return The [Grammar] the grammar loaded.
     */
    fun load(file: File): Grammar {
        val uri = URI.createFileURI(file.absolutePath)
        val resource = resourceSet.getResource(uri, true)

        return GrammarUtil.getGrammar(resource.contents[0])
    }
}
