package com.study.luxin

import com.alibaba.fastjson.JSON
import com.google.common.collect.Maps
import com.study.luxin.curl.HttpInvoker
import spock.lang.Specification

class GroovyTest extends Specification {


    def "post_test"() {

        given:
        def url = 'http://10.112.32.47:8006/fs-paas-auth/roleInfo'
        String body = "{\"authContext\":{\"userId\":\"1000\",\"appId\":\"CRM\",\"tenantId\":\"71568\"}}"
        String body1 = "{\"authContext\":{\"userId\":\"1000\",\"appId\":\"CRM\",\"tenantId\":\"71568\"}}"
        def header = Maps.newHashMap()

        when:
        def post = HttpInvoker.post(url, header, bodyParam)
        def response = new String(post)
        println response

        def object = JSON.parse(response)
        def map = (Map) object
        def result = map.get("result")


        where:
        bodyParam || result
        body      || null
        body1     || null
    }


}
