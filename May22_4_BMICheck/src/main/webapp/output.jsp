<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bc.css">
</head>
<body>
	<table>
		<tr>
			<th>${g.name }</th>
		</tr>
		<tr>
			<td align="center"><img src="img/${g.photo }"></td>
		</tr>
		<tr>
			<td>키 : ${g.height * 100}cm
			</td>
		</tr>
		<tr>
			<td>몸무게 : ${g.weight }kg
			</td>
		</tr>
		<tr>
			<td>BMI : ${g.bmi }
			</td>
		</tr>
		<tr>
			<td align="center">${g.result }</td>
		</tr>
	</table>
</body>
</html>



