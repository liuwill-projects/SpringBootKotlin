package com.liuwill.demo.kotlinBoot.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by videopls on 2017/3/16.
 */
@RestController
@RequestMapping(value = "api/show")
public class ShowController {
    @RequestMapping(value = "",method = {RequestMethod.GET,RequestMethod.PUT},consumes = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public Map index(@RequestBody HashMap<Object,Object> reqBody){
        return reqBody;
    }
}
