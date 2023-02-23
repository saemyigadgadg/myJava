<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
A
<%
	RequestDispatcher dispatcher = request.getRequestDispatcher("1.b.jsp");
	dispatcher.forward(request, response);
%>
<!-- A에서 B로 자동으로 페이지 이동이 되었다.
forward가 실행되면서 request를 b.jsp로 던져버렸다.
그러므로 A가 쓰는 request, response는 B가 쓰는 request, response와 같다.
A가 먼저 실행됐다 B가 실행되었다. 마지막으로 request를 받은 페이지가
B이므로 최종 response는 B가 한다. 
 -->
 
 <!-- 기능은 동일하나 자바코드인 위의 코드보다는 2번 코드처럼 하는 것이 좋다. -->