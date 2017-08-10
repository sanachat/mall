<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>购物车信息</title>
</head>
<body>
<div>
    <div class="th w20">编号</div>
    <div class="th w20">用户Id</div>
    <div class="th w20">订单金额</div>
    <div class="th w20">商品编号</div>
    <div class="th w20">数量</div>
</div>
<c:forEach var="o" items="${shop}">
    <div class="td w20">
            ${o.shopId}
    </div>
    <div class="td w20">
            ${o.userId}
    </div>
    <div class="td w20">
            ${o.price}
    </div>
    <div class="td w20">
            ${o.gameGoodId}
    </div>
    <div class="td w20">
            ${o.count}
    </div>
</c:forEach>

</body>
</html>
