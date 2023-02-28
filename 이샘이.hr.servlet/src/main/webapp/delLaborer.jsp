<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<%@ page import='service.LaborerService, service.LaborerServiceImpl' %>
<%
	int laborerId = Integer.parseInt(request.getParameter("laborerId"));

	LaborerService laborerService = new LaborerServiceImpl();
	laborerService.delLaborer(laborerId);
%>