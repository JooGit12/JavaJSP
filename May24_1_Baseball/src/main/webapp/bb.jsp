<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>���ھ߱�</title>
<link rel="stylesheet" href="bb.css">
<script type="text/javascript" src="js/kwonValidChecker.js"></script>
<script type="text/javascript" src="js/bbCheck.js"></script>
</head>
<body>
	<form action="HomeController" method="post"
		name="bbForm" onsubmit="return check();">
		<table>
			<tr>
				<th>���ھ߱�</th>
			</tr>
			<tr>
				<td id="resultTd">
					S : ${s }<br> 
					B : ${b }<br>
					${result }
				</td>
			</tr>
			<tr>
				<td align="center">
					<input
						placeholder="${param.no }"
						name="no" maxlength="3"
						autocomplete="off" autofocus="autofocus">
				</td>
			</tr>
			<tr>
				<td align="center">
					<button>Ȯ��</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>

