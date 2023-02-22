<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<%
	String numStr = request.getParameter("num");

	try {
		int num = Integer.parseInt(numStr);
%>
		<!-- user가 form을 그냥 제출하거나 url을 통해 request를 보내면 
		nullStr 값이 null일 수 있다. 이렇게 되면 Exception이 발생할 수 있고,
		그렇기 때문에 try를 이용해서 숫자가 아닌 null값이 오지 못하도록 막았다. -->

	<%= num * 2 %>
	<a href='4.numIn.jsp'>back</a> <!-- 다시 form으로 돌아갈 수 있는 링크 제공한다. -->
<%
	} catch(NumberFormatException e) {
%>
	<%-- 과제: numIn.jsp form에 에러메세지(영어)를 출력하라 --%>
	<c:redirect url='4.numIn.jsp?msg=input number.'/>

<%
	}
%>

<!-- 웹앱은 에러가 난다고 해서 앱이 멈춰있지 않다. -->
