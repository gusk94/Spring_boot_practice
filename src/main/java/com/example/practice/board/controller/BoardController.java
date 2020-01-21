package com.example.practice.board.controller;

import java.util.List;

//import javax.annotation.Resource;
//import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.practice.board.domain.BoardVO;
import com.example.practice.board.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	@GetMapping("/test")
	public ModelAndView Test() {
		List<BoardVO> boardList = boardService.findByIdx(1);
		ModelAndView nxtPage = new ModelAndView("board/test");
		nxtPage.addObject("boardList", boardList);
		return nxtPage;
	}
		
	@RequestMapping("/count")
	public String CountBoard() {
		System.out.println(boardService.countBoard());
		return "count";
	}
	
	@PostMapping("/insert")
	public void create(BoardVO board) throws Exception {
		boardService.insertBoard(board);
	}
	
	@PutMapping("/update")
	public void update(BoardVO board) throws Exception {
		boardService.updateBoard(board);
	}
	
	@DeleteMapping("/delete/{bno}")
	public void delete(@PathVariable("bno") int bno) throws Exception {
		boardService.deleteBoard(bno);
	}

}
