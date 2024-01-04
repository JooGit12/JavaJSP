<%@page import="com.kwon.may224bc.main.Guest"%>
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
	<%
	Guest g = (Guest) request.getAttribute("g");
	%>
	<table>
		<tr>
			<th><%=g.getName()%></th>
		</tr>
		<tr>
			<td align="center"><img src="img/<%=g.getPhoto()%>"></td>
		</tr>
		<tr>
			<td>키 : <%=g.getHeight()%>m
			</td>
		</tr>
		<tr>
			<td>몸무게 : <%=g.getWeight()%>kg
			</td>
		</tr>
		<tr>
			<td>BMI : <%=g.getBmi()%>
			</td>
		</tr>
		<tr>
			<td align="center"><%=g.getResult()%></td>
		</tr>
	</table>
</body>
</html>



