<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>

<%
	for(int i = 0; i < 10; i++) {
%> 
		<%= i %> &nbsp;	<!-- Tomcat이 out.print로 번역한다. -->
<%
	}
%>
<!-- 과제: /ch03/ex01/out.jsp를 refactoring하라.
	out 객체를 쓰지마라. -->
	
	<!-- 자바 코드가 최소화 되는 것이 좋고 안에는 자바코드 밖에는 html코드 -->