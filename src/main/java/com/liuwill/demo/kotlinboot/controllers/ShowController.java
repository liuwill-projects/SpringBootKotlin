package com.liuwill.demo.kotlinboot.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liu will on 2017/3/16.
 */
@RestController
@RequestMapping(value = "v1/api/data")
public class ShowController {
    @RequestMapping(
            value = "",
            method = {RequestMethod.PUT},
            consumes = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public Map index(@RequestBody HashMap<Object, Object> reqBody) {
        return reqBody;
    }
}
