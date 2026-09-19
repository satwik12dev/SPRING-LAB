<!DOCTYPE html>
<html>
<head>
    <title>User Registration</title>
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>

<div class="container">
    <h1>User Registration</h1>
    <form action="${pageContext.request.contextPath}/user/register"
          method="post">
        <p>
            <label>Name:</label>
            <input type="text" name="name">
        </p>
        <p>
            <label>Email:</label>
            <input type="text" name="email">
        </p>
        <p>
            <label>Age:</label>
            <input type="number" name="age">
        </p>
        <p>
            <label>Phone:</label>
            <input type="text" name="phone">
        </p>
        <p>
            <input type="submit" value="Register">
        </p>
    </form>
</div>
</body>
</html>