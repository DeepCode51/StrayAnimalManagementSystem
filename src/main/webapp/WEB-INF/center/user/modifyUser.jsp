<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<script src="<%=request.getContextPath() %>/static/pages/js/userInfo.js?v=3.1415926" type="text/javascript"></script>

<form id="userInfoForm" action="" class="form-horizontal" method="post">
	<input id="userId" name="id" type="hidden" value="${userInfo.id }" />

	<div class="modal-header">
	    <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
	    <h4 class="modal-title">修改用户信息</h4>
	</div>
	<div class="modal-body">
	    <div class="row">
	        <div class="col-md-12">
							
                    <div class="form-body">
                    	<div class="form-group">
                        	<label class="col-md-3 control-label"><span class="required" aria-required="true"> * </span>用户名 /登录名</label>
                            <div class="col-md-4">
                            	<div id="input-error">
                            		<input id="username" name="username" type="text" class="form-control" value="${userInfo.username }" />
                            	</div>
							</div>
						</div>
                        
                        <div class="form-group">
							<label class="col-md-3 control-label"><span class="required" aria-required="true"> * </span>密码</label>
							<div class="col-md-4">
                                   <div id="input-error">
                                       <input id="password" name="password" type="text" class="form-control" value="${userInfo.password }">
                                   </div>
							</div>
						</div>
						
						<div class="form-group">
							<label class="col-md-3 control-label"><span class="required" aria-required="true"> * </span>确认密码</label>
							<div class="col-md-4">
                                   <div id="input-error">
                                       <input id="confirmPassword" name="confirmPassword" type="text" class="form-control" value="${userInfo.password }">
                                   </div>
							</div>
						</div>
						                        
						<div class="form-group">
							<label class="col-md-3 control-label"><span class="required" aria-required="true"> * </span>联系方式</label>
							<div class="col-md-4">
                                   <div id="input-error">
                                       <input id="tel" name="tel" type="text" class="form-control" value="${userInfo.tel }">
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