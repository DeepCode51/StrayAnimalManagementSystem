<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>留言</title>
    <script src="<%=request.getContextPath() %>/frontPage/static/js/jquery/jquery-2.1.4.min.js" type="text/javascript"></script>
    <script src="<%=request.getContextPath() %>/frontPage/static/layui/layui.js" type="text/javascript"></script>
    <script src="<%=request.getContextPath() %>/frontPage/static/js/index/index.js" type="text/javascript"></script>
    <script src="<%=request.getContextPath() %>/frontPage/static/js/index/freezeheader.js" type="text/javascript"></script>
    <script src="<%=request.getContextPath() %>/frontPage/static/layui/lay/modules/layer.js" type="text/javascript"></script>
    <script src="<%=request.getContextPath() %>/frontPage/static/js/index/sliders.js" type="text/javascript"></script>
    <script src="<%=request.getContextPath() %>/frontPage/static/js/index/html5.js" type="text/javascript"></script>
    <script src="<%=request.getContextPath() %>/frontPage/static/js/index/comment.js" type="text/javascript"></script>
    <link rel="stylesheet" href="<%=request.getContextPath() %>/frontPage/static/layui/css/layui.css" media="all"/>
    <link rel="stylesheet" href="<%=request.getContextPath() %>/frontPage/static/layui/css/modules/layer/default/layer.css"/>
    <link rel="stylesheet" href="<%=request.getContextPath() %>/frontPage/static/css/global.css"/>

</head>
<body>

<div class="layui-header header">
    <div class="main">
        <ul class="layui-nav layui-nav-left" lay-filter="filter">
          <li class="layui-nav-item layui-this nav-left">
              <a href="/ssm-adopt/frontPage/index.jsp">首页</a>
          </li>
          <li class="layui-nav-item">
              <a href="/ssm-adopt/frontPage/article.jsp">文章</a>
          </li>
          <li class="layui-nav-item">
              <a href="/ssm-adopt/frontPage/dogInfo.jsp">收养狗狗</a>
          </li>
          <li class="layui-nav-item">
              <a href="/ssm-adopt/frontPage/adoptDog.jsp">送养狗狗</a>
          </li>
          <li class="layui-nav-item">
              <a href="/ssm-adopt/comment/getFrontCommentInfoList.action">留言</a>
          </li>
        </ul>

<ul class="layui-nav layui-layout-right layui-nav-right" lay-filter="filter">
      <li class="layui-nav-item">
        <a href="javascript:;"><img src="<%=request.getContextPath() %>/frontPage/static/images/head.jpg" class="layui-nav-img">${sessionUser.username}</a>
        <dl class="layui-nav-child">
            <dd><a href="/ssm-adopt/user/logout.action">退了</a></dd>
        </dl>
      </li>
    </ul>
    </div>
</div>
<div class="layui-container container">
    <div class="layui-row layui-col-space20">
        <div class="layui-col-md8">
            <fieldset class="layui-elem-field layui-field-title" style="margin: 0px 0px; text-align: center;">
                <legend>留言</legend>
            </fieldset>
                    <div class="detail-box">
                        <a name="comment"></a>
                        <ul class="jieda" id="jieda">
                            <c:forEach var="item" items="${commentList}">
	                            <li >
	                                <a name="item-121212121212"></a>
	                                <div class="detail-about detail-about-reply">
	                                    <a class="jie-user" href="">
	                                        <img src="/ssm-adopt/frontPage/static/images/default.png" alt="">
	                                        <cite>
	                                            <i>${item.fromUserName}</i>
	                                        </cite>
	                                    </a>
	                                    <div class="detail-hits">
	                                        <span>
	                                        	<fmt:formatDate value="${item.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>
	                                        </span>
	                                    </div>
	
	                                </div>
	                                <div class="detail-body jieda-body">
	                                    <p>${item.comment }</p>
	                                </div>
	                            </li>
							</c:forEach>
                        </ul>

                        <div class="layui-form layui-form-pane">
                            <div class="layui-form-item layui-form-text">
                                <div class="layui-input-block">
                                    <textarea id="reply" name="reply" lay-verify="reply" class="layui-textarea fly-editor"></textarea>
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <input type="button" class="layui-btn" onclick="getReply();" lay-filter="*" lay-submit value="提交留言"/>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        </div>
    </div>
</div>
<div class="footer">
    <hr class="layui-bg-black" style="margin-top: 350px">
    <p><a href=""></a> 2018 &copy; <a href="#"></a></p>
</div>

</body>
</html>
