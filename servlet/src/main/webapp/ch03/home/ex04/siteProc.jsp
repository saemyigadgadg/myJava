<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>

<%
	String site = request.getParameter("site");
%>

<%
	if(site == null) {
%>
			<c:redirect url='siteIn.jsp?msg=Please select an option.'/>
			<!-- forward도 가능하지만, 실패한 form을 보낼 때 
				 redirect를 사용하면 앞 페이지에서의
				 데이터를 제거시키고 완전히 새로운 페이지로 열어
				 request scope를 종료시키고 오로지 error메세지만을 보낸다. -->
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