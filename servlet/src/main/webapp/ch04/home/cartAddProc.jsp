<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<%
	String[] products = request.getParameterValues("product");
	Cookie[] cookies = request.getCookies();
	
	if(products != null) {
		String cart = "";
		for(String product : products) cart += product + "/";
		for(Cookie cookie : cookies) {
			if(cookie.getName().equals("cart")) {
				cart += cookie.getValue() + "/";
			}
		}
		Cookie cookie = new Cookie("cart", cart);
		cookie.setMaxAge(60 * 60 * 24 * 7);
		response.addCookie(cookie);
	}
%>
<c:redirect url='cartOut.jsp'/>