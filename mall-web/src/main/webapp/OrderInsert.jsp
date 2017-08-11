<%--
  Created by IntelliJ IDEA.
  User: wan
  Date: 2017/8/10
  Time: 15:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>增加订单</title>
</head>
<body>
<form action="/Orderinsert" method="post">
  订单编号：<input type="text" name="orderId" ><br><br>
  订单用户：<input type="text" name="userId" ><br><br>
  日期：<input type="text" name="date" ><br><br>
  金额：<input type="text" name="price" ><br><br>
  <input type="submit" name="submit" value="提交">
</form>
</body>
</html>
