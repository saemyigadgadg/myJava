<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<%@ page import='service.LaborerService, service.LaborerServiceImpl' %>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<%
	int laborerId = Integer.parseInt(request.getParameter("laborerId"));

	LaborerService laborerService = new LaborerServiceImpl();
	laborerService.delLaborer(laborerId);
%>
<c:redirect url='main.jsp'/>
