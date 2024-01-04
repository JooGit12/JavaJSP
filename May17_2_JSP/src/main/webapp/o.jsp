<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		String xxx = request.getParameter("xx");
		int xxxx = Integer.parseInt(xxx);
		int yyyy = Integer.parseInt(request.getParameter("yy"));
	%>
	<table border="1">
		<tr><td><%=xxxx + yyyy %></td></tr>
		<tr><td><%=xxxx - yyyy %></td></tr>
		<tr><td><%=xxxx * yyyy %></td></tr>
		<tr><td><%=xxxx / yyyy %></td></tr>
	</table>
</body>
</html>





