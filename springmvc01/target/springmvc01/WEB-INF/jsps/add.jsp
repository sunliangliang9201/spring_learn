<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/command.do">
    姓名：<input type="text" name="username" id="username">
    年龄：<input type="text" name="age" id="age">
    生日：<input type="text" name="birthday" id="birthday">
    地址：<input type="text" name="address" id="address">
    <input type="submit" value="提交">
</form>
</body>
</html>
