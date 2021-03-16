package com.ddogring.dec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author DdogRing
 * @date 2021/3/16 08:50
 * @description 首页
 */
@Controller
public class IndexController {

    @RequestMapping(value = {"/index", "", "/"})
    public String index() {
        return "index";
    }
}
