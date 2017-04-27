<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="CSS/tableBook.css" type="text/css"></link>
<title>bookPart</title>
</head>
<body>
	
			<h3 align="center">书籍列表</h3>

		
		<table style="text-align:center" border="1" cellspacing="0" align="center" width="100%" class="gridtable">
			<thead>
				<tr>
					<td>书籍id</td>
					<td>书籍</td>
					<td>作者</td>
					<td>书籍信息</td>
					<td>操&nbsp;&nbsp;作</td>
				</tr>
			</thead>
			<c:forEach var="book" items="${blist}" >
			<tr>
				<td rowspan="2">${book.bid}</td>
				<td><img  src="${book.bimg}" width="80" height="80"></td>
				<td rowspan="2">${book.author}</td>
				<td rowspan="2">${book.bdescription}</td>
				<td rowspan="2"><a href="${book.address} " target="_blank">购买</a></td>
			</tr>
			<tr>
				<td>${book.bname},￥${book.price}</td>
			</tr>	
			</c:forEach>
		</table>	

</body>
</html>