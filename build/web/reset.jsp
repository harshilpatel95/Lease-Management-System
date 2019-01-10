<%-- 
    Document   : reset
    Created on : Mar 8, 2017, 12:21:27 PM
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
        <form action="mailserv">
           Enter your id: <input type="text" name="mail"/>
           <input type="submit" value="Send"/>
           
           <%
               if(request.getAttribute("msgl") !=null)
               {
                   String msg = request.getAttribute("msgl").toString();
           %>
           
           <%=msg%>
           
           <%
               }
           %>
               
        </form>

    </body>
</html>
