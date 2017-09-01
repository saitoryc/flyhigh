package com.saitoryc.flyhigh.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by UU051681 on 2017/08/24.
 */
@Controller
@RequestMapping("flyways")
public class FlywayController {

    @RequestMapping(value = "/new/", method = RequestMethod.GET)
    public String new_edit() {
        return "new";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String create() {
        return "redirect:/flyways";
    }

    @RequestMapping(value = "/{userId}/edit/", method = RequestMethod.GET)
    public String edit(@PathVariable("userId") String userId) {
        return "edit";
    }

    @RequestMapping(value = "/{userId}", method = RequestMethod.PUT)
    public String update(@PathVariable("userId") String userId) {
        return "redirect:/flyways";
    }

    @RequestMapping(method = RequestMethod.GET)
    public String list() {
        return "list";
    }

    @RequestMapping(value = "/{userId}/", method = RequestMethod.GET)
    public String show(@PathVariable("userId") String userId) {
        return "show";
    }


}
