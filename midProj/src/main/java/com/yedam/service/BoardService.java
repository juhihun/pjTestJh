package com.yedam.service;


import java.util.List;

import com.yedam.VO.BoardVO;
import com.yedam.common.SearchVO;

public interface BoardService {
	
	List<BoardVO> boardList(SearchVO search);//목록

	int getTotal(SearchVO search); //전체건수

	boolean addBoard(BoardVO vo);
	BoardVO getBoard(int boardNo);
	int addViewCnt(int boardNo);
	//수정
	boolean modifyBoard(BoardVO board);
	//삭제
	boolean delBoard(BoardVO board);


}
