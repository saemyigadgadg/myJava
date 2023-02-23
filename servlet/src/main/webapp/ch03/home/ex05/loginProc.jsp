<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<%@ page import='java.net.URLEncoder' %>
<%
	String userId = request.getParameter("userId");
	String password = request.getParameter("password");	
	String url = "main.jsp?msg=" + URLEncoder.encode(userId, "utf-8");
%>

<%
	if(!userId.equals("java") || !password.equals("java")) {
%>
			<c:redirect url='login.jsp?msg=Login failed.'/>
		
<%
	} else	
%>
			<jsp:forward page='<%= url + URLEncoder.encode("님 환영합니다.", "utf-8") %>' />
