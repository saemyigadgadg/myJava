<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<%@ page import='java.util.List, java.util.ArrayList' %>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<a href='main.jsp'>메인</a>
<h3>장바구니</h3>
<%
	Object cartObj = session.getAttribute("cart");

	if(cartObj != null) {
		List<String> cart = (List<String>)cartObj;
		if(cart.size() > 0) {
%>


	<form action='cartDelProc.jsp'  method='post'>
		<ul>
<%
			for(String product: cart) {
%>		
				<li><input type='checkbox' name='check' value='<%= product %>'><%= product %></li>
<%
			}
%>
		</ul> 
		<button type='submit'>삭제</button>
	</form>
	
	
<%
		} else out.println("장바구니에 물건이 없습니다.");
%>

<%
	} else {
%>
	<c:redirect url='main.jsp?msg=Please put the stuff in'/>
	
<%
	}
%>
