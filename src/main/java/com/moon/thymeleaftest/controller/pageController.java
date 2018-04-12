package com.moon.thymeleaftest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class pageController {
    @RequestMapping("/")
    public String page() {
        return "system/index";
    }

    @RequestMapping("/redirect")
    public String page2() {
        return "redirect/redirect";
    }

    @RequestMapping("/model")
    public String page3(Model model) {
        model.addAttribute("name", "seawater");
        return "hello";
    }
}
