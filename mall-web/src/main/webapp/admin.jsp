<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
						<span class="fl text-normal">
							管理员
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
						<span class="text-normal">用户管理</span>
					</a>
				</div>
				<ul class="sidebar-trans">
					<li>
						<a href="/adminshow">
							<b class="sidebar-icon"><img src="Images/icon_author.png" width="16" height="16" /></b>
							<span class="text-normal">用户列表</span>
						</a>
					</li>

					<li>
						<a href="admininsert.jsp">
							<b class="sidebar-icon"><img src="Images/icon_author.png" width="16" height="16" /></b>
							<span class="text-normal">增加管理员</span>
						</a>
					</li>

				</ul>
			</div>
			<div class="sidebar-nav">
				<div class="sidebar-title">
					<a href="#">
						<span class="icon"><b class="fl icon-arrow-down"></b></span>
						<span class="text-normal">交易信息</span>
					</a>
				</div>
				<ul class="sidebar-trans">
					<li>
						<a href="/adminrecord">
							<b class="sidebar-icon"><img src="Images/icon_cost.png" width="16" height="16" /></b>
							<span class="text-normal">交易信息记录</span>
						</a>
					</li>
				</ul>
			</div>
			<div class="sidebar-nav">
				<div class="sidebar-title">
					<a href="#">
						<span class="icon"><b class="fl icon-arrow-down"></b></span>
						<span class="text-normal">商品管理</span>
					</a>
				</div>
				<ul class="sidebar-trans">

					<li>
						<a href="/admingood">
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
						<span class="text-normal">游戏管理</span>
					</a>
				</div>
				<ul class="sidebar-trans">
					<li>
						<a href="/admingame">
							<b class="sidebar-icon"><img src="Images/icon_cost.png" width="16" height="16" /></b>
							<span class="text-normal">游戏列表</span>
						</a>
					</li>
					<li>
						<a href="admininsertgame.jsp">
							<b class="sidebar-icon"><img src="Images/icon_cost.png" width="16" height="16" /></b>
							<span class="text-normal">增加游戏</span>
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
						<a href="/findAllComplain">
							<b class="sidebar-icon"><img src="Images/icon_cost.png" width="16" height="16" /></b>
							<span class="text-normal">投诉处理</span>
						</a>
					</li>
					<li>
						<a href="AnnouncementAdd.jsp">
							<b class="sidebar-icon"><img src="Images/icon_cost.png" width="16" height="16" /></b>
							<span class="text-normal">发布公告</span>
						</a>
					</li>
					<li>
						<a href="/findAllAnnouncement">
							<b class="sidebar-icon"><img src="Images/icon_cost.png" width="16" height="16" /></b>
							<span class="text-normal">公告</span>
						</a>
					</li>
				</ul>
			</div>

			<div class="sidebar-nav">
				<div class="sidebar-title">
					<a href="/adminshow">
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
					<h6 class="layout padding-left manage-head-con">用户管理</h6>
				</div>
			</div>
			<div class="authority-content">
				<div class="list-content show">
					<div class="offcial-table tr-border margin-big-top clearfix">
						<div class="tr-th clearfix">
							<div class="th w10">
								用户ID
							</div>
							<div class="th w10">
								登陆名
							</div>
							<div class="th w15">
								登陆密码
							</div>
							<div class="th w15">
								电话
							</div>
							<div class="th w15">
								地址
							</div>
							<div class="th w10">
								用户状态
							</div>
							<div class="th w10">
								用户角色
							</div>
							<div class="th w15">
								操作
							</div>
						</div>
						<c:forEach var="list" items="${alluser}">
							<div class="tr clearfix border-bottom-none">
								<div class="td w10">
										${list.userId}
								</div>
								<div class="td w10">
										${list.loginName}
								</div>
								<div class="td w15">
										${list.loginPwd}
								</div>
								<div class="td w15">
										${list.tel}
								</div>
								<div class="td w15">
										${list.address}
								</div>
								<div class="td w10">
										${list.userState.userState}
								</div>
								<div class="td w10">
										${list.roleInfo.roleName}
								</div>
								<div class="td w5">
									<a href="adminstartstate?userid=${list.userId}"  class="button-word2 btn_ajax_confirm">启用</a>
								</div>
								<div class="td w5">
									<a href="adminfreezestate?userid=${list.userId}"  class="button-word2 btn_ajax_confirm">冻结</a>
								</div>
								<div class="td w5">
									<a href="admindeleteuser?uid=${list.userId}" class="button-word2 btn_ajax_confirm">删除</a>
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
</script>
</body>

</html>