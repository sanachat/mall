<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>4396游戏交易平台</title>
  <link rel="stylesheet" type="text/css" href="Css/identify.css"/>
  <link rel="stylesheet" type="text/css" href="Css/layout.css"/>
  <link rel="stylesheet" type="text/css" href="Css/account.css"/>
  <link rel="stylesheet" type="text/css" href="Css/style.css"/>
  <link rel="stylesheet" type="text/css" href="Css/control_index.css"/>
  <script type="text/javascript" src="Js/jquery-1.7.2.min.js"></script>
  <script type="text/javascript" src="Js/layer/layer.js"></script>
  <script type="text/javascript" src="Js/haidao.offcial.general.js"></script>
  <script type="text/javascript" src="Js/select.js"></script>
  <script type="text/javascript" src="Js/haidao.validate.js"></script>
</head>

<body>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>4396游戏交易平台</title>
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
      <a href="index.html" class="topbar-home-link topbar-btn text-center fl"><span>订单管理</span></a>
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
      <div class="sidebar-nav">

        <div class="sidebar-title">

          <a href="#">
            <span class="icon"><b class="fl icon-arrow-down"></b></span>
            <span class="text-normal">个人信息</span>
          </a>
        </div>
        <ul class="sidebar-trans">
          <li>
            <a href="/userShow">
              <b class="sidebar-icon"><img src="Images/icon_author.png" width="16" height="16" /></b>
              <span class="text-normal">我的信息</span>
            </a>
          </li>

        </ul>
      </div>
      <div class="sidebar-nav">
        <div class="sidebar-title">
          <a href="#">
            <span class="icon"><b class="fl icon-arrow-down"></b></span>
            <span class="text-normal">商品信息</span>
          </a>
        </div>
        <ul class="sidebar-trans">
          <li>
            <a href="/GameIndex">
              <b class="sidebar-icon"><img src="Images/icon_cost.png" width="16" height="16" /></b>
              <span class="text-normal">商品列表</span>
            </a>
          </li>
        </ul>
      </div>
      <div class="sidebar-nav">
        <div class="sidebar-title">
          <a href="#">
            <span class="icon"><b class="fl icon-arrow-down"></b></span>
            <span class="text-normal">账户信息</span>
          </a>
        </div>
        <ul class="sidebar-trans">
          <li>
            <a href="/balance">
              <b class="sidebar-icon"><img src="Images/icon_cost.png" width="16" height="16" /></b>
              <span class="text-normal">我的账户</span>
            </a>
          </li>
          <li>
            <a href="/findAllcart">
              <b class="sidebar-icon"><img src="Images/icon_cost.png" width="16" height="16" /></b>
              <span class="text-normal">购物车</span>
            </a>
          </li>
          <li>
            <a href="/myorder">
              <b class="sidebar-icon"><img src="Images/icon_cost.png" width="16" height="16" /></b>
              <span class="text-normal">购物记录</span>
            </a>
          </li>
          <li>
            <a href="ChangePayPwd.jsp">
              <b class="sidebar-icon"><img src="Images/icon_cost.png" width="16" height="16" /></b>
              <span class="text-normal">修改支付密码</span>
            </a>
          </li>
        </ul>
      </div>
      <div class="sidebar-nav">
        <div class="sidebar-title">
          <a href="#">
            <span class="icon"><b class="fl icon-arrow-down"></b></span>
            <span class="text-normal">商家信息</span>
          </a>
        </div>
        <ul class="sidebar-trans">
          <li>
            <a href="/Seller">
              <b class="sidebar-icon"><img src="Images/icon_cost.png" width="16" height="16" /></b>
              <span class="text-normal">成为商家</span>
            </a>
          </li>
        </ul>
      </div>
      <div class="sidebar-nav">
        <div class="sidebar-title">
          <a href="#">
            <span class="icon"><b class="fl icon-arrow-down"></b></span>
            <span class="text-normal">客户服务</span>
          </a>
        </div>
        <ul class="sidebar-trans">
          <li>
            <a href="/findAllAnnouncement">
              <b class="sidebar-icon"><img src="Images/icon_cost.png" width="16" height="16" /></b>
              <span class="text-normal">投诉</span>
            </a>
          </li>
          <li>
            <a href="/findAllComplain">
              <b class="sidebar-icon"><img src="Images/icon_cost.png" width="16" height="16" /></b>
              <span class="text-normal">公告</span>
            </a>
          </li>
        </ul>
      </div>

      <div class="sidebar-nav">
        <div class="sidebar-title">
          <a href="/GameIndex">
            <span class="icon"><b ></b></span>
            <span class="text-normal">返回首页</span>
          </a>
        </div>

      </div>
    </div>
  </div>
  <div class="view-product">
    <div class="authority">
      <div class="authority-head">
        <div class="manage-head">
          <h6 class="layout padding-left manage-head-con">购物车
            <span class="fr text-small text-normal padding-top">发布时间：2017-08-11</span>
            <span class="fr margin-large-right padding-top text-small text-normal">最新版本：<em class="text-main">2.4.0.160708</em></span>
          </h6>
        </div>

      </div>
      <div class="authority-content">
        <div class="list-content show">
          <div class="offcial-table tr-border margin-big-top clearfix">
            <div class="tr-th clearfix">
              <div class="th w20">
                商品名称
              </div>
              <div class="th w20">
                单价
              </div>
              <div class="th w20">
                数量
              </div>
              <div class="th w20">
                详情
              </div>
              <div class="th w20">
                操作
              </div>
            </div>
            <c:forEach var="o" items="${list}">
              <div class="tr clearfix border-bottom-none">
                <div class="td w20">
                    ${o.gameGoodName}
                </div>
                <div class="td w20">
                    ${o.price}
                </div>
                <div class="td w20">
                    ${o.num}
                </div>
                <div class="td w20">
                  <a href="/gamedetail?oid=${o.gameGoodId}"  class="button-word2 btn_ajax_confirm">查看</a>
                </div>
                <div class="td w20">
                  <a href="/shoppingdelete.action?pid=${o.shopId}"  class="button-word2 btn_ajax_confirm">删除</a>
                  <a href="/BanOne?sid=${o.shopId}&goodId=${o.gameGoodId}&uid=${o.userId}"  class="button-word2 btn_ajax_confirm">结算</a>
                </div>
              </div>
            </c:forEach>
          </div>
          <h4>
            <a href="clearingAll.jsp?uid=${o.userId}"><button style="margin-top:20px;margin-bottom:20px;margin-left: 90%; ">全部结算</button></a>
          </h4>
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
          <br>
          <br>
          <br>


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
</script>
</body>
</html>
