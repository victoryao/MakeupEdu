<!DOCTYPE HTML>
<html>
<head>
    <title>意向学员信息录入</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link rel="stylesheet" type="text/css" href="/css/style.css"/>
    <script language="javascript" src="/js/jquery.js"></script>
    <script language="javascript" type="text/javascript" src="/js/My97DatePicker/WdatePicker.js"></script>
</head>

<body>
<div class="wh_top">
    <div class="wht_left"><img src="/images/logo_li.png"/></div>
    <div class="wht_right">用户名: admin <a href="">注销</a></div>
</div>
<div class="wh_content5">
    <div class="wh_c5_1">学生咨询登记表</div>
    <div class="wh_c5_2">
        <p class="wh_c5_t1">为了方便您更好的了解咨询我们的课程，请您协助填写以下的内容，谢谢！</p>
        <form>
            <table>
                <tr>
                    <td>姓名 <input type="text" style="width:140px; line-height:25px;" value="" id="name"/> &nbsp;&nbsp;
                        性别 <select style="line-height:25px;" id="sex">
                            <option value="0">男</option>
                            <option value="1">女</option>
                        </select> &nbsp;&nbsp;
                        年龄 <input type="text" style="width:40px; line-height:25px;" value="" id="age"/> &nbsp;&nbsp;
                        联系电话 <input type="text" style="width:140px; line-height:25px;" value="" id="phone"/> &nbsp;&nbsp;
                        QQ号 <input type="text" style="width:140px; line-height:25px;" value="" id="qq"/></td>
                </tr>
                <tr>
                    <td>在职
                        <select style="line-height:25px;" id="zz">
                            <option value="0">是</option>
                            <option value="1">否</option>
                        </select> &nbsp;&nbsp;
                        职业类别
                        <input type="radio" name="leibie" value="职员"> 职员
                        <input type="radio" name="leibie" value="销售"> 销售
                        <input type="radio" name="leibie" value="学生">学生
                        <input type="radio" name="leibie" value="工人">工人
                        <input type="radio" name="leibie" value="自由职业"> 自由职业 其他，请注明
                        <input type="text" style="width:140px; line-height:25px;" value="" id="leibieqt"/>
                    </td>
                </tr>
                <tr>
                    <td>1.您对哪些课程感兴趣？（可多选）</td>
                </tr>
                <tr>
                    <td>
                        <input type="checkbox" value="美甲类" name="gxq"> 美甲类 &nbsp;
                        <input type="checkbox" value="摄影类" name="gxq"> 摄影类 &nbsp;
                        <input type="checkbox" value="化妆类" name="gxq"> 化妆类 &nbsp;
                        <input type="checkbox" value="美容类" name="gxq"> 美容类 &nbsp;
                        <input type="checkbox" value="美发类" name="gxq"> 美发类 &nbsp;
                        <input type="checkbox" value="半永久类" name="gxq"> 半永久类
                    </td>
                </tr>
                <tr>
                    <td>2.您想利用什么时间上课？</td>
                </tr>
                <tr>
                    <td>
                        <input type="checkbox" value="全日制" name="sksj"> 全日制 &nbsp;
                        <input type="checkbox" value="晚上" name="sksj"> 晚上 &nbsp;
                        <input type="checkbox" value="周末" name="sksj"> 周末 &nbsp;
                        其他，请注明 <input type="text" style="width:200px; line-height:25px;" value="" id="sksjqt"/>
                    </td>
                </tr>
                <tr>
                    <td>3.您是通过以下哪个渠道了解到我们学校？</td>
                </tr>
                <tr>
                    <td>
                        <input type="checkbox" value="网络" name="lj"> 网络 &nbsp;
                        <input type="checkbox" value="宣传单" name="lj"> 宣传单 &nbsp;
                        <input type="checkbox" value="活动现场" name="lj"> 活动现场 &nbsp;
                        <input type="checkbox" value="亲友介绍" name="lj"> 亲友介绍 &nbsp;
                        <input type="checkbox" value="户外广告" name="lj"> 户外广告 &nbsp;
                        其他，请注明 <input type="text" style="width:200px; line-height:25px;" value="" id="ljqt"/>
                    </td>
                </tr>
                <tr>
                    <td>4.您学习的主要目的是什么？</td>
                </tr>
                <tr>
                    <td>
                        <input type="checkbox" value="职业需要" name="md"> 职业需要 &nbsp;
                        <input type="checkbox" value="兴趣爱好" name="md"> 兴趣爱好 &nbsp;
                        <input type="checkbox" value="自营开店" name="md"> 自营开店 &nbsp;
                        其他，请注明 <input type="text" style="width:200px; line-height:25px;" value="" id="mdqt"/>
                    </td>
                </tr>
                <tr>
                    <td>5.您希望什么时候入学？</td>
                </tr>
                <tr>
                    <td>
                        <input type="checkbox" value="三天内" name="rx"> 三天内 &nbsp;
                        <input type="checkbox" value="一周内" name="rx"> 一周内 &nbsp;
                        <input type="checkbox" value="半个月" name="rx"> 半个月 &nbsp;
                        <input type="checkbox" value="一个月" name="rx"> 一个月 &nbsp;
                        其他，请注明 <input type="text" style="width:200px; line-height:25px;" value="" id="rxqt"/>
                    </td>
                </tr>
                <tr>
                    <td>6.您期望学习完毕业后，您的工作场所是哪里？</td>
                </tr>
                <tr>
                    <td>
                        <input type="checkbox" value="影楼" name="gzcs"> 影楼 &nbsp;
                        <input type="checkbox" value="工作室" name="gzcs"> 工作室 &nbsp;
                        <input type="checkbox" value="美甲会所" name="gzcs"> 美甲会所 &nbsp;
                        <input type="checkbox" value="美甲店" name="gzcs"> 美甲店 &nbsp;
                        <input type="checkbox" value="剧组" name="gzcs"> 剧组 &nbsp;
                        <input type="checkbox" value="电视" name="gzcs"> 电视 &nbsp;
                        其他，请注明 <input type="text" style="width:200px; line-height:25px;" value="" id="gzcsqt"/>
                    </td>
                </tr>
                <tr>
                    <td>7.您选择我们学校的理由是什么？（可多选）</td>
                </tr>
                <tr>
                    <td>
                        <input type="checkbox" value="知名度" name="ly"> 知名度 &nbsp;
                        <input type="checkbox" value="口碑" name="ly"> 口碑 &nbsp;
                        <input type="checkbox" value="学费" name="ly"> 学费 &nbsp;
                        <input type="checkbox" value="服务" name="ly"> 服务 &nbsp;
                        <input type="checkbox" value="环境" name="ly"> 环境 &nbsp;
                        <input type="checkbox" value="就业方向" name="ly"> 就业方向 &nbsp;
                        <input type="checkbox" value="师资" name="ly"> 师资
                        其他，请注明 <input type="text" style="width:200px; line-height:25px;" value="" id="lyqt"/>
                    </td>
                </tr>
                <tr>
                    <td>下面内容由接待老师填写</td>
                </tr>
                <tr>
                    <td>
                        意向课程 <input type="text" style="width:200px; line-height:25px;" value="" id="yxkc"/>
                        咨询老师 <input type="text" style="width:200px; line-height:25px;" value="" id="zxls"/>
                        咨询日期 <input class="Wdate" type="text" onClick="WdatePicker()"
                                    style="width:200px; line-height:25px;" value="" id="zxrq"/>
                    </td>
                </tr>
                <tr>
                    <td>备注</td>
                </tr>
                <tr>
                    <td><textarea style="width:850px; height:150px;" id="bz"/></textarea></td>
                </tr>
            </table>

            <input class="wh_c5_su1" type="button" value="正式报名" onClick="wh_tanchu(1);"/>
            <input class="wh_c5_su2" type="button" value="意向学员" onClick="wh_tanchu(2);"/>
            <input class="wh_c5_su3" type="button" value="BACK"/>
        </form>
        <div id="mydiv"></div>
    </div>
</div>

<div class="wh_tanchu2">
    <div class="wh_tanchu_1">
        <div class="wt1_t1">该学员已经转为意向学员</div>
        <div class="wt1_t2">请输入下次需要跟进的时间</div>
        下次跟进时间为 <input style="width:110px;" class="Wdate" type="text" onClick="WdatePicker()" value="请选择日期"/><br/>
        <input class="wt1_t3" type="button" value="BACK" onClick="wh_tanchu_close(1);"/>
    </div>
</div>

<div class="wh_tanchu1">
    <div class="wh_tanchu_1">
        <div class="wt1_t1">恭喜您报名成功</div>
        <div class="wt1_t2">您的学号为：<span id="stuId"></span></div>
        接下来您可以&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br/>
        <input class="wt1_t4" type="button" id="toClass" value="选择课程"/>
        <input class="wt1_t4" type="button" id="toProduct" value="选择产品"/>
        <input class="wt1_t4" type="button" id="toDorm" value="选择宿舍"/> <br/>
        <input class="wt1_t3" type="button" value="BACK" onClick="wh_tanchu_close(1);"/>
    </div>
</div>
<script>
    function wh_tanchu(num) {
        var json = tanchu();
        $.post("/register.do?json=" + json, function (data) {
            var jsonObj = eval(data);
            if (jsonObj.data == 'error') {
                alert("出现错误！");
                return;
            }
            $("#stuId").text(jsonObj.data);
            $(".wh_tanchu" + num).show();
        });
    }

    function wh_tanchu_close(num) {
        $(".wh_tanchu" + num).hide();
    }

    function tanchu() {
        var gxqobj = document.getElementsByName('gxq');
        var gxq = '';
        for (var i = 0; i < gxqobj.length; i++) {
            if (gxqobj[i].checked) gxq += gxqobj[i].value + ','; //如果选中，将value添加到变量s中
        }
        if (gxq.length > 0) gxq = gxq.substr(0, gxq.length - 1);
        var sksjobj = document.getElementsByName('sksj');
        var sksj = '';
        for (var i = 0; i < sksjobj.length; i++) {
            if (sksjobj[i].checked)
                sksj += sksjobj[i].value + ','; //如果选中，将value添加到变量s中
        }
        if (sksj.length > 0) sksj = sksj.substr(0, sksj.length - 1);
        var ljobj = document.getElementsByName('lj');
        var lj = '';
        for (var i = 0; i < ljobj.length; i++) {
            if (ljobj[i].checked)
                lj += ljobj[i].value + ','; //如果选中，将value添加到变量s中
        }
        if (lj.length > 0) lj = lj.substr(0, lj.length - 1);
        var mdobj = document.getElementsByName('md');
        var md = '';
        for (var i = 0; i < mdobj.length; i++) {
            if (mdobj[i].checked)
                md += mdobj[i].value + ','; //如果选中，将value添加到变量s中
        }
        if (md.length > 0) md = md.substr(0, md.length - 1);
        var rxobj = document.getElementsByName('rx');
        var rx = '';
        for (var i = 0; i < rxobj.length; i++) {
            if (rxobj[i].checked)
                rx += rxobj[i].value + ','; //如果选中，将value添加到变量s中
        }
        if (rx.length > 0) rx = rx.substr(0, rx.length - 1);
        var gzcsobj = document.getElementsByName('gzcs');
        var gzcs = '';
        for (var i = 0; i < gzcsobj.length; i++) {
            if (gzcsobj[i].checked)
                gzcs += gzcsobj[i].value + ','; //如果选中，将value添加到变量s中
        }
        if (gzcs.length > 0) gzcs = gzcs.substr(0, gzcs.length - 1);
        var lyobj = document.getElementsByName('ly');
        var ly = '';
        for (var i = 0; i < lyobj.length; i++) {
            if (lyobj[i].checked)
                ly += lyobj[i].value + ','; //如果选中，将value添加到变量s中
        }
        if (ly.length > 0) ly = ly.substr(0, ly.length - 1);
        var jsonstr = '{"student":{';
        jsonstr = jsonstr + '"name":"' + $("#name").val() + '","gender":' + $("#sex").val() + ',"age":' + $("#age").val() + ',"phone":' + $("#phone").val();
        jsonstr = jsonstr + ',"qq":"' + $("#qq").val() + '","isWork":"' + $("#zz").val() + '","jobSort":"' + $("input[name='leibie']:checked").val() + ',' + $("#leibieqt").val() + '"' +
                '},"stuInfo":{' + '"clsInterests":"' + gxq + '","clsTimes":"' + sksj + ',' + $("#sksjqt").val() + '"';
        jsonstr = jsonstr + ',"approachs":"' + lj + $("#ljqt").val() + '","learnGoals":"' + md + $("#mdqt").val() + '","learnTimes":"' + rx + $("#rxqt").val() + '","expectations":"'
                + gzcs + $("#gzcsqt").val() + '","reasons":"' + ly + $("#lyqt").val() + '"}' + ',"query":{';
        jsonstr = jsonstr + '"class":"' + $("#yxkc").val() + '","userName":"' + $("#zxls").val() + '","queryDate":"' + $("#zxrq").val() + '","remark":"' + $("#bz").val() + '"}}';
        return jsonstr.replace('undefined', '');
    }
</script>
</body>

</html>