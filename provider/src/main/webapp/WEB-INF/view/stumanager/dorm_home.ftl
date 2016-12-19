<!DOCTYPE HTML>
<html>
<head>
    <title>住宿安排</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link rel="stylesheet" type="text/css" href="/css/style.css"/>
    <script language="javascript" src="/js/jquery.js"></script>
    <script>
        $(document).ready(function () {
            $(".wh_tab tr:even").addClass('even');
        });

        //到指定的分页页面
        function topage(page) {
            var form = document.forms[0];
            form.page.value = page;
            form.submit();
        }

    </script>
</head>

<body>
<div class="wh_top">
    <div class="wht_left"><img src="/images/logo_li.png"/></div>
    <div class="wht_right">用户名: admin <a href="">注销</a></div>
</div>
<div class="wh_content1">
    <h1 class="wh_h1">住宿安排</h1>
    <form action="/student/manager/dorm/home.do">
        <div class="wh_sch">
            <form>
                <input type="hidden" name="page" id="page"/>
                <input type="text" value="请输入学生学号" name="id" onFocus="if (this.value=='请输入学生学号') this.value=''"
                       onBlur="if (this.value==''){this.value='请输入学生学号'}"/>
                <input type="text" value="请输入学生姓名" name="name" onFocus="if (this.value=='请输入学生姓名') this.value=''"
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
                    <td>学号</td>
                    <td>学员姓名</td>
                    <td>学员联系方式</td>
                    <td>住宿状态</td>
                    <td>宿舍号</td>
                    <td>操作</td>
                </tr>
            <#list pageView.records as student>
                <tr>
                    <td>${student.id}</td>
                    <td>${student.name}</td>
                    <td>${student.phone}</td>
                    <td>
                        <#if (student.dormStatus == 0)!>
                            未安排
                        </#if>
                        <#if (student.dormStatus == 1)!>
                            已安排
                        </#if>
                    </td>
                    <td>
                    ${student.dormId}
                    </td>
                    <td><a class="wh_ta_1" href="/student/manager/dorm/list.do?sId=${student.id}&type=add" style="margin-right:10px;">入住</a>
                        <a class="wh_ta_1" href="/student/manager/dorm/list.do?sId=${student.id}&type=exchange" style="margin-right:10px;border:1px solid #eb5e31;color:#eb5e31;">调换</a>
                        <a class="wh_ta_1" href="/student/manager/dorm/list.do?sId=${student.id}&type=cancel" style="margin-right:10px;border:1px solid #eb5e31;color:#eb5e31;">退宿</a>
                    </td>
                </tr>
            </#list>
            </table>
        </div>
    <#include "../../share/paging.ftl" >
    </form>
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