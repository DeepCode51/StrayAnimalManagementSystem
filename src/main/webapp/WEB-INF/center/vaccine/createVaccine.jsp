<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %> 

<script src="<%=request.getContextPath() %>/static/pages/js/vaccineInfo.js?v=3.1415927" type="text/javascript"></script>

	<!-- BEGIN PAGE HEADER-->
	<!-- BEGIN PAGE BAR -->
	<div class="page-bar">
	    <ul class="page-breadcrumb">
	        <li>
	            <span>首页</span>
	            <i class="fa fa-circle"></i>
	        </li>
	        <li>
	            <span>疫苗管理</span>
	            <i class="fa fa-circle"></i>
	        </li>
	        <li>
	            <span>添加疫苗</span>
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
                    		<i class="icon-user"></i>添加疫苗
                    	</div>
					</div>
					
					<div class="portlet-body form">
					
	                    <!-- BEGIN FORM-->
	                    <form id="vaccineInfoForm" class="form-horizontal" method="post">
							
		                    <div class="form-body">
		                    	<div class="form-group">
		                        	<label class="col-md-3 control-label"><span class="required" aria-required="true"> * </span>疫苗名称</label>
		                            <div class="col-md-4">
		                            	<div id="input-error">
		                            		<input id="vaccineName" name="vaccineName" type="text" class="form-control" value="" />
		                            	</div>
									</div>
								</div>
		                        
		                        <div class="form-group">
									<label class="col-md-3 control-label"><span class="required" aria-required="true"> * </span>库存</label>
									<div class="col-md-4">
	                                    <div id="input-error">
	                                        <input id="vaccineCount" name="vaccineCount" type="text" class="form-control" value="">
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
