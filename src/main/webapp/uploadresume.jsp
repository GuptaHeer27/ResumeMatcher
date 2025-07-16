<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Upload Resume</title>
    <style>
        body {
            font-family: Arial;
            padding: 40px;
            background-color: #f4f4f4;
        }
        .container {
            background: white;
            padding: 25px;
            border-radius: 10px;
            width: 400px;
            margin: auto;
            box-shadow: 0 0 10px gray;
        }
        h2 {
            text-align: center;
        }
        input[type="file"],
        input[type="submit"] {
            width: 100%;
            padding: 10px;
            margin-top: 15px;
            border-radius: 5px;
        }
        input[type="submit"] {
            background-color: #4CAF50;
            border: none;
            color: white;
            cursor: pointer;
        }
    </style>
</head>
<body>
<div class="container">
    <h2>Upload Your Resume</h2>
    <form action="UploadResumeServlet" method="post" enctype="multipart/form-data">
        <input type="file" name="resume" accept=".pdf,.doc,.docx" required><br>
        <input type="submit" value="Upload">
    </form>
</div>
</body>
</html>
