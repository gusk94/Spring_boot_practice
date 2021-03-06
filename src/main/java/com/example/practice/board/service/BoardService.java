package com.example.practice.board.service;

import java.util.List;

import com.example.practice.board.domain.BoardVO;

public interface BoardService {
	public BoardVO findByIdx(int bno);
	public List<BoardVO> findAll();
	
	public int countBoard();
	public void insertBoard(BoardVO board);
	public void updateBoard(BoardVO board);
	public void deleteBoard(int bno);
}
