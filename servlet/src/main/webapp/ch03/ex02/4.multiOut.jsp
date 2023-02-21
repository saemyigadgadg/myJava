<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<%
	String[] letters = request.getParameterValues("letter");
	//n개의 parameter values를 letters 배열에 담는다.
%>

<%-- 과제: letters를 iteration해서 출력하라. --%>
<%-- 과제: letter이 null일때 예외처리하라. --%>

<%
	if(letters != null) {

		for(int i = 0; i < letters.length; i++) {
%>

	<%= letters[i] %>

<%
	}} else out.print("None");
%>
