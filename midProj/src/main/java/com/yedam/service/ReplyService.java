package com.yedam.service;




import java.util.List;

import com.yedam.VO.ReplyVO;
import com.yedam.common.SearchVO;

public interface ReplyService {
	//목록
	List<ReplyVO> replyList(SearchVO search);
	boolean removeReply(int replyNo);
	boolean addReply(ReplyVO rvo);

	boolean updateReply(ReplyVO rvo);
	

}
