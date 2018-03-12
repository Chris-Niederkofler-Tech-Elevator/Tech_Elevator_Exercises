<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="pageTitle" value="Page 1"/>
</c:import>

<h2>Favorite Things Exercise</h2>

<p class="lead">What is your favorite color?</p>

<c:url var="formUrl" value="/FavoriteThings/Page1"/>
<form action="${formUrl}" method="POST">
	<input type="text" name="color"/>
	<input type="submit" value="Next >>>"/>	
</form>

<c:import url="/WEB-INF/jsp/common/footer.jsp"/>