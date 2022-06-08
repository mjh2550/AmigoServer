package com.spring.amigo.web.controller;

import com.spring.amigo.web.service.board.BoardService;
import com.spring.amigo.model.BoardVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class BoardController {

    private BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping("board/getBoardList.do")
    public ModelAndView getBoardList(){
        ModelAndView mv = new ModelAndView("board");
        ArrayList<BoardVO> getBoardList = boardService.getBoardList();
        mv.addObject("boardList",getBoardList);
        return mv;
    }
}
