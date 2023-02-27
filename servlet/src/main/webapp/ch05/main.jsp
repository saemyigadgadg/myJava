<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<%@ page import='ch05.service.TodayService, ch05.service.TodayServiceImpl' %>
<%
	TodayService todayService = new TodayServiceImpl();
%>

<%= todayService.getToday() %>

<!-- 100번 사원의 정보를 조회한다. -->