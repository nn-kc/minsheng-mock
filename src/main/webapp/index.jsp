<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="true"%>
<!DOCTYPE HTML>
<html>
<head>
    <title>生活缴费</title>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="/layer/assets/libs/layui/css/layui.css" />
    <link rel="stylesheet" href="/layer/assets/css/admin.css" />
    <link href="/layer/assets/images/favicon.ico" rel="SHORTCUT ICON">
</head>

<body class="layui-layout-body">

    <div class="layui-layout layui-layout-admin">
        <!-- 头部 -->
        <div class="layui-header" style="background-color:#669999;">
            <div class="layui-logo" style="width: 200px;margin-left: 43%;">生活缴费模拟第三方</div>
        </div>

        <!-- 侧边栏 -->
        <div class="layui-side">
            <div class="layui-side-scroll">
                <ul class="layui-nav layui-nav-tree" lay-filter="admin-side-nav" style="margin: 15px 0;">
                    <li class="layui-nav-item">
                        <a href="javascript:;" lay-href="/page/system/parameters.jsp">我的报文</a>
                    </li>
                    <li class="layui-nav-item">
                        <a href="javascript:;" lay-href="/page/system/publist.jsp">我的发布</a>
                    </li>
                </ul>
            </div>
        </div>
        <!-- 主体部分 -->
        <div class="layui-body">
            <div class="layui-tab" lay-allowClose="true" lay-filter="admin-pagetabs">
                <ul class="layui-tab-title">
                </ul>
                <div class="layui-tab-content">
                </div>
            </div>
            <div class="layui-icon admin-tabs-control layui-icon-prev" ew-event="leftPage"></div>
            <div class="layui-icon admin-tabs-control layui-icon-next" ew-event="rightPage"></div>
            <div class="layui-icon admin-tabs-control layui-icon-down">
                <ul class="layui-nav admin-tabs-select" lay-filter="admin-pagetabs-nav">
                    <li class="layui-nav-item" lay-unselect>
                        <a href="javascript:;"></a>
                        <dl class="layui-nav-child layui-anim-fadein">
                            <dd ew-event="closeThisTabs" lay-unselect><a href="javascript:;">关闭当前标签页</a></dd>
                            <dd ew-event="closeOtherTabs" lay-unselect><a href="javascript:;">关闭其它标签页</a></dd>
                            <dd ew-event="closeAllTabs" lay-unselect><a href="javascript:;">关闭全部标签页</a></dd>
                        </dl>
                    </li>
                </ul>
            </div>
        </div>
        <!-- 底部 -->
        <!--<div class="layui-footer">Copyright © 2018 EasyWeb All rights reserved. <span class="pull-right">Version 3.0.1</span>
        </div>-->
        <!-- 手机屏幕遮罩层 -->
        <div class="site-mobile-shade"></div>
    </div>

    <!-- 加载动画，移除位置在common.js中 -->
    <div class="page-loading">
        <div class="rubik-loader"></div>
    </div>

    <!-- js部分 -->
    <script type="text/javascript" src="/layer/assets/libs/layui/layui.js"></script>
    <script type="text/javascript" src="/layer/assets/js/common.js"></script>
    <script>
        layui.use(['layer', 'element', 'admin', 'index'], function () {
            var $ = layui.jquery;
            var layer = layui.layer;
            var admin = layui.admin;
            var index = layui.index;
            // 默认加载主页
            index.loadView({
                menuPath: '/page/system/index.jsp',
                menuName: '<i class="layui-icon layui-icon-home"></i>'
            });

            // 消息点击事件
            $('#btnMessage').click(function () {
                admin.popupRight({
                    type: 2,
                    content: 'tpl-message.html'
                });
            });
            // 修改密码点击事件
            $('#setPsw').click(function () {
                admin.open({
                    type: 2,
                    title: '修改密码',
                    area: ['380px', '290px'],
                    content: 'tpl-password.html'
                });
            });

            // 退出登录点击事件
            $('#btnLogout').click(function () {
                layer.confirm('确定退出登录？', function () {
                    location.replace('login.html');
                });
            });

            // 个人信息点击事件
            $('#setInfo').click(function () {

            });
        });
    </script>
</body>

</html>