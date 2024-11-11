package com.ypf.service;

import java.util.List;

import com.ypf.pojo.TComment;
import com.ypf.utils.JqGridResult;
import com.ypf.vo.CommentVO;


public interface CommentService {

	public int addComment(TComment comment);
	
	public int deleteComment(Integer commentId);
	
	public int updateComment(TComment comment);
	
	/**
	 * 后台客服管理查询留言
	 * @param page
	 * @param pageSize
	 * @return
	 */
	public JqGridResult queryAllComment(Integer page,Integer pageSize);
	
	/**
	 * 前台查询留言
	 * @return
	 */
	public List<CommentVO> queryAllFrontComment();

	public TComment queryCommentInfoById(Integer commentId);
}
