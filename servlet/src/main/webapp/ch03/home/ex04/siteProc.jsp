<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>

<%
	String site = request.getParameter("site");
%>

<%
	if(site == null) {
%>
			<c:redirect url='siteIn.jsp?msg=Please select an option.'/>
<%
	} else if(site.equals("naver")) {	
%>
			<c:redirect url='https://www.naver.com'/>
			
<%
	} else {	
%>
			<c:redirect url='https://www.daum.net'/>		
<%
	}	
%>