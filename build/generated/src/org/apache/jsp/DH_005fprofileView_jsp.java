package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import java.sql.ResultSet;
import DB.DBConnector;
import java.sql.Statement;

public final class DH_005fprofileView_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Profile View</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String username=(String)session.getAttribute("username");
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
      out.write("        <div style=\"min-height: 100px; overflow: hidden;\">\n");
      out.write("        <h1 style=\"text-align: center; color:darkblue;\">PROFILE VIEW</h1>\n");
      out.write("        \n");
      out.write("        ");

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
        
      out.write("\n");
      out.write("        \n");
      out.write("        <div id=\"sellview\">\n");
      out.write("            <div style=\"padding: 10px; \">\n");
      out.write("                <form action=\"\" method=\"post\">\n");
      out.write("                <table align=\"center\" style=\"font-size: 15px; color:#3820E0;\">\n");
      out.write("                    <tr><td><input type=\"hidden\" name=\"username\" value=\"");
      out.print(username);
      out.write("\"></td></tr>\n");
      out.write("                    <tr><td>First Name :</td><td><input type=\"text\" name=\"firstname\" value=\"");
      out.print(firstname);
      out.write("\" disabled=\"disabled\"></td></tr>\n");
      out.write("                    <tr><td>Last Name :</td><td><input type=\"text\" name=\"lastname\" value=\"");
      out.print(lastname);
      out.write("\" disabled=\"disabled\"></td></tr>                \n");
      out.write("                    <tr><td>Aadhar number :</td><td><input type=\"text\" name=\"aadhar\" value=\"");
      out.print(aadhar);
      out.write("\" disabled=\"disabled\"></td></tr>\n");
      out.write("                    <tr><td>House number :</td><td><input type=\"text\" name=\"houseno\" value=\"");
      out.print(houseno);
      out.write("\"></td></tr>\n");
      out.write("                    <tr><td>Colony :</td><td><input type=\"text\" name=\"colony\" value=\"");
      out.print(colony);
      out.write("\"</td></tr>\n");
      out.write("                    <tr><td>LandMark :</td><td><input type=\"text\" name=\"landmark\" value=\"");
      out.print(landmark);
      out.write("\"</td></tr>\n");
      out.write("                    <tr><td>City :</td><td><input type=\"text\" name=\"city\" value=\"");
      out.print(city);
      out.write("\"</td></tr>\n");
      out.write("                    <tr><td>State :</td><td><input type=\"text\" name=\"state\" value=\"");
      out.print(state);
      out.write("\"</td></tr>\n");
      out.write("                    <tr><td>Pin Code :</td><td><input type=\"text\" name=\"pin\" value=\"");
      out.print(pin);
      out.write("\"</td></tr>\n");
      out.write("                    \n");
      out.write("                    <tr><td>Phone :</td><td><input type=\"number\" name=\"phone\" value=\"");
      out.print(phone);
      out.write("\"></td></tr>                                      \n");
      out.write("                    \n");
      out.write("                </table>\n");
      out.write("                <table align=\"center\">    \n");
      out.write("                    <tr><td><input type=\"submit\" value=\"UPDATE\"></td></tr>\n");
      out.write("                </table>                \n");
      out.write("            </form>\n");
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
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- footer begins -->\n");
      out.write("        <div id=\"footer\">\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- footer ends -->\n");
      out.write("        </div>\n");
      out.write("    \n");
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
