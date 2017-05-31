<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
	<head>
	<title>PalmPesa | Login</title>
	<style>
		body {
			margin: 0px !important;
		}
		
		.top-header {
			background: lightgrey;
			width: 100%;
			position: fixed;
			top: 0px;
		}
		
		.header {
			text-align: center;
			width: 80%;
			margin: auto;
		}
		.logo {
			display: inline-block;
			color: green;
		}
		.login-form{
		    margin: auto;
		    width: 30%;
		    background-color: lightblue;
		    margin-top: 120px;
		}
		.footer {
			background: #4CAF50;
			width: 100%;
			position: fixed;
			bottom: 0px;
			text-align: -webkit-center;
		}
	</style>
	</head>
	<body>
		<div class="top-header">
			<div class="header">
				<h1 class="logo">PalmPesa | Login</h1>
			</div>
		</div>
		<div class="login-form">
			<h1>Login Here!</h1>
			<p th:if="${loginError}" class="error">Wrong user or password</p>
			<form th:action="@{/login.html}" method="post">
				<label for="username">Username</label>: 
				<input type="text"id="username" name="username" autofocus="autofocus" value="admin" /> <br /> 
				<label for="password">Password</label>: 
				<input type="password" id="password" name="password" value="123" /> <br /> 
				<input type="submit" value="Log in" /> 
				<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			</form>
		</div>
		
		<div class="footer">Copyright @2017 PalmPesa</div>
		
	</body>
</html>