<!DOCTYPE HTML>
<html>
<head>
    <title>课程安排</title>
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
    <h1 class="wh_h1">课程安排</h1>
    <div class="wh_sch">
        <form>
            <input type="text" value="请输入学生学号" name="id" onFocus="if (this.value=='请输入学生学号') this.value=''"
                   onBlur="if (this.value==''){this.value='请输入学生学号'}"/>
            <input type="text" value="请输入学生姓名" name="name" onFocus="if (this.value=='请输入学生姓名') this.value=''"
                   onBlur="if (this.value==''){this.value='请输入学生姓名'}"/>
            <input type="text" value="请输入学生电话" name="phone" onFocus="if (this.value=='请输入学生电话') this.value=''"
                   onBlur="if (this.value==''){this.value='请输入学生电话'}"/>
            <select>
                <option value="课程状态" selected>课程状态</option>
                <option value="未选课未试听">未选课未试听</option>
                <option value="未选课已试听">未选课未试听</option>
                <option value="已选课">已选课</option>
                <option value="已毕业">已毕业</option>
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
                <td>课程状态</td>
                <td>课程名称</td>
                <td>操作</td>
            </tr>
            <tr>
                <td>1</td>
                <td>888</td>
                <td>我遇风</td>
                <td>15555665566</td>
                <td>未选课未试听</td>
                <td>空</td>
                <td><a class="wh_ta_1" href="" style="margin-right:10px;">选班</a><a class="wh_ta_1" href=""
                                                                                   style="margin-right:10px;border:1px solid #eb5e31;color:#eb5e31;">升班</a><a
                        class="wh_ta_1" href="" style="margin-right:10px;border:1px solid #eb5e31;color:#eb5e31;">转班</a><a
                        class="wh_ta_1" href="" style="margin-right:10px;border:1px solid #eb5e31;color:#eb5e31;">结课</a>
                </td>
            </tr>
            <tr>
                <td>1</td>
                <td>888</td>
                <td>我遇风</td>
                <td>15555665566</td>
                <td>未选课已试听</td>
                <td>空</td>
                <td><a class="wh_ta_1" href="" style="margin-right:10px;">选班</a><a class="wh_ta_1" href=""
                                                                                   style="margin-right:10px;border:1px solid #eb5e31;color:#eb5e31;">升班</a><a
                        class="wh_ta_1" href="" style="margin-right:10px;border:1px solid #eb5e31;color:#eb5e31;">转班</a><a
                        class="wh_ta_1" href="" style="margin-right:10px;border:1px solid #eb5e31;color:#eb5e31;">结课</a>
                </td>
            </tr>
            <tr>
                <td>1</td>
                <td>888</td>
                <td>我遇风</td>
                <td>15555665566</td>
                <td>未选课</td>
                <td>空</td>
                <td><a class="wh_ta_1" href="" style="margin-right:10px;">选班</a><a class="wh_ta_1" href=""
                                                                                   style="margin-right:10px;border:1px solid #eb5e31;color:#eb5e31;">升班</a><a
                        class="wh_ta_1" href="" style="margin-right:10px;border:1px solid #eb5e31;color:#eb5e31;">转班</a><a
                        class="wh_ta_1" href="" style="margin-right:10px;border:1px solid #eb5e31;color:#eb5e31;">结课</a>
                </td>
            </tr>
            <tr>
                <td>1</td>
                <td>888</td>
                <td>我遇风</td>
                <td>15555665566</td>
                <td>已选课</td>
                <td>美甲初级课</td>
                <td><a class="wh_ta_1" href=""
                       style="margin-right:10px;border:1px solid #eb5e31;color:#eb5e31;">选班</a><a class="wh_ta_1"
                                                                                                  href=""
                                                                                                  style="margin-right:10px;">升班</a><a
                        class="wh_ta_1" href="" style="margin-right:10px;">转班</a><a class="wh_ta_1" href=""
                                                                                    style="margin-right:10px;">结课</a>
                </td>
            </tr>
            <tr>
                <td>1</td>
                <td>888</td>
                <td>我遇风</td>
                <td>15555665566</td>
                <td>已选课</td>
                <td>美甲高级课</td>
                <td><a class="wh_ta_1" href=""
                       style="margin-right:10px;border:1px solid #eb5e31;color:#eb5e31;">选班</a><a class="wh_ta_1"
                                                                                                  href=""
                                                                                                  style="margin-right:10px;">升班</a><a
                        class="wh_ta_1" href="" style="margin-right:10px;">转班</a><a class="wh_ta_1" href=""
                                                                                    style="margin-right:10px;">结课</a>
                </td>
            </tr>
            <tr>
                <td>1</td>
                <td>888</td>
                <td>我遇风</td>
                <td>15555665566</td>
                <td>已毕业</td>
                <td>半永久</td>
                <td><a class="wh_ta_1" href=""
                       style="margin-right:10px;border:1px solid #eb5e31;color:#eb5e31;">选班</a><a class="wh_ta_1"
                                                                                                  href=""
                                                                                                  style="margin-right:10px;border:1px solid #eb5e31;color:#eb5e31;">升班</a><a
                        class="wh_ta_1" href="" style="margin-right:10px;border:1px solid #eb5e31;color:#eb5e31;">转班</a><a
                        class="wh_ta_1" href="" style="margin-right:10px;border:1px solid #eb5e31;color:#eb5e31;">结课</a>
                </td>
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