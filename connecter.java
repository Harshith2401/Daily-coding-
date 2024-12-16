package com.Anurag;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/newdb"; // Replace with your DB details
    private static final String DB_USER = "root"; // Replace with your DB 
    private static final String DB_PASSWORD = "Harshith@43"; // Replace with your DB password

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        // Retrieve form data
        String name = req.getParameter("name");
        String phone = req.getParameter("phone");
        String email = req.getParameter("email");
        String address = req.getParameter("address");
        String gender = req.getParameter("gender");

        // Prepare the response
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        // Database insertion
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            // Load JDBC driver (optional for newer versions of Java)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // Prepare SQL query
            String sql = "INSERT INTO user_info (name, phone, email, address, gender) VALUES (?, ?, ?, ?, ?)";
            pstmt = conn.prepareStatement(sql);

            // Set parameters
            pstmt.setString(1, name);
            pstmt.setString(2, phone);
            pstmt.setString(3, email);
            pstmt.setString(4, address);
            pstmt.setString(5, gender);

            // Execute update
            int rowsInserted = pstmt.executeUpdate();

            if (rowsInserted > 0) {
                out.println("<html><body style='font-family: Arial, sans-serif; background: #000; color: #fff; text-align: center;'>");
                out.println("<h1>User Information</h1>");
                out.println("<p><strong>Name:</strong> " + name + "</p>");
                out.println("<p><strong>Phone Number:</strong> " + phone + "</p>");
                out.println("<p><strong>Email:</strong> " + email + "</p>");
                out.println("<p><strong>Address:</strong> " + address + "</p>");
                out.println("<p><strong>Gender:</strong> " + gender + "</p>");
                out.println("<p>Thank you for submitting your information! It has been saved successfully.</p>");
                out.println("</body>");
                out.println("</html>");
            }
        } catch (ClassNotFoundException | SQLException e) {
            out.println("<html><body style='font-family: Arial, sans-serif; background: #000; color: #fff; text-align: center;'>");
            out.println("<h1>Error</h1>");
            out.println("<p>There was an error saving your information. Please try again later.</p>");
            out.println("</body>");
            out.println("</html>");
            e.printStackTrace(out); // Print error details
        } finally {
            // Close resources
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace(out);
            }
        }
    }
}