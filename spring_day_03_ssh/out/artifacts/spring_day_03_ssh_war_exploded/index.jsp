<%--
  Created by IntelliJ IDEA.
  User: sunliangliang
  Date: 2019/7/5
  Time: 13:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/userAction_register" method="post">
  用户名：<input type="text" name="username"/> <br/>
  密码：<input type="password" name="password"/> <br/>
  年龄：<input type="text" name="age"/> <br/>
  <input type="submit" />
</form>
</body>
</html>
