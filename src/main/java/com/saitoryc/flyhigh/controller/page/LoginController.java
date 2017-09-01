package com.saitoryc.flyhigh.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by UU051681 on 2017/08/22.
 */
@Controller
@RequestMapping("login")
public class LoginController {

//    @GetMapping
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String login() {
        return "login";
    }
}
