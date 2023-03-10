<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<%@ page import='java.util.List, java.util.ArrayList' %>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<%
	String[] products = request.getParameterValues("product");
	Object cartObj = session.getAttribute("cart");

	if(cartObj == null) {
		
		if(products != null && products.length > 0) { 
			List<String> cart = new ArrayList<>();
			
			for(String product: products)
				cart.add(product);
			
			session.setAttribute("cart", cart);
		} else {
%>
	<c:redirect url='cartOut.jsp'/>
			
<%
		}
	} else {
		List<String> cart = (List<String>)cartObj;
		for(String product: products)
		cart.add(product);
		
		session.setAttribute("cart", cart);
	}
%>

<c:redirect url='cartOut.jsp'/>

<!-- 여러페이지에 들락 날락 하면서 물건을 담을테니, session에 담는다. -->