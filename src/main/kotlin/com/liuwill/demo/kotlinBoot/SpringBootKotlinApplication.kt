package com.liuwill.demo.kotlinBoot

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * Created by liuwill on 2017/3/15.
 */
@SpringBootApplication
open class SpringBootKotlinApplication

fun main(args: Array<String>){
    SpringApplication.run(SpringBootKotlinApplication::class.java,*args)
}