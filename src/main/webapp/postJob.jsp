<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Post Job</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f0f2f5;
            margin: 0;
        }

        header {
            background-color: #1abc9c;
            color: white;
            padding: 20px;
            text-align: center;
        }

        .container {
            max-width: 600px;
            background: white;
            margin: 40px auto;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 2px 10px rgba(0,0,0,0.1);
        }

        h2 {
            margin-bottom: 20px;
            color: #333;
        }

        input[type="text"], textarea {
            width: 100%;
            padding: 10px;
            margin-top: 10px;
            margin-bottom: 20px;
            border: 1px solid #ccc;
            border-radius: 6px;
            box-sizing: border-box;
        }

        input[type="submit"] {
            background-color: #3498db;
            color: white;
            padding: 12px 20px;
            border: none;
            border-radius: 6px;
            cursor: pointer;
            font-size: 16px;
        }

        input[type="submit"]:hover {
            background-color: #2980b9;
        }

        .back-link {
            display: block;
            margin-top: 15px;
            text-align: center;
        }

        .back-link a {
            text-decoration: none;
            color: #1abc9c;
        }

        .back-link a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>

<header>
    <h1>Post a New Job</h1>
</header>

<div class="container">
    <form action="PostJobServlet" method="post">
        <label for="title">Job Title</label>
        <input type="text" name="title" id="title" required>

        <label for="description">Job Description</label>
        <textarea name="description" id="description" rows="5" required></textarea>

        <label for="skills">Required Skills (comma separated)</label>
        <input type="text" name="skills" id="skills" required>
        
        <label for="recruiterEmail">Recruiter Email</label>
<input type="text" name="recruiterEmail" id="recruiterEmail" required>
        
        
        

        <input type="submit" value="Post Job">
    </form>

    <div class="back-link">
        <a href="recruiter_dashboard.jsp">← Back to Dashboard</a>
    </div>
</div>

</body>
</html>
