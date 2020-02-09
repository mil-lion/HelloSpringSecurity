<%-- 
    Document   : home
    Created on : 20 янв. 2020 г., 16:13:54
    Author     : Администратор
--%>

<%@page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spring Security</title>
    </head>
    <body>
        <h1>Spring Security OAuth and OIDC Sample</h1>
        <h2>${msg}</h2>
        <a href="/logout">Logout</a>
<!--
        <h2>Client Name - ${clientName}</h2>
        <h2>Username - ${userName}</h2>
        <h2>Email - ${email}</h2>

        <div>
            <span style="font-weight:bold">User Attributes:</span>
            <ul>
                <li th:each="userAttribute : ${userAttributes}">
                    <span style="font-weight:bold" th:text="${userAttribute.key}"></span>: <span th:text="${userAttribute.value}"></span>
                </li>
            </ul>
        </div>
-->
    </body>
</html>
