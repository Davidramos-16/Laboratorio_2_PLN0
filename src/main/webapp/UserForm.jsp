<%-- 
    Document   : UserForm
    Created on : Sep 21, 2023, 7:13:36 PM
    Author     : hecto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Clients Form</title>
    </head>
    <body class="bgForm">

            <form action="add" method="post">
            <h2 class="textCenter">Agregar clientes</h2>

            <div class="inputContainer">
                <label for="name">Nombre</label>
                    <input type="text" name="name" id="name" placeholder="Ingrese su nombre">
            </div>
            <div class="inputContainer">
                <label for="lastname">Apellido</label>
                    <input type="text" name="lastname" id="lastname" placeholder="Ingrese su apellido">
            </div>
            <div class="inputContainer">
                <label for="email">E-mail</label>
                    <input type="email" name="email" id="email" placeholder="email@ejemplo.com">
            </div>
            <div class="inputContainer">
                <label for="phone">Telefono</label>
                    <input type="text" name="phone" id="phone" placeholder="7777-7777">
            </div>
            <div class="inputContainer">
                <label for="saldo">Saldo</label>
                    <input type="number" name="saldo" id="saldo" placeholder="350.25">
            </div>

                <button type="submit" class="btnSubmit">Agregar cliente</button>

        </form>
    </body>
    <link rel="stylesheet" href="./css/main.css">
</html>
