<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<form action="${pageContext.request.contextPath }/recieveUser.do" method="post">--%>
<%--    姓名：<input type="text" name="username" id="username">--%>
<%--    年龄：<input type="text" name="age" id="age">--%>
<%--    生日：<input type="text" name="birthday" id="birthday">--%>
<%--    地址：<input type="text" name="address" id="address">--%>
<%--    <input type="submit" value="提交">--%>
<%--</form>--%>
<hr color="blue" size="12">
<form action="${pageContext.request.contextPath }/recieveInt.do" method="post">
    姓名：<input type="text" name="id" id="id">
    <input type="submit" value="提交">
</form>
<hr color="blue" size="12">
<form action="${pageContext.request.contextPath }/recieveString.do" method="post">
    姓名：<input type="text" name="name" id="name">
    <input type="submit" value="提交">
</form>
<hr color="blue" size="12">
<%--<form action="${pageContext.request.contextPath }/recieveUserCustom.do" method="post">--%>
<%--    姓名：<input type="text" name="user.username" id="username">--%>
<%--    年龄：<input type="text" name="user.age" id="age">--%>
<%--    生日：<input type="text" name="user.birthday" id="birthday">--%>
<%--    地址：<input type="text" name="user.address" id="address">--%>
<%--    <input type="submit" value="提交">--%>
<%--</form>--%>
<hr color="blue" size="12">
<%--<form action="${pageContext.request.contextPath }/recieveArray.do" method="post">--%>
<%--    ID:<input type="checkbox" name="ids" id="ids" value="1">--%>
<%--    ID:<input type="checkbox" name="ids" id="ids" value="2">--%>
<%--    ID:<input type="checkbox" name="ids" id="ids" value="3">--%>
<%--    ID:<input type="checkbox" name="ids" id="ids" value="4">--%>
<%--    <input type="submit" value="提交">--%>
<%--</form>--%>
<%--<hr color="blue" size="12">--%>
<%--<form action="${pageContext.request.contextPath }/recieveUserCustomList.do" method="post">--%>
<%--        姓名：<input type="text" name="userList[0].username" id="username">--%>
<%--        年龄：<input type="text" name="userList[0].age" id="age">--%>
<%--    姓名：<input type="text" name="userList[1].username" id="username">--%>
<%--    年龄：<input type="text" name="userList[1].age" id="age">--%>
<%--    <input type="submit" value="提交">--%>
<%--</form>--%>
<hr color="blue" size="12">
<form action="${pageContext.request.contextPath }/recieveUserCustomMap.do" method="post">
    姓名：<input type="text" name="maps['username']" id="username">
    年龄：<input type="text" name="maps['age']" id="age">
    <input type="submit" value="提交">
</form>
</body>
</html>
