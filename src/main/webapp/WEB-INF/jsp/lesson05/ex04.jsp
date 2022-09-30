<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL Fn 라이브러리</title>
</head>
<body>
	<c:set var="str1" value="No pain. No gain" />
	
	<h1>1. 길이 구하기 함수</h1>
	str1 변수의 길이는 : ${fn:length(str1)} <br>
	
	<h1>2. 특정 문자열이 있는지 확인</h1>
	str1 에 No가 존재하는가?  ${fn:contains(str1, "No")} <br>
	str1 에 no가 존재하는가? ${fn:contains(str1, "no")} <br>
	
	<c:if test="${fn:containsIgnoreCase(str1, 'no')}"> 
		str1에 no라는 문자열이 존재한다. (대소문자 구별안하는 IngnoreCase씀.)
	
	</c:if>
	
	
	<h1>3. 특정 문자열로 시작하는지 확인</h1>
	str1은 No로 시작하는가? ${fn:startsWith(str1, 'No')} <br>
	
	
	<h1>4. 특정 문자열로 끝나는지 확인</h1>
	str1은 n으로 끝나는가? ${fn:endsWith(str1, 'n')} <br>
	str1은 gain으로 끝나는가? ${fn:endsWith(str1, 'gain') } <br>
	
	<h1>5. 문자열 치환</h1>
	<c:set var="str2" value="I love chicken" />
	${str2}<br>
	빵으로 변환 : ${fn:replace(str2, 'chicken', 'bread')}
	
	<h1>6. 구분자로 잘라서 배열 만들기</h1>
	
	${fn:split(str1, '.')[0]}<br>
	${fn:split(str1, '.')[1]}<br>
	<c:set value="${fn:split(str1, '.')}" var="test"   /><br>
	${test[0]}
	
	
	
	
	<h1>7. 시작 인덱스 종료 인덱스 까지 구하기(substring)</h1>
	<%-- str2에서 love 추출 --%>
	${fn:substring(str2, 2, 6)}


	<h1>8. 모두 소문자로 변경 (toLowerCase)</h1>
	${fn:toLowerCase(str2)}
	
	<h1>9. 모두 대문자로 변경 (toUpperCase)</h1>
	${fn:toUpperCase(str2)}
	
	<h1>10. 앞 뒤 공백 제거 (trim)</h1>	
	
	<c:set var="str3" value="         hello         " />
	<pre>str3 : ${str3}</pre> <%-- 공백이 고대로 출력됨. --%>
	<pre>str3 : ${fn:trim(str3)} </pre>
	
	
	
	
</body>
</html>