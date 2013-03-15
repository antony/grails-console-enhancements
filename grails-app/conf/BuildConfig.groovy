grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"

grails.release.scm.enabled=false

grails.project.dependency.resolution = {
    inherits("global") {
    }
    log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    repositories {
        grailsPlugins()
        grailsHome()
        grailsCentral()
        mavenLocal()
        mavenCentral()
        mavenRepo "http://snapshots.repository.codehaus.org"
        mavenRepo "http://repository.codehaus.org"
    }
	dependencies {
		test "org.spockframework:spock-grails-support:0.7-groovy-2.0"
	}
    plugins {
	    test(":spock:0.7") {
		    exclude "spock-grails-support"
		    export = false
	    }
        build(':release:1.0.0.RC3') {
            export = false
        }
    }
}
