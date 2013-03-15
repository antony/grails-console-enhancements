import uk.co.desirableobjects.console.enhancements.ConsoleEnhancer

class ConsoleEnhancementsGrailsPlugin {

    def version = "1.0"
    def grailsVersion = "1.3.1 > *"
    def dependsOn = [:]
    def pluginExcludes = [
            "grails-app/views/error.gsp"
    ]
	def observe = ["*"]

    // TODO Fill in these fields
    def author = "Antony Jones (Desirable Objects)"
    def authorEmail = "aj@desirableobjects.co.uk"
    def title = "Grails console enhancements"
    def description = 'Enhances the grails console output for better visibility'

    def documentation = "http://grails.org/plugin/grails-console-enhancements"

    def doWithDynamicMethods = { ctx ->
        ConsoleEnhancer.enhanceConsole()
    }

    def onChange = { event ->
	    ConsoleEnhancer.enhanceConsole()
    }

}
