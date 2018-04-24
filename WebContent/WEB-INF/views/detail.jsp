<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	${info } ${user }
	<h3>顺风搬家预约登记</h3>
	起始地区:${info.area }<br/>
	所用车型:${info.cartype }<br/>
	搬家日期:${info.movedate }<br/>
	联系人:${info.contact }<br/>
	联系电话:${info.phone }<br/>
	状态:${info.status }<br/>
	<a href="login?name=${user.name}&password=${user.password}">返回</a>
</body>
</html>