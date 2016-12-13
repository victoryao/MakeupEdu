<!DOCTYPE HTML>
<html>
<head>
    <title>5.3住宿安排</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link rel="stylesheet" type="text/css" href="css/style.css"/>
    <script language="javascript" src="css/jquery.js"></script>
    <script>
        $(document).ready(function () {
            $(".wh_tab tr:even").addClass('even');
        });
    </script>
</head>

<body>
<div class="wh_top">
    <div class="wht_left"><img src="images/logo_li.png"/></div>
    <div class="wht_right">用户名: admin <a href="">注销</a></div>
</div>
<div class="wh_content1">
    <h1 class="wh_h1">住宿安排</h1>
    <div class="wh_sch">
        <form>
            <input type="text" value="请输入学生学号" name="xuehao" onFocus="if (this.value=='请输入学生学号') this.value=''"
                   onBlur="if (this.value==''){this.value='请输入学生学号'}"/>
            <input type="text" value="请输入学生姓名" name="xingming" onFocus="if (this.value=='请输入学生姓名') this.value=''"
                   onBlur="if (this.value==''){this.value='请输入学生姓名'}"/>
            <input type="text" value="请输入学生电话" name="phone" onFocus="if (this.value=='请输入学生电话') this.value=''"
                   onBlur="if (this.value==''){this.value='请输入学生电话'}"/>
            <select>
                <option value="住宿状态" selected>住宿状态</option>
                <option value="未安排">未安排</option>
                <option value="已安排">已安排</option>
            </select>
            <input class="wh_su" type="submit" value="查询"/>
        </form>
    </div>
    <div class="wh_tab">
        <table cellspacing="0">
            <tr class="wh_t1">
                <td>编号</td>
                <td>学号</td>
                <td>学员姓名</td>
                <td>学员联系方式</td>
                <td>住宿状态</td>
                <td>宿舍号</td>
                <td>操作</td>
            </tr>
            <tr>
                <td>1</td>
                <td>888</td>
                <td>我遇风</td>
                <td>15555665566</td>
                <td>未安排</td>
                <td>空</td>
                <td><a class="wh_ta_1" href="" style="margin-right:10px;">入住</a><a class="wh_ta_1" href=""
                                                                                   style="margin-right:10px;border:1px solid #eb5e31;color:#eb5e31;">调换</a><a
                        class="wh_ta_1" href="" style="margin-right:10px;border:1px solid #eb5e31;color:#eb5e31;">退宿</a>
                </td>
            </tr>
            <tr>
                <td>1</td>
                <td>888</td>
                <td>我遇风</td>
                <td>15555665566</td>
                <td>未安排</td>
                <td>空</td>
                <td><a class="wh_ta_1" href="" style="margin-right:10px;">入住</a><a class="wh_ta_1" href=""
                                                                                   style="margin-right:10px;border:1px solid #eb5e31;color:#eb5e31;">调换</a><a
                        class="wh_ta_1" href="" style="margin-right:10px;border:1px solid #eb5e31;color:#eb5e31;">退宿</a>
                </td>
            </tr>
            <tr>
                <td>1</td>
                <td>888</td>
                <td>我遇风</td>
                <td>15555665566</td>
                <td>已安排</td>
                <td>A001</td>
                <td><a class="wh_ta_1" href=""
                       style="margin-right:10px;border:1px solid #eb5e31;color:#eb5e31;">入住</a><a class="wh_ta_1"
                                                                                                  href=""
                                                                                                  style="margin-right:10px;">调换</a><a
                        class="wh_ta_1" href="" style="margin-right:10px;">退宿</a></td>
            </tr>
            <tr>
                <td>1</td>
                <td>888</td>
                <td>我遇风</td>
                <td>15555665566</td>
                <td>已安排</td>
                <td>B001</td>
                <td><a class="wh_ta_1" href=""
                       style="margin-right:10px;border:1px solid #eb5e31;color:#eb5e31;">入住</a><a class="wh_ta_1"
                                                                                                  href=""
                                                                                                  style="margin-right:10px;">调换</a><a
                        class="wh_ta_1" href="" style="margin-right:10px;">退宿</a></td>
            </tr>
        </table>
    </div>
    <div class="wh_page"><a href="">上一页</a><a href="">1</a><a href="" class="hover">2</a><a href="">下一页</a><a href=""
                                                                                                              class="wh_BACK">BACK</a>
    </div>
</div>
<script>
    $(function () {

        $('.wh_su').click(function () {


            var xing = $('input[name="xingming"]').val();
            var phone = $('input[name="phone"]').val();
            var xuehao = $('input[name="xuehao"]').val();

            if (xuehao == "请输入学生学号") {
                alert('请输入学生学号');
                return false;
            }

            if (xing == "请输入学生姓名") {
                alert('请输入学生姓名！');
                return false;
            }


            if (phone == "请输入学生电话") {
                alert('请输入学生电话');
                return false;
            }


        });

    });
</script>

</body>

</html>