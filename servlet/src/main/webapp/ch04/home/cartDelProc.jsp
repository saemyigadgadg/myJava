<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<%@ page import='java.util.List, java.util.ArrayList' %>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<%
	String[] products = request.getParameterValues("product");
	Cookie[] cookies = request.getCookies();
	String cart = "";
	
	if(products != null && products.length > 0) {
		for(Cookie cookie : cookies) {
			if(cookie.getName().equals("cart")) {
				cart += cookie.getValue() + "/";
			}
		}	
		for(String product : products) {
			cart = cart.replace(product + "/", "");
		}
		Cookie cookie = new Cookie("cart", cart);
		cookie.setMaxAge(60 * 60 * 24 * 7);
		response.addCookie(cookie);
	} else {
%>
			<c:redirect url='cartOut.jsp'>
	<c:param name='msg' value='장바구니에서 뺄 물건을 선택하세요.'/>
			</c:redirect>
<%
	}
%>