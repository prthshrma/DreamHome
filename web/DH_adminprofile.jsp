<%-- 
    Document   : DH_adminprofile
    Created on : Jun 8, 2020, 6:35:26 PM
    Author     : HP
--%>

<%@page import="DAO.AdminDAO"%>
<%@page import="DAO.UserProfileDAO"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="DTO.DTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="DHstyle.css" rel="stylesheet" type="text/css" />
        <title>Admin</title>
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
                            <li><a href="#" title="">Services</a></li>
                            <li><a href="#" title="">About us</a></li>
                            <li><a href="#" title="">Contact</a></li>                                
                            <li><a href="logout.jsp" class="drop">Logout</a></li>                                                                                                         
                        </ul>                        
            </div>
       
            <div id="logo">
                <a href="#">Dream Home</a>
            </div>
	
            
        </div>
        <!-- header ends -->
        
        <%
                AdminDAO dao=new AdminDAO();
                //DTO dto=dao.getuserData(username);
                DTO dto=null;
        %>
        
        <div style="min-height: 100px; overflow: hidden; width: 1000px; margin-left: auto; margin-right: auto; padding-top: 20px;">
            <div id="profiletolet">
                <div id="profiletoletheader">
                    <h1>To Let Data</h1>
                </div>
                    <table align="center" style="font-size: 12px; border-collapse: separate; border-spacing: 20px 0;">
                        <tr><th>Username</th> <th>Owner</th> <th>Registry number</th> <th>Status</th></tr>                
                <%
                   
                    ArrayList<DTO> toletList=dao.getallToletData();
                    
                    Iterator<DTO> toletiterator=toletList.iterator();
                    
                    while(toletiterator.hasNext())
                    {
                        dto=toletiterator.next();
                %>    
                        <tr><td align="center"><%=dto.getUsername()%></td> <td align="center"><%=dto.getOwner()%></td> <td align="center"><%=dto.getRegistry()%></td> <td align="center"><%=dto.getStatus()%></td>
                            <td><form action="Toletview" method="post">
                                    <input type="hidden" name="registry" value="<%=dto.getRegistry()%>">
                                    <input type="submit" value="View/Approve" style="width: 100px; height: 30px;">
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
                        <tr><th>Username</th> <th>Owner</th> <th>Registry Number</th> <th>Status</th></tr>                
                <%
                    ArrayList<DTO> sellList=dao.getallSellData(username);
                    
                    Iterator
                            <DTO> selliterator=sellList.iterator();
                    
                    while(selliterator.hasNext())
                    {
                        dto=selliterator.next();
                %>    
                        <tr><td align="center"><%=dto.getUsername()%></td> <td align="center"><%=dto.getOwner()%></td> <td align="center"><%=dto.getRegistry()%></td> <td align="center"><%=dto.getStatus()%></td>
                            <td><form action="Sellview" method="post">
                                    <input type="hidden" name="registry" value="<%=dto.getRegistry()%>">
                                    <input type="submit" value="View/Approve" style="width: 100px; height: 30px;">
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
