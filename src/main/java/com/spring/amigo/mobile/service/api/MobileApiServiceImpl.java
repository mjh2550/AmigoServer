package com.spring.amigo.mobile.service.api;

import com.spring.amigo.model.TestVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@RequiredArgsConstructor
@Service
public class MobileApiServiceImpl implements MobileApiService{

    @Override
    public ArrayList<TestVO> getAllList() {
        ArrayList<TestVO> getResultList = new ArrayList<>();

        //TODO Test
        getResultList.add(new TestVO("1","test"));
        getResultList.add(new TestVO("2","test2"));

        return getResultList;
    }
}
