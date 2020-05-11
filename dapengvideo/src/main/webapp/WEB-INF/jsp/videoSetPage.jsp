<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>My JSP 'Test.jsp' starting page</title>

    <script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath }/static/js/jquery.js" ></script>
    <script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath }/static/layer/layer.js" ></script>

</head>

<body>
<div align="center">
    <form id="form">
        <button type="button" onclick="makeImageFun()">触发按钮</button>
    </form>
</div>

<div align="center">
    <form id="form1">
        <button type="button" onclick="netWorking()">触发按钮</button>
    </form>
</div>

<div id='divId'>初始文字</div>

</body>

<script type="text/javascript">
    function makeImageFun(){
        $('#divId').html('发起请求');

        //加载层-默认风格

        layer.load();

        $.ajax({
            url: "${pageContext.request.contextPath}/videoSetPage/makeImage",
            type: "POST",
            dataType: 'json',
            contentType:'application/json',
            success: function(data) {
                $(document).ready(function(e){
                    $('#divId').html('数据请求成功');
                })

                layer.closeAll('loading');
            },
            error: function (data) {
                $(document).ready(function(e){
                    $('#divId').html('数据请求失败');
                })

                layer.closeAll('loading');
            },
            complete: function (data) {
                $(document).ready(function(e){
                    $('#divId').html('新的内容文字');
                })

                layer.closeAll('loading');
            }
        });
    }

    function netWorking() {
        $('#divId').html('netWorking');

        var data = {
            name: "asdeasd"
        }

        $.ajax({
            url: "${pageContext.request.contextPath}/video/unlock",
            type: "POST",
            data: JSON.stringify(data),
            dataType: 'json',
            contentType:'application/json',
            success:function(data) {
                $(document).ready(function(e){
                    $('#divId').html('数据请求失败');
                })
            },
            error:function(data) {
                $(document).ready(function(e){
                    $('#divId').html('数据请求失败');
                })
            }
        });
    }

</script>
</html>

