<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>权限管理系统</title>
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
  <style>
    .td {
      overflow: hidden;
      white-space: nowrap;
      text-overflow: ellipsis;
    }
    .box {
      width: 500px;
      height: 200px;
      background: #fff;
      position: fixed;
      top: 100px;
    }
  </style>
</head>

<body>
<div class="view-topbar">
  <div class="topbar-console">
    <div class="tobar-head fl">
      <a href="#" class="topbar-logo fl">
        <span><img src="Images/logo.png" width="20" height="20"/></span>
      </a>
      <a href="index.html" class="topbar-home-link topbar-btn text-center fl"><span>管理权限管理系统</span></a>
    </div>
  </div>
  <div class="topbar-info">
    <ul class="fr">

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
      <!--一级菜单循环从这里开始 ，动态循环显示一级菜单-->
    </div>
  </div>
  <div class="view-product">
    <div class="authority">
      <div class="authority-head">
        <div class="manage-head">
          <h6 class="layout padding-left manage-head-con">管理员投诉管理
            <span class="fr text-small text-normal padding-top">发布时间：2016-07-08</span>
            <span class="fr margin-large-right padding-top text-small text-normal">最新版本：<em class="text-main">2.4.0.160708</em></span>
          </h6>
        </div>
      </div>
      <div class="authority-content">
        <div class="list-content show">
          <a href="findAllAnnouncement"></a><br>
          <div class="offcial-table tr-border margin-big-top clearfix">
            <div class="tr-th clearfix">
              <div class="th w25">
                投诉编号
              </div>
              <div class="th w25">
                投诉人ID
              </div>
              <div class="th w25">
                投诉内容
              </div>
              <div class="th w25">
                操作
              </div>
            </div>
            <a href="findAllComplain"></a>
            <c:forEach var="c" items="${complain}" >
              <div class="tr clearfix border-bottom-none">
                <div class="td w25">
                    ${c.complainId}
                </div>
                <div class="td w25">
                    ${c.userId}
                </div>
                <div class="td w25">
                    ${c.content}
                </div>
                <div class="td w25">
                  <a href="ComplainAdd.jsp"  class="button-word2 btn_ajax_confirm">增加</a> |
                  <a href="/dodeleteComplain.action?pid=${c.complainId}"  class="button-word2 btn_ajax_confirm">删除</a>
                </div>
              </div>
            </c:forEach>
          </div>
        </div>
        <div class="show-page padding-big-right">
          <div class="page">
            <div class="page">
              <ul class="offcial-page margin-top margin-big-right">
                <li>共<em class="margin-small-left margin-small-right">1</em>条数据</li>
                <li>每页显示<em class="margin-small-left margin-small-right">15</em>条</li>
                <li><a class="next disable">上一页</a></li>
                <li></li>
                <li><a class="next disable">下一页</a></li>
                <li><span class="fl">共<em class="margin-small-left margin-small-right">1</em>页</span></li>
              </ul>
            </div>
          </div>
        </div>
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
  $(".td").click(function () {
    var $box = $("<div class='box'></div>");

    $("body").append($box)
    $box.html($(this).html())
    $box.css({"left": parseInt($("body").width())/2 + "px","margin-left": -parseInt( $box.width())/2+"px"})

    $box.click(function () {
//     $(this).css({"display": "none"})
      $(this).remove();
    })
  })
</script>
</body>

</html>