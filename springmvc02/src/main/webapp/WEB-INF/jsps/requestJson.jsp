<%--
  Created by IntelliJ IDEA.
  User: sunliangliang
  Date: 2019/7/10
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<%--    <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.form.js"/>--%>
    <script type="text/javascript">

        function requestJson(){
            var jsonUser = JSON.stringify({"username":"孙亮亮", "age":"27", "address":"回龙观"})
            $.ajax({
                type:'post',
                url:'${pageContext.request.contextPath }/requestJson.do',
                contentType:'application/json;charset=utf-8',
                data:jsonUser,
                success:function (data) {
                    alert(data);
                }
            })
        }

        function requestPojo(){
            $.ajax({
                type:'post',
                url:'${pageContext.request.contextPath }/requestPojo.do',
                data:'username=孙亮亮&age=123&address=北京',
                success:function (data) {
                    alert(data);
                }
            })
        }
    </script>
</head>

<body>
<input type="button" value="请求json，返回json" onclick="requestJson();">
<input type="button" value="请求POJO，返回json" onclick="requestPojo();">
</body>
</html>