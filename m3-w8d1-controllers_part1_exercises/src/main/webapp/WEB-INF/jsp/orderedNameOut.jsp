<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%-- <c:import url="/WEB-INF/jsp/header.jsp">
	<c:param name="pageTitle" value="xOrdered Name"/>
</c:import> --%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>Enter Name</h3>

<p>
	First name:
	<c:out value="${orderedNameBean.first}" />
	<br /> Middle initial:
	<c:out value="${orderedNameBean.middle}" />
	<br /> Last name:
	<c:out value="${orderedNameBean.last}" />
	<br />
</p>

<p>
	Ordered:
	<c:out value="${orderedNameBean.result}" />
</p>
</body>
</html>
<%-- <c:import url="/WEB-INF/jsp/footer.jsp"/> --%>