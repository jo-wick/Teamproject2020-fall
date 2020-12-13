<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" href="../resources/css/member/login.css">
</head>
<body>

<div class="wrapper">
	
	<div class="wrap">
		<div class="logo_wrap">
			<span>Cooking kitchen</span>
		</div>
	<form method="post" action="loginOk">
		<div class="login_wrap"> 
			<div class="id_wrap">
					<div class="id_input_box">
					<label>User ID: </label><input type='text' name='userid'/>
				</div>
			</div>
			<div class="pw_wrap">
				<div class="pw_input_box">
				<label>Password: </label><input type='password' name='password'/>
				</div>
			</div>
			<div class="login_button_wrap">
				<button type="submit" class="login_button">로그인</button>
				
			</div>			
		</div>
	</form>
		
	</div>

</div>

</body>
</html>