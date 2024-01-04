<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="JoinController" method="post"
		enctype="multipart/form-data"
	 	name="joinForm" onsubmit="return joinCheck();">
		<table id="joinTbl">
			<tr>
				<th>회원가입</th>
			</tr>
			<tr>
				<td align="center">
					<input name="id" class="boxType" placeholder="id" autofocus="autofocus" autocomplete="off" maxlength="10">
				</td>
			</tr>
			<tr>
				<td align="center">
					<input name="pw" class="boxType" placeholder="pw" type="password" maxlength="10">
				</td>
			</tr>
			<tr>
				<td align="center">
					<input name="pwChk" class="boxType" placeholder="pw확인" type="password" maxlength="10">
				</td>
			</tr>
			<tr>
				<td align="center">
					<input name="name" class="boxType" placeholder="이름" maxlength="10" autocomplete="off">
				</td>
			</tr>
			<tr>
				<td align="center">
					생년월일
					<select name="y" class="selectType">
						<c:forEach var="yy" begin="${curYear - 50 }" end="${curYear }">
							<option>${yy }</option>
						</c:forEach>
					</select>년&nbsp;&nbsp;
					<select name="m" class="selectType">
						<c:forEach var="mm" begin="1" end="12">
							<option>${mm }</option>
						</c:forEach>
					</select>월&nbsp;&nbsp;
					<select name="d" class="selectType">
						<c:forEach var="dd" begin="1" end="31">
							<option>${dd }</option>
						</c:forEach>
					</select>일
				</td>
			</tr>
			<tr>
				<td align="center">
					<input name="addr1" class="boxType" placeholder="우편번호"><br>
					<input name="addr2" class="boxType" placeholder="주소"><br>
					<input name="addr3" class="boxType" placeholder="상세주소">
				</td>
			</tr>
			<tr>
				<td align="center">
					프사
					<input name="photo" type="file" class="boxType2">
				</td>
			</tr>
			<tr>
				<td align="center">
					<button>가입</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>







