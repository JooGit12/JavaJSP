<%@page import="javax.script.ScriptEngine"%>
<%@page import="java.util.HashMap"%>
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
	double n = Double.parseDouble(request.getParameter("no"));
	String w = request.getParameter("what");

	HashMap<String, String[]> hm = new HashMap<>();
	hm.put("len", new String[] { "cm", "inch" });
	hm.put("size", new String[] { "㎡", "평" });
	hm.put("temp", new String[] { "℃", "℉" });
	hm.put("spd", new String[] { "km/h", "mi/h" });

	double result = n * 0.621371;
	if (w.equals("len")) {
		result = n * 0.393701;
	} else if (w.equals("size")) {
		result = n * 0.3025;
	} else if (w.equals("temp")) {
		result = (n * (9 / 5)) + 32;
	}
	%>
	
	<table id="<%=w %>">
		<tr>
			<th>변환결과</th>
		</tr>
		<tr>
			<td align="center">
				<%=String.format("%.1f", n)%> <%=hm.get(w)[0] %>
			</td>
		</tr>
		<tr>
			<td align="center">
				↓
			</td>
		</tr>
		<tr>
			<td align="center">
				<%=String.format("%.1f", result)%> <%=hm.get(w)[1] %>
			</td>
		</tr>
	</table>
</body>
</html>











