<%--
  Created by IntelliJ IDEA.
  User: kanat
  Date: 8/24/20
  Time: 9:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show cart</title>
</head>
<body>
    <%@page import="somePackage.Cart" %>
    <% Cart cart = (Cart)session.getAttribute("cart"); %>

    <p> Наименование: <%= cart.getName()%> </p>
    <p> Количество: <%= cart.getQuantity()%> </p>
</body>
</html>
