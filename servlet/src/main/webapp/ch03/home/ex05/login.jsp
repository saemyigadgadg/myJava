<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<form action='loginProc.jsp'>
		<input type='text' name='userId' required/>아이디
		<input type='password' name='password' required/>비밀번호
		<input type='submit'/>
</form>

<%
	String msg = request.getParameter("msg");
%>

<%= msg != null ? msg : "" %>