package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class DH_005fsell_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"DHstyle.css\" rel=\"stylesheet\" type=\"text/css\" />        \n");
      out.write("        <title>Sell</title>\n");
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
      out.write("        <h1 style=\"text-align: center;\">PROPERTY (SELL) REGISTRATION FORM</h1>\n");
      out.write("        \n");
      out.write("        <div id=\"sell_register\">\n");
      out.write("            <div style=\"padding: 10px; \">\n");
      out.write("                <form action=\"Sell_Registration\" method=\"post\">\n");
      out.write("                <table align=\"center\">\n");
      out.write("                    <tr><td><input type=\"hidden\" name=\"username\" value=\"");
      out.print(username);
      out.write("\"></td></tr>\n");
      out.write("                    <tr><td><input type=\"text\" name=\"registry\" placeholder=\"Registry number\"></td>\n");
      out.write("                        <td><input type=\"text\" name=\"owner\" placeholder=\"Owner Name\"></td></tr>\n");
      out.write("                    <tr><td></td><td>Fill Configuration as \"NONE\" for plot.</td></tr>\n");
      out.write("                    <tr><td><input type=\"text\" name=\"type\" placeholder=\"Type (Flat/House/Plot)\"></td>\n");
      out.write("                        <td><input type=\"text\" name=\"configuration\" placeholder=\"Configuration(Flat/House)\"></td></tr>\n");
      out.write("                    <tr><td><input type=\"text\" name=\"builtuparea\" placeholder=\"Built Up Area (feet*feet)\"></td>\n");
      out.write("                        <td><input type=\"text\" name=\"propertyage\" placeholder=\"Property Age\"></td></tr>\n");
      out.write("                </table>\n");
      out.write("                <table align=\"center\">    \n");
      out.write("                    <tr><td><input type=\"text\" name=\"houseno\" placeholder=\"House number\"></td></tr>\n");
      out.write("                    <tr><td><input type=\"text\" name=\"colony\" placeholder=\"Colony\"></td></tr>\n");
      out.write("                    <tr><td><input type=\"text\" name=\"landmark\" placeholder=\"LandMark\"></td></tr>\n");
      out.write("                    <tr><td><input type=\"text\" name=\"city\" placeholder=\"City\"></td></tr>\n");
      out.write("                    <tr><td><input type=\"text\" name=\"state\" placeholder=\"State\"></td></tr>\n");
      out.write("                    <tr><td><input type=\"text\" name=\"pin\" placeholder=\"Pin Code\"></td></tr>\n");
      out.write("                    \n");
      out.write("                    <tr><td><input type=\"number\" name=\"price\" placeholder=\"Price\"></td></tr> \n");
      out.write("                    <tr><td>Google Map Coordinates</td></tr>\n");
      out.write("                    <tr><td><input type=\"number\" step=\"0.000001\" name=\"lat\" placeholder=\"Latitude\"></td></tr>\n");
      out.write("                    <tr><td><input type=\"number\" step=\"0.000001\" name=\"long\" placeholder=\"Longitude\"></td></tr>\n");
      out.write("                    <!-- <tr><td><input type=\"file\" name=\"image\"></td></tr>\n");
      out.write("                    -->\n");
      out.write("                    <tr><td><textarea name=\"description\" rows=\"4\" cols=\"30\" placeholder=\"Property Description\"></textarea></td></tr>\n");
      out.write("                </table>\n");
      out.write("                <table align=\"center\">    \n");
      out.write("                    <tr><td><input type=\"submit\" value=\"REGISTER\"></td></tr>\n");
      out.write("                </table>                \n");
      out.write("            </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
