package org.bamol.dsl.gen.xtext.entity

import org.eclipse.emf.ecore.EClass
import org.eclipse.xtext.xtext.wizard.EPackageInfo
import org.eclipse.xtext.xtext.wizard.LanguageDescriptor
import org.eclipse.xtext.xtext.wizard.WizardConfiguration
import java.io.File

/**
 * The xtext settings that can be changed.
 *
 * @param targetDirectory The directory where the projects are going to be created.
 * @param languageName The language name.
 * @param baseName The base name of the project.
 * @param fileExtensions The file extensions of the dsl.
 * @param packageInfos The set of [EPackageInfo] for the ecore configuration.
 * @param defaultPackage The default [EPackageInfo] for the ecore configuration.
 * @param rootElementClass The [root element class][EClass] for the ecore configuration.
 *
 * @see org.bamol.dsl.gen.ecore.EPackageInfoLoader
 */
class XtextConfiguration(
    private val targetDirectory: File,
    private val languageName: String,
    private val baseName: String,
    private val fileExtensions: Iterable<String>,
    private val packageInfos: Set<EPackageInfo>,
    private val defaultPackage: EPackageInfo,
    private val rootElementClass: EClass
) {

    init {
        validateLanguageName(languageName)
    }

    /**
     * Validates the language name. The last name of the language name has to be
     * capitalized in order to prevent an error in the xtext project. For example:
     * `org.bamol.Dsl`
     *
     * @throws IllegalArgumentException if it is not valid.
     */
    private fun validateLanguageName(languageName: String) {
        if (languageName.split(".").last().first().isLowerCase()) {
            throw IllegalArgumentException("The first letter has of the last name of the language has to be capitalized.")
        }
    }

    /**
     * Convert this to a partially filled [WizardConfiguration].
     *
     * @return The [WizardConfiguration] created.
     */
    fun toWizardConfiguration(): WizardConfiguration {
        val config = WizardConfiguration()

        config.rootLocation = targetDirectory.absolutePath
        config.baseName = baseName

        // Configuring the language
        config.language.name = languageName
        config.language.fileExtensions = LanguageDescriptor.FileExtensions(fileExtensions)

        // Configuring the ecore2xtext
        config.ecore2Xtext.ePackageInfos.addAll(packageInfos)
        config.ecore2Xtext.defaultEPackageInfo = defaultPackage
        config.ecore2Xtext.rootElementClass = rootElementClass

        return config
    }
}