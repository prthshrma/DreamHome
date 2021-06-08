package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DTO.DTO;
import Model.DeleteAuthentication;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

/**
 *
 * @author HP
 */
public class ToletDelete extends HttpServlet 
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
            
            DTO toletdelDTO=new DTO();
            toletdelDTO.setRegistry(registry);
            
            DeleteAuthentication delAuthenticate=new DeleteAuthentication();
            if(delAuthenticate.istoletDelete(toletdelDTO))
            {
                HttpSession session=request.getSession(true);
                String username=(String)session.getAttribute("username");
                if(username.equals("admin"))
                {
                RequestDispatcher rd=request.getRequestDispatcher("DH_adminprofile.jsp");
                rd.forward(request, response);
                }
                else
                {
                RequestDispatcher rd=request.getRequestDispatcher("DH_profile.jsp");
                rd.forward(request, response);
                }
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
