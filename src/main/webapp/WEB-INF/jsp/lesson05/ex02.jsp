<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>1. 조건문 (c:choose, c:when , c:otherwise)</h1>
	<c:set var="weight" value="65"/>
	
	<c:choose>					             	
		<c:when test="${weight <60 }">       <!--else if랑 같음 조건이 맞으면 break됨.-->
			치킨먹자~~~<br>
		</c:when>
		<c:when test="${weight <70 }">           <!--  위 조건을 만족 못하고 여기에 온다면 60 ~69 --> 
			샐러드먹자 <br>
		</c:when>
		<c:otherwise>                      	<!--else 랑 같은거임. 여기온다면 70이상  -->
			굶으세요 <br>		
		</c:otherwise>
	</c:choose>
	
	<h1>2. 반복문 (c:forEach)</h1>
	<c:forEach begin="0" end="5" step="1" var="val1">
		${val1}<br>
	
	</c:forEach>
	<c:forEach begin="16" end="20" step="1" var="val2" varStatus="status">       <!--begin 시작 , end 끝 , step 만큼 증가 , var 값  -->
		var:${val2}
		current : ${status.current}           <!--현재의 값  -->
		first : ${status.first}					<!--처음인지 확인여부  -->
		last : ${status.last }					<!--마지막 확인인지  -->
		count : ${status.count } 				<!--몇번 돌았는지  -->
		index : ${status.index }				<!-- index 번호  -->
  		<br>
	</c:forEach>
	
	<!--서버에서 가져온 List<String> 출력  -->
	<c:forEach var="umm" items="${fruits}" varStatus="status">
		과일 종류 : ${umm}   +++++++  ${status.count } ++++++++${status.index} <br>
	</c:forEach>
	
	<!--서버에서 가져온 List<Map<String, Object>> 출력  -->
	<c:forEach var="user" items="${users}" varStatus="status">
		<h3>${status.count } 번째 사람 정보</h3>
		이름 : ${user.name} <br>
		나이 : ${user.age} <br>
		취미 : ${user.hobby} <br>
	</c:forEach>
	
	<!--테이블 구성  -->
	<table border=1>
		<thead>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>나이</th>
				<th>취미</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="user" items="${users}" varStatus="status">
				<tr>
					<td>${status.count}</td>
					<td>${user.name}</td>
					<td>${user.age}</td>
					<td>${user.hobby}</td>
				</tr>
			</c:forEach>
		</tbody>
	
	</table>
	
</body>
</html>