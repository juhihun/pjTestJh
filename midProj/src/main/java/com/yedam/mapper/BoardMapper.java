package com.yedam.mapper;

import java.util.List;

import com.yedam.VO.BoardVO;
import com.yedam.common.SearchVO;

public interface BoardMapper {

	List<BoardVO> boardList(); //전체목록가져오기
	List<BoardVO> boardListPaging(SearchVO search); //5개씩 리스트

	
	int getTotalCnt(SearchVO search);
	int insertBoard(BoardVO board);
	BoardVO selectBoard(int boardNo);
	int updateViewCnt(int boardNo);
	int updateBoard(BoardVO board); //수정처리
	int deleteBoard(BoardVO board); //삭제

}
