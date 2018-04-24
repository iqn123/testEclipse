<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<h3>顺风搬家预约登记</h3>
	<form action="list" method="post">
	起始地区:<select name="area">
			<option value="高新区">高新区</option>
			<option value="青羊区">青羊区</option>
			<option value="成华区">成华区</option>
			<option value="武侯区">武侯区</option>
			<option value="双流区">双流区</option>
		</select><br/>
	所用车型:<input type="radio" name="cartype" value="金杯"/>金杯
			<input type="radio" name="cartype" value="皮卡"/>皮卡
			<input type="radio" name="cartype" value="厢式货车"/>厢式货车
			<br/>
	搬家日期:<input type="text" name="movedate"/><br/>
	联系人:<input type="text" name="contact"/><br/>
	联系电话:<input type="text" name="phone"/><br/>
	<input type="submit" value="预约登记"/> <a href="changeinfo">修改信息</a>
	</form>
</body>
</html>