package com.saitoryc.flyhigh.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by UU051681 on 2017/08/24.
 */
@Controller
@RequestMapping("list")
public class ListContoller {

    @RequestMapping
    public String index() {
        return "list";
    }
}
