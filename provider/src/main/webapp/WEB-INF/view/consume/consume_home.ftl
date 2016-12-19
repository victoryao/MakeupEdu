<!DOCTYPE HTML>
<html>
<head>
    <title>消费记录</title>
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
    <h1 class="wh_h1">消费记录查询</h1>
    <form action="/student/manager/home/list.do?type=consume" id="mainForm">
        <div class="wh_sch">
            <input type="hidden" name="page" id="page"/>
            <input type="text" value="请输入学生学号" name="id" onFocus="if (this.value=='请输入学生学号') this.value=''"
                   onBlur="if (this.value==''){this.value='请输入学生学号'}"/>
            <input type="text" value="请输入学生姓名" name="name" onFocus="if (this.value=='请输入学生姓名') this.value=''"
                   onBlur="if (this.value==''){this.value='请输入学生姓名'}"/>
            <input type="text" value="请输入学生电话" name="phone" onFocus="if (this.value=='请输入学生电话') this.value=''"
                   onBlur="if (this.value==''){this.value='请输入学生电话'}"/>

            <input class="wh_su" type="submit" value="筛选"/>

        </div>
        <div class="wh_tab">
            <table cellspacing="0">
                <tr class="wh_t1">
                    <td>学号</td>
                    <td>学员姓名</td>
                    <td>学员联系方式</td>
                    <td>操作</td>
                </tr>
            <#list pageView.records as student>
                <tr>
                    <td>${student.id}</td>
                    <td>${student.name}</td>
                    <td>${student.phone}</td>
                    <td><a class="wh_ta_1" href="/student/manager/consume/list.do">查看</a></td>
                </tr>
            </#list>

            </table>
        </div>
    <#include "../../share/paging.ftl" >
    </form>
</div>

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
</body>

</html>