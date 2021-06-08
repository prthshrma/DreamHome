/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DB.DBConnector;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HP
 */
public class SellReview extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("DH_adminprofile.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    int i=0;
        try
        {
            String registry=request.getParameter("registry");

            Connection con=DBConnector.getConnection();
            PreparedStatement pst=con.prepareStatement("update sellregistration set status='approved' where registry='"+registry+"'");
            
            i=pst.executeUpdate();
            
            if(i>0)
            {
                RequestDispatcher rd=request.getRequestDispatcher("DH_adminprofile.jsp");
                rd.forward(request, response);
            }
            else
            {
                response.sendRedirect("DH_adminprofile.jsp");
            }
            
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }
         
    }
}
