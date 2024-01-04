<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<!-- 
	(include빼고)
	css/js/그림파일/... 상대경로가 .jsp기준x
	C기준(webapp폴더)기준
	
	.jsp -> 서블릿으로 바뀌어 실행되니
 -->
<link rel="stylesheet" href="css/index.css">
<link rel="stylesheet" href="css/bb.css">
<link rel="stylesheet" href="css/calc.css">
<script type="text/javascript" src="js/kwonValidChecker.js"></script>
<script type="text/javascript" src="js/may242check.js"></script>
</head>
<body>
	<table id="site">
		<tr>
			<td id="siteTitle">May24_2_CustomTag</td>
		</tr>
		<tr>
			<td id="siteMenu">
				<a href="HomeController">홈</a>
				<a href="TestController">테스트</a>
				<a href="CalcController">사칙연산</a>
				<a href="BBController">숫자야구</a>
			</td>
		</tr>
		<tr>
			<td id="siteContent" align="center">
				<jsp:include page="${contentPageHaha }"></jsp:include>
			</td>
		</tr>
	</table>
</body>
</html>






