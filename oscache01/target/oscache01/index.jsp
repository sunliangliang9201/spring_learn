<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: sunliangliang
  Date: 2019/7/11
  Time: 22:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib prefix="oscache" uri="http://www.opensymphony.com/oscache" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.form/4.2.1/jquery.form.min.js"
            integrity="sha384-tIwI8+qJdZBtYYCKwRkjxBGQVZS3gGozr3CtI+5JF/oL1JmPEHzCEnIKbDbLTCer"
            crossorigin="anonymous"></script>
    <script type="text/javascript"></script>

</head>
<body>
现在时间：<%=new Date()%><br>
<oscache:cache scope="session">
    缓存时间：<%=new Date()%><br>
</oscache:cache>
</body>
</html>