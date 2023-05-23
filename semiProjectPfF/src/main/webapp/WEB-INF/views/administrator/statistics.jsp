<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.boardBox{
 		width: calc(100% - 200px);
		padding: 30px 50px;
    	background: #ffffff;
    	min-height: 950px;
    	float: left;
	}
	.subH3{
		font-size: 1.3em;
    	font-weight: 600;
    	margin-bottom: 30px;
    	padding-bottom: 10px;
    	position: relative;
    	border-bottom: 1px solid lightgray;
	}
	.subH3 span{
		display: inline-block;
    	font-size: 1.1rem;
    	margin-left: 10px;
    	color: #808080;
    	font-weight: 400;
	}
	
	.chartBox{
		border: 1px solid lightgray;
		width: 700px;
		margin: 0 auto;
	}
	
</style>
</head>
<body>
<script>
	if(${loginUser != null}){
		  location.href='${ contextPath }';
	} else if(${loginUser.isAdmin == 'N'}){
		  location.href='${ contextPath }';
	}
</script>
<div class="boardBox">
<h3 class="subH3">통계관리 <span>매출분석</span></h3>
<div class="chartBox">
<%@ include file="numOfPay.jsp" %>
</div>
<br>
<div class="chartBox">
<%@ include file="amountOfPay.jsp" %>
</div>
</div>
</body>
</html>