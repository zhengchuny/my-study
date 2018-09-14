package com.study.luxin

import spock.lang.Specification

class GroovyTest extends Specification {

  def "mytset"() {
    given:
    String a = ""
    when:
    a = "dsfsd"
    then:
    1 == 1
  }
}
