package controller;

import DTO.DTO;
import Model.LoginAuthenticator;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Login extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.sendRedirect("DH_login.html");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        
        if(username!=null && password!=null && !username.trim().equals("") && !password.trim().equals(""))
        {
            DTO user=new DTO();
            user.setUsername(username);
            user.setPassword(password);
            
            System.out.println(user.getUsername());
            System.out.println(user.getPassword());
            
            LoginAuthenticator authenticate=new LoginAuthenticator();
            if(authenticate.checkLogin(user))
            {
                HttpSession session=request.getSession(true);
                session.setAttribute("username", username);
                
                if(username.equals("admin"))
                {
                RequestDispatcher rd=request.getRequestDispatcher("DH_adminprofile.jsp");
                rd.forward(request, response);
                }
                else
                {
                RequestDispatcher rd=request.getRequestDispatcher("DH_userhome.jsp");
                rd.forward(request, response);
                }
                
            }
            else
            {
                response.sendRedirect("DH_login.html");
            }
        }
    }
    
    
}
