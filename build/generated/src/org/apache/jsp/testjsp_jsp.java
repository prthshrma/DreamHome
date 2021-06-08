package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class testjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Registration testing</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link href=\"DHstyle.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("    </head>\n");
      out.write("    <body  style=\"background:url(images/back_all.jpg) repeat-x;\">\n");
      out.write("        <div id=\"register\">\n");
      out.write("            <div style=\"padding: 15px; \">\n");
      out.write("                <form action=\"Registration\" method=\"post\" > \n");
      out.write("                <table align=\"center\">\n");
      out.write("                    <tr><td><input type=\"text\" name=\"firstname\" placeholder=\"First Name\"></td></tr>\n");
      out.write("                    <tr><td><input type=\"text\" name=\"lastname\" placeholder=\"Last Name\"></td></tr>                \n");
      out.write("                    <tr><td><input type=\"text\" name=\"houseno\" placeholder=\"House number\"></td></tr>\n");
      out.write("                    <tr><td><input type=\"text\" name=\"colony\" placeholder=\"Colony\"></td></tr>\n");
      out.write("                    <tr><td><input type=\"text\" name=\"landmark\" placeholder=\"LandMark\"></td></tr>\n");
      out.write("                    <tr><td><input type=\"text\" name=\"city\" placeholder=\"City\"></td></tr>\n");
      out.write("                    <tr><td><input type=\"text\" name=\"state\" placeholder=\"State\"></td></tr>\n");
      out.write("                    <tr><td><input type=\"text\" name=\"pin\" placeholder=\"Pin Code\"></td></tr>\n");
      out.write("                    <tr><td><input type=\"number\" name=\"phone\" placeholder=\"Mobile number\"></td></tr>\n");
      out.write("                    <tr><td><input type=\"number\" name=\"aadhar\" placeholder=\"Aadhar number\"></td></tr> \n");
      out.write("                    <tr><td><input type=\"file\" name=\"profilephoto\"></td></tr>\n");
      out.write("                    <tr><td><input type=\"text\" name=\"username\" placeholder=\"Email(username)\"></td></tr>                  \n");
      out.write("                    <tr><td><input type=\"password\" name=\"password\" placeholder=\"Password\"></td></tr>\n");
      out.write("                    <tr><td><input type=\"password\" name=\"confirmpassword\" placeholder=\"Confirm Password\"></td></tr>\n");
      out.write("                </table>\n");
      out.write("                <table align=\"center\">    \n");
      out.write("                    <tr><td><input type=\"submit\" value=\"REGISTER\"></td></tr>\n");
      out.write("                </table>                \n");
      out.write("            </form>\n");
      out.write("            </div>\n");
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
