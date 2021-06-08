/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DTO.DTO;
import Model.RegistrationInsert;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HP
 */
public class RegistrationUser extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("DH_registration.html");
    }

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        try
        {
            
            String firstname=request.getParameter("first");
            String lastname=request.getParameter("lastname");
            String houseno=request.getParameter("houseno");
            String colony=request.getParameter("colony");
            String landmark=request.getParameter("landmark");
            String city=request.getParameter("city");
            String state=request.getParameter("state");
            String pin=request.getParameter("pin");
            String aadhar=request.getParameter("aadhar");
            //String photo=request.getParameter("profile");
            //String profilephoto=request.getParameter("profilephoto");
            String username=request.getParameter("username");
            String phone=request.getParameter("phone");
            String password=request.getParameter("password");
            String confirmpassword=request.getParameter("confirmpassword");
            
            //Part photo=request.getPart("profile");
            
            //String photo="C:\\Users\\HP\\Pictures\\Screenshots\\Screenshot (96).png";
            //
            
            System.out.println(firstname);
            System.out.println(lastname);
            System.out.println(houseno);
            System.out.println(colony);
            System.out.println(landmark);
            System.out.println(city);
            System.out.println(state);
            System.out.println(pin);
            System.out.println(aadhar);
            //System.out.println(profilephoto);
            System.out.println(username);
            System.out.println(phone);
            System.out.println(password);
            System.out.println(confirmpassword);
            
            System.out.println("yes");
            
            if(password.equals(confirmpassword) && username!=null && !username.trim().equals("") && firstname!=null && !firstname.trim().equals("") && phone!=null && !phone.trim().equals("") 
               && password!=null && !password.trim().equals("") && !houseno.trim().equals("") && !colony.trim().equals("") && !landmark.trim().equals("")
               && !city.trim().equals("") && !state.trim().equals("") && !pin.trim().equals("") && !aadhar.trim().equals(""))// && profilephoto!=null && !profilephoto.trim().equals("")) //&& photo!=null )
            {
                System.out.println("inside if");
                DTO user=new DTO();
                user.setFirstname(firstname);
                user.setLastname(lastname);
                user.setHouseno(houseno);
                user.setColony(colony);
                user.setLandmark(landmark);
                user.setCity(city);
                user.setState(state);
                user.setPin(pin);
                user.setAadhar(aadhar);
                //user.setProfilephoto(profilephoto);
 //               user.setPhoto(photo);
                user.setPassword(password);
                user.setPhone(phone);
                user.setUsername(username);
                
                System.out.println("1");
                
                RegistrationInsert reg=new RegistrationInsert();
                if(reg.isRegistration(user))
                {
                    System.out.println("2");
                    response.sendRedirect("DH_login.html");
                }
                else
                {
                response.sendRedirect("DH_registration.html");
                }
            }
            else
            {
                System.out.println("inside else");
                response.sendRedirect("DH_registration.html");
            }
        }
        catch(Exception e)
        {
            System.out.println(e+" Here you are");
        }
    }
    
    

    

}
