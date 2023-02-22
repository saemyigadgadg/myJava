<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
A
<%
	response.sendRedirect("1.b.jsp");
%>

<%-- forward와의 차이점은 주소창을 보면 알 수 있다. forward는 a가 response하지만
sendRedirect는 자동으로 b가 response를 보낸다. --%>

