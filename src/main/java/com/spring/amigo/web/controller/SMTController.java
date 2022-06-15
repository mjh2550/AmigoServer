package com.spring.amigo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SMTController {

    @GetMapping("SpringMessageTest")
    public ModelAndView SMT(){
        ModelAndView mv = new ModelAndView("SpringMessageTest");
        mv.addObject("price", 1000);
        return mv;
    }
}
