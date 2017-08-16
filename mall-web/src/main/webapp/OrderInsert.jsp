<%--
  Created by IntelliJ IDEA.
  User: wan
  Date: 2017/8/10
  Time: 15:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>控制台-新增模块</title>
  <link rel="stylesheet" type="text/css" href="Css/identify.css" />
  <link rel="stylesheet" type="text/css" href="Css/layout.css" />
  <link rel="stylesheet" type="text/css" href="Css/account.css" />
  <link rel="stylesheet" type="text/css" href="Css/style.css" />
  <link rel="stylesheet" type="text/css" href="Css/control_index.css" />
  <script type="text/javascript" src="Js/jquery-1.7.2.min.js"></script>
  <script type="text/javascript" src="Js/layer/layer.js"></script>
  <script type="text/javascript" src="Js/haidao.offcial.general.js"></script>
  <script type="text/javascript" src="Js/select.js"></script>
  <script type="text/javascript" src="Js/haidao.validate.js"></script>
</head>

<body>
<div class="view-topbar">
  <div class="topbar-console">
    <div class="tobar-head fl">
      <a href="#" class="topbar-logo fl">
        <span><img src="Images/logo.png" width="20" height="20"/></span>
      </a>
      <a href="index.html" class="topbar-home-link topbar-btn text-center fl"><span>管理控制台</span></a>
    </div>
  </div>
  <div class="topbar-info">
    <ul class="fr">
      <li class="fl dropdown topbar-notice topbar-btn">
        <a href="#" class="dropdown-toggle">
          <span class="icon-notice"></span>
          <span class="topbar-num have">0</span>

        </a>

      <li class="fl topbar-info-item">
        <div class="dropdown">
          <a href="#" class="topbar-btn">
            <span class="fl text-normal">
              <%=session.getAttribute("username")%>
            </span>
            <span class="icon-arrow-down"></span>
          </a>
          <ul class="dropdown-menu">
            <li><a href="editUser.jsp">编辑</a></li>
            <li><a href="login.html">退出</a></li>
          </ul>
        </div>
      </li>
    </ul>
  </div>
</div>
<div class="view-body">
  <div class="view-sidebar">
    <div class="sidebar-content">

      <!--这里请使用Foreach标签和if标签循环加载用户的模块列表-->
      <c:forEach var="r" items="${relist}">
        <c:if test="${r.parentId==0}">
          <div class="sidebar-nav">
            <div class="sidebar-title">
              <a href="#">
                <span class="icon"><b class="fl icon-arrow-down"></b></span>
                <span class="text-normal">${r.rname}</span>
              </a>
            </div>
            <ul class="sidebar-trans">
              <c:forEach var="ro" items="${relist}">
                <c:if test="${ro.parentId==r.rid}">
                  <!--二级菜单循环从这里开始 ，动态循环显示二级菜单-->
                  <li>
                    <a href="#">
                      <b class="sidebar-icon"><img src="Images/icon_author.png" width="16" height="16" /></b>
                      <span class="text-normal">${ro.rname}</span>
                    </a>
                  </li>
                </c:if>
              </c:forEach>
              <!--二级菜单循环从这里结束 ，动态循环显示二级菜单-->
            </ul>
          </div>
        </c:if>
      </c:forEach>
      <!--这里请使用Foreach标签和if标签循环加载用户的模块列表-->


    </div>
  </div>
  <div class="view-product">
    <div class="company_identify">
      <div class="manage-head">
        <h6 class="padding-left manage-head-con">新增订单</h6>
      </div>
      <form name="setp0" action="/Orderinsert" method="post" autocomplete="off">
        <div class="basic-info-detail clearfix">

          <div class="unit-style padding-big-lr clearfix">
            <h4 class="real-name-head margin-large-top">填写订单信息</h4>
            <div class="real-name-con height-main margin-top-25">
              <p class="content-left-zoon">
                订单id
              </p>
              <div class="content-right-zoon">
                <input class="width-main input" type="text" name="orderId" datatype="*" value="">
              </div>
            </div>
            <div class="real-name-con height-main margin-top-25">
              <p class="content-left-zoon">
                下单用户
              </p>
              <div class="content-right-zoon">
                <input class="width-main input" type="text" name="userId" datatype="*" value="">
              </div>
            </div>
            <div class="real-name-con height-main margin-top-25">
              <p class="content-left-zoon">
                下单时间
              </p>
              <div class="content-right-zoon">
                <input class="width-main input" type="text" name="date" datatype="*" value="">
              </div>
            </div>
            <div class="real-name-con height-main margin-top-25">
              <p class="content-left-zoon">
                金额
              </p>
              <div class="content-right-zoon">
                <input class="width-main input" type="text" name="price" datatype="*" value="">
              </div>
            </div>

          </div>
          <p>&nbsp;</p>
        </div>

        <div class="unit-style padding-large-tb clearfix">
          <div class="margin-large-top padding-left text-left content-right-zoon">
            <input type="submit" value="确认" class="submit fl">
          </div>
        </div>
      </form>
    </div>
  </div>
</div>

<script>
  $(".sidebar-title").live('click', function() {
    if ($(this).parent(".sidebar-nav").hasClass("sidebar-nav-fold")) {
      $(this).next().slideDown(200);
      $(this).parent(".sidebar-nav").removeClass("sidebar-nav-fold");
    } else {
      $(this).next().slideUp(200);
      $(this).parent(".sidebar-nav").addClass("sidebar-nav-fold");
    }
  });
</script>
</body>

</html>
<%--
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
--%>
