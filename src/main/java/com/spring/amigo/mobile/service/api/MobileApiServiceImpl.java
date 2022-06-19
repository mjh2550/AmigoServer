package com.spring.amigo.mobile.service.api;

import com.spring.amigo.mobile.mapper.MobileApiMapper;
import com.spring.amigo.model.TestVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@RequiredArgsConstructor
@Service
public class MobileApiServiceImpl implements MobileApiService{

    private final MobileApiMapper mobileApiMapper;

//    @Autowired
//    public MobileApiServiceImpl(MobileApiMapper mobileApiMapper) {
//        this.mobileApiMapper = mobileApiMapper;
//    }

    @Override
    public ArrayList<TestVO> getAllList() {
        return mobileApiMapper.getAllList();
    }
}
