package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Propertyholder_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Propertyholderheader.jsp");
    _jspx_dependants.add("/footerpropertyholder.jsp");
  }

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

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Home Plat a Real Estates and Builders Category Flat Bootstrap Responsive Web Template | Home :: w3layouts</title>\n");
      out.write("<!--css-->\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<!--css-->\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Home Plat Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/flexslider.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("<!--js-->\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<!--js-->\n");
      out.write("<!--webfonts-->\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Josefin+Sans:400,700italic,700,600italic,600,400italic,300italic,300,100italic,100' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>\n");
      out.write("<!--webfonts-->\n");
      out.write("<script src=\"js/responsiveslides.min.js\"></script>\n");
      out.write(" <script>\n");
      out.write("    $(function () {\n");
      out.write("      $(\"#slider\").responsiveSlides({\n");
      out.write("      \tauto: true,\n");
      out.write("      \tnav: true,\n");
      out.write("      \tspeed: 500,\n");
      out.write("        namespace: \"callbacks\",\n");
      out.write("        pager: true,\n");
      out.write("      });\n");
      out.write("    });\n");
      out.write("  </script>\n");
      out.write("  <link href=\"css/owl.carousel.css\" rel=\"stylesheet\">\n");
      out.write("<script src=\"js/owl.carousel.js\"></script>\n");
      out.write("\t<script>\n");
      out.write("\t\t$(document).ready(function() {\n");
      out.write("\t\t$(\"#owl-demo\").owlCarousel({\n");
      out.write("\t\t\titems : 1,\n");
      out.write("\t\t\tlazyLoad : true,\n");
      out.write("\t\t\tautoPlay : true,\n");
      out.write("\t\t\tnavigation : false,\n");
      out.write("\t\t\tnavigationText :  false,\n");
      out.write("\t\t\tpagination : true,\n");
      out.write("\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
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
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clearfix\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"logo\">\n");
      out.write("                        <h1><a href=\"index.jsp\">Lease Management System</a></h1>\n");
      out.write("                        <h4><a href=\"index.jsp\">PropertyHolder</a></h4>\n");
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
      out.write("                                    <li class=\"menu__item menu__item--current\"><a href=\"Propertyholder.jsp\" class=\"menu__link\"><span class=\"menu__helper\">Home</span></a></li>\n");
      out.write("                                    <li class=\"menu__item menu__item--current\"><a href=\"viewpropertyholderprofileserv\" class=\"menu__link\"><span class=\"menu__helper\">Profile</span></a></li>\n");
      out.write("                                    <li> <select class=\"menu__item menu__item--current\"name=\"property\" onchange=\"window.location.href=this.value\" class=\"menu__link\" style=\"color: #02B875;\n");
      out.write("    background-color: #fff;height: 36px;\"><span class=\"menu__helper\">Property</span>\n");
      out.write("                                                <option value=\"\">Property</option>\n");
      out.write("                                                <option value=\"fetchcategory\">Add Property</option>\n");
      out.write("                                        <option value=\"viewpropertyServ\">View Property</option>\n");
      out.write("                                        </select></li>\n");
      out.write("                                    \n");
      out.write("                                    <li class=\"menu__item menu__item--current\"><a href=\"propertyholderviewfeedbackserv\" class=\"menu__link\"><span class=\"menu__helper\">Feedback</span></a></li>\n");
      out.write("                                    <li class=\"menu__item menu__item--current\"><a href=\"phviewpaymenthistoryserv\" class=\"menu__link\"><span class=\"menu__helper\">View Payment</span></a></li>\n");
      out.write("                                </ul>\n");
      out.write("                                \n");
      out.write("                            </nav>\n");
      out.write("                           \n");
      out.write("                            <div class=\"clearfix\"></div>\n");
      out.write("                        </div><!-- /.navbar-collapse -->\n");
      out.write("                        <!-- /.container-fluid -->\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("            </div>\t\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    <!--banner-->\n");
      out.write("\t\t<div class=\"banner-section\">\n");
      out.write("\t\t<div class=\"slider\">\n");
      out.write("\t\t\t<div class=\"callbacks_container\">\n");
      out.write("\t\t\t\t<ul class=\"rslides\" id=\"slider\">\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t  <img src=\"images/ba1.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t <div class=\"caption\">\n");
      out.write("\t\t\t\t\t\t<h3></h3>\n");
      out.write("\t\t\t\t\t\t<p>Lease management system will keep record of housing properties available on rent and will work as connecting bridge between customer and property sellers. Due to this system there is no need to visit various places in search of desired property. The information of various properties in various locations can be accessible at one place.  This system will provide a platform to home line property sellers and buyers.  This will keep record of land, houses or flats available for rent with their rates and make this available to customers. Also will keep record of contact information of customer and will send necessary notices and/or reminders to customer. This project will increase the efficiency of work of user.  The wastage of time will reduce. The user can simply login to the system and go through all the functions and get the services.</p>\n");
      out.write("\t\t\t\t\t </div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t  <img src=\"images/ba2.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t<div class=\"caption\">\n");
      out.write("\t\t\t\t\t\t<h3></h3>\n");
      out.write("\t\t\t\t\t\t<p>Lease management system will keep record of housing properties available on rent and will work as connecting bridge between customer and property sellers. Due to this system there is no need to visit various places in search of desired property. The information of various properties in various locations can be accessible at one place.  This system will provide a platform to home line property sellers and buyers.  This will keep record of land, houses or flats available for rent with their rates and make this available to customers. Also will keep record of contact information of customer and will send necessary notices and/or reminders to customer. This project will increase the efficiency of work of user.  The wastage of time will reduce. The user can simply login to the system and go through all the functions and get the services.</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li><li>\n");
      out.write("\t\t\t\t\t  <img src=\"images/ba3.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t<div class=\"caption\">\n");
      out.write("\t\t\t\t\t\t<h3></h3>\n");
      out.write("\t\t\t\t\t\t<p>Lease management system will keep record of housing properties available on rent and will work as connecting bridge between customer and property sellers. Due to this system there is no need to visit various places in search of desired property. The information of various properties in various locations can be accessible at one place.  This system will provide a platform to home line property sellers and buyers.  This will keep record of land, houses or flats available for rent with their rates and make this available to customers. Also will keep record of contact information of customer and will send necessary notices and/or reminders to customer. This project will increase the efficiency of work of user.  The wastage of time will reduce. The user can simply login to the system and go through all the functions and get the services.</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t  </div>\n");
      out.write("\t  </div>\n");
      out.write("\t</div>\n");
      out.write("\t");
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
      out.write("        <!--footer-->\n");
      out.write("\t\t\t\t\t<div class=\"footer-section\">\n");
      out.write("\t\t\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"footer-grids\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-3 footer-grid\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4>About </h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat.</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-3 footer-grid\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4>Property Types</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>Lorem Post With Image Format</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>Example Video Blog Post</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>Example Post With Gallery Post</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>Example Video Blog Post</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>Lorem Post With Image Format</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>Example Video Blog Post</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-3 footer-grid\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4>Useful links</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("                                                                            <li><a href=\"Propertyholder.jsp\">Home</a></li>\n");
      out.write("                                                                            <li><a href=\"viewpropertyholderprofileserv\">Profile</a></li>\n");
      out.write("                                                                            <li><a href=\"addproperty.jsp\"> Add Property</a></li>\n");
      out.write("                                                                            <li><a href=\"viewpropertyServ\"> View Property</a></li>\n");
      out.write("                                                                            <li><a href=\"propertyholderviewfeedbackserv\">Feedback</a></li>\n");
      out.write("                                                                        </ul>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-3 footer-grid\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4>Contacts</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><i class=\"glyphicon glyphicon-earphone\" aria-hidden=\"true\"></i>7874007766</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><i class=\"glyphicon glyphicon-envelope\" aria-hidden=\"true\"></i><a href=\"mailto:example@mail.com\"> harshilgp@gmail.com</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><i class=\"glyphicon glyphicon-map-marker\" aria-hidden=\"true\"></i>Ghatlodia, Ahmedabad</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><i class=\"glyphicon glyphicon-time\" aria-hidden=\"true\"></i>Mon-Sat 8:00 am to 8:00 pm</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!--footer-->\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\t\n");
      out.write("</body>\n");
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
