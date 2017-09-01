package com.saitoryc.flyhigh.controller.page

import com.saitoryc.flyhigh.ApplicationContext
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.mock.web.MockRequestDispatcher
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import spock.lang.Specification
import spock.lang.Unroll

/**
 *
 * Created by UU051681 on 2017/08/24.
 */
@WebMvcTest(ListContoller)
@ContextConfiguration(classes = ApplicationContext)
@Unroll
class ListContollerTest extends Specification {

    MockMvc mockMvc

    void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(new ListContoller()).build()
    }

    def "index_flyway一覧表示"() {

        expect:
        mockMvc.perform(MockMvcRequestBuilders.get("/list/"))
        .andExpect(MockMvcResultMatchers.status().isOk())
        .andExpect(MockMvcResultMatchers.view().name("list"))
    }
}
