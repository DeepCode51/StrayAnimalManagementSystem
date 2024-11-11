// 重新渲染modal
function renderModal() {
	// 重新渲染ajax modal
	Common.openAjaxModal('a[name="ajaxDetailUserInfoLink"]', '#ajax-detailItemInfo-modal');
	Common.openAjaxModal('a[name="ajaxModifyItemLink"]', '#ajax-modifyItem-modal');
	
	Common.openAjaxModal('a[name="ajaxModifyDogVaccineInfoLink"]', '#ajax-modifyDogVaccineInfo-modal');
} 

var reloadItemGrid = function() {
	var jqGrid = $("#jqGridDemoItemList");  
	var hdnContextPath = $("#hdnContextPath").val();
	jqGrid.jqGrid('setGridParam',{datatype:'json'}).setGridParam({ 
		page: 1,
        url: hdnContextPath + "/dog/getDogInfoList.action",
    }).trigger("reloadGrid");
}

// 删除流浪狗
var deleteItem = function(itemId) {
	
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
		    	url: $("#hdnContextPath").val() + "/dog/delete.action",
		    	type: "POST",
		    	async: false,
		    	data: {"dogId": itemId},
		    	success: function(data) {
		            if(data.status == 200 && data.msg == "OK") {
		            	App.unblockUI();
		            	SweetAlert.success("删除成功！");
		            	
		            	// 刷新jqgrid
		            	reloadItemGrid();
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

// 流浪狗对象
var DemoItemList = function () {
	
    // 流浪狗列表
	var handleDemoItemList = function() {
    	
		var hdnContextPath = $("#hdnContextPath").val();
		
		var jqGrid = $("#jqGridDemoItemList");  
        jqGrid.jqGrid({  
            caption: "流浪狗信息列表",  
            url: hdnContextPath + "/dog/getDogInfoList.action",  
            mtype: "post",  
            styleUI: 'Bootstrap',//设置jqgrid的全局样式为bootstrap样式  
            datatype: "json",  
            colNames: ['ID', '流浪狗名', '品种', '性别','年龄','图片', '接种疫苗状态', '领养状态', '描述','操作'],  
            colModel: [  
                { name: 'id', index: 'id', width: 60, sortable: false, hidden: true },  
                { name: 'dogName', index: 'dogName', width: 20, sortable: false },
                { name: 'dogKind', index: 'dogKind', width: 20, sortable: false },
                { name: 'dogSex', index: 'dogSex', width: 20, sortable: false },
                { name: 'dogAge', index: 'dogAge', width: 20, sortable: false },
                { name: 'faceImage', index: 'faceImage', width: 50, sortable: false,
                	formatter:function(cellvalue, options, rowObject) {
                		var hdnContextPath = $("#hdnContextPath").val();
                		
                		var html = "<img src='"+hdnContextPath+"\\"+cellvalue+"' alt='加载失败' style='width:200px;hegiht:200px;'></img>"
                		return html;
                	}
                },
                { name: 'vaccinationStatus', index: 'vaccinationStatus', width: 30, sortable: false, 
                	formatter:function(cellvalue, options, rowObject) {
                		if(cellvalue=="1"){
                			return "未接种";
                		}else{
                			return "已接种";
                		}
                	}
                },
                { name: 'adoptState', index: 'adoptState', width: 30, sortable: false,
                	formatter:function(cellvalue, options, rowObject) {
                		if(cellvalue=="1"){
                			return "未领养";
                		}else{
                			return "已领养";
                		}
                	}	
                },
                { name: 'descrption', index: 'descrption', width: 60, sortable: false },
                { width: 30, sortable: false,
                	formatter:function(cellvalue, options, rowObject) {
			    		
    			    	var dogId = rowObject.id;
    			    	
    			    	var btnModify = '<a class="btn btn-outline blue-chambray" id="ajaxModifyItemLink" name="ajaxModifyItemLink" data-url="' + hdnContextPath + '/dog/showModifyDogPage.action?dogId=' + dogId + '" data-toggle="modal" style="padding: 1px 3px 1px 3px;">编辑</a>';
    			    	
    			    	var btnVaccine = '<a class="btn btn-outline blue-chambray" id="ajaxModifyDogVaccineInfoLink" name="ajaxModifyDogVaccineInfoLink" data-url="' + hdnContextPath + '/vaccine/modifyDogVaccine.action?dogId=' + dogId + '" data-toggle="modal" style="padding: 1px 3px 1px 3px;">接种</a>';

    			    	var btnDelete = '<button class="btn btn-outline blue-chambray" id="" onclick=deleteItem("' + dogId + '") style="padding: 1px 3px 1px 3px;">删除</button>';
    			    	
    			    	return btnModify + btnVaccine + btnDelete;
    			}  // success
                }
            ],  
            viewrecords: true,  		// 定义是否要显示总记录数
            rowNum: 10,					// 在grid上显示记录条数，这个参数是要被传递到后台
//            multiselect: true,  		// 定义是否可以多选
            rownumbers: true,  			// 如果为ture则会在表格左边新增一列，显示行顺序号，从1开始递增。此列名为'rn'
//            width: 900,
            autowidth: true,  			// 如果为ture时，则当表格在首次被创建时会根据父元素比例重新调整表格宽度。如果父元素宽度改变，为了使表格宽度能够自动调整则需要实现函数：setGridWidth
            height: "auto",				// 表格高度，可以是数字，像素值或者百分比
            rownumWidth: 36, 			// 如果rownumbers为true，则可以设置行号 的宽度
            pager: "#jqGridDemoItemPager",		// 分页控件的id  
            subGrid: false,				// 是否启用子表格
            gridComplete: renderModal	// grid加载完毕后重新渲染model
        }).navGrid('#jqGridDemoItemPager', {
            edit: false,
            add: false,
            del: false,
            search: false
        });
        
  
        // 随着窗口的变化，设置jqgrid的宽度  
        $(window).bind('resize', function () {  
            var width = $('.jqGridDemoItemList_wrapper').width()*0.99;  
            jqGrid.setGridWidth(width);  
        });  
        
        // 不显示水平滚动条
        jqGrid.closest(".ui-jqgrid-bdiv").css({ "overflow-x" : "hidden" });
    }
    
    return {
        // 初始化各个函数及对象
        init: function () {

        	handleDemoItemList();
        	
        }

    };

}();


jQuery(document).ready(function() {
	DemoItemList.init();
});