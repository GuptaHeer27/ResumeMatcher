package com.resumematcher.controller;

import com.resumematcher.model.Job;
import com.resumematcher.util.HibernateUtil;
import com.resumematcher.util.ResumeParserUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/UploadResumeServlet")
@MultipartConfig
public class UploadResumeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Part filePart = request.getPart("resume");
        InputStream fileContent = filePart.getInputStream();

        // Step 1: Extract text from resume
        String resumeText = ResumeParserUtil.extractText(fileContent).toLowerCase();

        // Step 2: Fetch all jobs from DB
        List<Job> matchedJobs = new ArrayList<>();
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<Job> query = session.createQuery("FROM Job", Job.class);
            List<Job> allJobs = query.list();

            // Step 3: Match logic based on keyword occurrence
            for (Job job : allJobs) {
                String[] skills = job.getSkills().toLowerCase().split(",");
                for (String skill : skills) {
                    if (resumeText.contains(skill.trim())) {
                        matchedJobs.add(job);
                        break;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Step 4: Forward matched jobs to JSP
        request.setAttribute("matchedJobs", matchedJobs);
        request.getRequestDispatcher("matched_profile.jsp").forward(request, response);
    }
}
