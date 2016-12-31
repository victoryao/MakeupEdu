<!DOCTYPE HTML>
<html>
<head>
    <title>9.1营收统计</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link rel="stylesheet" type="text/css" href="/css/style.css"/>
    <link type="text/css" rel="stylesheet" href="/css/zhu1.css"/><!--柱状图样式-->
    <script language="javascript" src="/js/jquery-1.12.4.js"></script>
    <script language="javascript" type="text/javascript" src="/js/My97DatePicker/WdatePicker.js"></script>
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
    <h1 class="wh_h1">营收统计</h1>

    <div class="wh_sch">
        <div style="float:left;line-height:38px;font-size:14px;">统计时间段：</div>
        <form style="float:left;margin-left:20px;">
            <input class="Wdate" type="text" onClick="WdatePicker()" value="开始时间" name="kaishi"
                   style="width:200px; line-height:25px;"/>
            <input class="Wdate" type="text" onClick="WdatePicker()" value="结束时间" name="jieshu"
                   style="width:200px; line-height:25px;"/>
        </form>
    </div>
    <div class="wh_sch">
        <div style="float:left;line-height:38px;font-size:14px;">统计内容：</div>
        <form style="float:left;margin-left:35px;">
            <select style="width:400px;">
                <option value="总收入" selected>总收入</option>
                <option value="学费收入">学费收入</option>
                <option value="产品收入">产品收入</option>
                <option value="项目收入">项目收入</option>

            </select>

            <input class="wh_su" id="cx" type="button" value="查询" style="margin-left:60px;"/>
            <input class="wh_su" type="button" value="返回"/>
        </form>
    </div>

    <div style="margin-top:40px;font-size:20px;">从XXXX.XX.XX到XXXX.XX.XX期间，学校的总收入/课程总收入/产品总收入/项目总收入为：XXXX元</div>
</div>
<script>
    $(function () {

        $('#cx').click(function () {


            var kaishi = $('input[name="kaishi"]').val();
            var jieshu = $('input[name="jieshu"]').val();


            if (kaishi == "开始时间") {
                alert('请输入开始时间！');
                return false;
            }


            if (jieshu == "结束时间") {
                alert('请输入结束时间');
                return false;
            }


        });

    });
</script>
<script>
    $(function () {
        $("#bars li .bar").each(function (key, bar) {
            var percentage = $(this).data('percentage');

            $(this).animate({
                'height': percentage + '%'
            }, 1000);
        })
    })
</script>

<div style="width:1100px;margin:0 auto;overflow:hidden;">
    <div id="chart">
        <div style="text-align:center;line-height:50px;font-size:24px;">学校总收入</div>
        <ul id="numbers">
            <li><span>350000</span></li>
            <li><span>300000</span></li>
            <li><span>250000</span></li>
            <li><span>200000</span></li>
            <li><span>150000</span></li>
            <li><span>100000</span></li>
            <li><span>50000</span></li>
            <li><span>0</span></li>
        </ul>
        <ul id="bars">
            <li>
                <div data-percentage="56" class="bar"></div>
                <span>课程</span></li>
            <li>
                <div data-percentage="33" class="bar"></div>
                <span>产品</span></li>
            <li>
                <div data-percentage="54" class="bar"></div>
                <span>项目</span></li>

        </ul>
    </div>
    <div id="chart">
        <div style="text-align:center;line-height:50px;font-size:24px;">课程总收入</div>
        <ul id="numbers">
            <li><span>140000</span></li>
            <li><span>120000</span></li>
            <li><span>100000</span></li>
            <li><span>80000</span></li>
            <li><span>60000</span></li>
            <li><span>40000</span></li>
            <li><span>20000</span></li>
            <li><span>0</span></li>
        </ul>
        <ul id="bars">
            <li style="width:60px;">
                <div data-percentage="56" class="bar" style="width:20px;margin-left:20px;"></div>
                <span style="bottom:-3rem;">美甲初级班</span></li>
            <li style="width:60px;">
                <div data-percentage="33" class="bar" style="width:20px;margin-left:20px;"></div>
                <span style="bottom:-3rem;">美甲中级班</span></li>
            <li style="width:60px;">
                <div data-percentage="54" class="bar" style="width:20px;margin-left:20px;"></div>
                <span style="bottom:-3rem;">美甲高级班</span></li>
            <li style="width:60px;">
                <div data-percentage="56" class="bar" style="width:20px;margin-left:20px;"></div>
                <span style="bottom:-3rem;">美发初级班</span></li>
            <li style="width:60px;">
                <div data-percentage="33" class="bar" style="width:20px;margin-left:20px;"></div>
                <span style="bottom:-3rem;">美发中级班</span></li>
            <li style="width:60px;">
                <div data-percentage="54" class="bar" style="width:20px;margin-left:20px;"></div>
                <span style="bottom:-3rem;">美发高级班</span></li>
            <li style="width:60px;">
                <div data-percentage="54" class="bar" style="width:20px;margin-left:20px;"></div>
                <span style="bottom:-3rem;">半永久</span></li>
        </ul>
    </div>
    <div id="chart">
        <div style="text-align:center;line-height:50px;font-size:24px;">产品总收入</div>
        <ul id="numbers">
            <li><span>140000</span></li>
            <li><span>120000</span></li>
            <li><span>100000</span></li>
            <li><span>80000</span></li>
            <li><span>60000</span></li>
            <li><span>40000</span></li>
            <li><span>20000</span></li>
            <li><span>0</span></li>
        </ul>
        <ul id="bars">
            <li style="width:85px;">
                <div data-percentage="56" class="bar" style="width:45px;margin-left:20px;"></div>
                <span>眼影</span></li>
            <li style="width:85px;">
                <div data-percentage="33" class="bar" style="width:45px;margin-left:20px;"></div>
                <span>洗发水</span></li>
            <li style="width:85px;">
                <div data-percentage="54" class="bar" style="width:45px;margin-left:20px;"></div>
                <span>面膜</span></li>
            <li style="width:85px;">
                <div data-percentage="56" class="bar" style="width:45px;margin-left:20px;"></div>
                <span>化妆刷</span></li>
            <li style="width:85px;">
                <div data-percentage="33" class="bar" style="width:45px;margin-left:20px;"></div>
                <span>护肤</span></li>

        </ul>
    </div>
    <div id="chart">
        <div style="text-align:center;line-height:50px;font-size:24px;">项目总收入</div>
        <ul id="numbers">
            <li><span>140000</span></li>
            <li><span>120000</span></li>
            <li><span>100000</span></li>
            <li><span>80000</span></li>
            <li><span>60000</span></li>
            <li><span>40000</span></li>
            <li><span>20000</span></li>
            <li><span>0</span></li>
        </ul>
        <ul id="bars">
            <li style="width:70px;">
                <div data-percentage="56" class="bar" style="width:40px;margin-left:15px;"></div>
                <span>美容</span></li>
            <li style="width:70px;">
                <div data-percentage="33" class="bar" style="width:40px;margin-left:15px;"></div>
                <span>美发</span></li>
            <li style="width:70px;">
                <div data-percentage="54" class="bar" style="width:40px;margin-left:15px;"></div>
                <span>美甲</span></li>
            <li style="width:70px;">
                <div data-percentage="56" class="bar" style="width:40px;margin-left:15px;"></div>
                <span>半永久</span></li>
            <li style="width:70px;">
                <div data-percentage="33" class="bar" style="width:40px;margin-left:15px;"></div>
                <span>摄影</span></li>
            <li style="width:70px;">
                <div data-percentage="33" class="bar" style="width:40px;margin-left:15px;"></div>
                <span>跟妆</span></li>
        </ul>
    </div>
</div>
</body>

</html>