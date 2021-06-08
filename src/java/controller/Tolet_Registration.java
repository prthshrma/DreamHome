package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DTO.DTO;
import Model.ToletAuthentication;
import javax.servlet.http.HttpSession; 
import javax.websocket.Session;

/**
 *
 * @author HP
 */
public class Tolet_Registration extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.sendRedirect("DH_home.html");
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        try
        {
            String registry=request.getParameter("registry");
            String owner=request.getParameter("owner");
            String type=request.getParameter("type");
            String configuration=request.getParameter("configuration");
            String builtuparea=request.getParameter("builtuparea");
            String propertyage=request.getParameter("propertyage");
            String houseno=request.getParameter("houseno");
            String colony=request.getParameter("colony");
            String landmark=request.getParameter("landmark");
            String city=request.getParameter("city");
            String state=request.getParameter("state");
            String pin=request.getParameter("pin");
            String preference=request.getParameter("preference");
            String rent=request.getParameter("rent");
            String longitude=request.getParameter("long");
            String latitude=request.getParameter("lat");
            String description=request.getParameter("description");
            String image=request.getParameter("image");
            String username=request.getParameter("username");
            
            if(!registry.trim().equals("") && !owner.trim().equals("") && !configuration.trim().equals("") && !type.trim().equals("") 
                && !builtuparea.trim().equals("") && !propertyage.trim().equals("") && !description.trim().equals("") 
                && !preference.trim().equals("") && !rent.trim().equals("") && !houseno.trim().equals("") && !colony.trim().equals("") && !landmark.trim().equals("")
               && !city.trim().equals("") && !state.trim().equals("") && !pin.trim().equals(""))
            {
                DTO property=new DTO();
                property.setRegistry(registry);
                property.setOwner(owner);
                property.setConfiguration(configuration);
                property.setType(type);
                property.setBuiltuparea(builtuparea);
                property.setPropertyage(propertyage);
                property.setHouseno(houseno);
                property.setColony(colony);
                property.setLandmark(landmark);
                property.setCity(city);
                property.setState(state);
                property.setPin(pin);
                property.setDescription(description);
                property.setPreference(preference);
                property.setRent(rent);
                property.setLatitude(latitude);
                property.setLongitude(longitude);
                property.setImage(image);
                property.setUsername(username);
                property.setStatus("pending");
                
                
                ToletAuthentication tolet=new ToletAuthentication();
                if(tolet.isTolet(property))
                {
                   response.sendRedirect("DH_profile.jsp");
                }
                else
                {
                    response.sendRedirect("DH_userhome.jsp");
                }
            }
            else
            {
                response.sendRedirect("DH_userhome.jsp");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    
}
