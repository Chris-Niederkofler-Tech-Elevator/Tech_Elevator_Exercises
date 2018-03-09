<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

 <c:import url="/WEB-INF/jsp/header.jsp">
	<c:param name="pageTitle" value="xOrdered Name"/>
</c:import>
<h3>xOrdered Name</h3>

<c:url var="formInput" value="/orderedNameOut" />
<form method="GET" action="${formInput}">

	<h4>Enter Name</h4>
	<label for="firstname">First name: </label>
	<br />
	<input type="text" name="firstname" />
	<br />
	<label for="middleinitial">Middle initial: </label>
	<br />
	<input type="text" name="middleinitial" />
	<br />
	<label for="lastname">Last name: </label>
	<br />
	<input type="text" name="lastname" />

	<h4>Choose Order</h4>
	<input type="radio" name="order" value="1" /> First MI Last
	<br />
	<input type="radio" name="order" value="2" /> First Last
	<br />
	<input type="radio" name="order" value="3"> Last, First MI
	<br />
	<input type="radio" name="order" value="4"> Last, First
	<br /> <br />
	<input type="submit" value="Submit" />

</form>

<c:import url="/WEB-INF/jsp/footer.jsp"/>