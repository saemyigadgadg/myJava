<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<a href='main.html'>메인</a>
<%
	Cookie cookie1 = new Cookie("userName", "john");
	Cookie cookie2 = new Cookie("age", "32");
	
	response.addCookie(cookie1);
	response.addCookie(cookie2);
%>

<!-- 쿠키를 만드는 법: 쿠키객체를 생성하고 response에 저장하면 된다.
	CooKie(pram1, param2) 쿠키네임, 쿠키벨류 
	파람들은 String 타입이다. -->
	
<!-- 쿠키의 Expire을 설정하지 않으면 기본 session이다. 해당 쿠키는
	session이 끝나면 사라진다. -->