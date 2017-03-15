package com.liuwill.demo.kotlinBoot.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

/**
 * Created by liuwill on 2017/3/15.
 */
@RestController
@RequestMapping(value = "api/data")
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
}