<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<form action='userOut' method='post'><!-- 핸들러에 붙어있는 url이다. -->
	<label>이름: <input type='text' name='username'/></label><br>
	<label>나이: <input type='number' name='age'/></label><br>
	<label>등록일: <input type='date' name='regDate'/></label><br>
	<input type='submit'/>
</form>