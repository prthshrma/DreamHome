package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import java.util.ArrayList;
import DAO.BuyRentDAO;
import DTO.DTO;

public final class DH_005fbuyshow_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"DHstyle.css\" rel=\"stylesheet\" type=\"text/css\" />                \n");
      out.write("        <title>Show Property</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String username=(String)session.getAttribute("username");
            String type=(String)session.getAttribute("type");
            String min=(String)session.getAttribute("min");
            String max=(String)session.getAttribute("max");
            String city=(String)session.getAttribute("city");
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
      out.write("            </div>            \n");
      out.write("        </div>\n");
      out.write("        <!-- header ends -->\n");
      out.write("        \n");
      out.write("        <div style=\"padding-top: 20px;\">\n");
      out.write("            <div id=\"filter\">\n");
      out.write("                <form action=\"BuyShow\" method=\"post\">\n");
      out.write("                <table align='center'>\n");
      out.write("                    <tr><td>Type :</td><td><select name=\"type\">\n");
      out.write("                                            <option>Flat</option>\n");
      out.write("                                            <option>House</option>\n");
      out.write("                                            <option>Plot</option>\n");
      out.write("                                           </select></td></tr>\n");
      out.write("                    <tr><td>Price :</td><td><input type=\"number\" name=\"min\" placeholder=\"Minimum\" required=\"required\"></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"max\" placeholder=\"Maximum\" required=\"required\"></td></tr>\n");
      out.write("                    <tr><td>City :</td><td><input type=\"text\" name=\"city\" placeholder=\"city\" required=\"required\"></td></tr>\n");
      out.write("                    \n");
      out.write("                </table>\n");
      out.write("                <table align=\"center\">    \n");
      out.write("                    <tr><td><input type=\"submit\" value=\"SHOW\"></td></tr>\n");
      out.write("                </table> \n");
      out.write("                </form>   \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div style=\"min-height: 100px; overflow: hidden; width: 1000px; margin-left: auto; margin-right: auto; padding-top: 20px;\">\n");
      out.write("                <table>\n");
      out.write("                    <tr><th>Registry no.</th><th>Owner</th><th>Address</th><th>Price</th></tr>\n");
      out.write("                    ");

                        DTO dto=null;
                        BuyRentDAO dao=new BuyRentDAO();
                        ArrayList<DTO> list=dao.getData(type, min, max, city);
                        Iterator<DTO> showiterator=list.iterator();
                        
                        while(showiterator.hasNext())
                        {
                            dto=showiterator.next();
                    
      out.write("\n");
      out.write("                    <tr><td align=\"center\">");
      out.print(dto.getRegistry());
      out.write("</td> <td>");
      out.print(dto.getOwner());
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
      out.write("</td>\n");
      out.write("                            <td><form action=\"Toletview\" method=\"post\">\n");
      out.write("                                    <input type=\"hidden\" name=\"registry\" value=\"");
      out.print(dto.getRegistry());
      out.write("\">\n");
      out.write("                                    <input type=\"submit\" value=\"View/Update\" style=\"width: 100px; height: 30px;\">\n");
      out.write("                                </form>\n");
      out.write("                            </td></tr>\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
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
