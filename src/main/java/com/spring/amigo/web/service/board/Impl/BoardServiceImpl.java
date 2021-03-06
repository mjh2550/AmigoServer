package com.spring.amigo.web.service.board.Impl;

import com.spring.amigo.model.Pagination;
import com.spring.amigo.web.mapper.BoardMapper;
import com.spring.amigo.model.BoardVO;
import com.spring.amigo.web.service.board.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;

@RequiredArgsConstructor
@Service
public class BoardServiceImpl implements BoardService {

    private BoardMapper boardMapper;

    @Autowired
    public BoardServiceImpl(BoardMapper boardMapper) {
        this.boardMapper = boardMapper;
    }

    @Override
    public ArrayList<BoardVO> getBoardList() {
        return boardMapper.getBoardList();
    }

    @Override
    public String getListCount() {
        return boardMapper.getListCount();
    }

    @Override
    public ArrayList<BoardVO> getBoardListWithPaging(HashMap<String, Object> paramMap) {
        return boardMapper.getBoardListWithPaging(paramMap);
    }

}
