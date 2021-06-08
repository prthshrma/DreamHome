package controller;

import DTO.DTO;
import Model.UpdateAuthentication;
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
public class SellUpdate extends HttpServlet 
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
            
            String propertyage=request.getParameter("propertyage");
            String price=request.getParameter("price");
            String description=request.getParameter("description");
                  
            
        if(!propertyage.trim().equals("") && !description.trim().equals(""))
        {
                 
         DTO sellUpdateDTO=new DTO();
         sellUpdateDTO.setRegistry(registry);
         sellUpdateDTO.setPropertyage(propertyage);
         sellUpdateDTO.setDescription(description);
         sellUpdateDTO.setPrice(price);
        
        UpdateAuthentication updateAuthenticate=new UpdateAuthentication();
        if(updateAuthenticate.issellUpdate(sellUpdateDTO))
        {
            RequestDispatcher rd=request.getRequestDispatcher("DH_profile.jsp");
            rd.forward(request, response);
        }
        else
        {
            response.sendRedirect("DH_profile.jsp");
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
