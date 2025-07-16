package com.resumematcher.controller;

import com.resumematcher.model.User;
import com.resumematcher.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import javax.servlet.http.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;


import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "FROM User WHERE email = :email AND password = :password";
        Query<User> query = session.createQuery(hql, User.class);
        query.setParameter("email", email);
        query.setParameter("password", password);

        User user = query.uniqueResult();
        session.close();

        if (user != null) {
            HttpSession httpSession = request.getSession();
            httpSession.setAttribute("currentUser", user);

            if (user.getRole().equalsIgnoreCase("recruiter")) {
                response.sendRedirect("recruiter_dashboard.jsp");
            } else {
                response.sendRedirect("student_dashboard.jsp");
            }
        } else {
            response.sendRedirect("login.jsp?error=invalid");
        }
    }
}
