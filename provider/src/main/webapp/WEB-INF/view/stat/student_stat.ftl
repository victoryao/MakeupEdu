<!DOCTYPE HTML>
<html>
<head>
    <title>9.2学员统计</title>
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
    <h1 class="wh_h1">学员统计</h1>

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
                <option value="总收入" selected>目前在校生人数</option>
                <option value="毕业学生人数">毕业学生人数</option>
                <option value="毕业去向人数">毕业去向人数</option>
                <option value="咨询学生人数">咨询学生人数</option>
            </select>

            <input class="wh_su" id="cx" type="button" value="查询" style="margin-left:60px;"/>
            <input class="wh_su" type="button" value="返回"/>
        </form>
    </div>

    <div style="margin-top:40px;font-size:20px;">从XXXX.XX.XX到XXXX.XX.XX期间，在校总人数/毕业总人数/咨询总人数为：XXXX人</div>
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

<div style="width:1100px;margin:0 auto;overflow:hidden;padding-bottom:20px;">
    <div id="chart">
        <div style="text-align:center;line-height:50px;font-size:24px;">在校人数统计</div>
        <ul id="numbers">
            <li><span>35</span></li>
            <li><span>30</span></li>
            <li><span>25</span></li>
            <li><span>20</span></li>
            <li><span>15</span></li>
            <li><span>10</span></li>
            <li><span>5</span></li>
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
        <div style="text-align:center;line-height:50px;font-size:24px;">毕业人数统计</div>
        <ul id="numbers">
            <li><span>700</span></li>
            <li><span>600</span></li>
            <li><span>500</span></li>
            <li><span>400</span></li>
            <li><span>300</span></li>
            <li><span>200</span></li>
            <li><span>100</span></li>
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

    <div id="chart">
        <div style="text-align:center;line-height:50px;font-size:24px;">毕业去向统计</div>
        <ul id="numbers">
            <li><span>700</span></li>
            <li><span>600</span></li>
            <li><span>500</span></li>
            <li><span>400</span></li>
            <li><span>300</span></li>
            <li><span>200</span></li>
            <li><span>100</span></li>
            <li><span>0</span></li>
        </ul>
        <ul id="bars">
            <li style="width:60px;">
                <div data-percentage="56" class="bar" style="width:20px;margin-left:20px;"></div>
                <span style="bottom:-3rem;">影楼</span></li>
            <li style="width:60px;">
                <div data-percentage="33" class="bar" style="width:20px;margin-left:20px;"></div>
                <span style="bottom:-3rem;">工作室</span></li>
            <li style="width:60px;">
                <div data-percentage="54" class="bar" style="width:20px;margin-left:20px;"></div>
                <span style="bottom:-3rem;">美甲会所</span></li>
            <li style="width:60px;">
                <div data-percentage="56" class="bar" style="width:20px;margin-left:20px;"></div>
                <span style="bottom:-3rem;">美甲店</span></li>
            <li style="width:60px;">
                <div data-percentage="33" class="bar" style="width:20px;margin-left:20px;"></div>
                <span style="bottom:-3rem;">剧组</span></li>
            <li style="width:60px;">
                <div data-percentage="54" class="bar" style="width:20px;margin-left:20px;"></div>
                <span style="bottom:-3rem;" 电视</span></li>
            <li style="width:60px;">
                <div data-percentage="54" class="bar" style="width:20px;margin-left:20px;"></div>
                <span style="bottom:-3rem;">创业</span></li>
        </ul>
    </div>
    <div id="chart">
        <div style="text-align:center;line-height:50px;font-size:24px;">咨询人数统计</div>
        <ul id="numbers">
            <li><span>700</span></li>
            <li><span>600</span></li>
            <li><span>500</span></li>
            <li><span>400</span></li>
            <li><span>300</span></li>
            <li><span>200</span></li>
            <li><span>100</span></li>
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