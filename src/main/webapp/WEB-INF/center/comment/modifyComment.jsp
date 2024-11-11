<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<script src="<%=request.getContextPath() %>/static/pages/js/commentInfo.js?v=3.1415926" type="text/javascript"></script>

<form id="commentInfoForm" action="" class="form-horizontal" method="post">
	<input id="commentId" name="id" type="hidden" value="${commentInfo.id }" />

	<div class="modal-header">
	    <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
	    <h4 class="modal-title">回复留言</h4>
	</div>
	<div class="modal-body">
	    <div class="row">
	        <div class="col-md-12">
							
                    <div class="form-body">
                        
                        <div class="form-group">
							<label class="col-md-3 control-label"><span class="required" aria-required="true"> * </span>回复内容</label>
							<div class="col-md-4">
                                   <div id="input-error">
                                   	   <textarea  id="comment" name="comment" rows="10" cols="80"></textarea>
                                   </div>
							</div>
						</div>
						
					</div>
                                                       
				
	        </div>
	    </div>
	</div>
	<div class="modal-footer">
	    <button type="button" class="btn default" data-dismiss="modal">关  闭</button>
	    <button type="submit" class="btn blue">保  存</button>
	</div>

</form>