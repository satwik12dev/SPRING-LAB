<!DOCTYPE html>
<html>
<head>
    <title>Registration Successful</title>
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
<div class="container">
    <h1>Registration Successful</h1>
    <p>Welcome, ${user.name}!</p>
    <p>Email: ${user.email}</p>
    <p>Age: ${user.age}</p>
    <p>Phone: ${user.phone}</p>
    <a href="${pageContext.request.contextPath}/user/register">
        Register Another User
    </a>
</div>
</body>
</html>