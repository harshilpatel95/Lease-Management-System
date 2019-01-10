<%-- 
    Document   : Adminheader.jsp
    Created on : Feb 18, 2017, 6:53:57 AM
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
                        <h4><a href="index.jsp">Admin</a></h4>
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
                                    <li class="menu__item menu__item--current"><a href="Admin.jsp" class="menu__link"><span class="menu__helper">Home</span></a></li>
                                   
                                    <li> <select class="menu__item menu__item--current"name="user" onchange="window.location.href=this.value" class="menu__link" style="color: #02B875;
    background-color: #fff;height: 36px;"><span class="menu__helper">View User</span>
                                            <option value="">View User</option>
                                        <option value="adminviewuserph">View Propertyholder</option>
                                        <option value="adminviewuseraaserv">View Client</option>
                                        </select></li>
                                    <li> <select class="menu__item menu__item--current"name="category" onchange="window.location.href=this.value" class="menu__link" style="color: #02B875;
    background-color: #fff;height: 36px;"><span class="menu__helper">Manage Category</span>
                                            <option value="">Manage Category</option>
                                        <option value="aaddcategory.jsp">Add Category</option>
                                        <option value="viewcateServ">View Category</option>
                                        </select></li>
                                        <li> <select class="menu__item menu__item--current"name="Approve" onchange="window.location.href=this.value" class="menu__link" style="color: #02B875;
    background-color: #fff;height: 36px;"><span class="menu__helper">Approve</span>
                                                <option value="">Manage Property</option>
                                        <option value="aprovepropertyServ">Aprrove Property</option>
                                        <option value="adminviewpropertyserv">View Property</option>
                                        </select></li>
                                    
                                    <li class="menu__item menu__item--current"><a href="adminviewfeedbackserv" class="menu__link"><span class="menu__helper">Feedback</span></a></li>
                                    <li class="menu__item menu__item--current"><a href="adminviewpaymenthistoryserv" class="menu__link"><span class="menu__helper">View Payment</span></a></li>
                                    
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
