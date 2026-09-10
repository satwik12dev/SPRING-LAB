<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Welcome</title>

    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(135deg, #667eea, #764ba2);
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }

        .container {
            background: white;
            padding: 50px;
            border-radius: 20px;
            text-align: center;
            width: 450px;
            box-shadow: 0 15px 40px rgba(0, 0, 0, 0.25);
        }

        h1 {
            color: #333;
            margin-bottom: 15px;
        }

        p {
            color: #666;
            font-size: 18px;
            margin-bottom: 30px;
        }

        .btn {
            display: inline-block;
            padding: 12px 30px;
            background: #667eea;
            color: white;
            text-decoration: none;
            border-radius: 8px;
            transition: 0.3s;
        }

        .btn:hover {
            background: #4c5fd5;
            transform: translateY(-2px);
        }
    </style>
</head>

<body>

<div class="container">

    <h1>Welcome, ${name} 👋</h1>

    <p>${message}</p>

    <a href="${pageContext.request.contextPath}/about" class="btn">About</a>

</div>

</body>
</html>