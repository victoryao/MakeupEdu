<!DOCTYPE HTML>
<html>
<head>
    <title>5.5.1消费记录列表</title>
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
    <h1 class="wh_h1">消费记录列表</h1>
    <div style="font-size:14px;text-align:center;padding-bottom:30px;">
        学号：${student.id}&nbsp;&nbsp;&nbsp;学员姓名：${student.name}&nbsp;&nbsp;&nbsp;学员电话：${student.phone}</div>

    <div class="wh_tab">
        <table cellspacing="0">
            <tr class="wh_t1">
                <td>编号</td>
                <td>时间</td>
                <td>类别</td>
                <td>金额</td>
                <td>折扣</td>
                <td>应付金额</td>
            </tr>
        <#list orderDOs as orderDO>
            <tr>
                <td>${orderDO.id}</td>
                <td>${(orderDO.created?string("yyyy.MM.dd"))!}</td>
                <td>${orderDO.type}</td>
                <td>${orderDO.amount}</td>
                <td>${orderDO.discount}</td>
                <td>${orderDO.finalAmount}</td>
            </tr>
        </#list>
        </table>
    </div>
</div>


</body>

</html>