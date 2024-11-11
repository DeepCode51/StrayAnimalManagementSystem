<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  

<script src="<%=request.getContextPath() %>/static/pages/js/demoItem.js?v=3.1415927" type="text/javascript"></script>

	<!-- BEGIN PAGE HEADER-->
	<!-- BEGIN PAGE BAR -->
	<div class="page-bar">
	    <ul class="page-breadcrumb">
	        <li>
	            <span>首页</span>
	            <i class="fa fa-circle"></i>
	        </li>
	        <li>
	            <span>流浪狗管理</span>
	            <i class="fa fa-circle"></i>
	        </li>
	        <li>
	            <span>添加流浪狗</span>
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
                    		<i class="icon-user"></i>添加流浪狗
                    	</div>
					</div>
					
					<div class="portlet-body form">
					
	                    <!-- BEGIN FORM-->
	                    <!-- enctype="multipart/form-data" -->
	                    <form id="itemForm" class="form-horizontal" enctype="multipart/form-data">
							
		                    <div class="form-body">
		                    	<div class="form-group">
		                        	<label class="col-md-3 control-label"><span class="required" aria-required="true"> * </span>流浪狗名称</label>
		                            <div class="col-md-4">
		                            	<div id="input-error">
		                            		<input id="dogName" name="dogName" type="text" class="form-control" value="" />
		                            	</div>
									</div>
								</div>
		                        
		                        <div class="form-group">
		                        	<label class="col-md-3 control-label"><span class="required" aria-required="true"> * </span>流浪狗品种</label>
		                            <div class="col-md-4">
		                            	<div id="input-error">
		                            		<input id="dogKind" name="dogKind" type="text" class="form-control" value="" />
		                            	</div>
									</div>
								</div>
								
								<div class="form-group">
		                        	<label class="col-md-3 control-label"><span class="required" aria-required="true"> * </span>流浪狗性别</label>
		                            <div class="col-md-4">
		                            	<div id="input-error">
		                            		<select id="dogSex" name="dogSex" class="form-control"  >
		                            			<option value="公">公</option>
		                            			<option value="母">母</option>
		                            		</select>
		                            	</div>
									</div>
								</div>
								
								<div class="form-group">
		                        	<label class="col-md-3 control-label"><span class="required" aria-required="true"> * </span>流浪狗年龄</label>
		                            <div class="col-md-4">
		                            	<div id="input-error">
		                            		<input id="dogAge" name="dogAge" type="text" class="form-control" value="" />
		                            	</div>
									</div>
								</div>
								
								<div class="form-group">
		                        	<label class="col-md-3 control-label"><span class="required" aria-required="true"> * </span>流浪狗图片</label>
		                            <div class="col-md-4">
		                            	<div id="input-error">
		                            		<input id="file" name="file" type="file" value="" />
		                            	</div>
									</div>
								</div>
								
								<div class="form-group">
		                        	<label class="col-md-3 control-label"><span class="required" aria-required="true"> * </span>是否接种疫苗</label>
		                            <div class="col-md-4">
		                            	<div id="input-error">
		                            		<select name="vaccinationStatus" class="form-control"  >
		                            			<option value="2">是</option>
		                            			<option value="1">否</option>
		                            		</select>
		                            	</div>
									</div>
								</div>
								
								<div class="form-group">
		                        	<label class="col-md-3 control-label"><span class="required" aria-required="true"> * </span>流浪狗描述</label>
		                            <div class="col-md-4">
		                            	<div id="input-error">
		                            		<input id="descrption" name="descrption" type="text" class="form-control" value="" />
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
