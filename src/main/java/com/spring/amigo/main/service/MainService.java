package com.spring.amigo.main.service;

import com.spring.amigo.model.MainVO;
import org.springframework.context.annotation.Bean;

import javax.annotation.Resource;
import java.util.ArrayList;

public interface MainService {
     ArrayList<MainVO> getAllList();
}
