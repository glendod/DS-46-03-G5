<%@ page import="java.sql.*" %>
<%
    // Cek session, jika belum login, redirect ke login
    if (session.getAttribute("userID") == null) {
        response.sendRedirect("index.jsp?error=loginRequired");
    }
%>
<!DOCTYPE html>
<html>
<head>
    <title>Shuttle Booking</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-5">
    <h2>Welcome, <%= session.getAttribute("userName") %></h2>
    <h3>Available Shuttles</h3>
    <table class="table table-bordered">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Capacity</th>
            <th>Action</th>
        </tr>
        <%
            // Tampilkan data shuttle dari database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shuttle_booking", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Shuttle");
            while (rs.next()) {
        %>
        <tr>
            <td><%= rs.getInt("shuttleID") %></td>
            <td><%= rs.getString("shuttleName") %></td>
            <td><%= rs.getInt("capacity") %></td>
            <td>
                <form action="BookingServlet" method="post">
                    <input type="hidden" name="shuttleID" value="<%= rs.getInt("shuttleID") %>">
                    <button type="submit" class="btn btn-primary">Book</button>
                </form>
            </td>
        </tr>
        <%
            }
        %>
    </table>
</div>
</body>
</html>
