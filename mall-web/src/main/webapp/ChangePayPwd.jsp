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
<div class="view-topbar">
    <div class="topbar-console">
        <div class="tobar-head fl">
            <a href="#" class="topbar-logo fl">
                <span><img src="Images/logo.png" width="20" height="20"/></span>
            </a>
            <a href="buy.jsp" class="topbar-home-link topbar-btn text-center fl"><span>账户管理</span></a>
        </div>
    </div>
    <div class="topbar-info">
        <ul class="fr">

            <li class="fl topbar-info-item">
                <div class="dropdown">
                    <a href="#" class="topbar-btn">
                        <span class="fl text-normal">小朱</span>
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
            <!--一级菜单循环从这里开始 ，动态循环显示一级菜单-->
            <div class="sidebar-nav">
                <div class="sidebar-title">
                    <a href="buy.jsp">
                        <span class="icon"><b class="fl icon-arrow-down"></b></span>
                        <span class="text-normal">我的账户</span>
                    </a>
                </div>
            </div>
        </div>
    </div>
    <div class="view-product">
        <div class="authority">
            <div class="authority-head">
                <div class="manage-head">
                    <h6 class="layout padding-left manage-head-con">修改支付密码
                        <span class="fr text-small text-normal padding-top">发布时间：2017-08-14</span>
                        <span class="fr margin-large-right padding-top text-small text-normal">最新版本：<em
                                class="text-main">2.4.0.160708</em></span>
                    </h6>

                </div>

                    <div class="authority">
                        <h6 class="layout padding-left manage-head-con">
                            <form action="/changePayPwd" method="post" style="margin-left: 300px;margin-top: 60px;">
                                请输入原密码：<input type="password" name="oldpassword" style="margin-top: 50px;border: solid;color: #66c1e1"><br/>
                                请输入新密码：<input type="password" name="newpassword1" style="margin-top: 50px;border: solid;color: #66c1e1"><br/>
                                请确定新密码：<input type="password" name="newpassword2" style="margin-top: 50px;border: solid;color: #66c1e1"><br/>
                                <button type="submit" name="sub" style="margin-top: 30px;font-size: 16px;">提交</button>
                            </form>
                        </h6>
                    </div>

            </div>
        </div>
    </div>
</div>

<script>
    $(".sidebar-title").live('click', function () {
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
