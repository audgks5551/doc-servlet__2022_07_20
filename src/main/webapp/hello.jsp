<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
    <c:if test="${hello}" >
        이름은 ${name} 입니다.<br>
        ${name}이 ${action} 갑니다.<br>
    </c:if>
</body>
</html>