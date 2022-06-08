package com.spring.amigo.web.mapper;

import com.spring.amigo.model.MainVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
@Mapper
public interface MainMapper {
     ArrayList<MainVO> getAllList();
}
