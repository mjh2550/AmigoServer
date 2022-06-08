package com.spring.amigo.web.mapper;

import com.spring.amigo.model.BoardVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;

@Repository
@Mapper
public interface BoardMapper {
    ArrayList<BoardVO> getBoardList();
    String getListCount();
    ArrayList<BoardVO> getBoardListWithPaging(HashMap<String,Object> paramMap);
}
