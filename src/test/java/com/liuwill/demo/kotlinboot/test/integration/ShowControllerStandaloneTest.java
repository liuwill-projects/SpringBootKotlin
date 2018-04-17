package com.liuwill.demo.kotlinboot.test.integration;

/**
 * Created by liuwill<liuwill@live.com> on 2017/3/17.
 */

import com.liuwill.demo.kotlinboot.controllers.ShowController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(ShowController.class)
public class ShowControllerStandaloneTest {


    private WebApplicationContext wac;
    @Autowired
    private MockMvc mvc;

    @Before
    public void setUp() throws Exception {
        //mvc = MockMvcBuilders.standaloneSetup(new DataController()).build();
    }

    @Test
    public void getData() throws Exception {
        String expectStr = "{\"msg\":\"hello\"}";
        mvc.perform(
            MockMvcRequestBuilders.put("/v1/api/data")
                .contentType(MediaType.APPLICATION_JSON)
                .content(expectStr)
                .accept(MediaType.APPLICATION_JSON)
            )
            .andExpect(status().isOk())
            .andExpect(content().json(expectStr))
            .andDo(print());
    }
}