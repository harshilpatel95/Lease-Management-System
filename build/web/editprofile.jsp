<%-- 
    Document   : editprofile
    Created on : Mar 18, 2017, 1:52:13 PM
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


    <body>
        <%@include file="Clientheader.jsp" %>
        <!--Register-->

        <%

            ArrayList<Registration> al;
            if (request.getAttribute("al") != null) {
                al = (ArrayList<Registration>) request.getAttribute("al");
                for (Registration r : al) {
        %>

        <form action="updateprofileserv" method="post">
            
            <input type="hidden" value="<%=r.getRid()%>" name="rid">
            <input type="hidden" value="<%=r.getLid()%>" name="lid">
            
            Name: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="Name" value="<%=r.getName()%>" onfocus="this.value = '';" onblur="if (this.value == '') {
                        this.value = 'Name';
                    }" required=""></br><br>
            Mobile number:&nbsp;&nbsp;<input type="text" name="Phone" value="<%=r.getContact()%>" onfocus="this.value = '';" onblur="if (this.value == '') {
                        this.value = 'Mobile number';
                    }" required=""><br><br>
            Email id:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="Email" value="<%=r.getEmailid()%>" onfocus="this.value = '';" onblur="if (this.value == '') {
                        this.value = 'Email id';
                    }" required=""><br><br>
            
            Address:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="Address" value="<%=r.getAddress()%>" onfocus="this.value = '';" onblur="if (this.value == '') {
                        this.value = 'address';
                    }" required=""><br><br>	

            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="Update" >
        </form>
        <%}

            }
        %>

        </br></br></br>
        <!--Register-->
        <%@include file="footerclient.jsp" %>
    </body>
</html>
