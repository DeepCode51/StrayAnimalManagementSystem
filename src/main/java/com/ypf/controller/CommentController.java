package com.ypf.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ypf.pojo.TAdmin;
import com.ypf.pojo.TComment;
import com.ypf.pojo.TUser;
import com.ypf.service.CommentService;
import com.ypf.utils.AdoptJSONResult;
import com.ypf.utils.JqGridResult;
import com.ypf.vo.CommentVO;

@Controller
@RequestMapping("/comment")
public class CommentController extends BaseController {
	
	final static Logger log = LoggerFactory.getLogger(CommentController.class);
	
	@Autowired
	private CommentService commentService;
	
	@RequestMapping("/showCommentInfoListPage")
	public String showCommentInfoListPage(){
		return "/comment/commentInfoList";
	}
	
	@RequestMapping("/showCreateCommentPage")
	public ModelAndView showCreateCommentPage(HttpServletRequest request){
		
		ModelAndView mv = new ModelAndView("comment/createComment");
		return mv;
	}
	
	
	@RequestMapping("/delete")
	@ResponseBody
	public AdoptJSONResult deleteComment(Integer commentId){
		 commentService.deleteComment(commentId);
		 return AdoptJSONResult.ok();
	}
	
	@RequestMapping("/getCommentInfoList")
	@ResponseBody
	public JqGridResult getCommentInfoList(Integer page){
		 if(page == null){
			 page = 1;
		 }
		 JqGridResult jqGridResult = commentService.queryAllComment(page, pageSize);
		 return jqGridResult;
	}
	
	@RequestMapping("/getFrontCommentInfoList")
	public String getFrontCommentInfoList(Model md){
		
		List<CommentVO> commentList  = commentService.queryAllFrontComment();
		md.addAttribute("commentList", commentList);
		return "forward:/frontPage/comment.jsp";
	}

	@RequestMapping("/saveOrUpdate")
	@ResponseBody
	public AdoptJSONResult saveOrUpdate(TComment comment,HttpServletRequest request){
		
		//id不为空，则回复；id为空，则新建留言
		Integer commentId = comment.getId();
		TAdmin admin = getCurrentUser(request);
		if(admin == null){
			return AdoptJSONResult.errorMsg("请登录...");
		}
		Integer fromUserId = admin.getAdminid();
		if (commentId != null && fromUserId != null) {
			comment.setToUserId(fromUserId);
			
			//添加回复
			TComment toComment = new TComment();
			toComment.setComment(comment.getComment());
			toComment.setFromUserId(fromUserId);
			toComment.setCreateTime(new Date());
			commentService.addComment(toComment);
			
			comment.setComment(null);
			commentService.updateComment(comment);
		} else {
			comment.setFromUserId(fromUserId);
			comment.setCreateTime(new Date());
			commentService.addComment(comment);
		}		
		return AdoptJSONResult.ok();
	}
	
	@RequestMapping("/saveComment")
	@ResponseBody
	public AdoptJSONResult saveComment(TComment comment,HttpServletRequest request){
		
		TUser user = (TUser) request.getSession().getAttribute("sessionUser");
		if(user == null){
			return AdoptJSONResult.errorMsg("请登录...");
		}
		Integer fromUserId = user.getId();
		comment.setFromUserId(fromUserId);
		comment.setCreateTime(new Date());
		commentService.addComment(comment);
		return AdoptJSONResult.ok();
	}
	
	@RequestMapping("/modifyComment")
	public ModelAndView showModifyComment(Integer commentId, HttpServletRequest request){
		
		// 查询用户个人信息
		TComment commentInfo = commentService.queryCommentInfoById(commentId);
		
		ModelAndView mv = new ModelAndView("comment/modifyComment");
		mv.addObject("commentInfo", commentInfo);
		
		return mv;
	}
	
	
}
