<%-- 
    Document   : index
    Created on : Sep 21, 2023, 7:13:04 PM
    Author     : hecto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuarios</title>
    </head>
    <body>
        <header class="header">
            <h1 class="mainTitle">Administrador de clientes</h1>
        </header>
        <main>
            <a href="userForm.jsp" class="addUsers">Agregar usuarios</a>
            <table class="table">
                <tr>
                    <th>Nombres</th>
                    <th>Apellidos</th>
                    <th>E-mail</th>
                    <th>Telefono</th>
                    <th>Saldo</th>
                    <th>Acciones</th>
                </tr>
                <tr>
                    <td>Nombres</td>
                    <td>Apellidos</td>
                    <td>E-mail</td>
                    <td>Telefono</td>
                    <td>Saldo</td>
                    <td class="tdAction">
                        
                        <div>
                            <a href="userForm.jsp" class="editUsers btnAction">Editar</a>
                        </div>
                        <div>
                            <a href="userForm.jsp" class="deleteUsers btnAction">Borrar</a>
                        </div>
                    </td>
                </tr>
            </table>
        </main>
        <footer class="footer">
            <h3 class="title">Creado por: </h3>
            <section class="authors">
                <p>name</p>
                <p>name</p>
                <p>name</p>
                <p>name</p>
                <p>name</p>
                <p>name</p>
            </section>
            <center>
                <small>UFG 2023</small>
            </center>
        </footer>

        <link rel="stylesheet" href="./css/main.css">
    </body>
</html>
