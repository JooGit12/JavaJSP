<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form name="calcForm" 
		action="CalcController" method="post" 
		onsubmit="return calcCheck();">
		x : <input name="x" class="calcInput"><p>
		y : <input name="y" class="calcInput"><p>
		<button class="calcBtn">계산</button>
	</form>
</body>
</html>



