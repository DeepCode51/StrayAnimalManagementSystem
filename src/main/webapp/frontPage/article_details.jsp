<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>文章-个人博客-【心路历程】请不要在设计这条路上徘徊啦</title>
<script src="<%=request.getContextPath() %>/frontPage/static/js/jquery/jquery-2.1.4.min.js" type="text/javascript"></script>
<script src="<%=request.getContextPath() %>/frontPage/static/layui/layui.js" type="text/javascript"></script>
<script src="<%=request.getContextPath() %>/frontPage/static/js/index/index.js" type="text/javascript"></script>
<script src="<%=request.getContextPath() %>/frontPage/static/js/index/freezeheader.js" type="text/javascript"></script>
<script src="<%=request.getContextPath() %>/frontPage/static/layui/lay/modules/layer.js" type="text/javascript"></script>
<script src="<%=request.getContextPath() %>/frontPage/static/js/index/sliders.js" type="text/javascript"></script>
<script src="<%=request.getContextPath() %>/frontPage/static/js/index/html5.js" type="text/javascript"></script>
<script src="<%=request.getContextPath() %>/frontPage/static/js/index/article_details.js" type="text/javascript"></script>
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
      <div>
          <span class="layui-breadcrumb">
              <a href="index.jsp">首页</a>
              <a href="article.jsp">文章</a>
              <a href="article.jsp">个人博客</a>
              <a><cite>【心路历程】请不要在设计这条路上徘徊啦</cite></a>
    	</span>
        <hr class="layui-bg-red">
        <div class="content" id="photos">
        	<h2 class="c_titile">【心路历程】请不要在设计这条路上徘徊啦</h2>
            <p class="box_c"><span class="d_time">发布时间：2017-07-13</span><span>编辑：admin</span><span>阅读（1231）</span></p>
        <div class="detail-body">
           <h3 style="text-align: justify;"><b>一、抹前言</b></h3><p style="text-align: justify;">没有爱的日子，时间如指尖细沙，不知不觉就流逝了。写“<a href="http://www.zhangxinxu.com/wordpress/?p=583" target="_blank">CSS float浮动的深入研究、详解及拓展(一)</a>”和“<a href="http://www.zhangxinxu.com/wordpress/?p=594" target="_blank">CSS float浮动的深入研究、详解及拓展(二)</a>”似乎就在不久前，然而相隔差不多有一年之久了。文章最后留下了“浮动布局更好的替代方案是什么？”后文再介绍的预告。</p><p style="text-align: justify;">由于自己肚子中的货物不足<b>以撑起一篇足够质量的文章，所以关于“浮动布局更好的替代方案</b>是什么？”的文章一直并未动笔。好在事物总是在发展的，我也是每天都是在进步，对于列表布局的思考也愈发成<i>熟。加上正好前不久又有人询问</i>我“浮动布局的替换方案是什么”，于是觉得介绍“<strike>浮动布局的替换方案“的</strike>时机成熟了。</p><p style="text-align: justify;">要注意，本文的布局专指列表布<u>局。就是具有相同DOM结构的水平排列可以rep</u>eat出来的列表元素。如QQ校友中的图片列表（图片截自老同学相册，已隐去名字）</p><p style="text-align: justify;"><img src="http://img.t.sinajs.cn/t4/appstyle/expression/ext/normal/6a/laugh.gif" alt="[抓狂]">&nbsp;<img src="http://img.t.sinajs.cn/t4/appstyle/expression/ext/normal/6a/laugh.gif" alt="[怒骂]"><img src="http://img.t.sinajs.cn/t4/appstyle/expression/ext/normal/6a/laugh.gif" alt="[互粉]"><img src="http://img.t.sinajs.cn/t4/appstyle/expression/ext/normal/6a/laugh.gif" alt="[晕]"><br>
           
           
  <pre>public int update(String sql, Object[] params) throws DaoException {
		queryRunner = new QueryRunner(dataSource);
		int affectedRows = 0;
		try {
			if (params == null) {
				affectedRows = queryRunner.update(sql);
			} else {
				affectedRows = queryRunner.update(sql, params);
                affectedRows = queryRunner.update(sql, params);
			}
		} catch (SQLException e) {
			logger.error("Error occured while attempting to update data", e);
			throw new DaoException(e);
		}
		return affectedRows;
	}</pre>         
           </p>
          <p>
          	<img lay-src="<%=request.getContextPath() %>/frontPage/static/images/4.jpg" layer-src="<%=request.getContextPath() %>/frontPage/static/images/4.jpg" layer-pid layer-index="0" alt="Fly社区">
            <br/><br/>
            <img lay-src="<%=request.getContextPath() %>/frontPage/static/images/5.jpg" layer-src="<%=request.getContextPath() %>/frontPage/static/images/5.jpg" layer-pid layer-index="1" alt="Fly社区">
          </p>
        </div>

        <fieldset class="layui-elem-field layui-field-title" style="margin: 0px 0px; text-align: center;">
          <legend>评论</legend>
        </fieldset>
	<div class="detail-box">
        <a name="comment"></a>
        <ul class="jieda" id="jieda">
          <li data-id="12" class="jieda-daan">
            <a name="item-121212121212"></a>
            <div class="detail-about detail-about-reply">
              <a class="jie-user" href="">
                <img src="<%=request.getContextPath() %>/frontPage/static/images/default.png" alt="">
                <cite>
                  <i>纸飞机</i>
                  <!-- <em>(楼主)</em>
                  <em style="color:#5FB878">(管理员)</em>
                  <em style="color:#FF9E3F">（活雷锋）</em>-->
                  <em style="color:#999">（该号已被封）</em>
                </cite>
              </a>
              <div class="detail-hits">
                <span>3分钟前</span>
              </div>
              <i class="iconfont icon-caina" title="最佳答案"></i>
            </div>
            <div class="detail-body jieda-body">
              <p>么么哒</p>
              <img lay-src="<%=request.getContextPath() %>/frontPage/static/images/5.jpg" layer-src="<%=request.getContextPath() %>/frontPage/static/images/5.jpg" alt="Fly社区">
            </div>
            <div class="jieda-reply">
              <span class="jieda-zan zanok" type="zan"><i class="iconfont icon-zan"></i><em>12</em></span>
              <span type="reply"><i class="iconfont icon-svgmoban53"></i>回复</span>
              <!-- <div class="jieda-admin">
                <span type="edit">编辑</span>
                <span type="del">删除</span>
                <span class="jieda-accept" type="accept">采纳</span>
              </div> -->
            </div>
          </li>
          <li data-id="13">
            <a name="item-121212121212"></a>
            <div class="detail-about detail-about-reply">
              <a class="jie-user" href="">
                <img src="<%=request.getContextPath() %>/frontPage/static/images/default.png" alt="">
                <cite>
                  <i>香菇</i>
                 <em style="color:#FF9E3F">活雷锋</em>
                </cite>
              </a>
              <div class="detail-hits">
                <span>刚刚</span>
              </div>
            </div>
            <div class="detail-body jieda-body">
              <p>蓝瘦</p>
              <img lay-src="<%=request.getContextPath() %>/frontPage/static/images/4.jpg" layer-src="<%=request.getContextPath() %>/frontPage/static/images/4.jpg" layer-pid width="100px" height="80px" layer-index="3" alt="Fly社区">
            </div>
            <div class="jieda-reply">
              <span class="jieda-zan" type="zan"><i class="iconfont icon-zan"></i><em>0</em></span>
              <span type="reply"><i class="iconfont icon-svgmoban53"></i>回复</span>
              <div class="jieda-admin">
                <span type="edit">编辑</span>
                <span type="del">删除</span>
                <span class="jieda-accept" type="accept">采纳</span>
              </div>
            </div>
          </li>
          <!-- <li class="fly-none">没有任何回答</li> -->
        </ul>
        <!--分页-->
      	<div id="page_reply"></div>
        <div class="layui-form layui-form-pane">
            <div class="layui-form-item layui-form-text">
              <div class="layui-input-block">
                <textarea id="reply" name="reply" lay-verify="reply" class="layui-textarea fly-editor"></textarea>
              </div>
            </div>
            <div class="layui-form-item">
              <input type="button" class="layui-btn" onclick="getReply();" lay-filter="*" lay-submit value="提交回复"/>
            </div>
        </div>
      </div>
      </div>
      </div>
    </div>
    <div class="layui-col-md4">

    
      <div class="ad"> <img src="<%=request.getContextPath() %>/frontPage/static/images/ad.jpg"> </div>
      <div class="ms-top">
        <ul class="hd" id="tab">
          <li class="cur"><a>点击排行</a></li>
          <li><a>最新文章</a></li>
          <li><a>站长推荐</a></li>
          <li><a>最新评论</a></li>
        </ul>
      </div>
      <div class="ms-main" id="ms-main">
        <div style="display: block;" class="bd bd-news" >
          <ul>
            <li><a href="#" target="_blank">住在手机里的朋友</a></li>
            <li><a href="#" target="_blank">教你怎样用欠费手机拨打电话</a></li>
            <li><a href="#" target="_blank">原来以为，一个人的勇敢是，删掉他的手机号码<%=request.getContextPath() %>/frontPage.</a></li>
            <li><a href="#" target="_blank">手机的16个惊人小秘密，据说99.999%的人都不知</a></li>
            <li><a href="#" target="_blank">豪雅手机正式发布! 在法国全手工打造的奢侈品</a></li>
            <li><a href="#" target="_blank">你面对的是生活而不是手机</a></li>
          </ul>
        </div>
        <div  class="bd bd-news">
          <ul>
            <li><a href="#" target="_blank">原来以为，一个人的勇敢是，删掉他的手机号码<%=request.getContextPath() %>/frontPage.</a></li>
            <li><a href="#" target="_blank">手机的16个惊人小秘密，据说99.999%的人都不知</a></li>
            <li><a href="#" target="_blank">住在手机里的朋友</a></li>
            <li><a href="#" target="_blank">教你怎样用欠费手机拨打电话</a></li>
            <li><a href="#" target="_blank">你面对的是生活而不是手机</a></li>
            <li><a href="#" target="_blank">豪雅手机正式发布! 在法国全手工打造的奢侈品</a></li>
          </ul>
        </div>
        <div class="bd bd-news">
          <ul>

            <li><a href="#" target="_blank">手机的16个惊人小秘密，据说99.999%的人都不知</a></li>
            <li><a href="#" target="_blank">你面对的是生活而不是手机</a></li>
            <li><a href="#" target="_blank">住在手机里的朋友</a></li>
            <li><a href="#" target="_blank">豪雅手机正式发布! 在法国全手工打造的奢侈品</a></li>
            <li><a href="#" target="_blank">教你怎样用欠费手机拨打电话</a></li>
            <li><a href="#" target="_blank">原来以为，一个人的勇敢是，删掉他的手机号码<%=request.getContextPath() %>/frontPage.</a></li>
          </ul>
        </div>
        <div  class="bd bd-news">
          <ul>
            <li><a href="#" target="_blank">原来以为，一个人的勇敢是，删掉他的手机号码<%=request.getContextPath() %>/frontPage.</a></li>
            <li><a href="#" target="_blank">手机的16个惊人小秘密，据说99.999%的人都不知</a></li>
            <li><a href="#" target="_blank">住在手机里的朋友</a></li>
            <li><a href="#" target="_blank">教你怎样用欠费手机拨打电话</a></li>
            <li><a href="#" target="_blank">你面对的是生活而不是手机</a></li>
            <li><a href="#" target="_blank">豪雅手机正式发布! 在法国全手工打造的奢侈品</a></li>
          </ul>
        </div>
      </div>


      <div class="ad"> <img src="<%=request.getContextPath() %>/frontPage/static/images/03.jpg"> </div>
    </div>
  </div>
</div>
    <div class="footer">
      <hr class="layui-bg-black" style="margin-top: 350px">
      <p><a href=""></a> 2018 &copy; <a href="#"></a></p>
    </div>
     <script>
    //图片放大 预览显示
    layer.photos({
      photos: '#photos'
      ,anim: 0 //0-6的选择，指定弹出图片动画类型，默认随机（请注意，3.0之前的版本用shift参数）
    }); 
    </script>
</body>
</html>
