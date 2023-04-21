<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<form method='post' encType='multipart/form-data'>
	<label>이름: <input type='text' name='username'/></label><br>
	<label>나이: <input type='number' name='age'/></label><br>
	<label>얼굴: <input type='file' name='face'/></label><br>
	<input type='submit'/>
</form>

<!-- 
encType: enctype 속성은 폼 데이터(form data)가 서버로 
		 제출될 때 해당 데이터가 인코딩되는 방법을 명시합니다.
multipart/form-data' : 모든 문자를 인코딩하지 않음을 명시함.
 -->