package com.spring.amigo.web.service.board;

import com.spring.amigo.web.mapper.BoardMapper;
import com.spring.amigo.model.BoardVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

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
}
