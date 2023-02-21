<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<%
	String userName = request.getParameter("userName"); //유저가 쓴 파라미터 val을 return한다.
	String age = request.getParameter("age");
	String birthday = request.getParameter("birthday");
%>
<h3>사용자</h3>
<ul>
	<li>이름: <%= userName %></li>
	<li>나이: <%= age %></li>
	<li>생일: <%= birthday %></li>
</ul>

<!-- 클라이언트가 보내는 데이터를 서버가 받아서 처리한다. -->