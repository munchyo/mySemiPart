<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>Home</title>
<script src="http://code.jquery.com/jquery-3.6.4.min.js"></script>
</head>
<body>
<c:set value="${ pageContext.servletContext.contextPath }" var="contextPath" scope="application"/>
	
	<a href="${ contextPath }/loginView.me"><button>로그인</button></a>
</body>
</html>
