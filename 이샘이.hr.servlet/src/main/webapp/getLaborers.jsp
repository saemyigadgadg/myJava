<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<%@ page import='service.LaborerService, domain.Laborer, java.util.List, java.util.ArrayList, service.LaborerServiceImpl' %>
<%
	LaborerService laborerService = new LaborerServiceImpl(); 
%>

<%= laborerService.getLaborers() %>
