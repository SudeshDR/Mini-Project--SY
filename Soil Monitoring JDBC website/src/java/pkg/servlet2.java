package pkg;

import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servlet2 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
    
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ShowStudent</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ShowStudent at " + request.getContextPath() + "</h1>");

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data", "root", "mysql");
            Statement st1 = (Statement) con.createStatement();
            String qry = "Select * from info;";
            ResultSet rs1 = st1.executeQuery(qry);
            out.println("<h1>Student Data</h1>");
            out.println("<table border = '1' bgcolor = 'grey'>");
            out.println("<tr>");
            out.println("<td><b>FirstName</b></td>");
            out.println("<td><b>LastName</b></td>");
            out.println("<td><b>Email</b></td>");
            out.println("<td><b>Subject</b></td>");
            out.println("<td><b>Message</b></td>");
            out.println("</tr>");

            while (rs1.next()) {
                out.println("<tr>");
                out.println("<td>" + rs1.getString("FirstName") + "</td>");
                out.println("<td>" + rs1.getString("LastName") + "</td>");
                out.println("<td>" + rs1.getString("Email") + "</td>");
                out.println("<td>" + rs1.getString("Subject") + "</td>");
                out.println("<td>" + rs1.getString("Message") + "</td>");

                                
                
                out.println("</tr>");
            }
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");

        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(servlet2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(servlet2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(servlet2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(servlet2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
