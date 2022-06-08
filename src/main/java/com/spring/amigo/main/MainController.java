package com.spring.amigo.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    private ModelAndView mv;

    @GetMapping("test.do")
    public ModelAndView home(){
        mv = new ModelAndView("test");

        return mv;
    }
}
