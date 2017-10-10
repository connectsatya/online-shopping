<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="/assets/css" />
<spring:url var="js" value="/assets/js" />
<spring:url var="images" value="/assets/images" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Online Shopping -${title}</title>
<script>
	window.menu = '${title}';
</script>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"
	integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4"
	crossorigin="anonymous"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js"
	integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1"
	crossorigin="anonymous"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css"
	integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M"
	crossorigin="anonymous">



<!-- Bootstrap core CSS -->
<!-- <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet"> -->

<!-- Custom styles for this template -->
<!-- <link href="css/shop-homepage.css" rel="stylesheet"> -->

</head>

<body>
	<div class="container">
		<!-- Navigation -->
		<%@ include file="./shared/navbar.jsp"%>
		<!-- -------------------------------------------------------------------------------------------------------------- -->
		<div class="content">
			<!-- Page Content -->
			<!-- Loading the Home Content -->
			<c:if test="${userClickHome==true}">
				<%@ include file="home.jsp"%>
			</c:if>
			<!-- Loads only when User Clicks About -->
			<c:if test="${userClickAbout==true}">
				<%@ include file="about.jsp"%>
			</c:if>
			<!-- Loads only when User Clicks Contact -->
			<c:if test="${userClickContact==true}">
				<%@ include file="contact.jsp"%>
			</c:if>
			<!-- Loads only when User Clicks Contact -->
			<c:if test="${userClickAllProducts==true or userClickCategoryProducts==true}">
				<%@ include file="listProducts.jsp"%>
			</c:if>

			<!-- -------------------------------------------------------------------------------------------------------------------------- -->
			<!-- /.container -->
		</div>
		<!-- Footer -->
		<%@ include file="./shared/footer.jsp"%>



		<!-- Bootstrap core JavaScript -->
		<!-- <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/popper/popper.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.min.js"></script> -->
		<link href="${css}/app.css"></link> 
		<script src="${js}/myapp.js"></script>
	</div>

</body>

</html>


