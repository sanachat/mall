<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>控制台-根据用户查询投诉</title>
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
      <!--这里请使用Foreach标签和if标签循环加载用户的模块列表-->
    </div>
  </div>
  <div class="view-product">
    <div class="company_identify">
      <div class="manage-head">
        <h6 class="padding-left manage-head-con">根据用户查询投诉</h6>
      </div>
      <form name="" action="/findComplainByUserId" method="post" autocomplete="off">
        <div class="basic-info-detail clearfix">

          <div class="unit-style padding-big-lr clearfix">
            <h4 class="real-name-head margin-large-top">显示投诉信息</h4>
            <div class="real-name-con height-main margin-top-25">
              <p class="content-left-zoon">
                请输入用户ID：
              </p>
              <div class="content-right-zoon">
                <input class="width-main input" type="text" name="userId" datatype="*" value="">
              </div>
            </div>
          </div>
        </div>
        <div class="unit-style padding-large-tb clearfix">
          <div class="margin-large-top padding-left text-left content-right-zoon">
            <input type="submit" value="确认" class="submit fl">
          </div>
        </div>
      </form>
    </div>
    <div class="authority-content">
      <div class="list-content show">
        <div class="offcial-table tr-border margin-big-top clearfix">
          <div class="tr-th clearfix">
            <div class="th w33">
              投诉编号
            </div>
            <div class="th w33">
              投诉人ID
            </div>
            <div class="th w33">
              投诉内容
            </div>
          </div>
          <a href="/findComplainByUserId"></a>
          <c:forEach var="c" items="${complainbyuserid}" >
            <div class="tr clearfix border-bottom-none">
              <div class="td w33">
                  ${c.complainId}
              </div>
              <div class="td w33">
                  ${c.userId}
              </div>
              <div class="td w33">
                  ${c.content}
              </div>
            </div>
          </c:forEach>
        </div>
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