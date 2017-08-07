<%-- 
    Document   : createHibernate
    Created on : Jul 2, 2017, 9:44:53 PM
    Author     : hamil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <h1>Crear empleado Hibernate Tutorial</h1>
            <form method="post" action="<%= request.getContextPath() %>/consultaServlet">
                <div class="form-group">
                    <label>Primer Nombre:</label>
                    <input name="pnombre" type="text" class="form-control">
                    <br>
                    <label>Segundo Nombre:</label>
                    <input name="snombre" type="text" class="form-control">
                    <br>
                    <label>Salario:</label>
                    <input name="salario" type="text" class="form-control">
                </div>
            </form>
        </div>
    </body>
</html>
