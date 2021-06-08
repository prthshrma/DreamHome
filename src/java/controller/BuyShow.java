package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DTO.DTO;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;


/**
 *
 * @author HP
 */
public class BuyShow extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.sendRedirect("DH_home.jsp");
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String type=request.getParameter("type");
        String max=request.getParameter("max");
        String city=request.getParameter("city");
        
        if(!type.trim().equals("") && !max.trim().equals("") && !city.trim().equals(""))
        {            
            HttpSession session=request.getSession();
            session.setAttribute("type", type);
            session.setAttribute("max", max);
            session.setAttribute("city", city);
        
            RequestDispatcher rd=request.getRequestDispatcher("DH_buyshow.jsp");
            rd.forward(request, response);
        }
        else
        {
            response.sendRedirect("DH_home.jsp");
        }
    }
    
    
}
