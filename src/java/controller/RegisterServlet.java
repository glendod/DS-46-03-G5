package controller;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String password = request.getParameter("password");

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shuttle_booking", "root", "password");
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO User (email, name, phone, password) VALUES (?, ?, ?, ?)");
            stmt.setString(1, email);
            stmt.setString(2, name);
            stmt.setString(3, phone);
            stmt.setString(4, password);

            stmt.executeUpdate();
            response.sendRedirect("index.jsp?success=registered");
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("register.jsp?error=1");
        }
    }
}
