<%-- 
    Document   : DH_toletReview
    Created on : Jun 8, 2020, 7:33:07 PM
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
        <title>Tolet Review</title>
    </head>
    <body>
        <%
            String username=(String)session.getAttribute("username");
            String registry=(String)session.getAttribute("registry");
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
                                <li><a href="#" title="">Services</a></li>
                                <li><a href="#" title="">About us</a></li>
                                <li><a href="#" title="">Contact</a></li>                                
                                <li><a href="DH_adminprofile.jsp" class="drop">Profile</a></li>                                                                                                         
                        </ul>                        
            </div>
       
            <div id="logo">
                <a href="#">Dream Home</a>
            </div>
	
            
        </div>
        <!-- header ends -->
        <div style="min-height: 100px; overflow: hidden;">
        <h1 style="text-align: center; color:darkblue;">PROPERTY REVIEW</h1>
        
        <%
            try
            {
                    Statement st=DBConnector.getStatement();
                    
                    String query="select * from toletregistration where registry='"+registry+"'";
                    
                    ResultSet rs=st.executeQuery(query);
                    while(rs.next())
                    {
                        String owner=rs.getString(3);
                        String type=rs.getString(4);
                        String configuration=rs.getString(5);
                        String builtuparea=rs.getString(6);
                        String propertyage=rs.getString(7);                        
                        String houseno=rs.getString(8);
                        String colony=rs.getString(9);
                        String landmark=rs.getString(10);
                        String city=rs.getString(11);
                        String state=rs.getString(12);
                        String pin=rs.getString(13);
                        String preference=rs.getString(14);
                        String rent=rs.getString(15);
                        String description=rs.getString(16);
                        String latitude=rs.getString(18);
                        String longitude=rs.getString(19);
                    
        %>
        
        
        <div id="toletview">
            <div style="padding: 10px; ">
                <form action="ToletReview" method="post" >
                <table align="center" style="font-size: 15px; color:#3820E0;">
                    <tr><td>Registry No. :</td><td><input type="text" name="registry" value="<%=registry%>" disabled="disabled"><input type="text" name="registry" value="<%=registry%>" hidden="hidden"></td>
                        <td>Owner Name :</td><td><input type="text" name="owner" value="<%=owner%>" disabled="disabled"></td></tr>                
                    <tr><td>Type :</td><td><input type="text" name="type" value="<%=type%>" disabled="disabled"></td>
                        <td>Configuration :</td><td><input type="text" name="configuration" value="<%=configuration%>" disabled="disabled"></td></tr>
                    <tr><td>Built Up Area :</td><td><input type="text" name="builtuparea" value="<%=builtuparea%>" disabled="disabled"></td>
                        <td>Property Age :</td><td><input type="text" name="propertyage" value="<%=propertyage%>" disabled="disabled"></td></tr>
                </table>
                <table align="center" style="font-size: 15px; color:#3820E0;">    
                    <tr><td>House number :</td><td><input type="text" name="houseno" value="<%=houseno%>" disabled="disabled"></td></tr>
                    <tr><td>Colony :</td><td><input type="text" name="colony" value="<%=colony%>" disabled="disabled"></td></tr>
                    <tr><td>LandMark :</td><td><input type="text" name="landmark" value="<%=landmark%>" disabled="disabled"></td></tr>
                    <tr><td>City :</td><td><input type="text" name="city" value="<%=city%>" disabled="disabled"></td></tr>
                    <tr><td>State :</td><td><input type="text" name="state" value="<%=state%>" disabled="disabled"></td></tr>
                    <tr><td>Pin Code :</td><td><input type="text" name="pin" value="<%=pin%>" disabled="disabled"></td></tr>
                    <tr><td>Preference :</td><td><select name="preference">
                                <option selected="selected" disabled="disabled"><%=preference%></option>
                                <option selected="selected" hidden="hidden"><%=preference%></option>
                                                    <option disabled="disabled">Students (Girls)</option>
                                                    <option disabled="disabled">Students (Boys)</option>
                                                    <option disabled="disabled">Family</option>
                                                </select></td></tr>
                    <tr><td>Rent :</td><td><input type="number" name="rent" value="<%=rent%>" disabled="disabled"></td></tr>                                      
                    <tr><td>Property Description :</td><td><textarea name="description" rows="4" cols="30" disabled="disabled"><%=description%></textarea></td></tr>
                </table>
                <table align="center">    
                    <tr><td><input type="submit" value="ACCEPT"></td></tr>
                </table>                
                </form>
            </div>
        </div>
                
        <div id="map"></div>
        
        <script>
        // Initialize and add the map
        function initMap() 
        {
        // The location of Uluru
        var uluru = {lat: <%= latitude%>, lng: <%= longitude%>};
        // The map, centered at Uluru
        var map = new google.maps.Map(
        document.getElementById('map'), {zoom: 1, center: uluru});
        // The marker, positioned at Uluru
        var marker = new google.maps.Marker({position: uluru, map: map});
        }
        </script>
        
        <script async defer
        src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDRXqIs75AeOd15bxFzXhYJcpc5tBlZy2k&callback=initMap">
        </script>
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

