package com.yedam.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.VO.BoardVO;
import com.yedam.common.Control;


import com.yedam.service.BoardService;
import com.yedam.service.BoardServiceImpl;

public class BoardInfoControl implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String bno = req.getParameter("bno");
		String page = req.getParameter("page");
		String sc = req.getParameter("searchCondition");
		String kw = req.getParameter("keyword");
		

		BoardService svc = new BoardServiceImpl();
		BoardVO vo = svc.getBoard(Integer.parseInt(bno)); 
		svc.addViewCnt(Integer.parseInt(bno));
		
		
		req.setAttribute("result", vo);
		req.setAttribute("page", page);
		req.setAttribute("searchCondition", sc);
		req.setAttribute("keyword", kw);
		
		String path = "board/board.tiles";
		req.getRequestDispatcher(path).forward(req, resp);
	}

}
