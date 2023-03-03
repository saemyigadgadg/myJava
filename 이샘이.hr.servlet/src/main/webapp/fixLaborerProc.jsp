<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<%@ page import='java.time.LocalDate, java.time.format.DateTimeFormatter' %>
<%@ page import='service.LaborerService, service.LaborerServiceImpl, domain.Laborer' %>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<%
	LocalDate hireDate = LocalDate.parse(request.getParameter("hireDate"), DateTimeFormatter.ISO_DATE);
	int laborerId = Integer.parseInt(request.getParameter("laborerId"));

	LaborerService laborerService = new LaborerServiceImpl();
	laborerService.fixLaborer(new Laborer(laborerId ,request.getParameter("laborerName"), hireDate));
%>
<c:redirect url='main.jsp'/>