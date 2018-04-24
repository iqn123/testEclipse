<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<style type="text/css">
	div{
		border: solid 1px black;
		text-align:center;
	}
	.top{
		float:left;
		width:100px;
		height:30px;
	}
	.bottom{
		float:left;
		width:200px;
		height:30px;
	}
</style>
</head>
<body>
	<h3>顺风搬家预约查询</h3>
	${info} ${user}
	
		<div id="outer">
			<div class="top">起始地区</div>
			<div class="top">所用车型</div>
			<div class="top">搬家日期</div>
			<div class="top">联系人</div>
			<div class="top">联系电话</div>
			<div class="top">状态</div>
			<div class="top">操作</div>
		</div>
		<div></div>
		<c:forEach items="${info}" var="g">
			<div>
				<div class="bottom">${g.area}</div>
				<div class="bottom">${g.cartype}</div>
				<div class="bottom">${g.movedate}</div>
				<div class="bottom">${g.contact}</div>
				<div class="bottom">${g.phone}</div>
				<div class="bottom">${g.status}</div>
				<div class="bottom" style="width:50px"><a href="doit?id=${g.id}&name=${user.name}&password=${user.password}">处理</a></div>
				<div class="bottom" style="width:50px"><a href="detail?id=${g.id}&name=${user.name}&password=${user.password}">详情</a></div>
			</div>
		</c:forEach>
	
	
</body>
</html>