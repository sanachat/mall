<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: wan
  Date: 2017/8/10
  Time: 16:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>显示订单及对应商品信息</title>
</head>
<body>
<form action="/OrderGameList" method="post">
  订单编号：<input type="text" name="orderId" ><br><br>
  <input type="submit" name="submit" value="提交">
</form>
</body>
</html>
