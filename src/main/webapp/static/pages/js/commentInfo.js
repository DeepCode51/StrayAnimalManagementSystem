var reloadCommentGrid = function() {
	var jqGrid = $("#jqGridCommentInfoList");  
	var hdnContextPath = $("#hdnContextPath").val();
	jqGrid.jqGrid('setGridParam',{datatype:'json'}).setGridParam({ 
		page: 1,
        url: hdnContextPath + "/comment/getCommentInfoList.action",
    }).trigger("reloadGrid");
}

var CommentInfo = function () {

	var handleCommentInfo = function() {
		
        $('#commentInfoForm').validate({
            errorElement: 'span', //default input error message container
            errorClass: 'help-block', // default input error message class
            focusInvalid: false, // do not focus the last invalid input
            ignore: "", // validate all fields including form hidden input
            rules: {
            },

            messages: {
            },

            invalidHandler: function(event, validator) { //display error alert on form submit   
                $('.alert-danger', $('#commentInfoForm')).show();
            },

            highlight: function(element) { // hightlight error inputs
                $(element).closest('.form-group').addClass('has-error'); // set error class to the control group
            },

            success: function(label) {
                label.closest('.form-group').removeClass('has-error');
                label.remove();
            },

            errorPlacement: function(error, element) {
                error.insertAfter(element.closest('#input-error'));
            },

            submitHandler: function(form) {
            	
            	App.blockUI();
            	
            	var commentId = $("#commentId").val();
            
            	var commentInfoForm = $('#commentInfoForm');
            	var hdnContextPath = $("#hdnContextPath").val();
            	commentInfoForm.ajaxSubmit({
            		dataType: "json",
                    type: "post", // 提交方式 get/post
                    url: hdnContextPath + '/comment/saveOrUpdate.action', // 需要提交的 url
                    data: commentInfoForm.serialize(),
                    success: function(data) {
                        // 登录成功或者失败的提示信息
                        if (data.status == 200 && data.msg == "OK") {
                        	SweetAlert.success("保存成功！");
                        	App.unblockUI();
                        	
                        	// 修改操作需要刷新grid以及关闭窗口
                        	if (commentId != "" && commentId != null && commentId != undefined) {
                        		reloadCommentGrid();
                        		$("#ajax-modifyCommentInfo-modal").modal('hide');
                        	}
                        } else {
                        	SweetAlert.error(data.msg);
                        	App.unblockUI();
                        }
                    },
	                error: function (response, ajaxOptions, thrownError) {
	                	Error.displayError(response, ajaxOptions, thrownError); 
	                	App.unblockUI();
	                }
                });
            	
            }
        });

        $('#commentInfoForm input').keypress(function(e) {
            if (e.which == 13) {
                if ($('#commentInfoForm').validate().form()) {
                    $('#commentInfoForm').submit(); //form validation success, call ajax form submit
                }
                return false;
            }
        });
        
    }
    
    return {
        // 初始化各个函数及对象
        init: function () {
        	handleCommentInfo();
        	
        }

    };

}();

jQuery(document).ready(function() {
	CommentInfo.init();
});