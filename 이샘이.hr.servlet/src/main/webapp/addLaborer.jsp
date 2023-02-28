<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<%@ page import='service.LaborerService, service.LaborerServiceImpl' %>
<%@ page import='java.time.LocalDate, java.time.format.DateTimeFormatter;' %>
<%
	LocalDate hireDate = LocalDate.parse(request.getParameter("hireDate"), DateTimeFormatter.ISO_DATE);
	
	LaborerService laborerService = new LaborerServiceImpl();
	laborerService.addLaborer(request.getParameter("laborerName"), hireDate);
%>