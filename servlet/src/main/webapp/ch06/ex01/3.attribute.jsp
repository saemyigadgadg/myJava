<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<%
	pageContext.setAttribute("username", "최한석");
%>
${username} <br>
${hello} <br> <!-- null값은 깨끗하게 나온다. -->
${empty hello} <br> <!-- null인지 조사하는 코드이다. -->
${empty username ? "무명" : username} <br>
${!empty username ? username: "무명"} <br>
<!-- hr서블릿 할 때에도 이렇게 쓰면 된다. -->