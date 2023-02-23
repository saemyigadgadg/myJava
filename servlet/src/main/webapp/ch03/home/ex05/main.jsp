<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<nav>
	<a href='login.jsp'>로그인</a>
</nav>

<%
	String msg = request.getParameter("msg") ;;
%>

<% 
	if(msg == null) { 
%>

			<%=msg=""%>
	
<%
} else {
%>
			<%= msg %>
			<a href='logout.jsp'>로그아웃</a>
<%
}
%>