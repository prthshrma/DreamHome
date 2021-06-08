<%-- 
    Document   : DH_tolet
    Created on : Jun 4, 2019, 10:47:08 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="DHstyle.css" rel="stylesheet" type="text/css" />
        <title>ToLet</title>
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
        <div id="tolet_content" style="min-height: 100px; overflow: hidden;">
        <h1 style="text-align: center;">PROPERTY (TO LET) REGISTRATION FORM</h1>
        
        <div id="tolet_register">
            <div style="padding: 10px; ">
                <form action="Tolet_Registration" method="post">
                <table align="center">
                    <tr><td><input type="hidden" name="username" value="<%=username%>"></td></tr>
                    <tr><td><input type="text" name="registry" placeholder="Registry number"></td>
                        <td><input type="text" name="owner" placeholder="Owner Name"></td></tr>                
                    <tr><td><input type="text" name="type" placeholder="Type (Flat/House)"></td>
                        <td><input type="text" name="configuration" placeholder="Configuration"></td></tr>
                    <tr><td><input type="text" name="builtuparea" placeholder="Built Up Area (Sq feet)"></td>
                        <td><input type="text" name="propertyage" placeholder="Property Age"></td></tr>
                </table>
                <table align="center">    
                    <tr><td><input type="text" name="houseno" placeholder="House number"></td></tr>
                    <tr><td><input type="text" name="colony" placeholder="Colony"></td></tr>
                    <tr><td><input type="text" name="landmark" placeholder="LandMark"></td></tr>
                    <tr><td><input type="text" name="city" placeholder="City"></td></tr>
                    <tr><td><input type="text" name="state" placeholder="State"></td></tr>
                    <tr><td><input type="text" name="pin" placeholder="Pin Code"></td></tr>
                    <tr><td><select name="preference">
                                                    <option >Rental Preferences</option>
                                                    <option>Students (Girls)</option>
                                                    <option>Students (Boys)</option>
                                                    <option>Family</option>
                                                </select> </td></tr>
                    <tr><td><input type="number" name="rent" placeholder="Rent (Rs per month)"></td></tr>  
                    <tr><td>Google Map Coordinates</td></tr>
                    <tr><td><input type="number" step="0.000001" name="lat" placeholder="Latitude"></td></tr>
                    <tr><td><input type="number" step="0.000001" name="long" placeholder="Longitude"></td></tr>
                    
                    <!-- <tr><td><input type="file" name="image"></td></tr>
                    -->
                    
                    <tr><td><textarea name="description" rows="4" cols="30" placeholder="Property Description"></textarea></td></tr>
                </table>
                <table align="center">    
                    <tr><td><input type="submit" value="REGISTER"></td></tr>
                </table>                
            </form>
            </div>
        </div>

        </div>


        <!-- footer begins -->
        <div id="footer">
        </div>

        <!-- footer ends -->
        </div>
    </body>
</html>
