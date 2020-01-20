package com.example.practice.board.mapper;

import org.springframework.stereotype.Repository;


// 해당 클래스가 데이터베이스에 접근하는 클래스 명시
@Repository("com.example.practice.board.mapper.BoardMapper")
public interface BoardMapper {
    public int boardCount() throws Exception;
}
