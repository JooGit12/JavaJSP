<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${param.n > 5 }">
		<h1>5���� ŭ</h1>
	</c:if> 
	<hr>
	<c:choose>
		<c:when test="${oeResult == 'Ȧ��' }">
			<h1>${param.n }�� ${oeResult }</h1>
		</c:when>
		<c:when test="${oeResult == 'ȣ�ü�' }">
			<h1>��</h1>
		</c:when>
		<c:otherwise>
			<h3>${param.n }�� ${oeResult }</h3>
		</c:otherwise>
	</c:choose>
	<hr>
	<c:forEach var="i" begin="2" end="20" step="3">
		<h2>${i }</h2>
	</c:forEach>
	<hr>
	<c:forEach var="m" items="${menus }">
		${m.name } : ${m.price }<br>
	</c:forEach>
	<%
		// .jsp���� java�ҽ� ������
		//		�� �ޱ� : EL
		//		������  : CustomTag
		// CustomTag
		//		jspǥ�ؾ׼��±� : �⺻ ��밡��
		//		����Ŀ�����±� : �ܺ� .jar���� �ְ�
		//			JSTL(JSP Standard Tag Library)
		//				core - for/if
		//				formatting - ��������
		//				functions - ���ڿ����� �޼ҵ�
		//				?
		//				?
		//				���� ����Ŵ� attribute���
	%>
</body>
</html>







