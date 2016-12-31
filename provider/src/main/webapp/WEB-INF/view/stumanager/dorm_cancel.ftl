<!DOCTYPE HTML>
<html>
<head>
    <title>退宿</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link rel="stylesheet" type="text/css" href="/css/style.css"/>
    <script language="javascript" src="/js/jquery.js"></script>
    <script>
        $(document).ready(function () {
            $(".wh_tab tr:even").addClass('even');
            var total = $("#amount").val() * $("#discount").val();
            $("#total").val(total);
            $("#discount").blur(function () {
                var total = $("#amount").val() * $("#discount").val();
                $("#total").val(total);
            });

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
    <div style="font-size:14px;text-align:center;padding-bottom:30px;">
        学号：${student.id}&nbsp;&nbsp;&nbsp;学员姓名：${student.name}&nbsp;&nbsp;&nbsp;学员电话：${student.phone}
    </div>

    <div class="wh_sch">

        <div class="wh_tab">
            <table cellspacing="0">
                <tr class="wh_t1">
                    <td>编号</td>
                    <td>宿舍类型</td>
                    <td>宿舍号</td>
                    <td>住宿费（月）</td>
                    <td>住宿时间</td>
                    <td>住宿天数</td>
                    <td>应付费用</td>
                </tr>
                <tr>
                    <td>${dorm.id}</td>
                    <td>${dorm.totalCount}人间</td>
                    <td>${dorm.dId}</td>
                    <td>${dorm.fee}</td>
                    <td>${(studentDorm.beginTime?string("yyyy.MM.dd"))!}
                        -${(studentDorm.endTime?string("yyyy.MM.dd"))!}</td>
                    <td>${studentDorm.durs}</td>
                    <td>${studentDorm.amount}</td>
                </tr>
            </table>

        </div>
        <div class="wh_c2_3" style="margin-left:0;">
            <form action="/student/manager/dorm/cancel.do" method="post">
                <input type="hidden" name="sId" value="${student.id}">
                <input type="hidden" name="dId" value="${dorm.id}">
                <input type="hidden" name="stuDormId" value="${studentDorm.id}">
                <table>
                    <tr>
                        <td class="wh_c2_td1">费用合计</td>
                        <td>
                            <input type="text" name="amount" id="amount" readonly value='${studentDorm.amount}'/>
                        </td>
                    </tr>
                    <tr>
                        <td class="wh_c2_td1">折扣系数</td>
                        <td><input name="discount" id='discount' type="text" value="1"/></td>
                    </tr>
                    <tr>
                        <td class="wh_c2_td1">实付费用</td>
                        <td><input name="finalAmount" id="total" readonly type="text" value=""/></td>
                    </tr>

                </table>
                <input class="wh_c2_su1" type="submit" id="paybtn" value="确认付款" style="color:#fff;"/>
                <input class="wh_c2_su3" type="button" value="BACK" style="color:#fff;"/>

            </form>
        </div>

    </div>


</body>

</html>