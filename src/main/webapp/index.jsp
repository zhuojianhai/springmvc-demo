<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
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

<div>
    <button id="testmethod" value="测试java重载的方法" ></button>

</div>
<div>
    <button id="testmethod1" value="测试java重载的方法"></button>
</div>

<div>
    <h3>jsp for循环</h3>
    <%!
        /*这里是java的属性的定义**/
        List<String> list = new ArrayList<>();
        int i = 0;

    %>
    <%
        /**这里是java*/
        list.add("100");
        list.add("200");
        list.add("300");
        list.add("400");
        list.add("500");
        list.add("600");
        for ( i=0;i<list.size();i++){%>
         <p> list集合的值为<%=list.get(i) %></p>
    <%   }%>

    <%! int fontSize; %>
    <h3>For 循环实例</h3>
    <%for ( fontSize = 1; fontSize <= 3; fontSize++){ %>
    <font color="green" size="<%= fontSize %>">
        菜鸟教程
    </font><br />
    <%}%>

</div>
<div>
    得力干将了攻击力
</div>

</body>
</html>
