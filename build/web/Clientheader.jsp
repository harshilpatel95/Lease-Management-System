<%-- 
    Document   : clientheader
    Created on : Feb 18, 2017, 6:52:00 AM
    Author     : patels
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <!--header-->
        <div class="header" id="home">
            <div class="header-top">
                <div class="container">
                    <div class="head-top">
                        <div class="indicate">
                            <i class="glyphicon glyphicon-map-marker" aria-hidden="true"></i><a href="#">Ghatlodiya, Ahmedabad.</a>
                        </div>
                        <div class="deatils">
                        </div>
                        <div class="clearfix"></div>
                    </div>
                    <div class="logo">
                        <h1><a href="index.jsp">Lease Management System</a></h1>
                        <h4><a href="index.jsp">Client</a></h4>
                    </div>
                </div>
            </div>

        </div>
        <!--header-->

        <div class="container">
            <div class="header-bottom">
                <nav class="navbar navbar-default">
                    <div class="container-fluid">
                        <!-- Brand and toggle get grouped for better mobile display -->
                        <div class="navbar-header">
                            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                                <span class="sr-only">Toggle navigation</span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                            </button>
                        </div>
                        <!-- Collect the nav links, forms, and other content for toggling -->
                        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                            <nav class="menu menu--francisco">
                                <ul class="nav navbar-nav menu__list">
                                    <li class="menu__item menu__item--current"><a href="Client.jsp" class="menu__link"><span class="menu__helper">Home</span></a></li>
                                    <li> <select class="menu__item menu__item--current" name="profile" onchange="window.location.href = this.value" class="menu__link" style="color: #02B875;
                                                 background-color: #fff;height: 36px;"><span class="menu__helper">Manage Profile</span>
                                            <option value="">Manage Profile</option>
                                            <option value="viewprofileserv">View Profile </option>
                                            <option value="viewserviceproviderserv">View Serviceprovider</option>
                                        </select>
                                    </li>
                                    <li class="menu__item"><a href="clientviewpropertyserv" class="menu__link"><span class="menu__helper">View Property</span></a></li>
                                    <li class="menu__item"><a href="recentviewpropertyserv" class="menu__link"><span class="menu__helper">Recent View Property</span></a></li>
                                    <li> <select class="menu__item menu__item--current" name="feedback" onchange="window.location.href = this.value" class="menu__link" style="color: #02B875;
                                                 background-color: #fff;height: 36px;"><span class="menu__helper">Manage Profile</span>
                                            <option value="">Feedback</option>
                                            <option value="clientaddfeedback.jsp">Add Feedback </option>
                                            <option value="clientviewfeedbackserv">View Feedback</option>
                                        </select>
                                    </li>
                                    <li class="menu__item menu__item--current"><a href="viewpaymenthistory" class="menu__link"><span class="menu__helper">View Payment</span></a></li>
                                   
                                </ul>
                            </nav>
                            
                            <div class="clearfix"></div>
                        </div><!-- /.navbar-collapse -->
                        <!-- /.container-fluid -->
                    </div>
                </nav>

            </div>	
        </div>

    </body>
</html>
