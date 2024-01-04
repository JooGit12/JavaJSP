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
		double xxx = Double.parseDouble(request.getParameter("xx"));
		double yyy = Double.parseDouble(request.getParameter("yy"));
		double bigger = (xxx > yyy) ? xxx : yyy;
	%>
	<h1>더 큰거 : <%=bigger %></h1>
</body>
</html>









