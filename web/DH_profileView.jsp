<%-- 
    Document   : DH_profileView
    Created on : Jun 14, 2019, 3:35:01 PM
    Author     : HP
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="DB.DBConnector"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="DHstyle.css" rel="stylesheet" type="text/css" />
        <title>Profile View</title>
    </head>
    <body>
        <%
            String username=(String)session.getAttribute("username");
            if(username==null || username.trim().equals(""))
            {
                response.sendRedirect("DH_login.html");
                return;
            }
        %>
        
        <div id="main">
        <!-- header begins -->
        <div id="header">
            <div id="buttons">
                	<ul>
                            <li class="first"><a href="DH_userhome.jsp"  title="">Home</a></li>
                                <li><a href="#" title="">Services</a></li>
                                <li><a href="#" title="">About us</a></li>
                                <li><a href="#" title="">Contact</a></li>                                
                                <li><a href="DH_profile.jsp" class="drop">Profile</a></li>                                                                                                         
                        </ul>                        
            </div>
       
            <div id="logo">
                <a href="#">Dream Home</a>
            </div>
	
            
        </div>
        <!-- header ends -->
        <div style="min-height: 100px; overflow: hidden;">
        <h1 style="text-align: center; color:darkblue;">PROFILE VIEW</h1>
        
        <%
            try
            {
                    Statement st=DBConnector.getStatement();
                    
                    String query="select * from registration where username='"+username+"'";
                    
                    ResultSet rs=st.executeQuery(query);
                    while(rs.next())
                    {
                        String firstname=rs.getString(1);
                        String lastname=rs.getString(2);
                        String houseno=rs.getString(3);
                        String colony=rs.getString(4);
                        String landmark=rs.getString(5);
                        String city=rs.getString(6);
                        String state=rs.getString(7);
                        String pin=rs.getString(8);                        
                        String phone=rs.getString(9);
                        String aadhar=rs.getString(10);
        %>
        
        <div id="profileview">
            <div style="padding: 10px; ">
                <form action="ProfileUpdate" method="post">
                <table align="center" style="font-size: 15px; color:#3820E0;">
                    <tr><td><input type="hidden" name="username" value="<%=username%>"></td></tr>
                    <tr><td>First Name :</td><td><input type="text" name="firstname" value="<%=firstname%>" disabled="disabled"></td></tr>
                    <tr><td>Last Name :</td><td><input type="text" name="lastname" value="<%=lastname%>" disabled="disabled"></td></tr>                
                    <tr><td>Aadhar number :</td><td><input type="text" name="aadhar" value="<%=aadhar%>" disabled="disabled"></td></tr>
                    <tr><td>House number :</td><td><input type="text" name="houseno" value="<%=houseno%>"></td></tr>
                    <tr><td>Colony :</td><td><input type="text" name="colony" value="<%=colony%>"</td></tr>
                    <tr><td>LandMark :</td><td><input type="text" name="landmark" value="<%=landmark%>"</td></tr>
                    <tr><td>City :</td><td><input type="text" name="city" value="<%=city%>"</td></tr>
                    <tr><td>State :</td><td><input type="text" name="state" value="<%=state%>"</td></tr>
                    <tr><td>Pin Code :</td><td><input type="text" name="pin" value="<%=pin%>"</td></tr>
                    
                    <tr><td>Phone :</td><td><input type="number" name="phone" value="<%=phone%>"></td></tr>                                      
                    
                </table>
                <table align="center">    
                    <tr><td><input type="submit" value="UPDATE"></td></tr>
                </table>                
            </form>
            </div>
        </div>
        <%
                    }
            }
            catch(SQLException e)
            {
                System.out.println(e);
            }
        %>
        </div>


        <!-- footer begins -->
        <div id="footer">
        </div>

        <!-- footer ends -->
        </div>
    
    </body>
</html>
