<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<%@ page import='service.LaborerService, service.LaborerServiceImpl' %>
<%
	LaborerService laborerService = new LaborerServiceImpl();
%>

<%= laborerService.getLaborers() %>