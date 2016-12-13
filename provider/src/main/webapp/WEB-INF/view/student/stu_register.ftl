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
                    <td>姓名 <input type="text" style="width:140px; line-height:25px;" value=""/> &nbsp;&nbsp;性别 <select
                            style="line-height:25px;">
                        <option value="男">男</option>
                        <option value="女">女</option>
                    </select> &nbsp;&nbsp;年龄 <input type="text" style="width:40px; line-height:25px;" value=""/> &nbsp;&nbsp;联系电话
                        <input type="text" style="width:140px; line-height:25px;" value=""/> &nbsp;&nbsp;QQ号 <input
                                type="text" style="width:140px; line-height:25px;" value=""/></td>
                </tr>
                <tr>
                    <td>在职 <select style="line-height:25px;">
                        <option value="是">是</option>
                        <option value="否">否</option>
                    </select> &nbsp;&nbsp;职业类别 <input type="radio" name="leibie" value="职员"> 职员 <input type="radio"
                                                                                                       name="leibie"
                                                                                                       value="销售"> 销售
                        <input type="radio" name="leibie" value="学生"> 学生 <input type="radio" name="leibie" value="工人">工人
                        <input type="radio" name="leibie" value="自由职业"> 自由职业 其他，请注明 <input type="text"
                                                                                           style="width:140px; line-height:25px;"
                                                                                           value=""/></td>
                </tr>
                <tr>
                    <td>1.您对哪些课程感兴趣？（可多选）</td>
                </tr>
                <tr>
                    <td>
                        <input type="checkbox" value="美甲类"> 美甲类 &nbsp;
                        <input type="checkbox" value="摄影类"> 摄影类 &nbsp;
                        <input type="checkbox" value="化妆类"> 化妆类 &nbsp;
                        <input type="checkbox" value="美容类"> 美容类 &nbsp;
                        <input type="checkbox" value="美发类"> 美发类 &nbsp;
                        <input type="checkbox" value="半永久类"> 半永久类
                    </td>
                </tr>
                <tr>
                    <td>2.您想利用什么时间上课？</td>
                </tr>
                <tr>
                    <td>
                        <input type="checkbox" value="全日制"> 全日制 &nbsp;
                        <input type="checkbox" value="晚上"> 晚上 &nbsp;
                        <input type="checkbox" value="周末"> 周末 &nbsp;
                        其他，请注明 <input type="text" style="width:200px; line-height:25px;" value=""/>
                    </td>
                </tr>
                <tr>
                    <td>3.您是通过以下哪个渠道了解到我们学校？</td>
                </tr>
                <tr>
                    <td>
                        <input type="checkbox" value="网络"> 网络 &nbsp;
                        <input type="checkbox" value="宣传单"> 宣传单 &nbsp;
                        <input type="checkbox" value="活动现场"> 活动现场 &nbsp;
                        <input type="checkbox" value="亲友介绍"> 亲友介绍 &nbsp;
                        <input type="checkbox" value="户外广告"> 户外广告 &nbsp;
                        其他，请注明 <input type="text" style="width:200px; line-height:25px;" value=""/>
                    </td>
                </tr>
                <tr>
                    <td>4.您学习的主要目的是什么？</td>
                </tr>
                <tr>
                    <td>
                        <input type="checkbox" value="职业需要"> 职业需要 &nbsp;
                        <input type="checkbox" value="兴趣爱好"> 兴趣爱好 &nbsp;
                        <input type="checkbox" value="自营开店"> 自营开店 &nbsp;
                        其他，请注明 <input type="text" style="width:200px; line-height:25px;" value=""/>
                    </td>
                </tr>
                <tr>
                    <td>5.您希望什么时候入学？</td>
                </tr>
                <tr>
                    <td>
                        <input type="checkbox" value="三天内"> 三天内 &nbsp;
                        <input type="checkbox" value="一周内"> 一周内 &nbsp;
                        <input type="checkbox" value="半个月"> 半个月 &nbsp;
                        <input type="checkbox" value="一个月"> 一个月 &nbsp;
                        其他，请注明 <input type="text" style="width:200px; line-height:25px;" value=""/>
                    </td>
                </tr>
                <tr>
                    <td>6.您期望学习完毕业后，您的工作场所是哪里？</td>
                </tr>
                <tr>
                    <td>
                        <input type="checkbox" value="影楼"> 影楼 &nbsp;
                        <input type="checkbox" value="工作室"> 工作室 &nbsp;
                        <input type="checkbox" value="美甲会所"> 美甲会所 &nbsp;
                        <input type="checkbox" value="美甲店"> 美甲店 &nbsp;
                        <input type="checkbox" value="剧组"> 剧组 &nbsp;
                        <input type="checkbox" value="电视"> 电视 &nbsp;
                        其他，请注明 <input type="text" style="width:200px; line-height:25px;" value=""/>
                    </td>
                </tr>
                <tr>
                    <td>7.您选择我们学校的理由是什么？（可多选）</td>
                </tr>
                <tr>
                    <td>
                        <input type="checkbox" value="知名度"> 知名度 &nbsp;
                        <input type="checkbox" value="口碑"> 口碑 &nbsp;
                        <input type="checkbox" value="学费"> 学费 &nbsp;
                        <input type="checkbox" value="服务"> 服务 &nbsp;
                        <input type="checkbox" value="环境"> 环境 &nbsp;
                        <input type="checkbox" value="就业方向"> 就业方向 &nbsp;
                        <input type="checkbox" value="师资"> 师资
                        其他，请注明 <input type="text" style="width:200px; line-height:25px;" value=""/>
                    </td>
                </tr>
                <tr>
                    <td>下面内容由接待老师填写</td>
                </tr>
                <tr>
                    <td>
                        意向课程 <input type="text" style="width:200px; line-height:25px;" value=""/>
                        咨询老师 <input type="text" style="width:200px; line-height:25px;" value=""/>
                        咨询日期 <input class="Wdate" type="text" onClick="WdatePicker()"
                                    style="width:200px; line-height:25px;" value=""/>
                    </td>
                </tr>
                <tr>
                    <td>备注</td>
                </tr>
                <tr>
                    <td><textarea style="width:850px; height:150px;"></textarea></td>
                </tr>
            </table>

            <input class="wh_c5_su1" type="button" value="正式报名" onClick="wh_tanchu(2);"/>
            <input class="wh_c5_su2" type="button" value="意向学员" onClick="wh_tanchu(1);"/>
            <input class="wh_c5_su3" type="button" value="BACK"/>
        </form>
    </div>
</div>

<div class="wh_tanchu1">
    <div class="wh_tanchu_1">
        <div class="wt1_t1">该学员已经转为意向学员</div>
        <div class="wt1_t2">请输入下次需要跟进的时间</div>
        下次跟进时间为 <input style="width:110px;" class="Wdate" type="text" onClick="WdatePicker()" value="请选择日期"/><br/>
        <input class="wt1_t3" type="button" value="BACK" onClick="wh_tanchu_close(1);"/>
    </div>
</div>

<div class="wh_tanchu2">
    <div class="wh_tanchu_1">
        <div class="wt1_t1">恭喜您报名成功</div>
        <div class="wt1_t2">您的学号为：XXXXXXXXXX</div>
        接下来您可以&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br/>
        <input class="wt1_t4" type="button" value="选择课程"/>
        <input class="wt1_t4" type="button" value="选择产品"/>
        <input class="wt1_t4" type="button" value="选择宿舍"/> <br/>
        <input class="wt1_t3" type="button" value="BACK" onClick="wh_tanchu_close(2);"/>
    </div>
</div>
<script>
    function wh_tanchu(num) {
        $(".wh_tanchu" + num).show();
    }

    function wh_tanchu_close(num) {
        $(".wh_tanchu" + num).hide();
    }
</script>
</body>

</html>