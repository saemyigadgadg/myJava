<%-- "<%@" page directive --%>
<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<% //scriptlet 자바 언어를 이 안에 적는다.
	int num1 = 1;
	int num2 = 2;
%>
<h2>더하기</h2>
<%-- expression 자바의 변수를 사용한다. --%>
<%= num1 %> + <%= num2 %> = <%= num1 + num2 %> 