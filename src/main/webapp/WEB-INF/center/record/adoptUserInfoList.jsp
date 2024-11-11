<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<script src="<%=request.getContextPath() %>/static/pages/js/adoptUserInfoList.js?v=1.10.3" type="text/javascript"></script>

	<!-- BEGIN PAGE HEADER-->
	<!-- BEGIN PAGE BAR -->
	<div class="page-bar">
	    <ul class="page-breadcrumb">
	        <li>
	            <span>首页</span>
	            <i class="fa fa-circle"></i>
	        </li>
	        <li>
	            <span>收养记录管理</span>
	            <i class="fa fa-circle"></i>
	        </li>
	        <li>
	            <span>送养人信息管理</span>
	        </li>
	    </ul>
	</div>
	<!-- END PAGE BAR -->
	<!-- END PAGE HEADER-->
        
    <!-- 送养人列表 jqgrid start -->                
	<div class="row">
    	<div class="col-md-12">
			<br/>
			
			<div class="jqGridAdoptUserInfoList_wrapper">  
			    <table id="jqGridAdoptUserInfoList"></table>  
			    <div id="jqGridAdoptUserInfoPager"></div>  
			</div>  
			
		</div>
	</div>
	<!-- 送养人列表 jqgrid end -->

	<!-- ajax 动态 读取model -->	
	<div id="ajax-modifyItem-modal" class="modal container fade" tabindex="-1"></div>
