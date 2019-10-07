<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%
    pageContext.setAttribute("path", request.getContextPath());
%>
<%@page isELIgnored="false"%>
<!--运行index.jsp代码出现操作前端界面，并且实现按钮点击进入管理界面功能-->
<!DOCTYPE HTML>
<html>
<head>
    <title>首页</title>
    <style type="text/css">  <!--type为属性，其值为testcss，告诉浏览器文本test要用css解析-->
        a {
            text-decoration: none;
            color: black;
            font-size: 18px;
        }

        h3 {
            width: 180px;
            height: 38px;
            margin: 100px auto;
            text-align: center;
            line-height: 38px;
            background: deepskyblue;
            border-radius: 4px;
        }
    </style>
</head>
<body>  <!--标签用于定义网页界面主体-->
<div class="container">  <!--标签用于定义文档中的节，class为其属性-->
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>  <!--标签用于定义HTML最大标题-->
                    基于SSM框架的管理系统：简单实现增、删、改、查。
                </h1>
            </div>
        </div>
    </div>
</div>
<br><br>  <!--标签用于定义简单的折行-->
<h3>  <!--标签用于定义HTML一般大小标题-->
    <a href="${path }/paper/allPaper">点击进入管理页面</a>
    <!--a锚标签用于网页中创建一个文档的链接，href用于定位需要链接的文档；$用于取出名为
    path的变量依次在从Page、Request、Session、 Application范围中查找，此时在本段代码顶部-->
</h3>
</body>
</html>
