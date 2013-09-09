grails.servlet.version = "2.5" // Change depending on target container compliance (2.5 or 3.0)
grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.target.level = 1.6
grails.project.source.level = 1.6
grails.project.war.file = "target/${appName}.war"

grails.project.dependency.resolution = {
    inherits("global")
    log "error" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    checksums true // Whether to verify checksums on resolve
    legacyResolve false // whether to do a secondary resolve on plugin installation, not advised and here for backwards compatibility

    repositories {
        inherits true // Whether to inherit repository definitions from plugins

        grailsPlugins()
        grailsHome()
        grailsCentral()
        mavenLocal()
        mavenCentral()
        mavenRepo "http://dl.bintray.com/upennlib/metridoc"
        mavenRepo "http://dl.bintray.com/upennlib/maven"
        mavenRepo "http://jcenter.bintray.com/"
        mavenRepo "https://metridoc.googlecode.com/svn/maven/repository"
    }

    plugins {
        //add other plugins here, ie
        compile ":metridoc-core:0.7.7"
        compile (":metridoc-counter:0.3") {
            excludes "metridoc-core"
        }
        compile (":metridoc-illiad:0.3.5") {
            excludes "metridoc-core"
        }
        compile (":metridoc-rid:0.3.3") {
            excludes "metridoc-core"
        }
        compile ":google-visualization:0.6.2"
        build ":tomcat:$grailsVersion"
        build ":squeaky-clean:0.1.1"
    }
}
