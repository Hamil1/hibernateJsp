<%-- 
    Document   : viewHibernate
    Created on : Jul 2, 2017, 6:26:39 PM
    Author     : hamil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <link rel="stylesheet" href="Css/css/bootstrap.min.css"/>
    <script src="Js/jquery-3.2.1.min.js"></script>
    <script src="Js/bootstrap.min.js"></script>
        
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <form action="action" method="post">
                <h1>Vista de Hibernate Tutorial</h1>
        <div class="form-group">
            <label>Esta es la vista</label>
            <input type="text" placeholder="Introduzca el id del empleado" class="form-control">
        </div>
        <div>
            <input type="submit" class="btn btn-primary" value="Consultar">
        </div>
            </form>
        </div>
    </body>
</html>
