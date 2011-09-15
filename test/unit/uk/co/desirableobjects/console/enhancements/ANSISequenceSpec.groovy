package uk.co.desirableobjects.console.enhancements

import static uk.co.desirableobjects.console.enhancements.ANSICode.*
import grails.plugin.spock.UnitSpec
import spock.lang.Unroll

class ANSISequenceSpec extends UnitSpec {

    @Unroll('Format string with #codes')
    def 'String formatted with colour'() {

        when:
            String output = new ANSISequence(codes).format('test message')

        then:
            output == expectedOutput

        where:
            codes                                 | expectedOutput
            [FOREGROUND_RED]                      | '\033[31mtest message\033[0m'
            [FOREGROUND_RED, BOLD_ON]             | '\033[31m\033[1mtest message\033[0m'

    }

}
