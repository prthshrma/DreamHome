<%-- 
    Document   : DH_userhome
    Created on : Jun 1, 2019, 11:46:12 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="DHstyle.css" rel="stylesheet" type="text/css" />
        <title>Dreamhome</title>
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
                        	<li class="first"><a href="#"  title="">Home</a></li>
                                <li><a href="DH_userservices.html" title="">Services</a></li>
                                <li><a href="DH_userAboutus.html" title="">About us</a></li>
                                <li><a href="DH_userContact.html" title="">Contact</a></li>                                
                                <li><a href="DH_profile.jsp" class="drop">Profile</a></li>                                                                                                         
                        </ul>                        
            </div>
       
            <div id="logo">
                <a href="#">Dream Home</a>
            </div>
	
            
        </div>
        <!-- header ends -->
        
        
        
        
        
        <div id="image">
            <img src="images/house.jpg" height="350px" width="1300px" alt="Image Not Found">
        </div>

        <div id="content">
        <div id="bar" style="background-color:white;">
            <h2><a href="DH_tolet.jsp" title="">To Let</a></h2>
        <p style="text-align: center; color: #0099E5; font-size: 13px;">Give your property on rent with the desired rental preference and huge exposure.</p>
        <img src="images/tolet.jpg" height="200px" width="250px" alt="Image Not Found" style="padding-left: 2px; padding-top: 15px;">
        </div>
        <div id="bar" style="background-color: white; font-size: 13px;">
            <h2><a href="DH_onrentfilter.jsp" title="">On Rent</a></h2>
        <p style="text-align: center; color: #0099E5;">Get the property of your choice on rent from the various options available.</p>
        <img src="images/onrent.jpg" height="200px" width="250px" alt="Image Not Found" style="padding-left: 2px; padding-top: 15px;">
        </div>
        <div id="bar" style="background-color: white; font-size: 13px;">
            <h2><a href="DH_sell.jsp" title="">Sell</a></h2>
        <p style="text-align: center; color: #0099E5;">Get best deals on selling your property by the great exposure to buyers.</p>
        <img src="images/sell.jpg" height="200px" width="250px" alt="Image Not Found" style="padding-left: 2px; padding-top: 15px;">
        </div>
        <div id="bar" style="background-color: white; font-size: 13px;">
            <h2><a href="DH_buyfilter.jsp" title="">Buy</a></h2>
        <p style="text-align: center; color: #0099E5;">Purchase the home of your Dream from the multiple options available.</p>
        <img src="images/buy.jpg" height="200px" width="250px" alt="Image Not Found" style="padding-left: 2px; padding-top: 15px;">
        </div>
        </div>


    <div style="width: 1000px; margin-left: auto; margin-right: auto; padding-top: 20px;">
    <h1 style="color: #3870E0">About us</h1>
    <p style="text-align: center; font-size:17px; padding-top: 20px;">
        
        Dream Home is an online platform where real estate trade is taking place in a much faster and newer manner. 
        We not just help you with finding the ideal real estate, but also ensure that your buying journey is as smooth as it can be. 
        We understand that while buying or renting a property, there are a lot of factors to be taken into consideration, 
        like the locality, preferred area, budget, amenities, and a lot more. 
        Dream Home is the destination where you will end up finding the best suitable property available across India. 
        Whether you are looking for a rented property or planning to build your dream abode, you can find anything and everything 
        in real estate at our portal. A wide variety of listing that is advertised here gives you an excellent overview of all property 
        available in the area you are considering.
    </p>
    </div>
        
    <div style="width: 1000px; margin-left: auto; margin-right: auto; padding-top: 30px;">
    <h1 style="color: #3870E0">Contact Us:</h1>
    <br>
    <br>
    <form>
       <table align="center">
            <tr><td>Name :</td><td><input type="text" name="name" style="background-color: white;"></td></tr>
            <tr><td>Email :</td><td><input type="text" name="email" style="background-color: white;"></td></tr>
            <tr><td>Message :</td><td><textarea name="message" rows="4" cols="30" style="background-color: white;"></textarea></td></tr>
        </table>
        <table align="center">
            <tr><td><input type="submit" value="submit"></td></tr>
        </table>
    </form>
    </div>    
        
    <div style="height: 30px;">
    </div>
        <!-- footer begins -->
        <div id="footer">
            <h3 style="color: white; padding-top: 25px; text-align: center;">?? Copyright 2019 Dream home - All Rights Reserved</h3>
        </div>

        <!-- footer ends -->
        </div>

    </body>
</html>
