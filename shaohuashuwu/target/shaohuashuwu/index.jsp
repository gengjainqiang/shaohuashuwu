<%--
  Created by IntelliJ IDEA.
  User: 耿建强
  Date: 2020/8/30
  Time: 17:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<a href="account/findAll">cceshi</a>

<form action="account/save" method="post">
    姓名：<input type="text" name="name"/><br/>
    金额：<input type="text" name="money"/><br/>
    <input type="submit" value="保存">
</form>

<form action="account/workbenchInterfacce" method="post">
    <input type="submit" value="跳转">
</form>



<form action="account/test" method="post">
    <input type="submit" value="跳转">
</form>

<a href="account/testtwo">two</a>
</body>
</html>
