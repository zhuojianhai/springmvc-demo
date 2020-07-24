<%--
  Created by IntelliJ IDEA.
  User: zjh
  Date: 2020/7/24
  Time: 9:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
    <style>
        div{
            margin-top: 18px;
        }
    </style>
</head>
<body>
    <h3>传统方式上传文件</h3>
    <form action="file/upload1" method="post" enctype="multipart/form-data">
        选择文件：<input type="file" name="upload"/><br>
        <input type="submit" value="开始上传">
    </form>

    <div>
        <h3>springmvc方式上传文件</h3>
        <form action="file/upload2" method="post" enctype="multipart/form-data">
            选择文件：<input type="file" name="upload"/><br>
            <input type="submit" value="开始上传">
        </form>
    </div>
</body>
</html>
