
var deleteAdoptRecord = function(recordId) {
	
	var hdnContextPath = $("#hdnContextPath").val();
	
	swal({
		  title: "提醒",
		  text: "确认删除?",
		  type: "warning",
		  confirmButtonText: "确认!",
		  confirmButtonClass: "btn-warning",
		  showCancelButton: true,
		  cancelButtonText: "噢!等等...",
		  confirmButtonColor: "#DD6B55",  
		  closeOnConfirm: false
	}, function(isConfirm) {
		if (isConfirm) {
			App.blockUI();
			
			$.ajax({
		    	url: $("#hdnContextPath").val() + "/adopt/delete.action",
		    	type: "POST",
		    	async: false,
		    	data: {"recordId": recordId},
		    	success: function(data) {
		            if(data.status == 200 && data.msg == "OK") {
		            	App.unblockUI();
		            	SweetAlert.success("删除成功！");
		            	
		            	// 刷新jqgrid
		            	reloadAdoptRecordGrid();
		            } else {
		            	App.unblockUI();
		            	console.log(JSON.stringify(data));
		            }
		    	},
		        error: function (response, ajaxOptions, thrownError) {
		        	App.unblockUI();
		        	Error.displayError(response, ajaxOptions, thrownError);                
		        }
		    });
			
		}
	});
	
}

//审核用户领养记录
var modifyAdoptRecord = function(recordId) {
	
	var hdnContextPath = $("#hdnContextPath").val();
	
	swal({
		  title: "提醒",
		  text: "确认审核?",
		  type: "warning",
		  confirmButtonText: "确认!",
		  confirmButtonClass: "btn-warning",
		  showCancelButton: true,
		  cancelButtonText: "噢!等等...",
		  confirmButtonColor: "#DD6B55",  
		  closeOnConfirm: false
	}, function(isConfirm) {
		if (isConfirm) {
			App.blockUI();
			
			$.ajax({
		    	url: $("#hdnContextPath").val() + "/adopt/modifyAdoptRecord.action",
		    	type: "POST",
		    	async: false,
		    	data: {"id": recordId},
		    	success: function(data) {
		            if(data.status == 200 && data.msg == "OK") {
		            	App.unblockUI();
		            	SweetAlert.success("审核成功！");
		            	
		            	// 刷新jqgrid
		            	reloadAdoptRecordGrid();
		            } else {
		            	App.unblockUI();
		            	console.log(JSON.stringify(data));
		            }
		    	},
		        error: function (response, ajaxOptions, thrownError) {
		        	App.unblockUI();
		        	Error.displayError(response, ajaxOptions, thrownError);                
		        }
		    });
			
		}
	});
	
}

// 重新刷新grid
var reloadAdoptRecordGrid = function() {
	var jqGrid = $("#jqGridAdoptRecordInfoList");  
	var hdnContextPath = $("#hdnContextPath").val();
	jqGrid.jqGrid('setGridParam',{datatype:'json'}).setGridParam({ 
		page: 1,
        url: hdnContextPath + "/adopt/getAdoptRecordInfoList.action",
    }).trigger("reloadGrid");
}

// 重新渲染modal
function renderModal() {
	// 重新渲染ajax modal
	Common.openAjaxModal('a[name="ajaxModifyCommentInfoLink"]', '#ajax-modifyCommentInfo-modal');
} 

var AdoptRecordInfoList = function () {
	
	var handleAdoptRecordInfoList = function() {
    	
		var hdnContextPath = $("#hdnContextPath").val();
		
		var jqGrid = $("#jqGridAdoptRecordInfoList");  
        jqGrid.jqGrid({  
            caption: "用户收养记录信息列表",  
            url: hdnContextPath + "/adopt/getAdoptRecordInfoList.action",  
            mtype: "post",  
            styleUI: 'Bootstrap',//设置jqgrid的全局样式为bootstrap样式  
            datatype: "json",  
            colNames: ['ID', '用户名', '手机号', '收养狗的名字' ,'狗的种类','狗的性别', '审核状态', '操作'],  
            colModel: [  
                { name: 'id', index: 'id', width: 30, sortable: false, hidden: true },  
                { name: 'username', index: 'username', width: 30, sortable: false },
                { name: 'tel', index: 'tel', width: 30, sortable: false },
                { name: 'dogName', index: 'dogName', width: 30, sortable: false },
                { name: 'dogKind', index: 'dogKind', width: 30, sortable: false },
                { name: 'dogSex', index: 'dogSex', width: 30, sortable: false },
                { name: 'status', index: 'status', width: 30, sortable: false,
                	formatter:function(cellvalue,options,rowObject){
                		
                		if(cellvalue == "0"){
                			return "未审核";
                		}else{
                			return "审核通过";
                		}
                	}
                },
                { width:50, sortable: false,
                	
			    	formatter:function(cellvalue, options, rowObject) {
			    		
				    	var recordId = rowObject.id;
				    	
				    	var btnModify = '<button class="btn btn-outline blue-chambray" id="" onclick=modifyAdoptRecord("' + recordId + '") style="padding: 1px 3px 1px 3px;">同意</button>';

				    	var btnDelete = '<button class="btn btn-outline blue-chambray" id="" onclick=deleteAdoptRecord("' + recordId + '") style="padding: 1px 3px 1px 3px;">删除</button>';
				    	
				    	return btnModify + btnDelete;
			    	}  // success
                }
            ],  
            viewrecords: true,  		// 定义是否要显示总记录数
            rowNum: 10,					// 在grid上显示记录条数，这个参数是要被传递到后台
//            multiselect: true,  		// 定义是否可以多选
            rownumbers: true,  			// 如果为ture则会在表格左边新增一列，显示行顺序号，从1开始递增。此列名为'rn'
//            width: 900,
            autowidth: true,  			// 如果为ture时，则当表格在首次被创建时会根据父元素比例重新调整表格宽度。如果父元素宽度改变，为了使表格宽度能够自动调整则需要实现函数：setGridWidth
            height: 500,				// 表格高度，可以是数字，像素值或者百分比
            rownumWidth: 36, 			// 如果rownumbers为true，则可以设置行号 的宽度
            pager: "#jqGridAdoptRecordInfoPager",		// 分页控件的id  
            subGrid: false,				// 是否启用子表格
            gridComplete: renderModal	// grid加载完毕后重新渲染switch
        }).navGrid('#jqGridAdoptRecordInfoPager', {
            edit: false,
            add: false,
            del: false,
            search: false
        });
        
  
        // 随着窗口的变化，设置jqgrid的宽度  
        $(window).bind('resize', function () {  
            var width = $('.jqGridAdoptRecordInfoList_wrapper').width()*0.99;  
            jqGrid.setGridWidth(width);  
        });  
        
        // 不显示水平滚动条
        jqGrid.closest(".ui-jqgrid-bdiv").css({ "overflow-x" : "hidden" });
        
    }
    
    return {
        // 初始化各个函数及对象
        init: function () {

        	handleAdoptRecordInfoList();
        	
        }

    };

}();


jQuery(document).ready(function() {
	AdoptRecordInfoList.init();
});