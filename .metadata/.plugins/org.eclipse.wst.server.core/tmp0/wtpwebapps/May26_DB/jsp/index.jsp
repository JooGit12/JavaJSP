<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>May26</title>
<link rel="stylesheet" href="css/index.css">
<link rel="stylesheet" href="css/bbs.css">
<script type="text/javascript" src="js/kwonValidChecker.js"></script>
<script type="text/javascript" src="js/may26check.js"></script>
<script type="text/javascript" src="js/may26move.js"></script>
</head>
<body>
	<table id="siteTitleArea">
		<tr>
			<td align="center">
				<table id="siteTitle"><tr><td>May26</td></tr></table>
			</td>
		</tr>
		<tr>
			<td align="center" id="siteMenu">
				<table><tr><td>
					<a href="HomeController">홈</a>
					<a href="BBSController">게시판</a>
				</td></tr></table>
			</td>
		</tr>
	</table>
	<table id="siteContentArea">
		<tr>
			<td align="center">
				<jsp:include page="${cp }"></jsp:include>
			</td>
		</tr>
	</table>
	<div id="resultArea">${result }</div>
</body>
</html>



