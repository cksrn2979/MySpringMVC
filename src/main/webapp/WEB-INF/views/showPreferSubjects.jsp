<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>

<title>Insert title here</title>
</head>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/main.css">
<body>

	선호 교과목 사전 수강 신청 조회 
	
	<table cellspacing="1" cellpadding="3" border="0" bgcolor="#737373"
		valign="top">
		<tr>
			<td bgcolor="#D0D8FF" width="80" align="center">과목코드</td>
			<td bgcolor="#D0D8FF" width="300" align="center">과목명</td>
			<td bgcolor="#D0D8FF" width="80" align="center">구분</td>
			<td bgcolor="#D0D8FF" width="50" align="center">학점</td>
		</tr>

		<c:forEach var="prefersubject" items="${prefersubjects}">
			<tr>
				<td bgcolor="#F5F5F5" align="center">${prefersubject.subjectcode}</td>
				<td bgcolor="#F5F5F5" align="center">${prefersubject.subjectname}</td>
				<td bgcolor="#F5F5F5" align="center">${prefersubject.division}</td>
				<td bgcolor="#F5F5F5" align="center">${prefersubject.credit}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>