package com.spring.amigo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 2022-06-15
 * SpringMessageTest - 삭제예정
 * @author 문호환
 * @param
 * @return model
 *
 */

@Controller
public class SMTController {

    @GetMapping("SpringMessageTest")
    public ModelAndView SMT(){
        ModelAndView mv = new ModelAndView("SpringMessageTest");
        mv.addObject("price", 1000);
        return mv;
    }
}
