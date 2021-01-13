<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>Login</title>	
	
	<style type="text/css" title="">
	label, input {
	  display:inline-block;
	}

</style>
	
</head>
<body>
	<div style="text-align: center;">
		<form action="login.check" method="post" onsubmit="return formTest();">
			<h2>LOGIN</h2>
			<label style="width: 100px;">아이디 : </label>
			<input type="text" id="idInput" name="idInput" placeholder="아이디를 입력하세요"/>
			<br>
			<label style="width: 100px;">비밀번호 : </label>
			<input type="password" id="passwordInput" name="passwordInput" placeholder="비밀번호를 입력하세요"/>
			<br><br>
			<input type="submit" value="로그인" />
		</form>
	</div>
</body>
<script type="text/javascript">
	function formTest() {
		var id = document.getElementById("idInput").value;
		var password = document.getElementById("passwordInput").value;
		
		if(id == null || id.trim() == "") {
			alert("아이디를 입력하세요");			
			return false;
		} else if(password == null || password.trim() == "") {			
			alert("비밀번호를 입력하세요");
			return false;
		} else {
			return true;
		}
	}
</script>
</html>