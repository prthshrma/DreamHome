<%-- 
    Document   : DH_profile
    Created on : Jun 4, 2019, 1:25:52 PM
    Author     : HP
--%>

<%@page import="java.io.OutputStream"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="DAO.UserProfileDAO"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="DB.DBConnector"%>
<%@page import="java.sql.Connection"%>
<%@page import="DTO.DTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="DHstyle.css" rel="stylesheet" type="text/css" />
        <title>profile</title>
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
                            <li><a href="DH_userservices.html" title="">Services</a></li>
                            <li><a href="DH_userAboutus.html" title="">About us</a></li>
                            <li><a href="DH_userContact.html" title="">Contact</a></li>                                
                                <li><a href="logout.jsp" class="drop">Logout</a></li>                                                                                                         
                        </ul>                        
            </div>
       
            <div id="logo">
                <a href="#">Dream Home</a>
            </div>
	
            
        </div>
        <!-- header ends -->
        
        <%
                UserProfileDAO dao=new UserProfileDAO();
                DTO dto=dao.getuserData(username);
                
                //System.out.println(dto.getProfilephoto());
                //OutputStream o = response.getOutputStream();
                //byte[] profileData=dto.getProfileData();
        %>
        <div id="profile">
     <!--      <div id="profilephoto">                
                <img src="images\defaultprofileicon.jpg" alt="Image Not Found" style="padding-top: 20px; padding-left: 38px;">
           </div>
        -->   
            <div id="profiledetail">
                <div id="buttons" style="padding-top: 10px;">
                    <ul>
                        <li>
                            <a href="DH_profileView.jsp">Update</a>
                        </li>
                    </ul>
                </div>
                <h1 style="padding-top: 10px; padding-left: 10px;">ABOUT</h1>
                <table style="font-size: 15px; border-collapse: collapse;" align="center">
                    <tr><th align="left">First Name : </th><td><%=dto.getFirstname()%></td> <th align="left">Last Name : </th><td><%=dto.getLastname()%></td></tr>
                    <tr><th align="left">User Name : </th><td><%=username%></td> <th align="left">Phone number : </th><td><%=dto.getPhone()%></td></tr>
                    <tr><th align="left">House no. : </th><td><%=dto.getHouseno()%></td> <th align="left">Colony : </th><td><%=dto.getColony()%></td></tr>
                    <tr><th align="left">Landmark : </th><td><%=dto.getLandmark()%></td> <th align="left">City : </th><td><%=dto.getCity()%></td></tr>
                    <tr><th align="left">State : </th><td><%=dto.getState()%></td> <th align="left">PIN Code : </th><td><%=dto.getPin()%></td></tr>
                </table>
                
         
            </div>
        </div>
        
        <div style="min-height: 100px; overflow: hidden; width: 1000px; margin-left: auto; margin-right: auto; padding-top: 20px;">
            <div id="profiletolet">
                <div id="profiletoletheader">
                    <h1>To Let Data</h1>
                </div>
                    <table align="center" style="font-size: 12px; border-collapse: separate; border-spacing: 20px 0;">
                        <tr><th>Registry number</th> <th>Address</th> <th>Rent</th> <th>Status</th></tr>                
                <%
                   
                    ArrayList<DTO> toletList=dao.getallToletData(username);
                    
                    Iterator<DTO> toletiterator=toletList.iterator();
                    
                    while(toletiterator.hasNext())
                    {
                        dto=toletiterator.next();
                %>    
                        <tr><td align="center"><%=dto.getRegistry()%></td> <td><%=dto.getHouseno()%>,<%=dto.getColony()%>,<%=dto.getLandmark()%>,<%=dto.getCity()%>,<%=dto.getState()%></td> <td><%=dto.getRent()%></td> <td><%=dto.getStatus()%></td>
                            <td><form action="Toletview" method="post">
                                    <input type="hidden" name="registry" value="<%=dto.getRegistry()%>">
                                    <input type="submit" value="View/Update" style="width: 100px; height: 30px;">
                                </form>
                            </td>
                            <td><form action="ToletDelete" method="post">
                                    <input type="hidden" name="registry" value="<%=dto.getRegistry()%>">
                                    <input type="submit" value="Delete" style="width: 100px; height: 30px;">
                                </form>
                            </td>
                        </tr>
                <%
                    }
                %>
                </table>
            </div>
            <div id="profileonrent">
                <div id="profileonrentheader">
                    <h1>Sell Data</h1>
                </div>
                <table align="center" style="font-size: 12px; border-collapse: separate; border-spacing: 20px 0;">
                        <tr><th>Registry number</th> <th>Address</th> <th>Price</th> <th>Status</th></tr>                
                <%
                    ArrayList<DTO> sellList=dao.getallSellData(username);
                    
                    Iterator<DTO> selliterator=sellList.iterator();
                    
                    while(selliterator.hasNext())
                    {
                        dto=selliterator.next();
                %>    
                        <tr><td align="center"><%=dto.getRegistry()%></td> <td><%=dto.getHouseno()%>,<%=dto.getColony()%>,<%=dto.getLandmark()%>,<%=dto.getCity()%>,<%=dto.getState()%></td> <td><%=dto.getPrice()%></td> <td><%=dto.getStatus()%></td>
                            <td><form action="Sellview" method="post">
                                    <input type="hidden" name="registry" value="<%=dto.getRegistry()%>">
                                    <input type="submit" value="View/Update" style="width: 100px; height: 30px;">
                                </form>
                            </td>
                            <td><form action="SellDelete" method="post">
                                    <input type="hidden" name="registry" value="<%=dto.getRegistry()%>">
                                    <input type="submit" value="Delete" style="width: 100px; height: 30px;">
                                </form>
                            </td>
                        </tr>
                <%
                    }
                %>
                </table>
                
            </div>
        </div>
        
        <div style="height: 30px;">
                    
        </div>
        <!-- footer begins -->
        <div id="footer">
            <h3 style="color: white; padding-top: 25px; text-align: center;">© Copyright 2019 Dream home - All Rights Reserved</h3>
        </div>

        <!-- footer ends -->
        </div>

    </body>
</html>
