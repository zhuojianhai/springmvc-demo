<%--
  Created by IntelliJ IDEA.
  User: zjh
  Date: 2020/8/5
  Time: 10:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jsp 语法练习</title>
</head>
<body>
<div>
    <h3>jsp <% %> 代码片段练习</h3>
    <%
        out.println("这是代码片段输出的值");
        out.println("request.getSession "+request.getSession());
        out.println("request.getContextPath"+request.getContextPath());
        out.println("request.getRequestURL"+request.getRequestURL());
        out.println("request.getParameterMap"+request.getParameterMap());

    %>
</div>
</body>
</html>
