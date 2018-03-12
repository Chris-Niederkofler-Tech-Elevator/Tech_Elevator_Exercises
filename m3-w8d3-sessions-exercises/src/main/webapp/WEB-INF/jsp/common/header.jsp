<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>${param.pageTitle}</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css">
		<style>
			.active {
				font-weight: bold
			}
			.nav-link {
				color: #fff;
			}
			.container-main {
				margin-top: 20px;
			}
		</style>
	</head>
	<body>
	
	<%-- <c:url value="/orderedNameInput" var="orderedNameUrl"/> --%>
	
	
	<div class="container">
		<h1>M3 W8D3 Exercises</h1>
	</div>
	
	<nav class="navbar navbar-dark bg-dark">
		<div class="container">
			<%-- <a class="${param.pageTitle.equals("xOrdered Name") ? "nav-item nav-link active" : "nav-item nav-link"}" href="${orderedNameUrl}">xOrdered Name</a> --%>
		</div>
	</nav>
	
	<div class="container container-main">