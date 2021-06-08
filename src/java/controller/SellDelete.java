package controller;

import DTO.DTO;
import Model.DeleteAuthentication;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author HP
 */
public class SellDelete extends HttpServlet 
{
        public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.sendRedirect("DH_home.jsp");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        try
        {
            String registry=request.getParameter("registry");
            
            DTO selldelDTO=new DTO();
            selldelDTO.setRegistry(registry);
            
            DeleteAuthentication delAuthenticate=new DeleteAuthentication();
            if(delAuthenticate.issellDelete(selldelDTO))
            {
                RequestDispatcher rd=request.getRequestDispatcher("DH_profile.jsp");
                rd.forward(request, response);
            }
            else
            {
                response.sendRedirect("DH_profile.jsp");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

}
