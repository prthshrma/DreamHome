package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 *
 * @author HP
 */
public class Buyview extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.sendRedirect("DH_home.html");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String registry=request.getParameter("registry");
        
        HttpSession session=request.getSession();
        session.setAttribute("registry", registry);
        
        RequestDispatcher rd=request.getRequestDispatcher("DH_buyView.jsp");
        rd.forward(request, response);
    } 
}
