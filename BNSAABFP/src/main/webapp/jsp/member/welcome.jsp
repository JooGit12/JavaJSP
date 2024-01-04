<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table id="loginTbl">
		<tr>
			<td align="center" id="pSa" rowspan="2">
				<img src="img/${sessionScope.loginMember.photo }">
			</td>
			<td id="loginID" valign="top">
				${sessionScope.loginMember.id }
			</td>
		</tr>
		<tr>
			<td id="loginName" align="right">
				${sessionScope.loginMember.name }님 ㅎㅇ
			</td>
		</tr>
	</table>
</body>
</html>