<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="BBSWriteController" method="post" 
		name="bbsWriteForm" onsubmit="return bbsWriteCheck();">
		<table id="bbsWriteTbl">
			<tr>
				<td align="center">
					<br>
					<input maxlength="80" 
						name="title" placeholder="����" 
						autocomplete="off" autofocus="autofocus">
				</td>
			</tr>
			<tr>
				<td align="center">
					<textarea maxlength="280" 
					name="txt" placeholder="����"
					autocomplete="off"></textarea>
				</td>
			</tr>
			<tr>
				<td align="center">
					<button>����</button><br><br>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>