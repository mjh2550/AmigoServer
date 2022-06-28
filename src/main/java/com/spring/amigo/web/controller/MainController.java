package com.spring.amigo.web.controller;

import com.spring.amigo.web.service.main.MainService;
import com.spring.amigo.model.MainVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

@Controller
public class MainController {

    private final MainService mainService;

    public MainController(MainService mainService) {
        this.mainService = mainService;
    }

    @GetMapping("")
    public ModelAndView home(){
        ModelAndView mv = new ModelAndView("home");     //View page Name
        mv.addObject("param","param1");     // param Name
        return mv;
    }

    @GetMapping("index")
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView("index");     //View page Name
        mv.addObject("param","param1");     // param Name
        return mv;
    }

    @PostMapping("getAll.do")
    public ModelAndView getAll(HttpServletRequest httpServletRequest){
        ModelAndView mv = new ModelAndView("JsonView");
        ArrayList<MainVO> getAllList = mainService.getAllList();
        mv.addObject("getAllList",getAllList);
        return mv;
    }
}
