<%@ page contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>Home</title>

    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/css/style.css">
</head>

<body>

<div class="container">

    <h1>Welcome to Home Page</h1>

    <p>
        This is the Home page of my Spring MVC application.
    </p>

    <a href="${pageContext.request.contextPath}/user/about">
        About
    </a>

    <br><br>

    <a href="${pageContext.request.contextPath}/product/home">
        Products
    </a>

</div>

</body>
</html>