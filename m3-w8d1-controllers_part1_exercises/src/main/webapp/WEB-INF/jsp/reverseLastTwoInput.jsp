<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/header.jsp">
	<c:param name="pageTitle" value="Last Two"/>
</c:import>

<h3>Last Two</h3>

<c:url var="formInput" value="/reverseLastTwoOutput" />
<form method="GET" action="${formInput}">

	<c:forEach begin="1" end="10" var="num">
		<label for="word">Word ${num}: </label>
		<input type="text" name="word" />
		<br />
	</c:forEach>
	
	<input type="submit" value="Submit" />

</form>

<c:import url="/WEB-INF/jsp/footer.jsp"/>