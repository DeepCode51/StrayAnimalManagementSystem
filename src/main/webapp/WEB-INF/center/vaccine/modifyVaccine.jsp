<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<script src="<%=request.getContextPath() %>/static/pages/js/vaccineInfo.js?v=3.1415921" type="text/javascript"></script>

<form id="vaccineInfoForm" action="" class="form-horizontal" method="post">
	<input id="vaccineId" name="id" type="hidden" value="${vaccineInfo.id }" />

	<div class="modal-header">
	    <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
	    <h4 class="modal-title">修改疫苗信息</h4>
	</div>
	<div class="modal-body">
	    <div class="row">
	        <div class="col-md-12">
							
                    <div class="form-body">
                        
                        <div class="form-group">
		                        	<label class="col-md-3 control-label"><span class="required" aria-required="true"> * </span>疫苗名称</label>
		                            <div class="col-md-4">
		                            	<div id="input-error">
		                            		<input id="vaccineName" name="vaccineName" type="text" class="form-control" value="${vaccineInfo.vaccineName}" />
		                            	</div>
									</div>
								</div>
		                        
                        <div class="form-group">
							<label class="col-md-3 control-label"><span class="required" aria-required="true"> * </span>库存</label>
							<div class="col-md-4">
                                   <div id="input-error">
                                       <input id="vaccineCount" name="vaccineCount" type="text" class="form-control" value="${vaccineInfo.vaccineCount }">
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