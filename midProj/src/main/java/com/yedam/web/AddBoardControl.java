package com.yedam.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.VO.BoardVO;
import com.yedam.common.Control;
import com.yedam.service.BoardService;
import com.yedam.service.BoardServiceImpl;

public class AddBoardControl implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String title = req.getParameter("boardTitle");
		String content = req.getParameter("boardContent");
//		String memberId = req.getParameter("memberId");
		String category = req.getParameter("selectCategory");
		
		String path = "board/addBoard.tiles";
		BoardService svc = new BoardServiceImpl();
		
		req.getRequestDispatcher(path).forward(req, resp);
		
		BoardVO vo = new BoardVO();
		vo.setBoardTitle(title);
		vo.setBoardContent(content);
//		vo.setMemberId(memberId);
		vo.setCategory(category);
		
		System.out.println("제목"+title);
		System.out.println("제목"+content);
		System.out.println("제목"+category);
	
		
		if(svc.addBoard(vo)){
			System.out.println("등록성공");
			resp.sendRedirect("boardList.do");
			return;
		
		}else {
			System.out.println("등록실패");
		}
	
	}

}
