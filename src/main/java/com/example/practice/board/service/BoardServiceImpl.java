package com.example.practice.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practice.board.domain.BoardVO;
import com.example.practice.board.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	BoardMapper boardMapper;
	
	@Override
	public List<BoardVO> findByIdx(int bno) {
		return boardMapper.findByIdx(bno);
	}
	
	@Override
	public List<BoardVO> findAll() {
		return boardMapper.findALl();
	}
	
	@Override
	public int countBoard() {
		return boardMapper.countBoard();
	}
	
	@Override
	public void insertBoard(BoardVO board) {
		boardMapper.insertBoard(board);
	}
	
	@Override
	public void updateBoard(BoardVO board) {
		boardMapper.updateBoard(board);
	}
	
	@Override
	public void deleteBoard(int bno) {
		boardMapper.deleteBoard(bno);
	}
}
