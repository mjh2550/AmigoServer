package com.spring.amigo.web.service.main;

import com.spring.amigo.web.mapper.MainMapper;
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
