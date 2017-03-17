package com.liuwill.demo.kotlinBoot.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

/**
 * Created by liuwill on 2017/3/15.
 */
@RestController
@RequestMapping(value = "/api/data")
class DataController {

    @RequestMapping(value = "",method = arrayOf(RequestMethod.GET,RequestMethod.PUT))
    fun index():Map<String,Any>{
        val resultMap = HashMap<String,Any>()

        resultMap["status"] = true
        resultMap["code"] = "100010"
        resultMap["msg"] = "success"
        resultMap["data"] = "data"
        return resultMap
    }

    @RequestMapping(value = "show",method = arrayOf(RequestMethod.PUT),consumes = arrayOf(MediaType.APPLICATION_JSON_UTF8_VALUE))
    fun test(@RequestBody reqMap:Map<Any,Any>):Map<Any,Any>{
        return reqMap
    }
}