<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<script src="<%=request.getContextPath() %>/static/pages/js/demoItem.js?v=3.1415926" type="text/javascript"></script>

<form id="itemForm" action="" class="form-horizontal" method="post">
	<input id="itemId" name="id" type="hidden" value="${dogInfo.id}" />

	<div class="modal-header">
	    <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
	    <h4 class="modal-title">修改流浪狗信息</h4>
	</div>
	<div class="modal-body">
	    <div class="row">
	        <div class="col-md-12">
							
                    <div class="form-body">
                   			<div class="form-group">
	                        	<label class="col-md-3 control-label"><span class="required" aria-required="true"> * </span>流浪狗名称</label>
	                            <div class="col-md-4">
	                            	<div id="input-error">
	                            		<input id="dogName" name="dogName" type="text" class="form-control" value="${dogInfo.dogName}" />
	                            	</div>
								</div>
							</div>
	                        
	                        <div class="form-group">
	                        	<label class="col-md-3 control-label"><span class="required" aria-required="true"> * </span>流浪狗品种</label>
	                            <div class="col-md-4">
	                            	<div id="input-error">
	                            		<input id="dogKind" name="dogKind" type="text" class="form-control" value="${dogInfo.dogName}" />
	                            	</div>
								</div>
							</div>
							
							<div class="form-group">
	                        	<label class="col-md-3 control-label"><span class="required" aria-required="true"> * </span>流浪狗性别</label>
	                            <div class="col-md-4">
	                            	<div id="input-error">
	                            		<select id="dogSex" name="dogSex" class="form-control"  >
	                            			<option value="公" ${dogInfo.dogSex == '公' ? 'selected': ''}>公</option>
	                            			<option value="母" ${dogInfo.dogSex == '母' ? 'selected': ''}>母</option>
	                            		</select>
	                            	</div>
								</div>
							</div>
							
							<div class="form-group">
	                        	<label class="col-md-3 control-label"><span class="required" aria-required="true"> * </span>流浪狗年龄</label>
	                            <div class="col-md-4">
	                            	<div id="input-error">
	                            		<input id="dogAge" name="dogAge" type="text" class="form-control" value="${dogInfo.dogAge}" />
	                            	</div>
								</div>
							</div>
							
							<!-- <div class="form-group">
	                        	<label class="col-md-3 control-label"><span class="required" aria-required="true"> * </span>流浪狗图片</label>
	                            <div class="col-md-4">
	                            	<div id="input-error">
	                            		<input id="faceImage" name="faceImage" type="text" class="form-control" value="" />
	                            	</div>
								</div>
							</div> -->
							
							<div class="form-group">
	                        	<label class="col-md-3 control-label"><span class="required" aria-required="true"> * </span>是否接种疫苗</label>
	                            <div class="col-md-4">
	                            	<div id="input-error">
	                            		<select name="vaccinationStatus" class="form-control"  >
	                            			<option value="2" ${dogInfo.vaccinationStatus == '2' ? 'selected': ''}>是</option>
	                            			<option value="1" ${dogInfo.vaccinationStatus == '1' ? 'selected': ''}>否</option>
	                            		</select>
	                            	</div>
								</div>
							</div>
							
							<div class="form-group">
	                        	<label class="col-md-3 control-label"><span class="required" aria-required="true"> * </span>流浪狗描述</label>
	                            <div class="col-md-4">
	                            	<div id="input-error">
	                            		<input id="descrption" name="descrption" type="text" class="form-control" value="${dogInfo.descrption}" />
	                            	</div>
								</div>
							</div>
						
					</div>
                                                       
				
	        </div>
	    </div>
	</div>
	<div class="modal-footer">
	    <button type="button" class="btn default" data-dismiss="modal">关  闭</button>
	    <button type="submit" class="btn blue">保  存</button>
	</div>

</form>