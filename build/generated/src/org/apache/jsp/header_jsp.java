package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<!--header-->\n");
      out.write("\t<div class=\"header\" id=\"home\">\n");
      out.write("\t\t\t<div class=\"header-top\">\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<div class=\"head-top\">\n");
      out.write("\t\t\t\t\t\t<div class=\"indicate\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"glyphicon glyphicon-map-marker\" aria-hidden=\"true\"></i><a href=\"#\">Ghatlodiya, Ahmedabad</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"deatils\">\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li><i class=\"glyphicon glyphicon-log-in\" aria-hidden=\"true\"></i><a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal\">Sign In</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><i class=\"glyphicon glyphicon-lock\" aria-hidden=\"true\"></i><a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal1\">Register</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"logo\">\n");
      out.write("\t\t\t\t\t\t<h1><a href=\"index.jsp\">Lease Management System</a></h1>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"header-bottom\">\n");
      out.write("\t\t\t\t<nav class=\"navbar navbar-default\">\n");
      out.write("\t\t\t\t\t<div class=\"container-fluid\">\n");
      out.write("    <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("\t\t\t\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("<!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("\t\t\t\t\t\t<div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("\t\t\t\t\t\t\t<nav class=\"menu menu--francisco\">\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"nav navbar-nav menu__list\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"menu__item menu__item--current\"><a href=\"index.jsp\" class=\"menu__link\"><span class=\"menu__helper\">Home</span></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"menu__item\"><a href=\"about.jsp\" class=\"menu__link\"><span class=\"menu__helper\">About</span></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"menu__item\"><a href=\"services.jsp\" class=\"menu__link\"><span class=\"menu__helper\">Services</span></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</nav>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"social-icons\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\"><i class=\"icon\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\"><i class=\"icon1\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\"><i class=\"icon2\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\"><i class=\"icon3\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t</div><!-- /.navbar-collapse -->\n");
      out.write("\t\t\t\t\t\t\t<!-- /.container-fluid -->\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</nav>\n");
      out.write("\n");
      out.write("\t\t\t</div>\t\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!--header-->\n");
      out.write("\t\n");
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
