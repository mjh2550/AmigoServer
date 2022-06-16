package com.spring.amigo.mobile.controller;

import com.spring.amigo.mobile.service.api.MobileApiService;
import com.spring.amigo.model.TestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class MobileApiController {

    private final MobileApiService mobileApiService;

    public MobileApiController(MobileApiService mobileApiService) {
        this.mobileApiService = mobileApiService;
    }

    @ResponseBody
    @GetMapping("mobile/api/getAllList.do")
    public ArrayList<TestVO> getAllList(){
        return mobileApiService.getAllList();
    }
}
