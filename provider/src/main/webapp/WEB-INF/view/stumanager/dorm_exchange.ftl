<!DOCTYPE HTML>
<html>
<head>
    <title>5.3.2调换</title>
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
    <h1 class="wh_h1">调换宿舍</h1>
    <div style="font-size:14px;text-align:center;padding-bottom:30px;">
        学号：${student.id}&nbsp;&nbsp;&nbsp;学员姓名：${student.name}&nbsp;&nbsp;&nbsp;学员电话：${student.phone}</div>
    <div class="wh_sch">
        <div style="float:left;line-height:38px;font-size:14px;">宿舍类型</div>
        <form style="float:left;margin-left:20px;"
              action="/student/manager/dorm/list.do">
            <input type="hidden" name="sId" value="${student.id}">
            <input type="hidden" name="type" value="exchange">
            <select style="width:200px;" name="totalCount">
                <option value="1" selected>单人间</option>
                <option value="2">双人间</option>
                <option value="4">四人间</option>
                <option value="8">八人间</option>
            </select>
            <input class="wh_su" type="submit" value="筛选"/>
        </form>
    </div>
    <div class="wh_tab">
        <table cellspacing="0">
            <tr class="wh_t1">
                <td>编号</td>
                <td>宿舍类型</td>
                <td>宿舍号</td>
                <td>入住人数/满员数</td>
                <td>住宿费（月）</td>
                <td>操作</td>
            </tr>
        <#list dormList as dorm>
            <tr>
                <td>${dorm.id}</td>
                <td>${dorm.totalCount}人间</td>
                <td>${dorm.dId}</td>
                <td>${dorm.headCount}/${dorm.totalCount}</td>
                <td>${dorm.fee}</td>
                <td>
                    <#if (dorm.headCount < dorm.totalCount)!>
                        <a class="wh_ta_1" href="/student/manager/dorm/exchange.do?sId=${student.id}&dId=${dorm.id}"
                           style="width:80px;">确认入住</a>
                    </#if>
                </td>
            </tr>
        </#list>
        </table>
    </div>
    <div class="wh_page"><a href="" class="wh_BACK" style="margin-left:400px;">BACK</a></div>
</div>


</body>

</html>