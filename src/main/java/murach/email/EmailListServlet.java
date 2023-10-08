package murach.email;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import murach.business.User;
//import murach.data.UserDB;

public class EmailListServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        String url = "/index.html";
        response.setContentType("text/html");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";// default action
        } // perform action and set URL to appropriate page 
        if (action.equals ("join")) { url = "/index.html"; 
            // the "join" page 
        }
        else if (action.equals("add")) {
             //get parameters from the request
            String dateofBirth = request.getParameter("dateofBirth"); 
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            String knowVia = request.getParameter("knowVia");
            String[] Yes = request.getParameterValues("Yes");
            String Contact = request.getParameter("Contact");
            // store data in User object and save User object in db 
            User user = new User (dateofBirth, firstName, lastName, email, knowVia, Yes, Contact); 
            //UserDB. insert (user);
            // set User object in request object and set URL 
            request.setAttribute ("user", user); url = "/thanks.jsp"; // the "thanks" page
        }
        // forward request and response objects to specified URL 
        getServletContext().getRequestDispatcher(url).forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

}