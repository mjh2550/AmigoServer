package com.spring.amigo.main.service;

import com.spring.amigo.mapper.MainMapper;
import com.spring.amigo.model.MainVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@RequiredArgsConstructor
@Service
public class MainServiceImpl implements MainService{

    private final MainMapper mainMapper;

    @Override
    public ArrayList<MainVO> getAllList() {
        return mainMapper.getAllList();
    }
}
