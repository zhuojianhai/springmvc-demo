<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery-3.4.1.js" ></script>
    <script src="js/index.js" ></script>
    <style>
        div{
            margin-top: 18px;
        }
    </style>
</head>
<body>
<h2>Hello World!</h2>
<a href="hello/welcome">请求成功后，跳转到success.jsp 页面</a>
<div>
    <form action="hello/formsubmit" method="post">
        <input type="text" name="name" placeholder="输入你的姓名"/> <br>
        <input type="text" name="password" placeholder="请输入密码"/><br>

        <input type="submit" value="表单提交">
    </form>
</div>

<div>
    <a href="hello/anno">跳转到anno.jsp页面</a>
</div>
<div>
    <a href="param.jsp">跳转到param.jsp页面</a>
</div>

<div>
    <a href="#" id="ajax">ajax 方式请求页面</a>
</div>

<div>
    <a href="fileupload.jsp" >跳转到文件上传jsp页面</a>
</div>

<div>
    <a href="resp/req" >跳转到响应的response.jsp</a>
</div>

<div>
    <a href="resp/reqvoid" >跳转到响应的response.jsp</a>
</div>

<div>
    <a href="resp/reqdirect" >重定向response.jsp</a>
</div>
<div>
    <a href="resp/reqmodel" >modelAndView 方式跳转到response.jsp</a>
</div>

<script>

</script>
</body>
</html>
