<!DOCTYPE HTML>
<html>
<head>
    <title>意向学员信息列表</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link rel="stylesheet" type="text/css" href="/css/style.css"/>
    <script language="javascript" src="/js/jquery.js"></script>
    <script>
        $(document).ready(function () {
            $(".wh_tab tr:even").addClass('even');
        });
    </script>
</head>

<body>
<div class="wh_top">
    <div class="wht_left"><img src="/images/logo_li.png"/></div>
    <div class="wht_right">用户名: admin <a href="">注销</a></div>
</div>
<div class="wh_content1">
    <h1 class="wh_h1">意向学员信息查询</h1>
    <div class="wh_sch" style="width:600px; margin:0 auto;">
        <form action="/student/list.do">
            <input type="text" value="请输入学生姓名" onFocus="if (this.value=='请输入学生姓名') this.value=''"
                   onBlur="if (this.value==''){this.value='请输入学生姓名'}" name="name"/>
            <input type="text" value="请输入学生电话" onFocus="if (this.value=='请输入学生电话') this.value=''"
                   onBlur="if (this.value==''){this.value='请输入学生电话'}" name="phone"/>
            <input class="wh_su" type="submit" value="查询"/>
        </form>
    </div>
    <div class="wh_tab">
        <table cellspacing="0" style="width:700px; margin:0 auto;">
            <thead>
            <tr class="wh_t1">
                <td>编号</td>
                <td>学员姓名</td>
                <td>学员联系方式</td>
                <td>操作</td>
            </tr>
            </thead>
            <tbody>
            <#list pageView.records as student>
            <tr>
                <td>${student.id}</td>
                <td>${student.name}</td>
                <td>${student.phone}</td>
                <td><a class="wh_ta_1" href="">跟进</a></td>
            </tr>
            </#list>
            </tbody>
        </table>
    </div>
<#include "../../share/paging.ftl" >
</div>

<script>
    $(function(){

        $('.wh_su').click(function(){


            var xing=$('input[name="xingming"]').val();
            var phone=$('input[name="phone"]').val();



            if(xing=="请输入学生姓名"){
                alert('请输入学生姓名！');
                return false;
            }


            if(phone=="请输入学生电话"){
                alert('请输入学生电话');
                return false;
            }



        });

    });
</script>
</body>

</html>