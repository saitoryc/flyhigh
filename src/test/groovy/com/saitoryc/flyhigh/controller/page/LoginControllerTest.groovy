package com.saitoryc.flyhigh.controller.page

import org.springframework.test.web.servlet.MockMvcBuilder
import org.springframework.test.web.servlet.MvcResult
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers
import org.springframework.test.web.servlet.setup.MockMvcBuilders

//import static org.mockito.Matchers.*
//import static org.mockito.Mockito.*
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.web.servlet.MockMvc

import com.saitoryc.flyhigh.ApplicationContext
import spock.lang.Specification
import spock.lang.Unroll

/**
 *
 * Created by UU051681 on 2017/08/22.
 */
@WebMvcTest(LoginController)
@ContextConfiguration(classes = ApplicationContext)
@Unroll
class LoginControllerTest extends Specification {

    @Autowired
    MockMvc mockMvc

    def setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(new LoginController()).build()
    }

    def "index_ログイン画面表示"() {

        expect:
        mockMvc.perform(MockMvcRequestBuilders.get("/login/"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("login"))
    }
}
