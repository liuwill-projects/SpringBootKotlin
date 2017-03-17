package com.liuwill.demo.kotlinBoot.test.integration

import com.liuwill.demo.kotlinBoot.controllers.HomeController
import org.hamcrest.CoreMatchers.containsString
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.http.MediaType
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*

@RunWith(SpringJUnit4ClassRunner::class)
@WebMvcTest(HomeController::class)
class HomeControllerStandaloneTest {

    //private val wac: WebApplicationContext? = null

    @Autowired
    private var mvc: MockMvc? = null

    @Before
    @Throws(Exception::class)
    fun setUp() {
        //mvc = MockMvcBuilders.standaloneSetup(HomeController()).build()
    }

    @Test
    @Throws(Exception::class)
    fun indexTest() {
        mvc!!.perform(MockMvcRequestBuilders.get("/index").accept(MediaType.TEXT_HTML))
                .andExpect(status().isOk)
                .andExpect(model().attributeExists("data"))
                .andExpect { content().string(containsString("")) }
    }
}