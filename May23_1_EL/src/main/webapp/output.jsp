<%@page import="java.util.ArrayList"%>
<%@page import="com.kwon.may231el.main.Dog"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		// .jsp(V) : �������̳� - ���α׷����� �ϴ� ����� �ƴ�
		// => .jsp���� java�ҽ� ������
		// .jsp�� java�ҽ� �� ���� ����
		//		1) �� �ޱ� - EL
		//		2) for/if
		//		3) ��� ����
		//		...
		
		// EL(Expression Language)
		//		�� ���� �� Java��� ��밡����
		//		Java�ƴ�, tomcat�� Java�� �ٲ��� -> .jsp������ ����
		//		������ ��밡��, ����ȯ �ڵ�, 
		//		�� ������ ���°�, import��� ��
		//		req param : ${param.�Ķ���͸�}
		//		req attr
		//			�⺻���� : ${��Ʈ����Ʈ��}
		//			��ü�� : ${��Ʈ����Ʈ��.���������} : ����� getter���°�
		//			ArrayList<��ü> : ${��Ʈ����Ʈ��[�ε���].���������}
		String j11 = request.getParameter("j1");
		int agee = (Integer) request.getAttribute("age");
		Dog dd = (Dog) request.getAttribute("d");
		ArrayList<Dog> dogs = (ArrayList<Dog>) request.getAttribute("dogs");
	%>
	���� : <%=j11 %> <br>
	���� : <%=agee %><br>
	<%=dd %><br>
	<%=dd.getName() %>, <%=dd.getAge() %><br>
	<%=dogs %><br>
	<%
		for (Dog ddd : dogs) {
	%>
			<%=ddd.getName() %>, <%=ddd.getAge() %><br>
	<%
		}
	%>
	<hr>
	���� : ${param.j1 } <br>
	���� : ${age }<br>
	${d }<br>
	${d.name}, ${d.age}<br>
	${dogs}<br>
	${dogs[0]}<br>
	${dogs[0].name}, ${dogs[0].age}<br>  
	${dogs[1].name}, ${dogs[1].age}<br>  
	${dogs[2].name}, ${dogs[2].age}<br>  
	
	${age + 10 }<br>
	${sdkjfl }
</body>
</html>




