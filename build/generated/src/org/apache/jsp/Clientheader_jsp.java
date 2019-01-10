package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Clientheader_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--header-->\n");
      out.write("        <div class=\"header\" id=\"home\">\n");
      out.write("            <div class=\"header-top\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"head-top\">\n");
      out.write("                        <div class=\"indicate\">\n");
      out.write("                            <i class=\"glyphicon glyphicon-map-marker\" aria-hidden=\"true\"></i><a href=\"#\">Ghatlodiya, Ahmedabad.</a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"deatils\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"logo\">\n");
      out.write("                        <h1><a href=\"index.jsp\">Lease Management System</a></h1>\n");
      out.write("                        <h4><a href=\"index.jsp\">Client</a></h4>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!--header-->\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"header-bottom\">\n");
      out.write("                <nav class=\"navbar navbar-default\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("                        <div class=\"navbar-header\">\n");
      out.write("                            <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n");
      out.write("                                <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                            </button>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                        <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                            <nav class=\"menu menu--francisco\">\n");
      out.write("                                <ul class=\"nav navbar-nav menu__list\">\n");
      out.write("                                    <li class=\"menu__item menu__item--current\"><a href=\"Client.jsp\" class=\"menu__link\"><span class=\"menu__helper\">Home</span></a></li>\n");
      out.write("                                    <li> <select class=\"menu__item menu__item--current\" name=\"profile\" onchange=\"window.location.href = this.value\" class=\"menu__link\" style=\"color: #02B875;\n");
      out.write("                                                 background-color: #fff;height: 36px;\"><span class=\"menu__helper\">Manage Profile</span>\n");
      out.write("                                            <option value=\"\">Manage Profile</option>\n");
      out.write("                                            <option value=\"viewprofileserv\">View Profile </option>\n");
      out.write("                                            <option value=\"viewserviceproviderserv\">View Serviceprovider</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"menu__item\"><a href=\"clientviewpropertyserv\" class=\"menu__link\"><span class=\"menu__helper\">View Property</span></a></li>\n");
      out.write("                                    <li class=\"menu__item\"><a href=\"recentviewpropertyserv\" class=\"menu__link\"><span class=\"menu__helper\">Recent View Property</span></a></li>\n");
      out.write("                                    <li> <select class=\"menu__item menu__item--current\" name=\"feedback\" onchange=\"window.location.href = this.value\" class=\"menu__link\" style=\"color: #02B875;\n");
      out.write("                                                 background-color: #fff;height: 36px;\"><span class=\"menu__helper\">Manage Profile</span>\n");
      out.write("                                            <option value=\"\">Feedback</option>\n");
      out.write("                                            <option value=\"clientaddfeedback.jsp\">Add Feedback </option>\n");
      out.write("                                            <option value=\"clientviewfeedbackserv\">View Feedback</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"menu__item menu__item--current\"><a href=\"viewpaymenthistory\" class=\"menu__link\"><span class=\"menu__helper\">View Payment</span></a></li>\n");
      out.write("                                   \n");
      out.write("                                </ul>\n");
      out.write("                            </nav>\n");
      out.write("                            \n");
      out.write("                            <div class=\"clearfix\"></div>\n");
      out.write("                        </div><!-- /.navbar-collapse -->\n");
      out.write("                        <!-- /.container-fluid -->\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("            </div>\t\n");
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
