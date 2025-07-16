<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Recruiter Dashboard</title>
    <style>
        body {
            margin: 0;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f0f2f5;
        }

        header {
            background-color: #1abc9c;
            padding: 20px;
            color: white;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }

        header h1 {
            margin: 0;
        }

        .logout a {
            color: white;
            background-color: #e74c3c;
            padding: 8px 14px;
            text-decoration: none;
            border-radius: 5px;
        }

        .logout a:hover {
            background-color: #c0392b;
        }

        .container {
            max-width: 900px;
            margin: 30px auto;
            padding: 20px;
        }

        .card {
            background: white;
            padding: 25px;
            margin-bottom: 20px;
            border-radius: 8px;
            box-shadow: 0 2px 10px rgba(0,0,0,0.1);
        }

        .card h2 {
            margin-top: 0;
            font-size: 22px;
        }

        .btn {
            display: inline-block;
            padding: 10px 18px;
            background-color: #3498db;
            color: white;
            text-decoration: none;
            border-radius: 5px;
            margin-top: 10px;
        }

        .btn:hover {
            background-color: #2980b9;
        }

        footer {
            text-align: center;
            padding: 15px;
            color: #888;
            font-size: 14px;
            margin-top: 30px;
        }
    </style>
</head>
<body>

<header>
    <h1>Welcome, Recruiter</h1>
    <div class="logout">
        <a href="logout.jsp">Logout</a>
    </div>
</header>

<div class="container">
    <div class="card">
        <h2>Post a Job</h2>
        <p>Create and post job openings for students to apply.</p>
        <a href="postJob.jsp" class="btn">Post Job</a>
    </div>

    
</div>

<footer>
    &copy; 2025 Resume Matcher | Recruiter Portal
</footer>

</body>
</html>
