package com.spring.amigo.mobile.mapper;

import com.spring.amigo.model.TestVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
@Mapper
public interface MobileApiMapper {

    ArrayList<TestVO> getAllList();
}
