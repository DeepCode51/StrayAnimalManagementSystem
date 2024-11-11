<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<script src="<%=request.getContextPath() %>/static/pages/js/dogVaccineInfo.js?v=3.1415921" type="text/javascript"></script>

<form id="vaccineInfoForm"   class="form-horizontal" method="post">
	<%-- <input id="dogVaccineId" name="id" type="hidden" value="${dogVaccineInfo.id }" /> --%>
	<input id="dogId" name="dogId" type="hidden" value="${dogInfo.id }" />
	<div class="modal-header">
	    <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
	    <h4 class="modal-title">流浪狗接种疫苗</h4>
	</div>
	<div class="modal-body">
	    <div class="row">
	        <div class="col-md-12">
							
                    <div class="form-body">
                        
                        <div class="form-group">
                        	<label class="col-md-3 control-label"><span class="required" aria-required="true"> * </span>接种狗名</label>
                            <div class="col-md-4">
                            	<div id="input-error">
                            		<input id="dogName" name="dogName"  readonly type="text" class="form-control" value="${dogInfo.dogName}" />
                            	</div>
							</div>
						</div>
                        
                        <div class="form-group">
                        	<label class="col-md-3 control-label"><span class="required" aria-required="true"> * </span>疫苗名称</label>
                            <div class="col-md-4">
                            	<div id="input-error">
                            		<select id="vaccineId" name="vaccineId" class="form-control"  >
	                            		<c:forEach var="item" items="${vaccineInfoList }">
		                            		<option value="${item.id}" }>${item.vaccineName}</option>
	                            		</c:forEach>
	                            	</select>
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