<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>PalmPesa | Student</title>
<link href="css/style.css" rel="stylesheet" media="screen"/>
</head>
<body>

	<div class="top-header">
		<div class="header">
			<a class="back" href="<c:url value="#" />"> Home</a>
			<h1 class="logo">PalmPesa | Student Panel</h1>
			<a class="logout" href="<c:url value="/logout" />"> Logout </a>
		</div>
	</div>
	<div class="content">
		<div class="left">
			<a class="plain-a" href="#">
				<span class="link">Transactions</span>
			</a> 

		</div>
		<div class="right">
			<div>
				<span class="theading">List for Transactions</span>
				<a href="#"><button class="button">Print</button></a>
			</div>
		</div>
	</div>

	<div class="footer">Copyright @2017 by Cleave Masereka</div>


</body>
</html>