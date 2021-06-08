package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class DH_005fuserhome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"DHstyle.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <title>Dreamhome</title>\n");
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
      out.write("        \n");
      out.write("        <div id=\"main\">\n");
      out.write("        <!-- header begins -->\n");
      out.write("        <div id=\"header\">\n");
      out.write("            <div id=\"buttons\">\n");
      out.write("                \t<ul>\n");
      out.write("                        \t<li class=\"first\"><a href=\"#\"  title=\"\">Home</a></li>\n");
      out.write("                                <li><a href=\"DH_userservices.html\" title=\"\">Services</a></li>\n");
      out.write("                                <li><a href=\"DH_userAboutus.html\" title=\"\">About us</a></li>\n");
      out.write("                                <li><a href=\"DH_userContact.html\" title=\"\">Contact</a></li>                                \n");
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
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div id=\"image\">\n");
      out.write("            <img src=\"images/house.jpg\" height=\"350px\" width=\"1300px\" alt=\"Image Not Found\">\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"content\">\n");
      out.write("        <div id=\"bar\" style=\"background-color:white;\">\n");
      out.write("            <h2><a href=\"DH_tolet.jsp\" title=\"\">To Let</a></h2>\n");
      out.write("        <p style=\"text-align: center; color: #0099E5; font-size: 13px;\">Give your property on rent with the desired rental preference and huge exposure.</p>\n");
      out.write("        <img src=\"images/tolet.jpg\" height=\"200px\" width=\"250px\" alt=\"Image Not Found\" style=\"padding-left: 2px; padding-top: 15px;\">\n");
      out.write("        </div>\n");
      out.write("        <div id=\"bar\" style=\"background-color: white; font-size: 13px;\">\n");
      out.write("            <h2><a href=\"DH_onrentfilter.jsp\" title=\"\">On Rent</a></h2>\n");
      out.write("        <p style=\"text-align: center; color: #0099E5;\">Get the property of your choice on rent from the various options available.</p>\n");
      out.write("        <img src=\"images/onrent.jpg\" height=\"200px\" width=\"250px\" alt=\"Image Not Found\" style=\"padding-left: 2px; padding-top: 15px;\">\n");
      out.write("        </div>\n");
      out.write("        <div id=\"bar\" style=\"background-color: white; font-size: 13px;\">\n");
      out.write("            <h2><a href=\"DH_sell.jsp\" title=\"\">Sell</a></h2>\n");
      out.write("        <p style=\"text-align: center; color: #0099E5;\">Get best deals on selling your property by the great exposure to buyers.</p>\n");
      out.write("        <img src=\"images/sell.jpg\" height=\"200px\" width=\"250px\" alt=\"Image Not Found\" style=\"padding-left: 2px; padding-top: 15px;\">\n");
      out.write("        </div>\n");
      out.write("        <div id=\"bar\" style=\"background-color: white; font-size: 13px;\">\n");
      out.write("            <h2><a href=\"DH_buyfilter.jsp\" title=\"\">Buy</a></h2>\n");
      out.write("        <p style=\"text-align: center; color: #0099E5;\">Purchase the home of your Dream from the multiple options available.</p>\n");
      out.write("        <img src=\"images/buy.jpg\" height=\"200px\" width=\"250px\" alt=\"Image Not Found\" style=\"padding-left: 2px; padding-top: 15px;\">\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div style=\"width: 1000px; margin-left: auto; margin-right: auto; padding-top: 20px;\">\n");
      out.write("    <h1 style=\"color: #3870E0\">About us</h1>\n");
      out.write("    <p style=\"text-align: center; font-size:17px; padding-top: 20px;\">\n");
      out.write("        \n");
      out.write("        Dream Home is an online platform where real estate trade is taking place in a much faster and newer manner. \n");
      out.write("        We not just help you with finding the ideal real estate, but also ensure that your buying journey is as smooth as it can be. \n");
      out.write("        We understand that while buying or renting a property, there are a lot of factors to be taken into consideration, \n");
      out.write("        like the locality, preferred area, budget, amenities, and a lot more. \n");
      out.write("        Dream Home is the destination where you will end up finding the best suitable property available across India. \n");
      out.write("        Whether you are looking for a rented property or planning to build your dream abode, you can find anything and everything \n");
      out.write("        in real estate at our portal. A wide variety of listing that is advertised here gives you an excellent overview of all property \n");
      out.write("        available in the area you are considering.\n");
      out.write("    </p>\n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("    <div style=\"width: 1000px; margin-left: auto; margin-right: auto; padding-top: 30px;\">\n");
      out.write("    <h1 style=\"color: #3870E0\">Contact Us:</h1>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <form>\n");
      out.write("       <table align=\"center\">\n");
      out.write("            <tr><td>Name :</td><td><input type=\"text\" name=\"name\" style=\"background-color: white;\"></td></tr>\n");
      out.write("            <tr><td>Email :</td><td><input type=\"text\" name=\"email\" style=\"background-color: white;\"></td></tr>\n");
      out.write("            <tr><td>Message :</td><td><textarea name=\"message\" rows=\"4\" cols=\"30\" style=\"background-color: white;\"></textarea></td></tr>\n");
      out.write("        </table>\n");
      out.write("        <table align=\"center\">\n");
      out.write("            <tr><td><input type=\"submit\" value=\"submit\"></td></tr>\n");
      out.write("        </table>\n");
      out.write("    </form>\n");
      out.write("    </div>    \n");
      out.write("        \n");
      out.write("    <div style=\"height: 30px;\">\n");
      out.write("    </div>\n");
      out.write("        <!-- footer begins -->\n");
      out.write("        <div id=\"footer\">\n");
      out.write("            <h3 style=\"color: white; padding-top: 25px; text-align: center;\">© Copyright 2019 Dream home - All Rights Reserved</h3>\n");
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
