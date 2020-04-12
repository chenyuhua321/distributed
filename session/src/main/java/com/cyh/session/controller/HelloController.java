package com.cyh.session.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Chenyuhua
 * @date 2020/4/12 16:42
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    public String hello() {
        return "login";
    }
}
