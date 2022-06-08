package com.spring.amigo.web.service.board;

import com.spring.amigo.model.BoardVO;

import java.util.ArrayList;
import java.util.HashMap;

public interface BoardService {
    ArrayList<BoardVO> getBoardList();
    String getListCount();
    ArrayList<BoardVO> getBoardListWithPaging(HashMap<String,Object> paramMap);
}
