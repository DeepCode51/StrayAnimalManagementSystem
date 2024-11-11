// JavaScript Document

var editIndex = null;
$(function(){	
	
});

layui.use(['layedit', 'form', 'layer', 'laypage'], function(){
    var layedit = layui.layedit
	,form = layui.form
	,layer = layui.layer
	,laypage = layui.laypage;
	
    layedit.set({
      uploadImage: {
        url: '#' //接口url
        ,type: 'post' //默认post
      }
    });

   editIndex = layedit.build('reply',{
      height: 150, //设置编辑器高度
      tool: ['strong', 'italic', 'underline', 'left', 'center', 'right', '|', 'link', 'image', 'code']
    }); //建立编辑器

	//只显示上一页、下一页
	laypage.render({
		elem: 'page_reply'
		,count: 20
		//['count', 'prev', 'page', 'next', 'limit', 'skip']
		,layout: ['prev', 'page', 'next']
		,jump: function(obj, first){
		  if(!first){
			layer.msg('第 '+ obj.curr +' 页');
		  }
		}
	});
});

function getReply(){
	layui.use(['layedit','layer','form'], function(){
		var layedit = layui.layedit
			,layer = layui.layer
			,form = layui.form;
			
		//自定义验证规则
		  form.verify({
			reply: function(value){
				var comment = layedit.getContent(editIndex);  //获取编辑器的内容
				
				if(comment.length <= 0){
					return '留言内容不能为空';
				}else{
					 //ajax提交后台
					$.ajax({
				    	url: "/ssm-adopt/comment/saveComment.action",
				    	type: "POST",
				    	data: {"comment": comment},
				    	async: false,
				    	success: function(data) {
				    		layer.alert('留言成功', {
				    			  skin: 'layui-layer-molv' //样式类名
				    			  ,closeBtn: 0
				    		},function(){
				    			  window.location.href = "/ssm-adopt/comment/getFrontCommentInfoList.action";
				    		});
				    	},
				        error: function (response, ajaxOptions, thrownError) {
				        	layer.alert(resonse.msg, {
				    			  skin: 'layui-layer-molv' //样式类名
				    			  ,closeBtn: 0
				    		});
				        }
				    });
				}
			}
		  });
	});
}



