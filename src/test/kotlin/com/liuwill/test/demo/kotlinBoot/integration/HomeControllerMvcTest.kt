package com.liuwill.test.demo.kotlinBoot.integration

import com.liuwill.demo.kotlinBoot.SpringBootKotlinApplication
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.model
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.view
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import org.junit.Before
import org.junit.Test
import org.springframework.test.web.servlet.MockMvc
import org.springframework.web.context.WebApplicationContext
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType

import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultHandlers.print
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*


/**
 * Created by videopls on 2017/3/17.
 */
@RunWith(SpringJUnit4ClassRunner::class) // SpringJUnit支持，由此引入Spring-Test框架支持！
@SpringBootTest(classes = arrayOf(SpringBootKotlinApplication::class), webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HomeControllerMvcTest {
    @Autowired
    private val wac: WebApplicationContext? = null

    //@Autowired
    private var mvc: MockMvc? = null

    @Before
    @Throws(Exception::class)
    fun setUp() {
        mvc = MockMvcBuilders.webAppContextSetup(wac!!).build()
    }

    @Test
    @Throws(Exception::class)
    fun index() {
        this.mvc!!.perform(get("/index")
                .accept(MediaType.TEXT_HTML))
                .andExpect(status().isOk())
                .andExpect(view().name("index"))
                .andExpect(model().attributeExists("data"))
                .andExpect(model().attribute("data","success"))
                .andDo(print())
    }
}