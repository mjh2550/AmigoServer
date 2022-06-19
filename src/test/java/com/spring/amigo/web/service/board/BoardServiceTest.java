package com.spring.amigo.web.service.board;

import com.spring.amigo.model.BoardVO;
import com.spring.amigo.model.TestVO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BoardServiceTest {

    @Autowired
    private BoardService boardService;

    @Test
    public void 리스트_가져오기 () throws Exception {

        //given : when you type test codes, given values


        //when : condition given by value


        //then : do test
       ArrayList<BoardVO> testList =  boardService.getBoardList();

       for(BoardVO bvo : testList){
           System.out.println("idx : "+bvo.getBoard_idx());
           System.out.println("title : "+bvo.getBoard_title());

       }
    }
}