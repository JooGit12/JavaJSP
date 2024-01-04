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
	<c:if test="${page != 1 }">
		<table id="snsL">
			<tr>
				<td align="center" onmouseleave="snsPageChange(${page - 1 });"></td>
			</tr>
		</table>
	</c:if>
	
	<c:if test="${page != pageCount }">
		<table id="snsR">
			<tr>
				<td align="center" onmouseleave="snsPageChange(${page + 1 });"></td>
			</tr>
		</table>
	</c:if>
	
	<br><br>
	<c:forEach var="sm" items="${msgs }">
		<table class="aSNSMsg" style="box-shadow: 5px 5px 5px ${sm.color};">
			<tr>
				<td align="center" rowspan="4" valign="top" class="aSNSPhoto">
					<img src="img/${sm.ownerPhoto }">
				</td>
				<td class="aSNSOwner" style="color:${sm.color};">${sm.owner }</td>
			</tr>
			<tr>
				<td align="right" class="aSNSDate">
					<fmt:formatDate value="${sm.date }" type="both" dateStyle="long" timeStyle="short"/>
				</td>
			</tr>
			<tr>
				<td class="aSNSTxt">${sm.txt }</td>
			</tr>
			<tr>
				<td class="aSNSReplyArea">
					<c:forEach var="sr" items="${sm.replys }">
						<div class="aSNSReply">
						<c:choose>
							<c:when test="${sr.owner == sessionScope.loginMember.id }">
								<span ondblclick="snsReplyDelete(${sr.no}, ${page });" style="color:${sm.color}; margin-right:10px; cursor:pointer;">${sr.owner }</span>
							</c:when>
							<c:otherwise>
								<span style="color:${sm.color}; margin-right:10px;">${sr.owner }</span>
							</c:otherwise>
						</c:choose>
						${sr.txt }(<fmt:formatDate value="${sr.date }" type="both" dateStyle="short" timeStyle="short"/>)</div>
					</c:forEach>
					
					<c:if test="${sessionScope.loginMember != null }">
						<div class="aSNSLine" style="background-color:${sm.color};margin-top:15px;"></div>
						<form action="SNSReplyWriteController" onsubmit="return snsReplyWriteCheck(this);">
							<input name="p" value="${page }" type="hidden">
							<input name="s_no" value="${sm.no }" type="hidden">
							<input name="token" value="${token }" type="hidden">
							<span style="color:${sm.color}; margin-right:0px;">${sessionScope.loginMember.id }</span>
							<input name="txt" maxlength="130" style="border-bottom:${sm.color} solid 2px;" autocomplete="off">
							<button style="color:${sm.color}; font-size:10pt; margin-left:0px;">쓰기</button>
						</form>
					</c:if>
				</td>
			</tr>
			<c:if test="${sessionScope.loginMember.id == sm.owner }">
				<tr>
					<td colspan="2" align="right">
						<button onclick="snsMsgUpdate(${sm.no}, '${sm.txt }', ${page });" style="color:${sm.color};">수정</button>
						<button onclick="snsMsgDelete(${sm.no});" style="color:${sm.color};">삭제</button>
					</td>
				</tr>
			</c:if>
		</table>
	</c:forEach>
	<c:if test="${sessionScope.loginMember != null }">
		<form action="SNSWriteController" method="post" name="snsWriteForm" onsubmit="return snsWriteCheck();">
			<table id="snsWriteTbl">
				<tr>
					<td align="center">
						<input name="token" value="${token }" type="hidden">
						<textarea name="txt" placeholder="뭐" maxlength="450"></textarea>
					</td>
					<td align="center">
						<input type="image" src="img/pen.png" class="subMenuIcon">
					</td>
				</tr>		
			</table>
		</form>
		<form action="SNSSearchController" name="snsSearchForm" onsubmit="return snsSearchCheck();">
			<table id="snsSearchTbl">
				<tr>
					<td align="center">
						<input name="txt" class="boxType" placeholder="뭐" maxlength="100" autocomplete="off">
					</td>
					<td align="center">
						<input type="image" src="img/search.png" class="subMenuIcon">
					</td>
				</tr>
			</table>
		</form>
	</c:if>
</body>
</html>

