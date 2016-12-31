<!DOCTYPE HTML>
<html>
<head>
    <title>5.2.1学习记录列表</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link rel="stylesheet" type="text/css" href="/css/style.css"/>
    <script language="javascript" src="/js/jquery.js"></script>
    <script>
        $(document).ready(function () {
            $(".wh_tab tr:even").addClass('even');
        });

        //到指定的分页页面
        function topage(page) {
            var form = document.forms[0];
            form.page.value = page;
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
    <h1 class="wh_h1">学习记录列表</h1>
    <div style="font-size:14px;text-align:center;padding-bottom:30px;">学号：${student.id}&nbsp;&nbsp;&nbsp;学员姓名：${student.name}&nbsp;&nbsp;&nbsp;学员电话：${student.phone}</div>

    <div class="wh_tab">
        <input type="hidden" name="page" id="page"/>
        <table cellspacing="0">
            <tr class="wh_t1">
                <td>编号</td>
                <td>时间</td>
                <td>课程类型</td>
                <td>课程名称</td>
                <td>课程花费</td>
                <td>学习成绩</td>
            </tr>
        <#list pageView.records as stuclass>
            <tr>
                <td>${stuclass.id}</td>
                <td>${(stuclass.beginTime?string("yyyy.MM.dd"))!}-${(stuclass.endTime?string("yyyy.MM.dd"))!}</td>
                <td>${stuclass.classTypeName}</td>
                <td>${stuclass.className}</td>
                <td>${stuclass.fee}</td>
                <td>${stuclass.score}</td>
            </tr>
        </#list>
        </table>
    </div>
<#include "../../share/paging.ftl" >
    <div class="wh_page"><a href="" class="wh_BACK" style="margin-left:400px;">BACK</a></div>
</div>


</body>

</html>