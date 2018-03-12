
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="pageTitle" value="Page 2"/>
</c:import>

<h2>Favorite Things Exercise</h2>

<p class="lead">What is your favorite food?</p>

<c:url var="formUrl" value="/FavoriteThings/Page2"/>
<form action="${formUrl}" method="POST">
	<input type="text" name="food"/>
	<input type="submit" value="Next >>>"/>	
</form>

<c:import url="/WEB-INF/jsp/common/footer.jsp"/>