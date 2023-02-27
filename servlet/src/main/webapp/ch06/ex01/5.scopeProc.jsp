<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<%
	pageContext.setAttribute("scope", "페이지");
	request.setAttribute("scope", "리퀘스트");
	session.setAttribute("scope", "세션");
	application.setAttribute("scope", "애플리케이션");
%>
<jsp:forward page='5.scopeOut.jsp'/>

<!-- el은 좁은 범위에서 큰 범위 순으로 찾고 발견되는 것을 즉시
사용하고 끝냅니다. -->