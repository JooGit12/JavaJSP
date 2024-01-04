<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table id="bbsArea">
		<tr>
			<td align="right">
				<a href="BBSWriteController" class="bbsGo">글쓰기</a>
			</td>
		</tr>
		<tr>
			<td align="center">
				<table id="bbs">
					<tr>
						<th class="td1">번호</th>
						<th class="td2">제목</th>
						<th>날짜</th>
					</tr>
					<c:forEach var="m" items="${msgs }">
						<tr class="dataTr" onclick="goBBSDetail(${m.no});">
							<td align="center">${m.no }</td>
							<td>${m.title }</td>
							<td align="center">
								<fmt:formatDate value="${m.date }" type="date" dateStyle="short"/>
							</td>
						</tr>
					</c:forEach>
				</table>
			</td>
		</tr>
		<tr>
			<td align="center">
				<c:forEach var="p" begin="1" end="${pageCount }">
					<a href="BBSPageController?page=${p }" class="bbsPageChanger">${p }</a>				
				</c:forEach>
			</td>
		</tr>
		<tr>
			<td align="center">검색</td>
		</tr>
	</table>
</body>
</html>