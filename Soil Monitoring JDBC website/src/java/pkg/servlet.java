package pkg;

import java.sql.*;
import com.mysql.jdbc.Connection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Customer DataServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Your Query has been sent to" + request.getContextPath() + "</h1>");
            
            out.println("<p>Wait for the Reply...</p>");

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","mysql");
            out.println("<p>Have a nice day</p>");
            Statement st = (Statement)con.createStatement();
           
            
            String WFirstName = request.getParameter("FirstName");
            String WLastName = request.getParameter("LastName");
            String WEmail = request.getParameter("Email");
            String WSubject = request.getParameter("Subject");
            String WMessage = request.getParameter("Message");
            
            
            String sqlQuery = "Insert into info values('" + WFirstName + "', '" + WLastName + "', '" + WEmail + "','" + WSubject + "','" + WMessage + "');";
            //out.println(sqlQuery);
            st.executeUpdate(sqlQuery);
            //out.println("<h1>CustomerDataServlet at " + request.getContextPath() + "</h1>");

            
            out.println("<form action ='servlet2' method = 'post'>");
            out.println("<input type = 'submit' value = 'Fetch Page'/>");


            out.println("</form>");

            out.println("</body>");
            out.println("</html>");
            
            
            
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(servlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(servlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(servlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(servlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
