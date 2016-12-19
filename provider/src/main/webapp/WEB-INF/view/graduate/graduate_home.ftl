<!DOCTYPE HTML>
<html>
<head>
    <title>毕业去向</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link rel="stylesheet" type="text/css" href="/css/style.css"/>
    <script language="javascript" src="/js/jquery.js"></script>
    <script language="javascript" type="text/javascript" src="/js/My97DatePicker/WdatePicker.js"></script>
    <script>
        $(document).ready(function () {
            $(".wh_tab tr:even").addClass('even');


            $("#lrsubmit").click(function () {
                var company = $("#lrinput").val();
                var companyType = $("#lrselect").find("option:selected").val();
                var sId = $("#s_id").text();
                $.post("/stu/graduate.do?companyType=" + companyType + "&company=" + company + "&sId=" + sId, function (data) {
                    var json = eval(data);
                    if (json.data == "success") {
                        alert("操作成功！");
                    } else {
                        alert("操作失败！");
                    }
                });
            });

        });

        //到指定的分页页面
        function topage(page) {
            var form = document.forms[0];
            form.page.value = page;
            if ($("#id").val() == "请输入学生学号") {
                $("#id").val("");
            }
            if ($("#name").val() == "请输入学生姓名") {
                $("#name").val("");
            }
            if ($("#phone").val() == "请输入学生电话") {
                $("#phone").val("");
            }
            form.submit();
        }

    </script>
</head>

<body>
<div class="wh_top">
    <div class="wht_left"><img src="/images/logo_li.png"/></div>
    <div class="wht_right">用户名: admin <a href="">注销</a></div>
</div>
<div class="wh_content1">
    <h1 class="wh_h1">毕业去向</h1>
    <form action="/student/manager/home/list.do?type=graduate" id="mainForm">
        <div class="wh_sch" style="position:relative;">

            <input type="hidden" name="page" id="page"/>

            <input type="text" value="请输入学生学号" id="id" name="id" onFocus="if (this.value=='请输入学生学号') this.value=''"
                   onBlur="if (this.value==''){this.value='请输入学生学号'}"/>
            <input type="text" value="请输入学生姓名" id="name" name="name" onFocus="if (this.value=='请输入学生姓名') this.value=''"
                   onBlur="if (this.value==''){this.value='请输入学生姓名'}"/>
            <input type="text" value="请输入学生电话" id="phone" name="phone"
                   onFocus="if (this.value=='请输入学生电话') this.value=''"
                   onBlur="if (this.value==''){this.value='请输入学生电话'}"/>
            <select>
                <option value="毕业去向" selected>毕业去向</option>
                <option value="影楼">影楼</option>
                <option value="工作室">工作室</option>
                <option value="美容会所">美容会所</option>
                <option value="美甲店">美甲店</option>
                <option value="剧组">剧组</option>
                <option value="电视">电视</option>
                <option value="其他">其他</option>
            </select>
            <input class="wh_su" type="submit" value="查询"/>
        </div>
        <div class="wh_tab">
            <table cellspacing="0">
                <tr class="wh_t1">
                    <td>学号</td>
                    <td>学员姓名</td>
                    <td>学员联系方式</td>
                    <td>毕业去向</td>
                    <td>操作</td>
                </tr>
            <#list pageView.records as student>
                <tr>
                    <td>${student.id}</td>
                    <td>${student.name}</td>
                    <td>${student.phone}</td>
                    <td>${student.property}</td>
                    <td><a class="wh_ta_1" href="javascript:lr(${student.id},'${student.name}',${student.phone});"
                           style="margin-right:10px;">录入</a>
                        <a class="wh_ta_1" href="javascript:ck(${student.id},'${student.name}',${student.phone});"
                           style="margin-right:10px;border:1px solid #eb5e31;color:#eb5e31;">查看</a>
                        <a class="wh_ta_1" href="javascript:gx(${student.id},'${student.name}',${student.phone});"
                           style="margin-right:10px;border:1px solid #eb5e31;color:#eb5e31;">更新</a>
                    </td>
                </tr>
            </#list>
            </table>
        <#include "../../share/paging.ftl" >
    </form>
</div>


<div class="lr"
     style="position:absolute;left:300px;border-radius:10px;top:60px;width:400px;overflow:hidden;background:#fff;border:1px solid #358eec;padding:20px;display:none;overflow:hidden;">
    <div style="font-size:30px;text-align:center;padding-bottom:20px;">毕业去向录入</div>
    <div style="font-size:14px;text-align:center;padding-bottom:30px;">学号：<span id="s_id"></span>&nbsp;&nbsp;&nbsp;学员姓名：<span
            id="s_name"></span>&nbsp;&nbsp;&nbsp;学员电话：<span id="s_phone"></span></div>
    <select style="width:300px;" id="lrselect">
        <option value="0" selected>影楼</option>
        <option value="1">工作室</option>
        <option value="2">美容会所</option>
        <option value="3">美甲店</option>
        <option value="4">剧组</option>
        <option value="5">电视</option>
        <option value="6">其他</option>
    </select>
    <input type="text" id="lrinput" value="单位名称" onFocus="if (this.value=='单位名称') this.value=''"
           onBlur="if (this.value==''){this.value='单位名称'}" style="margin-top:10px;"/>

    <div class="qd" id="lrsubmit"
         style="margin:0 auto;width:80px;height:35px;line-height:35px;margin-top:20px;clear:both;text-align:center;background:#358eec;color:#fff;">
        确定
    </div>
</div>
<div class="ck"
     style="position:absolute;left:300px;border-radius:10px;top:60px;width:600px;overflow:hidden;background:#fff;border:1px solid #358eec;padding:20px;display:none;overflow:hidden;">
    <div style="font-size:30px;text-align:center;padding-bottom:20px;">毕业去向录入</div>
    <div style="font-size:14px;text-align:center;padding-bottom:30px;">学号：<span id="s_id2"></span>&nbsp;&nbsp;&nbsp;学员姓名：<span
            id="s_name2"></span>&nbsp;&nbsp;&nbsp;学员电话：<span id="s_phone2"></span></div>
    <div class="wh_tab" style="width:600px;">
        <table cellspacing="0" style="width:600px;" id="cktable">
            <tr class="wh_t1">
                <td>编号</td>
                <td>时间</td>
                <td>毕业去向</td>
                <td>单位名称</td>
            </tr>


        </table>
    </div>
    <div class="qd" id="lrsubmit2"
         style="margin:0 auto;width:80px;margin-top:20px;clear:both;text-align:center;height:35px;line-height:35px;background:#358eec;color:#fff;">
        确定
    </div>
</div>
<div class="gx"
     style="position:absolute;left:300px;border-radius:10px;top:60px;width:600px;overflow:hidden;background:#fff;border:1px solid #358eec;padding:20px;display:none;overflow:hidden;">
    <div style="font-size:30px;text-align:center;padding-bottom:20px;">毕业去向更新</div>
    <div style="font-size:14px;text-align:center;padding-bottom:30px;">学号：<span id="s_id3"></span>&nbsp;&nbsp;&nbsp;学员姓名：<span
            id="s_name3"></span>&nbsp;&nbsp;&nbsp;学员电话：<span id="s_phone3"></span></div>


    <input style="width:200px;margin-top:10px;" class="Wdate" type="text" onClick="WdatePicker()"
           value="工作截止时间"/>
    <select style="margin-top:10px;width:200px;">
        <option value="0" selected>影楼</option>
        <option value="1">工作室</option>
        <option value="2">美容会所</option>
        <option value="3">美甲店</option>
        <option value="4">剧组</option>
        <option value="5">电视</option>
        <option value="6">其他</option>
    </select>
    <input style="margin-top:10px;width:200px;" id="lrinput3" type="text" value="新单位名称"
           onFocus="if (this.value=='新单位名称') this.value=''"
           onBlur="if (this.value==''){this.value='新单位名称'}"/>
    <input style="width:200px;margin-top:10px;" id="lrbeginTime" class="Wdate" type="text" onClick="WdatePicker()"
           value="工作开始时间"/>

    <div class="qd" id="lrsubmit3"
         style="margin:0 auto;width:80px;margin-top:20px;clear:both;text-align:center;height:35px;line-height:35px;background:#358eec;color:#fff;">
        确定
    </div>
</div>


</body>
<script>

    function lr(id, name, phone) {
        $(".lr").show();
        $("#s_id").html(id);
        $("#s_name").html(name);
        $("#s_phone").html(phone);
    }
    function ck(id, name, phone) {
        $(".ck").show();
        $("#s_id2").html(id);
        $("#s_name2").html(name);
        $("#s_phone2").html(phone);
        $.get("/stu/graduate.do?sId=" + id, function (data) {
            var json = eval(data);
            $.each(json.data, function (a, b) {
                $("#cktable").append("<tr><td>" + b.id + "</td><td>" + b.beginTime + "-" + b.endTime + "</td><td>" + b.companyType + "</td><td>" + b.company + "</td></tr>");
            });

        });

    }
    function gx(id, name, phone) {
        $(".gx").show();
        $("#s_id3").html(id);
        $("#s_name3").html(name);
        $("#s_phone3").html(phone);
    }
    $(".qd").click(function () {
        $(".lr").hide();
        $(".ck").hide();
        $(".gx").hide();
    })
</script>
<script>
    $(function () {

        $('.wh_su').click(function () {

            var xing = $('input[name="name"]').val();
            var phone = $('input[name="phone"]').val();
            var xuehao = $('input[name="id"]').val();

            if (xuehao == "请输入学生学号") {
                $('input[name="id"]').val("");
            }

            if (xing == "请输入学生姓名") {
                $('input[name="name"]').val("");
            }


            if (phone == "请输入学生电话") {
                $('input[name="phone"]').val("");
            }

        });

    });
</script>
</html>