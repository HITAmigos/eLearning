<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>foodPart</title>
</head>
<body>
	
			<h3 align="center">美食列表</h3>
	
		
		<table style="text-align:center" border="1" cellspacing="0" align="center" width="100%">
			<thead>
				<tr>
					<td>美食id</td>
					<td>美食</td>
					<td>美食信息</td>
					<td>操&nbsp;&nbsp;作</td>
				</tr>
			</thead>
			<c:forEach var="food" items="${flist}" >
			<tr>
				<td rowspan="2">${food.fid}</td>
				<td><img  src="${food.fimg}" width="80" height="80"></td>
				<td rowspan="2">${food.fdescription}</td>
				<td rowspan="2"><a href="food_detail.action?food.fid=${food.fid}">查询</a></td>
			</tr>
			<tr>
				<td>${food.fname}</td>
			</tr>	
			</c:forEach>
		</table>	

</body>
</html>