<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
String: ${"hello"} <br>
int: ${10} <br>
double: ${10.0} <br>
boolean: ${true} <br>
null: ${null}

\${5 * 2} : ${5 * 2} <br>
${ 5 > 2 }<br>
${5 > 2 ? 5 : 2 } <br>
${ 5 > 2 || 5 < 2 }

<!-- java 코드를 제거해서 페이지를 깨끗하게 만들기 위해서 -->