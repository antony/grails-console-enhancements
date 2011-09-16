package uk.co.desirableobjects.console.enhancements

import grails.plugin.spock.UnitSpec
import spock.lang.Unroll

class ANSIPrintLnSpec extends UnitSpec {

    @Unroll('Println can print in #colour')
    def 'Println is auto decorated with colour methods'() {

        given:
            ANSIPrintLn printer = new ANSIPrintLn()

        expect:
            printer."${colour}"('hello') == "\033${outputCode}hello\033[0m"

        where:
            colour   | outputCode
            'red'    | ANSICode.FOREGROUND_RED
            'green'  | ANSICode.FOREGROUND_GREEN

    }

    def 'Println can print without any arguments'() {

        given:
            ANSIPrintLn printer = new ANSIPrintLn()

        expect:
            printer == "\033[31mhello\033[0m"

    }

}
