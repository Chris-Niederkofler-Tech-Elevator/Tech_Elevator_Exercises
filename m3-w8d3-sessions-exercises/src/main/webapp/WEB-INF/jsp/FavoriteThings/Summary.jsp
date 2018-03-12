<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="pageTitle" value="Summary"/>
</c:import>

<h2>Favorite Things Exercise</h2>

<table>
	<tr>
		<th>Favorite Color:</th>
		<td>${favoriteThings.color}</td>
	</tr>
	<tr>
		<th>Favorite Food:</th>
		<td>${favoriteThings.food}</td>
	</tr>
	<tr>
		<th>Favorite Season:</th>
		<td>${favoriteThings.season}</td>
	</tr>
</table>

<c:import url="/WEB-INF/jsp/common/footer.jsp"/>