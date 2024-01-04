<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>블록체인 네트워크 보안을 적용한 AI 서비스 기반 풀스택 개발자 카페</title>
<link rel="stylesheet" href="css/index.css">
<link rel="stylesheet" href="css/member.css">
<link rel="stylesheet" href="css/sns.css">
<script type="text/javascript" src="js/kwonValidChecker.js"></script>
<script type="text/javascript" src="js/bnsaabfpCheck.js"></script>
<script type="text/javascript" src="js/bnsaabfpMove.js"></script>
</head>
<body>
	<table id="siteTitleArea">
		<tr>
			<td align="center">
				<table>
					<tr>
						<td>
							<a href="HomeController">
								<span class="bigTitle">블록체인 네트워크</span> 보안을 적용한 <span class="bigTitle">AI</span> 서비스 기반 <span class="bigTitle">풀스택 개발자</span> 카페 <span id="v">v1.0</span>
							</a>
						</td>
					</tr>
					<tr>
						<td align="right" id="result">
							${r }&nbsp;
						</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
	<table id="siteContentArea">
		<tr>
			<td align="center">
				<jsp:include page="${contentPage }"></jsp:include>
			</td>
		</tr>
	</table>
	<table id="siteMenuArea">
		<tr>
			<td align="center" id="startBtn">
				<img src="img/window.png">
			</td>
			<td>
				<jsp:include page="${subMenuPage }"></jsp:include>
				<jsp:include page="${loginMenuPage }"></jsp:include>
			</td>
		</tr>
	</table>
	<table id="siteMenuArea2">
		<tr>
			<td align="center" colspan="2">
				<jsp:include page="${loginPage }"></jsp:include>
			</td>
		</tr>
		<tr class="menuTr">
			<td class="td1" align="center">
				<img src="img/dataroom.png">
			</td>
			<td class="td2">자료실</td>
		</tr>
		<tr class="menuTr">
			<td class="td1" align="center">
				<img src="img/gallery.png">
			</td>
			<td class="td2">갤러리</td>
		</tr>
		<tr class="menuTr">
			<td class="td1" align="center">
				<img src="img/brush.png">
			</td>
			<td class="td2">낙서</td>
		</tr>
		<tr>
			<td align="right" colspan="2" style="padding-right: 7px; padding-bottom: 15px; font-size: 11pt;">Programmed by<br>
			권기웅</td>
		</tr>
	</table>
</body>
</html>