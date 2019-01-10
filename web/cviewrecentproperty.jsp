<%-- 
    Document   : cviewrecentproperty
    Created on : Feb 20, 2017, 1:38:21 PM
    Author     : patels
--%>

<%@page import="model.Addproperty"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <title>Home Plat a Real Estates and Builders Category Flat Bootstrap Responsive Web Template | Home :: w3layouts</title>
        <!--css-->
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
        <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
        <!--css-->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="keywords" content="Home Plat Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola web design" />
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
        <link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" />
        <!--js-->
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <!--js-->
        <!--webfonts-->
        <link href='//fonts.googleapis.com/css?family=Josefin+Sans:400,700italic,700,600italic,600,400italic,300italic,300,100italic,100' rel='stylesheet' type='text/css'>
        <link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
        <!--webfonts-->
        <script src="js/responsiveslides.min.js"></script>
        <script>
            $(function () {
                $("#slider").responsiveSlides({
                    auto: true,
                    nav: true,
                    speed: 500,
                    namespace: "callbacks",
                    pager: true,
                });
            });
        </script>
        <link href="css/owl.carousel.css" rel="stylesheet">
        <script src="js/owl.carousel.js"></script>
        <script>
            $(document).ready(function () {
                $("#owl-demo").owlCarousel({
                    items: 1,
                    lazyLoad: true,
                    autoPlay: true,
                    navigation: false,
                    navigationText: false,
                    pagination: true,
                });
            });
        </script>
    </head>

    <%@include  file="Clientheader.jsp" %>
    <body>
        <div class="popular-w3">


            <%
                ArrayList<Addproperty> array;
                if (request.getAttribute("array") != null) {
                    array = (ArrayList<Addproperty>) request.getAttribute("array");
            %>
            <% Addproperty ap = array.get(0);
                {
            %>

            <div class="container">
                <h2 class="tittle">Most Popular</h2>
                <div class="popular-grids">
                    <div class="col-md-4 popular-grid">
                        <h4><%=ap.getPropertyname()%></h4>
                        <img src="images/<%=ap.getPhoto()%>" height="400px" width="400px" class="img-responsive" alt=""/>

                        <div class="popular-text">

                            <a href="#" class="button"><%=ap.getSaleprice()%></a>
                            <div class="detail-bottom">
                                <ul>
                                    <li class="text-info">Property Type :</li>
                                    <li class="text-info1"><%=ap.getPropertytype()%></li>
                                    <div class="clearfix"></div>
                                </ul>
                                <ul>
                                    <li class="text-info">Property Address :</li>
                                    <li class="text-info1"><%=ap.getAddress()%></li>
                                    <div class="clearfix"></div>
                                </ul>
                                
                                <ul>
                                    <li class="text-info">Property Description :</li>
                                    <li class="text-info1"><%=ap.getDescription()%></li>
                                    <div class="clearfix"></div>
                                </ul>
                                
                                <ul>
                                    <li class="text-info">Sq Ft</li>
                                    <li class="text-info1"><%=ap.getRate()%></li>
                                    <div class="clearfix"></div>
                                </ul>

                                <ul>
                                    <li class="text-info">City / Town</li>
                                    <li class="text-info1"><%=ap.getSelectcity()%></li>
                                    <div class="clearfix"></div>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <%
                        }%>
                    <% Addproperty ap1 = array.get(1);
                        {
                    %>
                    <div class="col-md-4 popular-grid">
                        <h4><%=ap1.getPropertyname()%></h4>
                        <img src="images/<%=ap1.getPhoto()%>"height="500px" width="500px" class="img-responsive" alt=""/>
                        <div class="popular-text">

                            <a href="#" class="button"><%=ap1.getSaleprice()%></a>
                            <div class="detail-bottom">
                                <ul>
                                    <li class="text-info">Property Type :</li>
                                    <li class="text-info1"><%= ap1.getPropertytype()%></li>
                                    <div class="clearfix"></div>
                                </ul>
                                <ul>
                                    <li class="text-info">Property Address :</li>
                                    <li class="text-info1"><%=ap1.getAddress()%></li>
                                    <div class="clearfix"></div>
                                </ul>
                                
                                <ul>
                                    <li class="text-info">Property Description :</li>
                                    <li class="text-info1"><%=ap1.getDescription()%></li>
                                    <div class="clearfix"></div>
                                </ul>
                                <ul>
                                    <li class="text-info">Sq Ft</li>
                                    <li class="text-info1"><%= ap1.getRate()%></li>
                                    <div class="clearfix"></div>
                                </ul>

                                <ul>
                                    <li class="text-info">City / Town</li>
                                    <li class="text-info1"><%= ap1.getSelectcity()%></li>
                                    <div class="clearfix"></div>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <%
                        }%>
                    <% Addproperty ap2 = array.get(2);
                        {
                    %>
                    <div class="col-md-4 popular-grid">
                        <h4><%=ap2.getPropertyname()%></h4>
                        <img src="images/<%=ap2.getPhoto()%>" height="400px" width="400px" class="img-responsive" alt=""/>
                        <div class="popular-text">

                            <a href="#" class="button"><%=ap2.getSaleprice()%></a>
                            <div class="detail-bottom">
                                <ul>
                                    <li class="text-info">Property Type : </li>
                                    <li class="text-info1"><%= ap2.getPropertytype()%></li>
                                    <div class="clearfix"></div>
                                </ul>
                                    <ul>
                                    <li class="text-info">Property Address :</li>
                                    <li class="text-info1"><%=ap2.getAddress()%></li>
                                    <div class="clearfix"></div>
                                </ul>
                                
                                <ul>
                                    <li class="text-info">Property Description :</li>
                                    <li class="text-info1"><%=ap2.getDescription()%></li>
                                    <div class="clearfix"></div>
                                </ul>
                                    <ul>
                                    <li class="text-info">Sq Ft</li>
                                    <li class="text-info1"><%= ap2.getRate()%></li>
                                    <div class="clearfix"></div>
                                </ul>

                                <ul>
                                    <li class="text-info">City / Town</li>
                                    <li class="text-info1"><%= ap2.getSelectcity()%></li>
                                    <div class="clearfix"></div>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <%
                        }%>
                    <div class="clearfix"></div>
                </div>
            </div>
            <%}
            %>
        </div>
            <%@include file="footerclient.jsp" %>
    </body>
</html>
