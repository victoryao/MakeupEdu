<!DOCTYPE HTML>
<html>
<head>
    <title>订单详情</title>
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
    <h1 class="wh_h1">订单详情</h1>
    <div class="wh_tab">
        <table cellspacing="0">
            <tr class="wh_t1">
                <td>编号</td>
                <td>类别</td>
                <td>编号</td>
                <td>名称</td>
                <td>金额</td>
                <td>折扣</td>
                <td>应付金额</td>
            </tr>
            <tr>
                <td>1</td>
                <td>课程</td>
                <td>XXXX-1</td>
                <td>课程1</td>
                <td>12</td>
                <td>1</td>
                <td>1212</td>
            </tr>
            <tr>
                <td>2</td>
                <td>产品</td>
                <td>CCCC-1</td>
                <td>产品11</td>
                <td>12</td>
                <td>1</td>
                <td>1212</td>
            </tr>
            <tr>
                <td>3</td>
                <td>产品</td>
                <td>CCCC-2</td>
                <td>课程1</td>
                <td>12</td>
                <td>1</td>
                <td>1212</td>
            </tr>
            <tr>
                <td>4</td>
                <td>住宿费</td>
                <td>ZSF</td>
                <td>住宿费</td>
                <td>12</td>
                <td>1</td>
                <td>1212</td>
            </tr>
        </table>
    </div>
    <div class="wh_c2_3">
        <form>
            <table>
                <tr>
                    <td class="wh_c2_td1">应付费用合计</td>
                    <td><input type="text" value="123.0"/></td>
                </tr>
                <tr>
                    <td class="wh_c2_td1">折扣系数</td>
                    <td><input type="text" value="1"/></td>
                </tr>
                <tr>
                    <td class="wh_c2_td1">最终费用合计</td>
                    <td><input type="text" value="123.0"/></td>
                </tr>
                <tr>
                    <td class="wh_c2_td1">支付方式</td>
                    <td><select>
                        <option value="现金">现金</option>
                        <option value="刷卡">刷卡</option>
                        <option value="微信">微信</option>
                        <option value="支付宝">支付宝</option>
                    </select></td>
                </tr>
            </table>
            <input class="wh_c2_su1" type="submit" value="确认付款"/>
            <input class="wh_c2_su3" type="button" value="BACK"/>

        </form>
    </div>
</div>


</body>

</html>