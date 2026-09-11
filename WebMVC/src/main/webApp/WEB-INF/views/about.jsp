<%@ page contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>About</title>

    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/css/style.css">
</head>

<body>

<div class="container">

    <h1>About Us</h1>

    <p>
        This is the About page of my Spring MVC application.
    </p>

    <a href="${pageContext.request.contextPath}/user/home">
        Back to Home
    </a>

    <br><br>

        <a href="${pageContext.request.contextPath}/product/home">
            Products
        </a>

</div>

</body>
</html>