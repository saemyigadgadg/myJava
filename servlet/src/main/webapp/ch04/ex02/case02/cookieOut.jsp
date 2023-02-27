<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<a href='../case01/main.html'>메인</a><br><br>
<%
	Cookie[] cookies = request.getCookies();
	
	for(Cookie cookie: cookies)
		if(cookie.getName().equals("userName")) {
%>	
			<%= cookie.getName() %>: <%= cookie.getValue() %>
<%
		}
%>

<!-- request에 쿠키가 담기지 않는다. -->
