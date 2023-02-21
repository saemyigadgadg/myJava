<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<%= request.getParameter("userName") %>

<!-- get이든 post든 url은 header에 저장된다. get방식에서는 queryString로써 
parameter가 url의 일부가 된다. 영상파일이나 음성 파일은 queryString이 
될 수 없으므로 post방식이 필요하다.  -->