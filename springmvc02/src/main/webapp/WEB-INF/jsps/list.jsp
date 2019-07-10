<%--
  Created by IntelliJ IDEA.
  User: sunliangliang
  Date: 2019/7/10
  Time: 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<h1>欢迎访问springmvc</h1>
<table border="1">
    <tr>
        <td>姓名</td>
        <td>年龄</td>
        <td>生日</td>
        <td>地址</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${userList }" var="user">
        <tr>
            <td>${user.username }</td>
            <td>${user.age }</td>
            <td>${user.birthday }</td>
            <td>${user.address }</td>
            <td>
                <a href="${pageContext.request.contextPath }/rest/update/${user.id}">修改</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>