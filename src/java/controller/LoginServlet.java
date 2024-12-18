package controller;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        try {
            // Koneksi ke database
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shuttle_booking", "root", "password");

            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM User WHERE email=? AND password=?");
            stmt.setString(1, email);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                // Set session
                HttpSession session = request.getSession();
                session.setAttribute("userID", rs.getInt("userID"));
                session.setAttribute("userName", rs.getString("name"));

                // Redirect ke halaman booking
                response.sendRedirect("booking.jsp");
            } else {
                // Jika login gagal
                response.sendRedirect("index.jsp?error=invalid");
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("index.jsp?error=database");
        }
    }
}
