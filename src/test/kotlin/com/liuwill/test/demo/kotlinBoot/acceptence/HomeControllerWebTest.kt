package com.liuwill.test.demo.kotlinBoot.acceptence

import com.liuwill.demo.kotlinBoot.SpringBootKotlinApplication
import org.hamcrest.Matchers.*
import org.junit.Assert.assertThat
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.springframework.boot.context.embedded.LocalServerPort
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.beans.factory.annotation.Autowired
import org.junit.Before
import org.junit.Test
import java.net.URL

/**
 * Created by videopls on 2017/3/17.
 */
@RunWith(SpringJUnit4ClassRunner::class) // SpringJUnit支持，由此引入Spring-Test框架支持！
@SpringBootTest(classes = arrayOf(SpringBootKotlinApplication::class), webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HomeControllerWebTest {
    @LocalServerPort
    private val port: Int = 0

    private var base: URL? = null

    @Autowired
    private val restTemplate: TestRestTemplate? = null

    @Before
    @Throws(Exception::class)
    fun setUp() {
        this.base = URL("http://localhost:$port/index.html")
    }

    @Test
    @Throws(Exception::class)
    fun getIndex() {
        val response = restTemplate?.getForEntity(base.toString(), String::class.java)
        assertThat(response?.statusCodeValue, equalTo(200))
        assertThat(response?.body,containsString("<title>Spring Boot Kotlin</title>"))
    }
}