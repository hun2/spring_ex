<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>        


<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>	
</head>
<body>

	<%-- 기존 form 방식 --%>
	<div class="container">
		<h1>회원 정보 추가</h1>
		<form method="post" action="/lesson06/ex01/add_user">
		
			<div class="form-group">
				<label for="name">이름</label>
				<input type="text" id="name" name="name" class="form-control">
			</div>
			<div class="form-group">
				<label for="yyyymmdd">생년월일</label>
				<input type="text" id="yyyymmdd" name="yyyymmdd" class="form-control">
			</div>
			<div class="form-group">
				<label for="email">이메일</label>
				<input type="text" id="email" name="email" class="form-control">
			</div>
			<div class="form-group">
				<label for="introduce">자기소개</label>
				<textarea id="introduce" name="introduce" class="form-control"></textarea>
			</div>
			<button type="button" class="btn btn-success" id="addBtn">저장</button>
		</form>
	</div>
	
	
	
	
	
	
<script>
	$(document).ready(function(){
	
		
		/* // 2. jquery의 submit 기능 이용하기. (form id 설정해서 가져오든 그냥 form 통째로 가져오든 선택)
		$('form').on('submit', function(e){
		
			//e.preventDefault(); // submit되는것을 막는다.
			//alert("추가버튼 클릭");
			
			//valdation (유효성검사)
			var name = $('#name').val().trim();			
			if (name.length < 1) {
				alert("이름을 입력하세요");
				return false;
			} 
			
			var yyyymmdd =  $('#yyyymmdd').val().trim();
			if (yyyymmdd == "") {
				alert("생년월일 입력하세요");
				return false;
			}
			
			if (isNaN(yyyymmdd)) {
				alert("숫자만 입력하세요");
				return false;
				
			}
			
			var email = $('#email').val().trim();
			if (email == "") {
				alert("이메일을 입력하세요");
				return false;
			}
			
			//여기까지 도달하면 submit 이 진행된다. 
			
		}) */
		
		
		//ajax 를 사용하려면 반드시 form 태그 안 submit 을 제거해야한다. 쓰지말라는거임 form 을 ㅋ
		// 만약 쓴다면 type을 반드시 제거!!!! (submit 제거!!★)
		// 3. jquery 의 ajax 통신을 이용하기 ( 하기전에 submit 을 반드시 button으루 바꾸기 ㅋ)
		$('#addBtn').on('click', function(e) {
			
			e.preventDefault();
			
			//valdation (유효성검사)
			var name = $('#name').val().trim();			
			if (name.length < 1) {
				alert("이름을 입력하세요");
				return ;
			} 
			
			var yyyymmdd =  $('#yyyymmdd').val().trim();
			if (yyyymmdd == "") {
				alert("생년월일 입력하세요");
				return ;
			}
			
			if (isNaN(yyyymmdd)) {
				alert("숫자만 입력하세요");
				return ;
				
			}
			
			var email = $('#email').val().trim();
			if (email == "") {
				alert("이메일을 입력하세요");
				return ;
			}
			
			
			
			// 유효성 검사 후 서버에 데이타 전송해야하는데 그때 ajax
			//비동기로 별도 요청(request)
			
			$.ajax({
				//request	
				type:"post"         // method 방식
				, url : "/lesson06/ex01/add_user"    // 요청주소
				, data :{"name": name, "yyyymmdd" : yyyymmdd, "email" : email, "introduce" : introduce}
				
				
				//response
				, success: function(data){
					alert(data);
				}
				, error : function(e) {
					alert("에러" + e);
				}
			});
			
			
			
			
			
			
		})
		
		
		
		
	})
	



</script>	
	
	
</body>
</html>