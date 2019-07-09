<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="true"%>
<!DOCTYPE html>
<html>
<head>
    <title>配置请求/响应报文</title>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="/layer/assets/libs/layui/css/layui.css" />
    <link rel="stylesheet" href="/layer/assets/css/admin.css" media="all" />
</head>
<style>
    .layui-card{
        min-height: 810px;
    }
    .layui-table tbody tr:hover{
        background-color:rgb(226, 142, 116);
    }
</style>

<body>
    <!-- 加载动画，移除位置在common.js中 -->
    <div class="page-loading">
        <div class="rubik-loader"></div>
    </div>

    <!-- 正文开始 -->
    <div class="layui-fluid">
        <div class="layui-card">
            <div class="layui-card-body">
                <div class="layui-form toolbar">
                    <div class="demoTable">
                        <div class="layui-inline">
                            <label class="layui-form-label">户号:</label>
                            <div style="width:200px;" class="layui-input-inline">
                                <input type="text" id="barCode" name="barCode" required lay-verify="required" size="50" placeholder="请输入户号" autocomplete="off" class="layui-input">
                            </div>
                        </div>
                        <div class="layui-inline">
                            <label class="layui-form-label">缴费单位码:</label>
                            <div style="width:200px;" class="layui-input-inline">
                                <input type="text" id="orgCode" name="orgCode" required lay-verify="required" size="50" placeholder="请输入缴费单位码" autocomplete="off" class="layui-input">
                            </div>
                        </div>
                        <div class="layui-inline">
                            <button class="layui-btn" data-type="reload">搜索</button>
                        </div>
                    </div>
                </div>
                <hr>

                <table class="layui-table" lay-filter="user-table" id="user-table" lay-data="{page:true,toolbar:'#toolbarDemo'}">
                </table>
                <script type="text/html" id="toolbarDemo">
                <div class="layui-btn-container">
                    <button class="layui-btn layui-btn-sm" id="add" lay-event="add">添加</button>
                    <button class="layui-btn layui-btn-sm" id="delete" lay-event="delete" data-type="deLink">删除</button>
                </div>
              </script>
            </div>
        </div>
    </div>
    <!-- js部分 -->
    <script type="text/javascript" src="/layer/assets/libs/layui/layui.js"></script>
    <script type="text/javascript" src="/layer/assets/js/common.js"></script>
    <script type="text/javascript" src="/layer/assets/libs/jquery/jquery-3.2.1.min.js"></script>
    <script>
        layui.use(['layer', 'form', 'table', 'laydate'], function () {
            var $ = layui.jquery;
            var layer = layui.layer;
            var table = layui.table;
            var laydate = layui.laydate;

            var url = "http://47.104.192.49:8080/";
            //常规用法
            laydate.render({
                elem: '#createDate'
            });
            table.render({
                elem: '#user-table',
                url: url+"queryParameters.html",
                page: {
                    layout: ['limit', 'count', 'prev', 'page', 'next', 'skip'], //自定义分页布局
                    limit: 20,
                    limits: [10,20, 50, 100]
                }
                ,id:"testReload"
                , toolbar: '#toolbarDemo'
                , title: '消息列表',
                cols: [[
                    { type: 'checkbox', field: true,width:40 }
                    , { field: 'id', title: 'ID',width:50}
                    , { field: 'barCode', title: '户号'}
                    , { field: 'orgCode', title: '缴费单位码'}
                    , { field: 'orgName', title: '缴费单位名称'}
                    , { field: 'bodyOne', title: '报文体1'}
                    , { field: 'bodyTwo', title: '报文体2'}
                    , { field: 'bodyThree', title: '报文体3'}
                    , { field: 'bodyType', title: '请求类型',templet: function(item){
                            if(item.bodyType == 'req'){
                                return '查询响应'
                            } else { return '销账响应'}
                        }}
                    , { field: 'effectFlag', title: '状态'}
                ]]
                , parseData: function(res){
                return {
                    "code": res.code, //解析接口状态
                    "count":res.count,
                    "data": res.data //解析数据列表
                };
            }
            });

            var $ = layui.$, active = {
                reload: function(){


                    console
                    var barCode=$('#barCode').val();
                    var orgCode=$('#orgCode').val();
                    //执行重载
                    table.reload('testReload', {
                        page: {
                            curr: 1 //重新从第 1 页开始
                        }
                        ,where: {'barCode':barCode,'orgCode':orgCode}
                    }, 'data');
                }
            };

            $('.demoTable .layui-btn').on('click', function(){
                var type = $(this).data('type');
                active[type] ? active[type].call(this) : '';
            });
            //头工具栏事件
            table.on('toolbar(user-table)', function (obj) {
                var checkStatus = table.checkStatus(obj.config.id);
                var type = $(this).data('type');
                switch (obj.event) {
                    case 'add':
                        window.location.href="/toBodyAddJsp.html";
                        break;
                    case 'delete':
                        if (checkStatus.data.length <= 0) {
                            layer.msg('请选择要删除的数据', { icon: 2 });
                        } else {
                            layer.confirm('确定是否删除', function (index) {
                                var data = checkStatus.data;
                                var ids = new Array();
                                for (var i in data) {
                                    ids[i] = checkStatus.data[i].id;
                                }

                                $.ajax({
                                    url:url+"delBody.html",
                                    data:{"ids":ids},
                                    dataType:"json",
                                    traditional: true,
                                    async: true,
                                    success:function (data) {
                                        if(data=="success"){
                                            layer.msg("删除成功！");
                                        }else{
                                            layer.msg("删除失败！");
                                        }
                                    },
                                    complete:function(XMLHttpRequest, textStatus){
                                        window.location.reload();
                                    }
                                })
                            })
                        }
                        break;
                };
            });
        });
    </script>
</body>
</html>