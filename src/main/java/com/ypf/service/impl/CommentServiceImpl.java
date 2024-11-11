package com.ypf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ypf.mapper.TCommentMapper;
import com.ypf.mapper.TCommentMapperCustom;
import com.ypf.pojo.TComment;
import com.ypf.service.CommentService;
import com.ypf.utils.JqGridResult;
import com.ypf.vo.CommentVO;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	TCommentMapper commentMapper;
	
	@Autowired
	TCommentMapperCustom commentMapperCustom;
	
	@Override
	public int addComment(TComment comment) {
		int result = commentMapper.insert(comment);
		return result;
	}

	@Override
	public int deleteComment(Integer commentId) {
		int result = commentMapper.deleteByPrimaryKey(commentId);
		return result;
	}

	@Override
	public int updateComment(TComment comment) {
		int result = commentMapper.updateByPrimaryKeySelective(comment);
		return result;
	}

	@Override
	public JqGridResult queryAllComment(Integer page,Integer pageSize) {
		
		PageHelper.startPage(page, pageSize);
		
		List<CommentVO> list = commentMapperCustom.queryCommentList();
		
		PageInfo<CommentVO> pageInfo = new PageInfo<>(list);
		
		JqGridResult grid = new JqGridResult();
		grid.setPage(pageInfo.getPageNum());
		grid.setRows(list);
		grid.setTotal(pageInfo.getPages());
		grid.setRecords(pageInfo.getTotal());
		
		return grid;
	}
	
	@Override
	public List<CommentVO> queryAllFrontComment() {
		
		List<CommentVO> list = commentMapperCustom.queryCommentList();
		return list;
	}

	@Override
	public TComment queryCommentInfoById(Integer commentId) {
		TComment commentInfo = commentMapper.selectByPrimaryKey(commentId);
		return commentInfo;
	}
	

}
