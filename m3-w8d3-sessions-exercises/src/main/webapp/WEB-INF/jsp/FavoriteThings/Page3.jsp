
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="pageTitle" value="Page 3"/>
</c:import>

<h2>Favorite Things Exercise</h2>

<p class="lead">What is your favorite season?</p>

<c:url var="formUrl" value="/FavoriteThings/Page3"/>
<form action="${formUrl}" method="POST">
	<input type="radio" name="season" value="spring"/> Spring
	<input type="radio" name="season" value="summer"/> Summer
	<input type="radio" name="season" value="fall"/> Fall
	<input type="radio" name="season" value="winter"/> Winter
	<br/>
	<input type="submit" value="Next >>>"/>	
</form>

<c:import url="/WEB-INF/jsp/common/footer.jsp"/>