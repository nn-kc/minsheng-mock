<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="true"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>layui</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="/layer/assets/libs/layui/css/layui.css" />
    <link rel="stylesheet" href="/layer/assets/css/admin.css" media="all" />
</head>
<body>
<form class="layui-form" action="addBody.html">
    <div class="layui-form-item">

    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">户号</label>
        <div class="layui-input-block" style="width: 20%">
            <input type="text" name="barCode" lay-verify="required" lay-reqtext="户号是必填项" autocomplete="off" placeholder="请输入户号" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">缴费单位码</label>
        <div class="layui-input-block" style="width: 20%">
            <input type="text" name="orgCode" lay-verify="required" lay-reqtext="缴费单位码是必填项" placeholder="请输入缴费单位码" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">缴费单位名</label>
        <div class="layui-input-block" style="width: 20%">
            <input type="text" name="orgName" lay-verify="required" lay-reqtext="缴费单位名称是必填项" placeholder="请输入缴费单位名称" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">报文体1</label>
        <div class="layui-input-block" style="width: 80%">
            <input type="text" name="bodyOne" lay-verify="required" lay-reqtext="报文内容是必填项！" placeholder="报文内容，长度超过1024请截取存放！" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">报文体2</label>
        <div class="layui-input-block" style="width: 80%">
            <input type="text" name="bodyTwo" placeholder="报文内容，长度超过1024请截取存放！" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">报文体3</label>
        <div class="layui-input-block" style="width: 80%">
            <input type="text" name="bodyThree" placeholder="报文内容，长度超过1024请截取存放！" autocomplete="off" class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">报文类型</label>
        <div class="layui-input-block" style="width: 10%">
            <select name="bodyType" lay-filter="aihao">
                <option value=""></option>
                <option value="req">查询</option>
                <option value="rsp">销账</option>
            </select>
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">状态</label>
        <div class="layui-input-block" style="width: 10%">
            <select name="effectFlag" lay-filter="aihao">
                <option value=""></option>
                <option value="true">有效</option>
                <option value="false">无效</option>
            </select>
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit="" lay-filter="btnSubmit">立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>

<script type="text/javascript" src="/layer/assets/libs/layui/layui.js"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>
    layui.use(['form', 'layedit', 'laydate'], function(){
        var form = layui.form
            ,layer = layui.layer
            ,layedit = layui.layedit
            ,laydate = layui.laydate;

        // 表单提交事件
        form.on('submit(btnSubmit)', function (data) {
            $.get(url, data.field, function (data) {
                alert("aaaa");
                window.location.href="/page/system/parameters.jsp";
            },'json');
            return false;
        });
    });
</script>

</body>
</html>