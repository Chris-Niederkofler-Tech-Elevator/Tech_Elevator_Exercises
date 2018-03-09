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
	
	<c:url value="/orderedNameIn" var="orderedNameUrl"/>
	<c:url value="/colorizedNameInput" var="colorizedNameUrl"/>
	<c:url value="/fizzBuzzInput" var="fizzBuzzUrl"/>
	<c:url value="/lastTwoInput" var="lastTwoUrl"/>
	<c:url value="/babyLottoInput" var="babyLottoUrl"/>
	<c:url value="/squirrelCigarInput" var="squirrelCigarUrl"/>
	
	<div class="container">
		<h1>M3 W8D1 Exercises</h1>
	</div>
	
	<nav class="navbar navbar-dark bg-dark">
		<div class="container">
			<a class="${param.pageTitle.equals("xOrdered Name") ? "nav-item nav-link active" : "nav-item nav-link"}" href="${orderedNameUrl}">xOrdered Name</a>
			<a class="${param.pageTitle.equals("Colorized Name") ? "nav-item nav-link active" : "nav-item nav-link"}" href="${colorizedNameUrl}">Colorized Name</a>
			<a class="${param.pageTitle.equals("FizzBuzz Revisited") ? "nav-item nav-link active" : "nav-item nav-link"}" href="${fizzBuzzUrl}">FizzBuzz Revisited</a>
			<a class="${param.pageTitle.equals("Last Two") ? "nav-item nav-link active" : "nav-item nav-link"}" href="${lastTwoUrl}">Last Two</a>
			<a class="${param.pageTitle.equals("Baby Lotto") ? "nav-item nav-link active" : "nav-item nav-link"}" href="${babyLottoUrl}">Baby Lotto</a>
			<a class="${param.pageTitle.equals("Squirrel Cigar Party") ? "nav-item nav-link active" : "nav-item nav-link"}" href="${squirrelCigarUrl}">Squirrel Cigar Party</a>
		</div>
	</nav>
	
	<div class="container container-main">