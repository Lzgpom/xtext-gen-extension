package org.bamol.dsl.gen.xtext.lib

import org.eclipse.xtext.util.JUnitVersion
import org.eclipse.xtext.util.JavaVersion
import org.eclipse.xtext.xtext.wizard.BuildSystem
import org.eclipse.xtext.xtext.wizard.LanguageServer
import org.eclipse.xtext.xtext.wizard.LineDelimiter
import org.eclipse.xtext.xtext.wizard.ProjectLayout
import org.eclipse.xtext.xtext.wizard.SourceLayout

object XtextDefaults {
    val PROJECT_LAYOUT = ProjectLayout.HIERARCHICAL
    val SOURCE_LAYOUT = SourceLayout.MAVEN
    val BUILD_SYSTEM = BuildSystem.GRADLE
    val JAVA_VERSION = JavaVersion.JAVA11
    val JUNIT_VERSION = JUnitVersion.JUNIT_5
    val LANGUAGE_SERVER = LanguageServer.FATJAR
    val ENCODING = Charsets.UTF_8
    val LINE_DELIMITER: String = LineDelimiter.UNIX.value
}