<%--
  Created by IntelliJ IDEA.
  User: wangfeng
  Date: 16/02/2017
  Time: 23:26
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Arrays" %>
<%@page import="com.wangfengbabe.*" %>


<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>el expression</title>
</head>

<body>
<%
    List<User> users = Arrays.asList(new User("zhaochi"), new User("wangfeng"));
    for (int i = 0; i < users.size(); i++) {
        session.setAttribute("user", users.get(i));
%>
${sessionScope.user["name"] }
${sessionScope.user.name}

<%
    }
%>


<%--
    与范围有关的EL 隐含对象包含以下四个：pageScope、requestScope、sessionScope 和applicationScope；
 --%>

</body>
</html>