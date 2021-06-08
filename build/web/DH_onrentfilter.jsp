<%-- 
    Document   : DH_onrentfilter
    Created on : Jun 23, 2019, 2:53:51 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="DHstyle.css" rel="stylesheet" type="text/css" />
        <title>Onrent Property</title>
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
        
        <div style="height: 400px; padding-top: 50px;">
            <div id="filter">
                <form action="OnrentShow" method="post">
                <table align='center'>
                    <tr><td>Type :</td><td><select name="type">
                                            <option>Flat</option>
                                            <option>House</option>
                                            <option>Plot</option>
                                           </select></td></tr>
                    <tr><td>Rent :</td><td><input type="number" name="max" placeholder="Maximum" required="required"></td></tr>
                    <tr><td>City :</td><td><input type="text" name="city" placeholder="city" required="required"></td></tr>
                    
                </table>
                <table align="center">    
                    <tr><td><input type="submit" value="SHOW"></td></tr>
                </table> 
                </form>   
            </div>
        </div>
        
        <!-- footer begins -->
        <div id="footer">
        </div>

        <!-- footer ends -->
        </div>
    </body>
</html>
