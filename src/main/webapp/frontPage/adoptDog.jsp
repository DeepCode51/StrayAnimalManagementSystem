<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>送养狗狗</title>
<script src="<%=request.getContextPath() %>/frontPage/static/js/jquery/jquery-2.1.4.min.js" type="text/javascript"></script>
<script src="<%=request.getContextPath() %>/frontPage/static/layui/layui.js" type="text/javascript"></script>
<script src="<%=request.getContextPath() %>/frontPage/static/js/index/index.js" type="text/javascript"></script>
<script src="<%=request.getContextPath() %>/frontPage/static/js/index/freezeheader.js" type="text/javascript"></script>
<script src="<%=request.getContextPath() %>/frontPage/static/layui/lay/modules/layer.js" type="text/javascript"></script>
<script src="<%=request.getContextPath() %>/frontPage/static/js/index/sliders.js" type="text/javascript"></script>
<script src="<%=request.getContextPath() %>/frontPage/static/js/index/html5.js" type="text/javascript"></script>
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
    <h2 class="page-title">送养狗狗</h2>
    <div class="layui-form layui-form-pane">
      <form action="<%=request.getContextPath() %>/dog/saveAdoptUserInfo.action" method="post">
          <div class="layui-form-item">
            <label class="layui-form-label">狗的名字</label>
            <div class="layui-input-block">
              <input type="text" name="dogName" lay-verify="title" autocomplete="off" class="layui-input">
            </div>
          </div>

          <div class="layui-form-item">
              <label class="layui-form-label">狗的种类</label>
              <div class="layui-input-block">
                  <input type="text" name="dogKind" lay-verify="title" autocomplete="off"  class="layui-input">
              </div>
          </div>

          <div class="layui-form-item">
              <label class="layui-form-label">狗的疫苗接种状态</label>
              <div class="layui-input-block">
                  <select name="vaccinationStatus" lay-verify="type">
                      <option value="1">否</option>
                      <option value="2">是</option>
                  </select>
              </div>
          </div>

          <div class="layui-form-item">
              <label class="layui-form-label">狗的年龄</label>
              <div class="layui-input-block">
                  <input type="text" name="dogAge" lay-verify="title" autocomplete="off"  class="layui-input">
              </div>
          </div>
          
          <div class="layui-form-item">
                <div class="layui-inline">
                    <label class="layui-form-label">狗的性别</label>
                    <div class="layui-input-block">
                        <select name="dogSex" lay-verify="type">
                            <option value="公">公</option>
                            <option value="母">母</option>
                        </select>
                    </div>
                </div>
          </div>

		  <div class="layui-form-item">
              <label class="layui-form-label">狗的介绍</label>
              <div class="layui-input-block">
                  <input type="text" name="descrption" lay-verify="title" autocomplete="off"  class="layui-input">
              </div>
          </div>

          <div class="layui-form-item">
              <div class="layui-inline">
                  <label class="layui-form-label">狗的图片</label>

                  <div class="layui-input-block">
                      <div class="layui-upload">
                          <input type="hidden" id="path" name="faceImage" />
                          <button type="button" class="layui-btn" id="dogImage">上传图片</button>
                          <div class="layui-upload-list">
                              <img class="layui-upload-img" id="demo1">
                              <p id="demoText"></p>
                          </div>
                      </div>
                  </div>
              </div>
          </div>

            <div class="layui-form-item">
              <button class="layui-btn" lay-filter="*" lay-submit>提交</button>
            </div>
      </form>
    </div>
</div>
<div class="footer">
    <hr class="layui-bg-black" style="margin-top: 350px">
  <p><a href=""></a> 2018 &copy; <a href="#"></a></p>
</div>
</body>
</html>


<script>
    layui.use('upload', function() {
        var $ = layui.jquery
            , upload = layui.upload;

        //普通图片上传
        var uploadInst = upload.render({
            elem: '#dogImage'
            , url: '/ssm-adopt/dog/upload.action'
            , before: function (obj) {
                //预读本地文件示例，不支持ie8
                obj.preview(function (index, file, result) {
                    $('#demo1').attr('src', result); //图片链接（base64）
                });
            }
            , done: function (data) {
            	console.info(data);
                //如果上传失败
                if (data.status != "200") {
                    return layer.msg('上传失败');
                }
                $("#path").attr("value",data.data);
                //上传成功
                return layer.msg('上传成功');
            }
            , error: function () {
                //演示失败状态，并实现重传
                var demoText = $('#demoText');
                demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-mini demo-reload">重试</a>');
                demoText.find('.demo-reload').on('click', function () {
                    uploadInst.upload();
                });
            }
        })
    })
</script>