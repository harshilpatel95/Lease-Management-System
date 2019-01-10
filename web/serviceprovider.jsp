<%-- 
    Document   : serviceprovider
    Created on : Mar 18, 2017, 1:22:26 PM
    Author     : patels
--%>

<%@page import="javafx.scene.layout.Region"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Registration"%>
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

        <style>
            .detail-bottom ul li.text-info1 {
    width: 40%;
    color: #777;
    font-size: 1em;
    font-weight: 400;
    float: right;
    text-align: right;
    margin-right: 0.8em;
    line-height: 2em;
}
            </style>
    </head>
     <body>
       
        <%@include file="Clientheader.jsp" %>
       <div class="popular-w3">

            <div class="container">
                
                <div class="popular-grids">
                    
             <%
                ArrayList<Registration> array;
                if (request.getAttribute("alr") != null) {
                    array = (ArrayList<Registration>) request.getAttribute("alr");
                    for(Registration r:array){
            
            %>
            <div class="col-md-4 popular-grid" style=" width: 500px; height: 600px; float: left">
                        
                                <div class="clearfix"></div>
                        
                        
                        <div class="popular-text">

                           
                            <div class="detail-bottom">
                                 <ul>
                                    <li class="text-info">Name :</li>
                                    <li class="text-info1"><%=r.getName()%></li>
                                    <div class="clearfix"></div>
                                </ul>
                                
                                
                                    
                                <ul>
                                    <li class="text-info">Email id :</li>
                                    <li class="text-info1"><%=r.getEmailid()%></li>
                                    <div class="clearfix"></div>
                                </ul>
                                <ul>
                                    <li class="text-info">Contact :</li>
                                    <li class="text-info1"><%=r.getContact()%></li>
                                    <div class="clearfix"></div>
                                </ul>
                                <ul>
                                    <li class="text-info">Address :</li>
                                    <li class="text-info1"><%=r.getAddress()%></li>
                                    <div class="clearfix"></div>
                                </ul>
                                    
                                
                                      
                                
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
