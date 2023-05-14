<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<div id="leftSide">
	<div class="sidebarSep"></div>
	<ul id="menu" class="nav">

		<li class="tables"><a title="管理员信息" class="exp"><span>管理员信息</span><strong>3</strong></a>
			<ul class="sub">
				<li><a href="admin/createAdmin.action" title="新增管理员信息">新增管理员信息</a></li>
				<li><a href="admin/getAllAdmin.action" title="管理员信息列表">管理员信息列表</a></li>
				<li><a href="admin/queryAdminByCond.action" title="管理员信息查询">管理员信息查询</a></li>
			</ul></li>
		<li class="tables"><a title="网站用户信息" class="exp"><span>网站用户信息</span><strong>2</strong></a>
			<ul class="sub">
				<li><a href="users/getAllUsers.action" title="网站用户信息列表">网站用户信息列表</a></li>
				<li><a href="users/queryUsersByCond.action" title="网站用户信息查询">网站用户信息查询</a></li>
			</ul></li>
		<li class="tables"><a title="新闻公告信息" class="exp"><span>新闻公告信息</span><strong>3</strong></a>
			<ul class="sub">
				<li><a href="article/createArticle.action" title="新增新闻公告信息">新增新闻公告信息</a></li>
				<li><a href="article/getAllArticle.action" title="新闻公告信息列表">新闻公告信息列表</a></li>
				<li><a href="article/queryArticleByCond.action" title="新闻公告信息查询">新闻公告信息查询</a></li>
			</ul></li>
		<li class="tables"><a title="建材类型信息" class="exp"><span>建材类型信息</span><strong>3</strong></a>
			<ul class="sub">
				<li><a href="cate/createCate.action" title="新增建材类型信息">新增建材类型信息</a></li>
				<li><a href="cate/getAllCate.action" title="建材类型信息列表">建材类型信息列表</a></li>
				<li><a href="cate/queryCateByCond.action" title="建材类型信息查询">建材类型信息查询</a></li>
			</ul></li>
		<li class="tables"><a title="城市信息" class="exp"><span>城市信息</span><strong>3</strong></a>
			<ul class="sub">
				<li><a href="city/createCity.action" title="新增城市信息">新增城市信息</a></li>
				<li><a href="city/getAllCity.action" title="城市信息列表">城市信息列表</a></li>
				<li><a href="city/queryCityByCond.action" title="城市信息查询">城市信息查询</a></li>
			</ul></li>
		<li class="tables"><a title="配货点信息" class="exp"><span>配货点信息</span><strong>3</strong></a>
			<ul class="sub">
				<li><a href="peihuo/createPeihuo.action" title="新增配货点信息">新增配货点信息</a></li>
				<li><a href="peihuo/getAllPeihuo.action" title="配货点信息列表">配货点信息列表</a></li>
				<li><a href="peihuo/queryPeihuoByCond.action" title="配货点信息查询">配货点信息查询</a></li>
			</ul></li>
		<li class="tables"><a title="建材商品信息" class="exp"><span>建材商品信息</span><strong>3</strong></a>
			<ul class="sub">
				<li><a href="jiancai/createJiancai.action" title="新增建材商品信息">新增建材商品信息</a></li>
				<li><a href="jiancai/getAllJiancai.action" title="建材商品信息列表">建材商品信息列表</a></li>
				<li><a href="jiancai/queryJiancaiByCond.action" title="建材商品信息查询">建材商品信息查询</a></li>
			</ul></li>
		<li class="tables"><a title="建材订单信息" class="exp"><span>建材订单信息</span><strong>2</strong></a>
			<ul class="sub">
				<li><a href="orders/getAllOrders.action" title="建材订单信息列表">建材订单信息列表</a></li>
				<li><a href="orders/queryOrdersByCond.action" title="建材订单信息查询">建材订单信息查询</a></li>
			</ul></li>
		<li class="tables"><a title="建材评价信息" class="exp"><span>建材评价信息</span><strong>2</strong></a>
			<ul class="sub">
				<li><a href="topic/getAllTopic.action" title="建材评价信息列表">建材评价信息列表</a></li>
				<li><a href="topic/queryTopicByCond.action" title="建材评价信息查询">建材评价信息查询</a></li>
			</ul></li>
	</ul>
</div>
