package com.liuwill.demo.kotlinBoot.controllers

import org.springframework.stereotype.Controller
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody

/**
 * Created by videopls on 2017/3/17.
 */
@Controller
@RequestMapping(value = "/")
class HomeController {
    @RequestMapping(value = "/index",method = arrayOf(RequestMethod.GET))
    fun index(pageModal: ModelMap):String{
        pageModal["data"] = "success"
        return "index"
    }

    @RequestMapping(value = "/",method = arrayOf(RequestMethod.GET))
    fun home(pageModal: ModelMap):String{
        pageModal["data"] = "success"
        return "index"
    }
}