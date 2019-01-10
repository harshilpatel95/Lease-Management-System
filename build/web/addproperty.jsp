<%-- 
    Document   : addproperty
    Created on : Feb 27, 2017, 11:30:26 AM
    Author     : patels
--%>

<%@page import="model.Category"%>
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
        <%@include file="Propertyholderheader.jsp" %>

        <label>  ADD NEW PROPERTY </label>
        <div class="modal-body real-spa">
            <div class="login-grids">
                <div class="login">
                    <div class="login-right">
                        <form action="imageuploadServ" method="POST"  enctype="multipart/form-data">

                            Property Type:&nbsp;&nbsp;&nbsp;

                            <select name="type" style="width: 30%">
                                <%
                                    ArrayList<Category> array;
                                    if (request.getAttribute("al") != null) {
                                        array = (ArrayList<Category>) request.getAttribute("al");
                                        for (Category it : array) {
                                %>

                                <option id = <%=it.getCid()%>><%=it.getCname()%></option>

                                <%}
                                    }%>
                            </select></br>

                            Property Name:-
                            <input type="text" name="name" required="" style="width: 30%">	</br>

                            I want to:
                            <br>

                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="selltype" value="rent out" style="width: 5%"/>Rent out<br>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="selltype" value="sell" style="width: 5%"/>Sell<br>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="selltype" value="rent out PG-Hostels" style="width: 5%"/>Rent out PG-Hostels<br>

                            <label>
                                Property Details:
                            </label>
                            <br>

                            Select city:


                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<select name="cityname" style="width: 30%">
                                <option value="ahmedabad">Ahmedabad</option>
                                <option value="baroda">Baroda</option>
                                <option value="bobmay">Bombay</option>
                                <option value="delhi">Delhi</option>
                                <option value="banglore">Banglore</option>
                            </select>
                            <br>

                            Address:

                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="address" value="" style="width: 30%" />
                            <br>
                            Sale price:


                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="saleprice" value="" style="width: 30%" />
                            <br>
                            Rate/sq.Ft:

                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="Rate" value="" style="width: 30%" />
                            <br>
                            uploads photos:<br>
                            <input type="file" name="photo" multiple="multiple"/><br>

                            <br>



                            Description:
                            &nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="description" value="" style="width: 30%">
                            <br>

                            <label>
                                Share your contact details:
                            </label>
                            <br>
                            Your name: 
                            &nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="yourname" value="" style="width: 30%"/><br></br>
                            Emailid:
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="email" name="email" required="" style="width: 30%"><br>	</br>

                            Mo Number:
                            <input type="number" name="mobilenumber" required="" style="width: 30%"><br>

                            <input type="submit" value="Add property"style="width: 30%" >
                        </form>
                    </div>
                </div>
                <p>By logging in you agree to our <a href="#">Terms</a> and <a href="#">Conditions</a> and <a href="#">Privacy Policy</a></p>
            </div>
        </div>


        <%@include file="footerpropertyholder.jsp" %>
    </body>
</html>
