<!DOCTYPE HTML>
<html>
<head>
    <title>首页-登录页面</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <script language="javascript" src="/js/jquery.js"></script>
    <link rel="stylesheet" type="text/css" href="/css/style.css"/>
    <style>
        body {
            background: url(/images/bg.jpg) top center;
        }
    </style>

    <script>
        $(function(){
            $('.wh_lg').click(function(){
                var userName=$('input[name="userName"]').val();
                var password=$('input[name="password"]').val();
                if(userName=="请输入用户名"){
                    alert('请输入用户名！');
                    return false;
                }
                if(password=="请输入密码"){
                    alert('请输入密码');
                    return false;
                }
            });

        });
    </script>
</head>

<body>
<div class="wh_logo"><img src="images/logo.png" width="180"/></div>
<div class="wh_login">
    <img style="padding:30px 0;" src="images/logo_n.png" width="450"/>
    <form action="/user/login.do" method="post">
        <input type="text" value="请输入用户名" onfocus="if (this.value=='请输入用户名') this.value=''"
               onblur="if (this.value==''){this.value='请输入用户名'}" id="userName" name="userName"/>
        <input type="password" value="请输入密码" onfocus="if (this.value=='请输入密码') this.value=''"
               onblur="if (this.value==''){this.value='请输入密码'}" id="password" name="password"/>
        <input class="wh_lg" type="submit" value="立即登录"/>
    </form>
</div>
</body>

</html>