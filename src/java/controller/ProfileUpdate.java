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
public class ProfileUpdate extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.sendRedirect("DH_home.jsp");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        try
        {
            String username=request.getParameter("username");
            String houseno=request.getParameter("houseno");
            String colony=request.getParameter("colony");
            String landmark=request.getParameter("landmark");
            String city=request.getParameter("city");
            String state=request.getParameter("state");
            String pin=request.getParameter("pin");
            String phone=request.getParameter("phone");
                  
            
        if(!houseno.trim().equals("") && !colony.trim().equals("") && !landmark.trim().equals("")
               && !city.trim().equals("") && !state.trim().equals("") && !pin.trim().equals("") && !phone.trim().equals(""))
        {
                 
         DTO profileUpdateDTO=new DTO();
         profileUpdateDTO.setUsername(username);
         profileUpdateDTO.setHouseno(houseno);
         profileUpdateDTO.setColony(colony);
         profileUpdateDTO.setLandmark(landmark);
         profileUpdateDTO.setCity(city);
         profileUpdateDTO.setState(state);
         profileUpdateDTO.setPin(pin);
         profileUpdateDTO.setPhone(phone);
        
        UpdateAuthentication updateAuthenticate=new UpdateAuthentication();
        if(updateAuthenticate.isprofileUpdate(profileUpdateDTO))
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
