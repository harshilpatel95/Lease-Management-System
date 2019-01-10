<%-- 
    Document   : viewproperty
    Created on : Mar 8, 2017, 11:09:26 AM
    Author     : patels
--%>

<%@page import="model.Addproperty"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
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
		$(document).ready(function() {
		$("#owl-demo").owlCarousel({
			items : 1,
			lazyLoad : true,
			autoPlay : true,
			navigation : false,
			navigationText :  false,
			pagination : true,
		});
		});
	</script>
</head>
    <body>
        
            <%@include file="Clientheader.jsp" %>
        <div class="popular-w3">

 

           
                   

            
            

            <div class="container">
                
                <div class="popular-grids">
                    
            <%
                ArrayList<Addproperty> array;
                if (request.getAttribute("array") != null) {
                    array = (ArrayList<Addproperty>) request.getAttribute("array");
                    for(Addproperty ap:array){
            
            %>
                    <div class="col-md-4 popular-grid">
                        <h4>
                            
                            <a href="#" class="text-info1"><%=ap.getPropertyname()%></a>
                                <div class="clearfix"></div>
                        </h4>
                        <img src="images/<%=ap.getPhoto()%>" height="400px" width="400px" class="img-responsive" alt="">

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
                                    <li class="text-info">City / Town</li>
                                    <li class="text-info1"><%=ap.getSelectcity()%></li>
                                    <div class="clearfix"></div>
                                </ul>
                                
                                <ul>
                                    <li class="text-info">Wantto</li>
                                    <li class="text-info1"><%=ap.getWantto()%></li>
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
                                      <ul><a href="buyserv?id=<%=ap.getPid()%>"><input type="button" value="Buy"></a></ul>
                                
                            </div>
                        </div>
                    </div>
                     <%}
            %>
            <%}
            %>
                          
                    <div class="clearfix"></div>
                </div>
            </div>
            
           
        </div>
            <%@include file="footerclient.jsp" %>
    </body>
</html>
