package com.spring.amigo.mobile.service.api;

import com.spring.amigo.model.TestVO;
import org.springframework.boot.configurationprocessor.json.JSONException;

import java.util.ArrayList;

public interface MobileApiService {
    ArrayList<TestVO> getAllList();
}
