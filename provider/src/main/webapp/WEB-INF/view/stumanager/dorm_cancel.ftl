<!DOCTYPE HTML>
<html>
<head>
    <title>5.3.3退宿</title>
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
    <h1 class="wh_h1">办理退宿</h1>
    学号：${student.id}&nbsp;&nbsp;&nbsp;学员姓名：${student.name}&nbsp;&nbsp;&nbsp;学员电话：${student.phone}</div>
    <div class="wh_sch">

        <div class="wh_tab">
            <table cellspacing="0">
            <#list dormList as dorm>
                <tr>
                    <td>${dorm.id}</td>
                    <td>${dorm.totalCount}人间</td>
                    <td>${dorm.dId}</td>
                    <td>${dorm.fee}</td>
                    <td></td>
                    <td>${dorm.fee}</td>
                    <td><a class="wh_ta_1" href="/student/manager/dorm/add.do?sId=${student.id}&dId=${dorm.id}" style="width:80px;">确认入住</a></td>
                </tr>
            </#list>
            </table>

        </div>
        <div class="wh_c2_3" style="margin-left:0;">
            <form>
                <table>
                    <tr>
                        <td class="wh_c2_td1">费用合计</td>
                        <td><input type="text" value=${dorm.fee}/></td>
                    </tr>
                    <tr>
                        <td class="wh_c2_td1">折扣系数</td>
                        <td><input type="text" value="1"/></td>
                    </tr>
                    <tr>
                        <td class="wh_c2_td1">实付费用</td>
                        <td><input type="text" value="123.0"/></td>
                    </tr>

                </table>
                <input class="wh_c2_su1" type="submit" value="确认付款" style="color:#fff;"/>
                <input class="wh_c2_su3" type="button" value="BACK" onclick="javascript:history.go(-1);" style="color:#fff;"/>

            </form>
        </div>

    </div>


</body>

</html>