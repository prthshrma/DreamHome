/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class OnrentShow extends HttpServlet 
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
        
            RequestDispatcher rd=request.getRequestDispatcher("DH_onrentshow.jsp");
            rd.forward(request, response);
        }
        else
        {
            response.sendRedirect("DH_home.jsp");
        }
    }
}
