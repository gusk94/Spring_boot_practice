package com.example.practice.board.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
	
	private static Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired
	private BoardService boardService;
	
	@GetMapping("/test")
	public ModelAndView Test() {
		List<BoardVO> boardList = boardService.findAll();
		ModelAndView nxtPage = new ModelAndView("board/main");
		nxtPage.addObject("boardList", boardList);
		return nxtPage;
	}
	
	@GetMapping("/test/{bno}")
	public ModelAndView findOne(@PathVariable("bno") int bno) throws Exception{
		ModelAndView idxPage = new ModelAndView("board/index");
		BoardVO board = boardService.findByIdx(bno);
		idxPage.addObject("board", board);
		return idxPage;
	}
		
	@RequestMapping("/count")
	public String CountBoard() {
		System.out.println(boardService.countBoard());
		return "count";
	}
	
	@PostMapping("/insert")
	public void create(BoardVO board) throws Exception {
		logger.info("POST /board : " + board.toString());
		boardService.insertBoard(board);
	}
	
	@PutMapping("/update")
	public void update(BoardVO board) throws Exception {
		logger.info("PUT data : " + board.toString());
		boardService.updateBoard(board);
	}
	
	@DeleteMapping("/delete/{bno}")
	public void delete(@PathVariable("bno") int bno) throws Exception {
		logger.info("DELETE bno : " + bno);
		boardService.deleteBoard(bno);
	}

}
