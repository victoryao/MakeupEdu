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
    <h1 class="wh_h1">今天需跟进意向学员列表</h1>
    <div class="wh_tab">
        <form action="/willdate/list.do">
            <table cellspacing="0" style="width:700px; margin:0 auto;">
                <input type="hidden" name="page" id="page"/>
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

        <#include "../../share/paging.ftl" >
        </form>
    </div>
</body>

</html>