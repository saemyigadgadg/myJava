<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
expression: <%= "hello" %> <br>
scriptlet: <% out.print("hello"); %> <br>
EL(Expression Language): ${"hello"}

<!-- 브라우저에 출력하기 위한 수단 3가지
	 가장 깔끔한 방법은 EL이다. -->