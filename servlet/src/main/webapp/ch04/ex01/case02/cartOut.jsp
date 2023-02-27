<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<%@ page import='java.util.List, java.util.ArrayList' %>
<%@ page import='java.util.StringTokenizer' %>
<a href='main.html'>진열대</a>
<%
	List<String> cart = new ArrayList<>();

	StringTokenizer st = null;
	Cookie[] cookies = request.getCookies();
	
	for(Cookie cookie: cookies) {
		if(cookie.getName().equals("cart")) {
			String tmp = cookie.getValue();
			st = new StringTokenizer(tmp, "/");
			while(st.hasMoreTokens()) //다음 토큰이 있는지 조사
				cart.add(st.nextToken()); //있으면 읽어낸다.
		}
	}
	
	if(cart.size() > 0) {
%>
		<ul>
<%
			for(String product: cart) {
%>	
				<li><%= product %></li>
<%
			}
%>
		</ul>
<%
	} else out.println("물건이 없습니다.");
%>
<!-- 
StringTokenizer: 문자 하나를 토큰으로 쪼갠다.
 -->