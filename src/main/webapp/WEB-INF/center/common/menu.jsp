<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!-- BEGIN CONTAINER -->
    <!-- BEGIN SIDEBAR -->
    <div class="page-sidebar-wrapper">
        <!-- BEGIN SIDEBAR -->
        <div class="page-sidebar navbar-collapse collapse">
            <!-- BEGIN SIDEBAR MENU -->
            <ul class="page-sidebar-menu  page-header-fixed " data-keep-expanded="false" data-auto-scroll="false" data-slide-speed="200" style="padding-top: 20px">
                <!-- DOC: To remove the sidebar toggler from the sidebar you just need to completely remove the below "sidebar-toggler-wrapper" LI element -->
                <!-- BEGIN SIDEBAR TOGGLER BUTTON -->
                <li class="sidebar-toggler-wrapper hide">
                    <div class="sidebar-toggler">
                        <span>
                        	
                        </span>
                    </div>
                </li>
                
               	<!-- 控制台  start -->
               	<li class="nav-item">
                	<a href="<%=request.getContextPath() %>/index.action">
                    	<i class="icon-home"></i>
                        	<span class="title">首页</span>
					</a>
               	</li>
               	
              	<!-- 用户个人信息 start -->
				<li class="nav-item ">
                    <a href="javascript:;" class="nav-link nav-toggle">
                        <i class="icon-user"></i>
                        <span class="title">用户信息</span>
						<span class="arrow"></span>
                    </a>
                    <ul class="sub-menu">
						<li class="nav-item ">
                            <a href="<%=request.getContextPath() %>/user/showCreateUserPage.action" class="ajaxify nav-link ">
                                <span class="title">创建用户</span>
                            </a>
                        </li>
                        <li class="nav-item ">
                            <a href="<%=request.getContextPath() %>/user/showUserInfoListPage.action" class="ajaxify nav-link ">
                                <span class="title">用户列表</span>
                            </a>
                        </li>
                    </ul>
               	</li>
               	
               	<!-- 流浪狗信息 start -->
				<li class="nav-item ">
                    <a href="javascript:;" class="nav-link nav-toggle">
                        <i class="icon-basket-loaded"></i>
                        <span class="title">流浪狗管理</span>
						<span class="arrow"></span>
                    </a>
                    <ul class="sub-menu">
						<li class="nav-item ">
                            <a href="<%=request.getContextPath() %>/dog/showCreateDogPage.action" class="ajaxify nav-link ">
                                <span class="title">添加流浪狗</span>
                            </a>
                        </li>
                        <li class="nav-item ">
                            <a href="<%=request.getContextPath() %>/dog/showDogInfoListPage.action" class="ajaxify nav-link ">
                                <span class="title">流浪狗列表</span>
                            </a>
                        </li>
                    </ul>
               	</li>
               	
                <!-- 疫苗信息 start -->
				<li class="nav-item ">
                    <a href="javascript:;" class="nav-link nav-toggle">
                        <i class="icon-basket-loaded"></i>
                        <span class="title">疫苗管理</span>
						<span class="arrow"></span>
                    </a>
                    <ul class="sub-menu">
                    	<li class="nav-item ">
                            <a href="<%=request.getContextPath() %>/vaccine/showCreateVaccinePage.action" class="ajaxify nav-link ">
                                <span class="title">添加疫苗</span>
                            </a>
                        </li>
						<li class="nav-item ">
                            <a href="<%=request.getContextPath() %>/vaccine/showVaccineInfoListPage.action" class="ajaxify nav-link ">
                                <span class="title">疫苗信息列表</span>
                            </a>
                        </li>
                        <li class="nav-item ">
                            <a href="<%=request.getContextPath() %>/vaccine/showDogVaccineInfoListPage.action" class="ajaxify nav-link ">
                                <span class="title">流浪狗接种疫苗列表</span>
                            </a>
                        </li>
                    </ul>
               	</li>
               	
               	<!-- 收养记录管理 start -->
				<li class="nav-item ">
                    <a href="javascript:;" class="nav-link nav-toggle">
                        <i class="icon-basket-loaded"></i>
                        <span class="title">收养记录管理</span>
						<span class="arrow"></span>
                    </a>
                    <ul class="sub-menu">
						<li class="nav-item ">
                            <a href="<%=request.getContextPath() %>/adopt/showAdoptRecordInfoListPage.action" class="ajaxify nav-link ">
                                <span class="title">用户收养记录管理</span>
                            </a>
                        </li>
                        <li class="nav-item ">
                            <a href="<%=request.getContextPath() %>/adopt/showAdoptUserInfoPage.action" class="ajaxify nav-link ">
                                <span class="title">送养人信息管理</span>
                            </a>
                        </li>
                    </ul>
               	</li>
               	
               	<!-- 客服管理 start -->
               	<li class="nav-item ">
                    <a href="javascript:;" class="nav-link nav-toggle">
                        <i class="icon-basket-loaded"></i>
                        <span class="title">客服管理</span>
						<span class="arrow"></span>
                    </a>
                    <ul class="sub-menu">
						<li class="nav-item ">
                            <a href="<%=request.getContextPath() %>/comment/showCommentInfoListPage.action" class="ajaxify nav-link ">
                                <span class="title">留言列表</span>
                            </a>
                        </li>
                    </ul>
               	</li>
               	
            </ul>
            <!-- END SIDEBAR MENU -->
        </div>
        <!-- END SIDEBAR -->
    </div>
    <!-- END SIDEBAR -->