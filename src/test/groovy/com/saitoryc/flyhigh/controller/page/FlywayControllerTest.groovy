package com.saitoryc.flyhigh.controller.page

import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import spock.lang.Specification

/**
 *
 * Created by UU051681 on 2017/08/24.
 */
class FlywayControllerTest extends Specification {

    MockMvc mockMvc

    void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(new FlywayController()).build()
    }

    def "New_edit"() {
        expect:
        mockMvc.perform(MockMvcRequestBuilders.get("/flyways/new/"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("new"))
    }

    def "Create"() {
    }

    def "Edit"() {
        expect:
        mockMvc.perform(MockMvcRequestBuilders.get("/flyways/1/edit/"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("edit"))
    }

    def "Update"() {
    }

    def "List"() {
        expect:
        mockMvc.perform(MockMvcRequestBuilders.get("/flyways"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("list"))
    }

    def "Show"() {
        expect:
        mockMvc.perform(MockMvcRequestBuilders.get("/flyways/1/"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("show"))
    }
}
