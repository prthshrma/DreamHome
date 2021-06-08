package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import java.sql.ResultSet;
import DB.DBConnector;
import java.sql.Statement;

public final class DH_005ftoletView_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"DHstyle.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <title>Tolet View</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String username=(String)session.getAttribute("username");
            String registry=(String)session.getAttribute("registry");
            if(username==null || username.trim().equals(""))
            {
                response.sendRedirect("DH_login.html");
                return;
            }
        
      out.write("\n");
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
      out.write("                                <li><a href=\"DH_profile.jsp\" class=\"drop\">Profile</a></li>                                                                                                         \n");
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
      out.write("        <div id=\"tolet_content\">\n");
      out.write("        <h1 style=\"text-align: center; color:darkblue;\">PROPERTY VIEW</h1>\n");
      out.write("        \n");
      out.write("        ");

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
                    
        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div id=\"toletview\">\n");
      out.write("            <div style=\"padding: 10px; \">\n");
      out.write("                <form action=\"ToletUpdate\" method=\"post\" >\n");
      out.write("                <table align=\"center\" style=\"font-size: 15px; color:#3820E0;\">\n");
      out.write("                    <tr><td>Registry No. :</td><td><input type=\"text\" name=\"registry\" value=\"");
      out.print(registry);
      out.write("\" disabled=\"disabled\"><input type=\"text\" name=\"registry\" value=\"");
      out.print(registry);
      out.write("\" hidden=\"hidden\"></td>\n");
      out.write("                        <td>Owner Name :</td><td><input type=\"text\" name=\"owner\" value=\"");
      out.print(owner);
      out.write("\" disabled=\"disabled\"></td></tr>                \n");
      out.write("                    <tr><td>Type :</td><td><input type=\"text\" name=\"type\" value=\"");
      out.print(type);
      out.write("\" disabled=\"disabled\"></td>\n");
      out.write("                        <td>Configuration :</td><td><input type=\"text\" name=\"configuration\" value=\"");
      out.print(configuration);
      out.write("\" disabled=\"disabled\"></td></tr>\n");
      out.write("                    <tr><td>Built Up Area :</td><td><input type=\"text\" name=\"builtuparea\" value=\"");
      out.print(builtuparea);
      out.write("\" disabled=\"disabled\"></td>\n");
      out.write("                        <td>Property Age :</td><td><input type=\"text\" name=\"propertyage\" value=\"");
      out.print(propertyage);
      out.write("\"></td></tr>\n");
      out.write("                </table>\n");
      out.write("                <table align=\"center\" style=\"font-size: 15px; color:#3820E0;\">    \n");
      out.write("                    <tr><td>House number :</td><td><input type=\"text\" name=\"houseno\" value=\"");
      out.print(houseno);
      out.write("\" disabled=\"disabled\"></td></tr>\n");
      out.write("                    <tr><td>Colony :</td><td><input type=\"text\" name=\"colony\" value=\"");
      out.print(colony);
      out.write("\" disabled=\"disabled\"></td></tr>\n");
      out.write("                    <tr><td>LandMark :</td><td><input type=\"text\" name=\"landmark\" value=\"");
      out.print(landmark);
      out.write("\" disabled=\"disabled\"></td></tr>\n");
      out.write("                    <tr><td>City :</td><td><input type=\"text\" name=\"city\" value=\"");
      out.print(city);
      out.write("\" disabled=\"disabled\"></td></tr>\n");
      out.write("                    <tr><td>State :</td><td><input type=\"text\" name=\"state\" value=\"");
      out.print(state);
      out.write("\" disabled=\"disabled\"></td></tr>\n");
      out.write("                    <tr><td>Pin Code :</td><td><input type=\"text\" name=\"pin\" value=\"");
      out.print(pin);
      out.write("\" disabled=\"disabled\"></td></tr>\n");
      out.write("                    <tr><td>Preference :</td><td><select name=\"preference\">\n");
      out.write("                                <option selected=\"selected\" disabled=\"disabled\">");
      out.print(preference);
      out.write("</option>\n");
      out.write("                                <option selected=\"selected\" hidden=\"hidden\">");
      out.print(preference);
      out.write("</option>\n");
      out.write("                                                    <option>Students (Girls)</option>\n");
      out.write("                                                    <option>Students (Boys)</option>\n");
      out.write("                                                    <option>Family</option>\n");
      out.write("                                                </select></td></tr>\n");
      out.write("                    <tr><td>Rent :</td><td><input type=\"number\" name=\"rent\" value=\"");
      out.print(rent);
      out.write("\"></td></tr>                                      \n");
      out.write("                    <tr><td>Property Description :</td><td><textarea name=\"description\" rows=\"4\" cols=\"30\" >");
      out.print(description);
      out.write("</textarea></td></tr>\n");
      out.write("                </table>\n");
      out.write("                <table align=\"center\">    \n");
      out.write("                    <tr><td><input type=\"submit\" value=\"UPDATE\"></td></tr>\n");
      out.write("                </table>                \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");

                    }
            }
            catch(SQLException e)
            {
                System.out.println(e);
            }
        
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- footer begins -->\n");
      out.write("        <div id=\"footer\">\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- footer ends -->\n");
      out.write("        </div>\n");
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
