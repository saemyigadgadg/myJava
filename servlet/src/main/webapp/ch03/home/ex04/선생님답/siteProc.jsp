<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>

<%
	String site = request.getParameter("site");
	if(site == null) site = "";
	
	switch(site) {
	case "daum" :
%>

	<c:redirect url='http://daum.net'/>
<%
	case "naver" :
%>
	<c:redirect url='http://naver.com'/>
	
<%
	default:
%>

	<c:redirect url='siteIn.jsp?msg=select a site.'/>
	
<%
	}
%>