package org.bamol.dsl.gen.xtext

import org.bamol.dsl.gen.xtext.entity.XtextConfiguration
import org.bamol.dsl.gen.xtext.lib.XtextDefaults
import org.eclipse.xtext.xtext.wizard.WizardConfiguration
import org.eclipse.xtext.xtext.wizard.cli.CliProjectsCreator

object ProjectCreator {

    /**
     * Creates the projects with given [XtextConfiguration]
     */
    fun create(xtextConfiguration: XtextConfiguration) {
        val config = createXtextConfiguration(xtextConfiguration)
        val creator = CliProjectsCreator()

        creator.lineDelimiter = config.lineDelimiter
        creator.createProjects(config)
    }

    /**
     * Creates a [WizardConfiguration] based on the given [XtextConfiguration] and the default settings
     * defined on [XtextDefaults].
     *
     * @return The [WizardConfiguration] created.
     */
    private fun createXtextConfiguration(xtextConfiguration: XtextConfiguration): WizardConfiguration {
        val config = xtextConfiguration.toWizardConfiguration()

        // Setting the default xtext configuration.
        config.projectLayout = XtextDefaults.PROJECT_LAYOUT
        config.sourceLayout = XtextDefaults.SOURCE_LAYOUT
        config.preferredBuildSystem = XtextDefaults.BUILD_SYSTEM
        config.javaVersion = XtextDefaults.JAVA_VERSION
        config.junitVersion = XtextDefaults.JUNIT_VERSION
        config.encoding = XtextDefaults.ENCODING
        config.lineDelimiter = XtextDefaults.LINE_DELIMITER
        config.languageServer = XtextDefaults.LANGUAGE_SERVER

        // Setting enable projects. This should be the only ones needed.
        config.runtimeProject.isEnabled = true
        config.ideProject.isEnabled = true

        return config
    }
}