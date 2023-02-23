<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<%@ page import='java.util.List, java.util.ArrayList' %>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>

<%
	String[] checks = request.getParameterValues("check");
	Object cartObj = session.getAttribute("cart"); 
	
		List<String> cart = (List<String>)cartObj; 
		
		if(cart!=null && cart.size() > 0) {
			for(String product : checks) 
				cart.remove(product); 
			
			session.setAttribute("cart", cart);
		}
		
%> 
<c:redirect url='cartOut.jsp'/>