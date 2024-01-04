<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>May25</title>
<link rel="stylesheet" href="css/index.css">
<link rel="stylesheet" href="css/jstlc.css">
<script type="text/javascript" src="js/kwonValidChecker.js"></script>
<script type="text/javascript" src="js/may25check.js"></script>
</head>
<body>
	<table id="siteTitleArea">
		<tr>
			<td align="center">
				<table>
					<tr><td>May25</td></tr>
				</table>
			</td>
		</tr>
	</table>
	<table id="siteMenuArea">
		<tr><td><a href="HomeController">Ȩ</a></td></tr>
		<tr><td><a href="JSTLCController">JSTL-core</a></td></tr>
		<tr><td><a href="JSTLFController">JSTL-formatting</a></td></tr>
		<tr><td><a href="DBController">DB</a></td></tr>
		<tr><td><a href="">?</a></td></tr>
	</table>
	<table id="siteContentArea">
		<tr>
			<td align="center">
				<jsp:include page="${contentPPPage }"></jsp:include>
			</td>		
		</tr>
	</table>
</body>
</html>

