var reloadDogVaccineGrid = function() {
	var jqGrid = $("#jqGridDogVaccineInfoList");  
	var hdnContextPath = $("#hdnContextPath").val();
	jqGrid.jqGrid('setGridParam',{datatype:'json'}).setGridParam({ 
		page: 1,
        url: hdnContextPath + "/vaccine/getDogVaccineInfoList.action",
    }).trigger("reloadGrid");
}

var DogVaccineInfo = function () {

	var handleDogVaccineInfo = function() {
		
        $('#vaccineInfoForm').validate({
            errorElement: 'span', //default input error message container
            errorClass: 'help-block', // default input error message class
            focusInvalid: false, // do not focus the last invalid input
            ignore: "", // validate all fields including form hidden input
            rules: {
            },

            messages: {
            },

            invalidHandler: function(event, validator) { //display error alert on form submit   
                $('.alert-danger', $('#vaccineInfoForm')).show();
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
            	
            	var vaccineId = $("#vaccineId").val();
            	var dogId = $("#dogId").val();
            	
            	var vaccineInfoForm = $('#vaccineInfoForm');
            	var hdnContextPath = $("#hdnContextPath").val();
            	vaccineInfoForm.ajaxSubmit({
            		dataType: "json",
                    type: "post", // 提交方式 get/post
                    url: hdnContextPath + '/vaccine/saveDogVaccine.action', // 需要提交的 url
                    data: vaccineInfoForm.serialize(),
                    success: function(data) {
                        // 登录成功或者失败的提示信息
                        if (data.status == 200 && data.msg == "OK") {
                        	SweetAlert.success("保存成功！");
                        	App.unblockUI();
                        	
                        	// 修改操作需要刷新grid以及关闭窗口
                        	if (vaccineId != "" && vaccineId != null && vaccineId != undefined) {
                        		reloadDogVaccineGrid();
                        		$("#ajax-modifyDogVaccineInfo-modal").modal('hide');
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

        $('#vaccineInfoForm input').keypress(function(e) {
            if (e.which == 13) {
                if ($('#vaccineInfoForm').validate().form()) {
                    $('#vaccineInfoForm').submit(); //form validation success, call ajax form submit
                }
                return false;
            }
        });
        
    }
    
    return {
        // 初始化各个函数及对象
        init: function () {
        	handleDogVaccineInfo();
        	
        }

    };

}();

jQuery(document).ready(function() {
	DogVaccineInfo.init();
});