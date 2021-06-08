package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import java.util.ArrayList;
import DAO.UserProfileDAO;
import java.sql.ResultSet;
import java.sql.Statement;
import DB.DBConnector;
import java.sql.Connection;
import DTO.DTO;

public final class DH_005fprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"DHstyle.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <title>profile</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");

            String username=(String)session.getAttribute("username");
            
            if(username==null || username.trim().equals(""))
            {
                response.sendRedirect("DH_login.html");
                return;
            }
        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div id=\"main\">\n");
      out.write("        <!-- header begins -->\n");
      out.write("        <div id=\"header\">\n");
      out.write("            <div id=\"buttons\">\n");
      out.write("                \t<ul>\n");
      out.write("                            <li class=\"first\"><a href=\"DH_userhome.jsp\"  title=\"\">Home</a></li>\n");
      out.write("                                <li><a href=\"#\" title=\"\">Services</a></li>\n");
      out.write("                                <li><a href=\"#\" title=\"\">About us</a></li>\n");
      out.write("                                <li><a href=\"#\" title=\"\">Contact</a></li>                                \n");
      out.write("                                <li><a href=\"logout.jsp\" class=\"drop\">Logout</a></li>                                                                                                         \n");
      out.write("                        </ul>                        \n");
      out.write("            </div>\n");
      out.write("       \n");
      out.write("            <div id=\"logo\">\n");
      out.write("                <a href=\"#\">Dream Home</a>\n");
      out.write("            </div>\n");
      out.write("\t\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <!-- header ends -->\n");
      out.write("        \n");
      out.write("        <div id=\"profile\">\n");
      out.write("            <div id=\"profilephoto\">\n");
      out.write("                <img src=\"images/defaultprofileicon.jpg\" alt=\"Image Not Found\" style=\"padding-top: 20px; padding-left: 38px;\">\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            ");

                UserProfileDAO dao=new UserProfileDAO();
                DTO dto=dao.getuserData(username);
                   
            
      out.write("\n");
      out.write("            \n");
      out.write("            <div id=\"profiledetail\">\n");
      out.write("                <div id=\"buttons\" style=\"padding-top: 10px;\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"DH_profileView.jsp\">Update</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <h1 style=\"padding-top: 10px; padding-left: 10px;\">ABOUT</h1>\n");
      out.write("                <table style=\"font-size: 15px; border-collapse: collapse;\" align=\"center\">\n");
      out.write("                    <tr><th align=\"left\">First Name : </th><td>");
      out.print(dto.getFirstname());
      out.write("</td> <th align=\"left\">Last Name : </th><td>");
      out.print(dto.getLastname());
      out.write("</td></tr>\n");
      out.write("                    <tr><th align=\"left\">User Name : </th><td>");
      out.print(username);
      out.write("</td> <th align=\"left\">Phone number : </th><td>");
      out.print(dto.getPhone());
      out.write("</td></tr>\n");
      out.write("                    <tr><th align=\"left\">House no. : </th><td>");
      out.print(dto.getHouseno());
      out.write("</td> <th align=\"left\">Colony : </th><td>");
      out.print(dto.getColony());
      out.write("</td></tr>\n");
      out.write("                    <tr><th align=\"left\">Landmark : </th><td>");
      out.print(dto.getLandmark());
      out.write("</td> <th align=\"left\">City : </th><td>");
      out.print(dto.getCity());
      out.write("</td></tr>\n");
      out.write("                    <tr><th align=\"left\">State : </th><td>");
      out.print(dto.getState());
      out.write("</td> <th align=\"left\">PIN Code : </th><td>");
      out.print(dto.getPin());
      out.write("</td></tr>\n");
      out.write("                </table>\n");
      out.write("                \n");
      out.write("         \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div style=\"min-height: 100px; overflow: hidden; width: 1000px; margin-left: auto; margin-right: auto; padding-top: 20px;\">\n");
      out.write("            <div id=\"profiletolet\">\n");
      out.write("                <div id=\"profiletoletheader\">\n");
      out.write("                    <h1>To Let Data</h1>\n");
      out.write("                </div>\n");
      out.write("                    <table align=\"center\" style=\"font-size: 12px; border-collapse: separate; border-spacing: 20px 0;\">\n");
      out.write("                        <tr><th>Registry number</th> <th>Address</th> <th>Rent</th> <th>Status</th></tr>                \n");
      out.write("                ");

                   
                    ArrayList<DTO> toletList=dao.getallToletData(username);
                    
                    Iterator<DTO> toletiterator=toletList.iterator();
                    
                    while(toletiterator.hasNext())
                    {
                        dto=toletiterator.next();
                
      out.write("    \n");
      out.write("                        <tr><td align=\"center\">");
      out.print(dto.getRegistry());
      out.write("</td> <td>");
      out.print(dto.getHouseno());
      out.write(',');
      out.print(dto.getColony());
      out.write(',');
      out.print(dto.getLandmark());
      out.write(',');
      out.print(dto.getCity());
      out.write(',');
      out.print(dto.getState());
      out.write("</td> <td>");
      out.print(dto.getRent());
      out.write("</td> <td>");
      out.print(dto.getStatus());
      out.write("</td>\n");
      out.write("                            <td><form action=\"Toletview\" method=\"post\">\n");
      out.write("                                    <input type=\"hidden\" name=\"registry\" value=\"");
      out.print(dto.getRegistry());
      out.write("\">\n");
      out.write("                                    <input type=\"submit\" value=\"View/Update\" style=\"width: 100px; height: 30px;\">\n");
      out.write("                                </form>\n");
      out.write("                            </td>\n");
      out.write("                            <td><form action=\"ToletDelete\" method=\"post\">\n");
      out.write("                                    <input type=\"hidden\" name=\"registry\" value=\"");
      out.print(dto.getRegistry());
      out.write("\">\n");
      out.write("                                    <input type=\"submit\" value=\"Delete\" style=\"width: 100px; height: 30px;\">\n");
      out.write("                                </form>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"profileonrent\">\n");
      out.write("                <div id=\"profileonrentheader\">\n");
      out.write("                    <h1>Sell Data</h1>\n");
      out.write("                </div>\n");
      out.write("                <table align=\"center\" style=\"font-size: 12px; border-collapse: separate; border-spacing: 20px 0;\">\n");
      out.write("                        <tr><th>Registry number</th> <th>Address</th> <th>Price</th> <th>Status</th></tr>                \n");
      out.write("                ");

                    ArrayList<DTO> sellList=dao.getallSellData(username);
                    
                    Iterator<DTO> selliterator=sellList.iterator();
                    
                    while(selliterator.hasNext())
                    {
                        dto=selliterator.next();
                
      out.write("    \n");
      out.write("                        <tr><td align=\"center\">");
      out.print(dto.getRegistry());
      out.write("</td> <td>");
      out.print(dto.getHouseno());
      out.write(',');
      out.print(dto.getColony());
      out.write(',');
      out.print(dto.getLandmark());
      out.write(',');
      out.print(dto.getCity());
      out.write(',');
      out.print(dto.getState());
      out.write("</td> <td>");
      out.print(dto.getPrice());
      out.write("</td> <td>");
      out.print(dto.getStatus());
      out.write("</td>\n");
      out.write("                            <td><form action=\"Sellview\" method=\"post\">\n");
      out.write("                                    <input type=\"hidden\" name=\"registry\" value=\"");
      out.print(dto.getRegistry());
      out.write("\">\n");
      out.write("                                    <input type=\"submit\" value=\"View/Update\" style=\"width: 100px; height: 30px;\">\n");
      out.write("                                </form>\n");
      out.write("                            </td>\n");
      out.write("                            <td><form action=\"SellDelete\" method=\"post\">\n");
      out.write("                                    <input type=\"hidden\" name=\"registry\" value=\"");
      out.print(dto.getRegistry());
      out.write("\">\n");
      out.write("                                    <input type=\"submit\" value=\"Delete\" style=\"width: 100px; height: 30px;\">\n");
      out.write("                                </form>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("                </table>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div style=\"height: 30px;\">\n");
      out.write("                    \n");
      out.write("        </div>\n");
      out.write("        <!-- footer begins -->\n");
      out.write("        <div id=\"footer\">\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- footer ends -->\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
