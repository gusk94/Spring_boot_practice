package com.example.practice.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.example.practice.board.domain.BoardVO;

@Mapper
public interface BoardMapper {
	public BoardVO findByIdx(int bno);
	public List<BoardVO> findAll();
	
	public int countBoard();
	
	public void insertBoard(BoardVO board);
	public void updateBoard(BoardVO board);
	public void deleteBoard(int bno);
}
