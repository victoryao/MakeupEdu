<!DOCTYPE HTML>
<html>
<head>
    <title>选课</title>
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
    <h1 class="wh_h1">选课</h1>
    <div style="font-size:14px;text-align:center;padding-bottom:30px;">
        学员姓名：<span id="name">${student.name}</span>&nbsp;&nbsp;&nbsp;学员电话：<span id="phone">${student.phone}</span>&nbsp;&nbsp;&nbsp;学号：<span
            id="id">${student.id}</span></div>
    <div class="wh_sch" style="position:relative;">
        <form action="/teacher/class/list.do">
            <input type="hidden" name="sId" value="${student.id}">
            <select name="classType" style="width:250px;">
                <option value="0" selected>课程类型</option>
                <option value="1">美甲类</option>
                <option value="2">摄影类</option>
                <option value="3">化妆类</option>
                <option value="4">美容类</option>
                <option value="5">美发类</option>
                <option value="6">半永久类</option>
            </select>
            <select name="tId" style="width:250px;">
                <option value="0" selected>授课老师</option>
                <option value="1">老师1</option>
                <option value="老师1">老师2</option>
                <option value="老师1">老师3</option>
                <option value="老师1">老师4</option>
                <option value="老师1">老师5</option>
            </select>
            <select name="classTimeType" style="width:250px;">
                <option value="0" selected>上课时间</option>
                <option value="1">全日制</option>
                <option value="2">晚上</option>
                <option value="3">周末</option>
            </select>
            <input class="wh_su" type="submit" value="筛选"/>
        </form>
        <div class="st"
             style="position:absolute;left:300px;border-radius:10px;top:60px;width:300px;overflow:hidden;background:#fff;border:1px solid #358eec;padding:20px;display:none;overflow:hidden;">
            <div style="text-align:center;">是否确认试听美甲高级班</div>
            <div style="overflow:hidden;width:300px;">
                <div class="qd"
                     style="width:80px;height:35px;line-height:35px;margin-top:20px;text-align:center;background:#358eec;color:#fff;float:left;margin-left:20px;">
                    确定
                </div>
                <div class="qx"
                     style="width:80px;height:35px;line-height:35px;margin-top:20px;text-align:center;background:#eb5e31;color:#fff;float:right;margin-right:20px;">
                    取消
                </div>
            </div>
        </div>

        <div class="bm"
             style="position:absolute;left:300px;border-radius:10px;top:60px;width:600px;overflow:hidden;background:#fff;border:1px solid #358eec;padding:20px;display:none;overflow:hidden;">
            <h1 style="text-align:center;padding-bottom:10px;">课程试听报名</h1>
            <div style="font-size:14px;text-align:center;padding-bottom:30px;">学员姓名：AAA&nbsp;&nbsp;&nbsp;学员电话：13125869875&nbsp;&nbsp;&nbsp;学号：0001</div>
            <div style="font-size:20px;text-align:center;padding-bottom:30px;">您已报名试听美甲类高级班，请确认上课时间并按时上课</div>
            <div class="qd1"
                 style="margin:0 auto;width:80px;height:35px;line-height:35px;margin-top:20px;text-align:center;background:#358eec;color:#fff;">
                确定
            </div>
        </div>

        <div class="bm2"
             style="position:absolute;left:300px;border-radius:10px;top:60px;width:600px;overflow:hidden;background:#fff;border:1px solid #358eec;padding:20px;display:none;overflow:hidden;">
            <h1 style="text-align:center;padding-bottom:10px;">课程报名</h1>
            <div style="font-size:20px;text-align:center;padding-bottom:30px;">您已报名成功，请在收银系统进行付款</div>
            <div class="qd3"
                 style="margin:0 auto;width:80px;height:35px;line-height:35px;margin-top:20px;text-align:center;background:#358eec;color:#fff;">
                确定
            </div>
        </div>
    </div>
    <div class="wh_tab">
        <table cellspacing="0">
            <tr class="wh_t1">
                <td>编号</td>
                <td>课程类型</td>
                <td>课程编号</td>
                <td>课程名称</td>
                <td>课程介绍</td>
                <td>授课老师</td>
                <td>老师介绍</td>
                <td>上课时间</td>
                <td>当前人数/满员人数</td>
                <td>课程费用</td>
                <td>操作</td>
            </tr>
        <#list pageView.records as class>
            <tr>
                <td>${class.id}</td>
                <td>${class.classTypeName}</td>
                <td>${class.cId}</td>
                <td>${class.className}</td>
                <td>${class.classIntro}</td>
                <td>${class.teacherName}</td>
                <td>${class.teacherIntro}</td>
                <td></td>
                <td>${class.curCount}/${class.totalCount}</td>
                <td>${class.fee}</td>
                <td>
                    <a class="wh_ta_1" id="addClassBtn" href="javascript:bm1();" style="margin-right:10px;">报名</a>
                </td>
            </tr>
        </#list>

        </table>
    </div>
    <div class="wh_page"><a href="" class="wh_BACK" style="margin-left:400px;">BACK</a></div>
</div>
<script>
    function st() {
        $(".st").show();
    }
    function bm1() {
        $(".bm1").show();
    }
    $(".qd").click(function () {
        $(".bm").show();
        $(".st").hide();
    });
    $(".qx").click(function () {

        $(".st").hide();
    });
    $(".qd1").click(function () {
        $(".bm").hide();

    });
    $(".qd2").click(function () {

//        $.post("/student/class/add.do", function () {
//
//        });
        $(".bm1").hide();
    });

    $("#addClassBtn").click(function () {
        var $this = $(this);
        var id = $("#id").text();
        var name = $("#name").text();
        var phone = $("#phone").text();
        var tcId = $this.parents("tr").find("td:eq(0)").text();
        var className = $this.parents("tr").find("td:eq(3)").text();
        var json = getJson(id, name, phone, tcId, className);
        $.post("/student/class/add.do?json=" + json, function (data) {
            var json = eval(data);
            alert(json.data);
            $(".bm2").show();
        });


    });
    $(".qd3").click(function () {
        $(".bm2").hide();

    });
    $(".qx2").click(function () {

        $(".bm1").hide();
    });

    function getJson(id, name, phone, tcId, className) {
        return '{"sId":' + id + ',"sName":"' + name + '","sPhone":' + phone + ',"tcId":' + tcId + ',"className":"' + className + '"}';
    }
</script>
</body>

</html>