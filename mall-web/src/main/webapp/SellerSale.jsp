<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>网游交易平台</title>
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
      <a href="#" class="topbar-home-link topbar-btn text-center fl"><span>4396网游交易平台</span></a>
    </div>
  </div>
  <div class="topbar-info">
    <ul class="fr">
      <li class="fl dropdown topbar-notice topbar-btn">
        <a href="#" class="dropdown-toggle">
          <span class="icon-notice"></span>
          <span class="topbar-num have">0</span>
          <!--have表示有消息，没有消息去掉have-->
        </a>
      </li>

      <li class="fl topbar-info-item">
        <div class="dropdown">
          <a href="#" class="topbar-btn">
            <span class="fl text-normal">帮助</span>
            <span ></span>
          </a>
        </div>
      </li>
      <li class="fl topbar-info-item">
        <div class="dropdown">
          <a href="#" class="topbar-btn">
            <span class="fl text-normal">欢迎</span>
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
          <li>
            <a href="/SellerManage">
              <b class="sidebar-icon"><img src="Images/icon_cost.png" width="16" height="16" /></b>
              <span class="text-normal">商品管理</span>
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
            <a href="/OrderGameList">
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
          <a href="/SellerManage">
            <span class="icon"><b ></b></span>
            <span class="text-normal">返回首页</span>
          </a>
        </div>
      </div>
    </div>
  </div>
  <div class="view-product">
    <div class="company_identify">
      <div class="manage-head">
        <h6 class="padding-left manage-head-con">新增商品</h6>
      </div>
      <form name="setp0" action="/SellerSale" method="post" autocomplete="off">
        <div class="basic-info-detail clearfix">
          <div class="unit-style padding-big-lr clearfix">
            <h4 class="real-name-head margin-large-top">填写商品信息</h4>
            <div class="real-name-con height-main margin-top-25">
              <p class="content-left-zoon">
                游戏商品名称
              </p>
              <div class="content-right-zoon">
                <input class="width-main input" type="text" name="gamegoodname" datatype="*" value="">
              </div>
            </div>
            <div class="real-name-con height-main margin-top-25">
              <p class="content-left-zoon">
                游戏种类
              </p>
              <div class="content-right-zoon">
                <input class="width-main input" type="text" name="gameid" datatype="*" value="">
              </div>
            </div>

            <div class="real-name-con height-main margin-top-25">
              <p class="content-left-zoon">
                服务器类型
              </p>
              <div class="content-right-zoon">
                <input class="width-main input" type="text" name="gameserverid" datatype="*" value="">
              </div>
            </div>
            <div class="real-name-con height-main margin-top-25">
              <p class="content-left-zoon">
                角色名称
              </p>
              <div class="content-right-zoon">
                <input class="width-main input" type="text" name="rolename" datatype="*" value="">
              </div>
            </div>
            <div class="real-name-con height-main margin-top-25">
              <p class="content-left-zoon">
                商品材料类型
              </p>
              <div class="content-right-zoon">
                <input class="width-main input" type="text" name="gametypeid" datatype="*" value="">
              </div>
            </div>
            <div class="real-name-con height-main margin-top-25">
              <p class="content-left-zoon">
                售出数量
              </p>
              <div class="content-right-zoon">
                <input class="width-main input" type="text" name="gamegoodsellcount" datatype="*" value="">
              </div>
            </div>
            <div class="real-name-con height-main margin-top-25">
              <p class="content-left-zoon">
                库存数量
              </p>
              <div class="content-right-zoon">
                <input class="width-main input" type="text" name="gamegoodcount" datatype="*" value="">
              </div>
            </div>
            <div class="real-name-con height-main margin-top-25">
              <p class="content-left-zoon">
                描述
              </p>
              <div class="content-right-zoon">
                <input class="width-main input" type="text" name="describe" datatype="*" value="">
              </div>
            </div>
            <div class="real-name-con height-main margin-top-25">
              <p class="content-left-zoon">
                卖家名称
              </p>
              <div class="content-right-zoon">
                <input class="width-main input" type="text" name="sellername" datatype="*" value="">
              </div>
            </div>
            <div class="real-name-con height-main margin-top-25">
              <p class="content-left-zoon">
                单价
              </p>
              <div class="content-right-zoon">
                <input class="width-main input" type="text" name="unitprice" datatype="*" value="">
              </div>
            </div>
            <div class="real-name-con height-main margin-top-25">
              <p class="content-left-zoon">
                图片地址
              </p>
              <div class="content-right-zoon">
                <input class="width-main input" type="text" name="pictureurl" datatype="*" value="">
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

