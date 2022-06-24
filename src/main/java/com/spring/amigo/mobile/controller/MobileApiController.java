package com.spring.amigo.mobile.controller;

import com.spring.amigo.mobile.service.api.MobileApiService;
import com.spring.amigo.model.TestVO;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@ApiOperation("api test")
@RestController
public class MobileApiController {

    private final MobileApiService mobileApiService;

    public MobileApiController(MobileApiService mobileApiService) {
        this.mobileApiService = mobileApiService;
    }


    @ResponseBody
    @ApiOperation(value="value", notes="notes. 메모는 여기로")
    @ApiResponses({
            @ApiResponse(code = 200, message = "API 정상 작동"),
            @ApiResponse(code = 500, message = "서버 에러")
    })
    @GetMapping("/mobile/v1/api/getAllList.do")
    public ArrayList<TestVO> getAllList(){
        return mobileApiService.getAllList();
    }
}
