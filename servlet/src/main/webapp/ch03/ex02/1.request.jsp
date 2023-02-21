<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<ul>
	<li><%= request.getRequestURL() %>
	<li><%= request.getProtocol() %>
	<li><%= request.getServerName() %>
	<li><%= request.getContextPath() %>
	<li><%= request.getRequestURI() %>
	<li><%= request.getQueryString() %>
	<li><%= request.getMethod() %>
</ul>

<!-- 논리적인 request를 물리적인 객체로 포장해준다.
request안에 반드시 있는 데이터는 URL이다. 
request에서 우리가 가장 관심 가져야 하는 것은 parameter이다.-->