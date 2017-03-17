package com.liuwill.test.demo.kotlinBoot.integration

import com.liuwill.demo.kotlinBoot.controllers.HomeController
import org.hamcrest.CoreMatchers.containsString
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringBootConfiguration
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import org.springframework.web.context.WebApplicationContext

@RunWith(SpringJUnit4ClassRunner::class)
@SpringBootTest
@SpringBootConfiguration
class HomeControllerStandaloneTest {
    @Autowired
    private val wac: WebApplicationContext? = null

    private var mvc: MockMvc? = null

    @Before
    @Throws(Exception::class)
    fun setUp() {
        mvc = MockMvcBuilders.standaloneSetup(HomeController()).build()
    }

    @Test
    @Throws(Exception::class)
    fun getData() {
        mvc!!.perform(MockMvcRequestBuilders.get("/index").accept(MediaType.TEXT_HTML))
                .andExpect(status().isOk)
                .andExpect(model().attributeExists("data"))
                .andExpect { content().string(containsString("")) }
    }
}