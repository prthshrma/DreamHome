<%-- 
    Document   : DH_buyshow
    Created on : Jun 22, 2019, 9:47:22 PM
    Author     : HP
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="DAO.BuyRentDAO"%>
<%@page import="DTO.DTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="DHstyle.css" rel="stylesheet" type="text/css" />                
        <title>Show Property</title>
    </head>
    <body>
        <%
            String username=(String)session.getAttribute("username");
            String type=(String)session.getAttribute("type");
            String max=(String)session.getAttribute("max");
            String city=(String)session.getAttribute("city");
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
        
        <div style="padding-top: 20px;">
            <div id="filter">
                <form action="BuyShow" method="post">
                <table align='center'>
                    <tr><td>Type :</td><td><select name="type">
                                            <option>Flat</option>
                                            <option>House</option>
                                            <option>Plot</option>
                                           </select></td></tr>
                    <tr><td>Price :</td><td><input type="number" name="max" placeholder="Maximum" required="required"></td></tr>
                    <tr><td>City :</td><td><input type="text" name="city" placeholder="city" required="required"></td></tr>
                    
                </table>
                <table align="center">    
                    <tr><td><input type="submit" value="SHOW"></td></tr>
                </table> 
                </form>   
            </div>
            
            <div style="padding-top: 30px;">
                <%
                    DTO dto=null;
                    BuyRentDAO dao=new BuyRentDAO();
                    ArrayList<DTO> list=dao.getBuyData(type, max, city);
                    if(!list.isEmpty())
                    {
                %>
            <div style="min-height: 100px; overflow: hidden; width: 800px; margin-left: auto; margin-right: auto; padding-top: 30px; background-color: white;">
                    
                <table align="center" style="font-size: 12px; border-collapse: separate; border-spacing: 20px 0;">
                    <tr><th>Registry no.</th><th>Owner</th><th>Address</th><th>Price</th></tr>
                    
                    <%
                        Iterator<DTO> showiterator=list.iterator();
                        
                        while(showiterator.hasNext())
                        {
                            dto=showiterator.next();
                    %>
                    <tr><td align="center"><%=dto.getRegistry()%></td> <td><%=dto.getOwner()%></td> <td><%=dto.getHouseno()%>,<%=dto.getColony()%>,<%=dto.getLandmark()%>,<%=dto.getCity()%>,<%=dto.getState()%></td> <td><%=dto.getPrice()%></td>
                            <td><form action="Buyview" method="post">
                                    <input type="hidden" name="registry" value="<%=dto.getRegistry()%>">
                                    <input type="submit" value="Details" style="width: 100px; height: 30px;">
                                </form>
                            </td></tr>
                    <%
                        }
                    %>
                </table>
            </div>
                    <%
                    }
                    else
                    {
                    %>
            <div style="height: 130px;">
                <div style="min-height: 100px; overflow: hidden; width: 300px; margin-left: auto; margin-right: auto; padding-top: 50px; background-color: #3886E0;">
                    <h1 style="text-align: center; color: white;">No Record</h1>
                </div>                    
            </div>
                    <%
                    }

                    %>
                
            </div>
        </div>
        
        <div style="height: 30px;">
                    
        </div>        
                
        <!-- footer begins -->
        <div id="footer">
        </div>

        <!-- footer ends -->
        </div>
    </body>
</html>
