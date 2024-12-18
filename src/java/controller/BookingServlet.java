package controller;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/book")
public class BookingServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String userID = (String) session.getAttribute("userID");
        int shuttleID = Integer.parseInt(request.getParameter("shuttleID"));

        try {
            // Koneksi ke database
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shuttle_booking", "root", "password");

            PreparedStatement stmt = conn.prepareStatement("INSERT INTO Booking (userID, shuttleID, bookingDate) VALUES (?, ?, CURDATE())");
            stmt.setString(1, userID);
            stmt.setInt(2, shuttleID);

            stmt.executeUpdate();
            response.sendRedirect("booking.jsp?success=1");
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("booking.jsp?error=Booking Failed");
        }
    }
}
