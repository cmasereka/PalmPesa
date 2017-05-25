<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<title>Login page</title>
</head>
<body>
	<h1>Login page</h1>
	<p th:if="${loginError}" class="error">Wrong user or password</p>
	<form th:action="@{/login.html}" method="post">
		<label for="username">Username</label>: <input type="text"id="username" name="username" autofocus="autofocus" /> <br /> 
		<label for="password">Password</label>: <input type="password" id="password" name="password" /> <br /> 
		<input type="submit" value="Log in" /> 
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
	</form>
</body>
</html>