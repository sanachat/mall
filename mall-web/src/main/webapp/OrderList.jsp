<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: wan
  Date: 2017/8/10
  Time: 14:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>所有订单信息</title>
</head>
<body>
<div>
  <div class="th w20">订单编号</div>
  <div class="th w20">下单用户</div>
  <div class="th w20">订单日期</div>
  <div class="th w20">订单金额</div>
</div>
<c:forEach var="o" items="${l}">
  <div class="td w20">
      ${o.orderId}
  </div>
  <div class="td w20">
      ${o.userId}
  </div>
  <div class="td w20">
      ${o.date}
  </div>
  <div class="td w20">
    ${o.price}
  </div>
  <div class="td w20">
      ${o.gamegoodinfo}
  </div>
</c:forEach>

</body>
</html>
