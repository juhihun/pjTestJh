package com.yedam.common;

import org.apache.ibatis.session.SqlSession;

import com.yedam.mapper.BoardMapper;

public class BoardTests {
	public static void main(String[] args) {
		SqlSession session = DataSource.getInstance().openSession(true);
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		mapper.boardList().forEach(System.out::println);
	}
}
