<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %> 

<script src="<%=request.getContextPath() %>/static/pages/js/userInfo.js?v=3.1415926" type="text/javascript"></script>

	<!-- BEGIN PAGE HEADER-->
	<!-- BEGIN PAGE BAR -->
	<div class="page-bar">
	    <ul class="page-breadcrumb">
	        <li>
	            <span>首页</span>
	            <i class="fa fa-circle"></i>
	        </li>
	        <li>
	            <span>用户信息</span>
	            <i class="fa fa-circle"></i>
	        </li>
	        <li>
	            <span>创建用户</span>
	        </li>
	    </ul>
	</div>
	<!-- END PAGE BAR -->
	<!-- END PAGE HEADER-->
                        
	<div class="row">
    	<div class="col-md-12">
			<br/>
			<!-- 用户信息 start -->
			<div class="tabbable-line boxless tabbable-reversed">
            	<div class="portlet box green-jungle">
                	<div class="portlet-title">
                    	<div class="caption">
                    		<i class="icon-user"></i>创建用户
                    	</div>
					</div>
					
					<div class="portlet-body form">
					
	                    <!-- BEGIN FORM-->
	                    <form id="userInfoForm" action="" class="form-horizontal" method="post">
							
		                    <div class="form-body">
		                    	<div class="form-group">
		                        	<label class="col-md-3 control-label"><span class="required" aria-required="true"> * </span>用户名 /登录名</label>
		                            <div class="col-md-4">
		                            	<div id="input-error">
		                            		<input id="username" name="username" type="text" class="form-control" value="" />
		                            	</div>
									</div>
								</div>
		                        
		                        <div class="form-group">
									<label class="col-md-3 control-label"><span class="required" aria-required="true"> * </span>密码</label>
									<div class="col-md-4">
	                                    <div id="input-error">
	                                        <input id="password" name="password" type="text" class="form-control" value="">
	                                    </div>
									</div>
								</div>
								
								<div class="form-group">
									<label class="col-md-3 control-label"><span class="required" aria-required="true"> * </span>确认密码</label>
									<div class="col-md-4">
	                                    <div id="input-error">
	                                        <input id="confirmPassword" name="confirmPassword" type="text" class="form-control" value="">
	                                    </div>
									</div>
								</div>
								                        
								<div class="form-group">
									<label class="col-md-3 control-label"><span class="required" aria-required="true"> * </span>联系方式</label>
									<div class="col-md-4">
	                                    <div id="input-error">
	                                        <input id="tel" name="tel" type="text" class="form-control"  maxlength="11" value="">
	                                    </div>
									</div>
								</div>
								
							</div>
	                                                        
							<div class="form-actions">
			                    <div class="row">
			                        <div class="col-md-offset-3 col-md-9">
			                            <button type="submit" class="btn green-jungle">提  交</button>
			                            <button type="reset" class="btn grey-salsa btn-outline">取  消</button>
			                        </div>
			                    </div>
							</div>
						</form>
						<!-- END FORM-->
						
					</div>
				</div>
			</div>
                            
		</div>
	</div>
