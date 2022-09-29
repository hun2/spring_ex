<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL fmt 라이브러리</title>
</head>
<body>
	<c:set var="number" value="12345678" />
	<h1>숫자 출력</h1>
	<fmt:formatNumber value="${number}" />         <!--3자리마다 콤마가 찍힌다. -->
	
	
	<h1>Type</h1>
	숫자 : <fmt:formatNumber value="${number}" type="number"/><br>   <!--type 은 정해져있다. number로 찍을거다(원래 기본값임)   -->
	숫자 3자리마다 쉼표 제거 : <fmt:formatNumber value="${number}" type="number" groupingUsed="false" /><br>   <!--기본값은 true 라 false 하면 기본값 세팅이 날라감.-->
	
	
	<%-- percent는 값 1이 100%를 의미한다.  --%>
	100% : <fmt:formatNumber value="1" type="percent" /> <br>
	40% : <fmt:formatNumber value="0.4" type="percent"/> <br>
	
	<%-- 통화는 type이 cyrrency 다. --%>
	통화(원) : <fmt:formatNumber value="${number}" type="currency"/> <br> 
	통화(달러) : <fmt:formatNumber value="${number}" type="currency" currencySymbol="$"/> <br>
	
	<h1>var로 변수에 저장</h1>
	<fmt:formatNumber value="${number }" type="currency" currencySymbol="$" var="doller"/>
	달러 EL로 출력 : ${doller } <br>
	
	<h1>Pattern</h1>
	3.14 : <fmt:formatNumber value="3.14" /><br>
	3.14(0.0000) : <fmt:formatNumber value="3.14" pattern="0.0000" /><br>   <%-- 0은 무조건 표시 --%>
	3.14(#.####) : <fmt:formatNumber value="3.14" pattern="#.####" /><br>   <%-- #은 있는 값만 표시 --%>
	3.141592(#.####) : <fmt:formatNumber value="3.141592" pattern="#.####" /><br>   <%-- #은 있는 값만 표시 --%>
	<hr>
	
	
	<h1>Date 객체를 String 형태로 출력 => fmt:formatDate</h1>
		
	today : ${today} <br>
	<fmt:formatDate value="${today}" pattern="yyyy년 MM월 dd일 HH시  mm분 ss초"  /> <br>
	<fmt:formatDate value="${today}" pattern="yyyy년 MM월 dd일 HH시  mm분 ss초" var="pattern1" /> 
	pattern1 : ${pattern1} <br>
	
	
	<fmt:formatDate value="${today}" pattern="yyyy/MM/dd HH:mm:ss" var="pattern2" />
	pattern2 : ${pattern2 } <br>
	
	
	<h1> String 객체를 Date 형태로 출력 => fmt:parseDate</h1>
	<fmt:parseDate value="${pattern2}" pattern="yyyy/MM/dd HH:mm:ss" var="date2"/>
	Date 객체 : ${date2}
	
	
		
	
</body>
</html>