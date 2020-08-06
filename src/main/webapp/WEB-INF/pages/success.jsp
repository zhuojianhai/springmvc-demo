<%--
  Created by IntelliJ IDEA.
  User: zjh
  Date: 2020/7/22
  Time: 15:16
  To change this template use File | Settings | File Templates.
--%>
<%--不能忽略EL表达，否则页面就只是展示标签了--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <style>
        div{
            margin-top: 18px;
        }
    </style>
</head>
<body>
    <div> this is success</div>
    <div>
        <h3>这是requestScope中的内容</h3>

        ${requestScope}
    </div>

    <div>
    <h3>这是sessionScope中的内容</h3>
        ${sessionScope}
    </div>

<div>
    <%
        out.println("通过拦截器跳转成功的页面来了");
    %>
</div>

</body>
</html>
