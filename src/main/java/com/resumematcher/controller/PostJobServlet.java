package com.resumematcher.controller;

import com.resumematcher.model.Job;
import com.resumematcher.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/PostJobServlet")
public class PostJobServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String title = request.getParameter("title");
        String description = request.getParameter("description");
        String skills = request.getParameter("skills");  // this field is new
        String email=request.getParameter("recruiterEmail");
       System.out.println(email);
        Job job = new Job(title,description,skills,email);

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            session.save(job);
            tx.commit();
            response.sendRedirect("recruiter_dashboard.jsp");
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("Failed to post job.");
        }
    }
}
