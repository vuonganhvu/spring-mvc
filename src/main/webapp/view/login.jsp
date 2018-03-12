<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/12/2018
  Time: 4:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<html>
<html>
<head>
    <title>Login</title>
</head>
<body>
 <div align="center">
     <c:if test="${param['error']}">User name and password is not correct!</c:if>
     <%--@elvariable id="user" type="com.higgsup.model.User"--%>
     <form:form action="dashboard" method="post" modelAttribute="user">
         <table>
             <tr>
                 <td><form:label path="username">UserName</form:label></td>
                 <td><form:input path="username" name="username2" id="username2"/></td>
             </tr>
             <tr>
                 <td><form:label path="password">Password</form:label></td>
                 <td><form:input path="password" name="password" id="password"/></td>
             </tr>
             <tr>
                 <td></td>
                 <td>
                     <form:button name="login" id="login">Login</form:button>
                 </td>
             </tr>
         </table>
     </form:form>
 </div>
</body>
</html>
