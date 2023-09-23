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
        <c:if test="${client != null}">
            <form action="update" method="post">
        </c:if>
        <c:if test="${client == null}">
            <form action="insert" method="post">
        </c:if>
        <c:if test="${client != null}">
            <h2 class="textCenter">Editar cliente</h2>
        </c:if>
        <c:if test="${client == null}">
            <h2 class="textCenter">Agregar clientes</h2>
        </c:if>
            <c:if test="${client != null}">
                <input type="hidden" name="id" value="<c:out value='${client.id}' />" />
            </c:if>
            <div class="inputContainer">
                <label for="name">Nombre</label>
                <c:if test="${client == null}">
                    <input type="text" name="name" id="name" placeholder="Ingrese su nombre">
                </c:if>
                <c:if test="${client != null}">
                    <input type="text" name="name" id="name" value="<c:out value='${client.nombre}' />" placeholder="Ingrese su nombre">
                </c:if>
            </div>
            <div class="inputContainer">
                <label for="lastname">Apellido</label>
                <c:if test="${client == null}">
                    <input type="text" name="lastname" id="lastname" placeholder="Ingrese su apellido">
                </c:if>
                <c:if test="${client != null}">
                    <input type="text" name="lastname" id="lastname" value="<c:out value='${client.apellido}' />" placeholder="Ingrese su apellido">
                </c:if>
            </div>
            <div class="inputContainer">
                <label for="email">E-mail</label>
                <c:if test="${client == null}">
                    <input type="email" name="email" id="email" placeholder="email@ejemplo.com">
                </c:if>
                <c:if test="${client != null}">
                    <input type="email" name="email" id="email" value="<c:out value='${client.email}' />" placeholder="email@ejemplo.com">
                </c:if>
            </div>
            <div class="inputContainer">
                <label for="phone">Telefono</label>
                <c:if test="${client == null}">
                    <input type="text" name="phone" id="phone" placeholder="7777-7777">
                </c:if>
                <c:if test="${client != null}">
                    <input type="text" name="phone" id="phone" value="<c:out value='${client.telefono}' />" placeholder="7777-7777">
                </c:if>
            </div>
            <div class="inputContainer">
                <label for="saldo">Saldo</label>
                <c:if test="${client == null}">
                    <input type="number" name="saldo" id="saldo" placeholder="350.25">
                </c:if>
                <c:if test="${client != null}">
                    <input type="number" name="saldo" id="saldo" value="<c:out value='${client.saldo}' />" placeholder="350.25">
                </c:if>
            </div>
            <c:if test="${client == null}">
                <button type="submit" class="btnSubmit">Agregar cliente</button>
            </c:if>
            <c:if test="${client != null}">
                <button type="submit" class="btnSubmit">Guardar cambios</button>
            </c:if>
        </form>
    </body>
    <link rel="stylesheet" href="./css/main.css">
</html>
