<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<c:choose>
	<c:when test='${param.color == 1}'>빨강</c:when>
	<c:when test='${param.color == 2}'>노랑</c:when>
	<c:when test='${param.color == 3}'>파랑</c:when>
	<c:when test='${param.color == 1}'>RED</c:when>
</c:choose>

<!-- if는 배타적 when은 비 배타적이다. -->