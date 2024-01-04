<%@page import="com.kwon.may223uc.main.UCResult"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" href="css/uc.css">
</head>
<body>
	<%
		UCResult ucr = (UCResult) request.getAttribute("ucr");
	%>
	
	<table id="<%=ucr.getWhat() %>">
		<tr>
			<th>변환결과</th>
		</tr>
		<tr>
			<td align="center">
				<%=ucr.getFrom()%> <%=ucr.getFromUnit() %>
			</td>
		</tr>
		<tr>
			<td align="center">↓</td>
		</tr>
		<tr>
			<td align="center">
				<%=ucr.getTo()%> <%=ucr.getToUnit() %>
			</td>
		</tr>
	</table>
</body>
</html>











