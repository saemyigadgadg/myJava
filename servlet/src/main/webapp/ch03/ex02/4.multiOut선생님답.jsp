<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<%
	String[] letters = request.getParameterValues("letter");
	String gender = request.getParameter("gender");
	String[] jobs = request.getParameterValues("job");
%>

<%-- getParameterValues : 파라미터 value에서 n개의 파라미터를 모아서 
	String 으로 변환한다. --%>

<%-- 과제: letters를 iteration해서 출력하라. --%>
<%-- 과제: letter가 null일 경우 예외처리하라. --%>
<%
	if(letters != null)
		for(String letter: letters) {
%>

			<%= letter %> &nbsp;
		
<%
	}
%><br>


<%= gender %> <br>

<%
	if(jobs != null)
		for(String job: jobs) {
%>

			<%= job %> &nbsp;
		
<%
	}
%>	