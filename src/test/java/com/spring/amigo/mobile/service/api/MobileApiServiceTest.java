package com.spring.amigo.mobile.service.api;

import com.spring.amigo.model.TestVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MobileApiServiceTest {

    @Autowired
    private MobileApiService mobileApiService;

    @Test
    public void 리스트_가져오기 () throws Exception {

        //given : when you type test codes, given values
        ArrayList<TestVO> testList = mobileApiService.getAllList();

        //when : condition given by value


        //then : do test

        for(TestVO tvo : testList){
            System.out.println("id : "+ tvo.getId());
            System.out.println("name : "+ tvo.getName());
        }

    }

}