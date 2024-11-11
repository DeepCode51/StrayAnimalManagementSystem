<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<script src="<%=request.getContextPath() %>/static/pages/js/adoptRecordInfoList.js?v=1.10.2" type="text/javascript"></script>

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
	            <span>用户收养记录管理列表</span>
	        </li>
	    </ul>
	</div>
	<!-- END PAGE BAR -->
	<!-- END PAGE HEADER-->
        
    <!-- 用户收养记录信息列表 jqgrid start -->                
	<div class="row">
    	<div class="col-md-12">
			<br/>
			
			<div class="jqGridAdoptRecordInfoList_wrapper">  
			    <table id="jqGridAdoptRecordInfoList"></table>  
			    <div id="jqGridAdoptRecordInfoPager"></div>  
			</div>  
			
		</div>
	</div>
	<!-- 用户收养记录信息列表 jqgrid end -->

	<!-- ajax 动态 读取model -->	
	<div id="ajax-detailItemInfo-modal" class="modal container fade" tabindex="-1"></div>
	<div id="ajax-modifyItem-modal" class="modal container fade" tabindex="-1"></div>
