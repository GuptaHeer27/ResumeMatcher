<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="com.resumematcher.model.Job" %>
<%
    List<Job> matchedJobs = (List<Job>) request.getAttribute("matchedJobs");
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Matched Jobs</title>
    <style>
        body {
            font-family: 'Segoe UI', sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }

        header {
            background-color: #1abc9c;
            color: white;
            padding: 20px;
            text-align: center;
        }

        .container {
            max-width: 900px;
            margin: 40px auto;
            padding: 20px;
            background-color: white;
            border-radius: 10px;
            box-shadow: 0 2px 8px rgba(0,0,0,0.1);
        }

        h2 {
            text-align: center;
            margin-bottom: 30px;
        }

        .job-card {
            border: 1px solid #ddd;
            padding: 20px;
            margin-bottom: 20px;
            border-radius: 8px;
        }

        .job-card h3 {
            margin-top: 0;
            color: #333;
        }

        .job-card p {
            margin: 5px 0;
        }

        .no-match {
            text-align: center;
            font-size: 18px;
            color: #888;
        }

        .back-btn {
            display: block;
            width: fit-content;
            margin: 20px auto 0;
            padding: 10px 20px;
            background-color: #3498db;
            color: white;
            text-decoration: none;
            border-radius: 6px;
        }

        .back-btn:hover {
            background-color: #2980b9;
        }
    </style>
</head>
<body>

<header>
    <h1>Matched Jobs Based on Your Resume</h1>
</header>

<div class="container">
    <h2>Recommended for You</h2>

    <%
        if (matchedJobs == null || matchedJobs.isEmpty()) {
    %>
        <p class="no-match">No matching jobs found.</p>
    <%
        } else {
            for (Job job : matchedJobs) {
    %>
        <div class="job-card">
            <h3><%= job.getTitle() %></h3>
            <p><strong>Description:</strong> <%= job.getDescription() %></p>
            <p><strong>Required Skills:</strong> <%= job.getSkills() %></p>
            <p><strong>Recruiter Email:</strong> <%= job.getRecruiterEmail() %></p>
        </div>
    <%
            }
        }
    %>

    <a href="student_dashboard.jsp" class="back-btn">← Back to Dashboard</a>
</div>

</body>
</html>
