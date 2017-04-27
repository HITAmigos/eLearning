<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	
			<h3 align="center">网站列表</h3>
		
		
		<table style="text-align:center" border="1" cellspacing="0" align="center" width="100%">
			<thead>
				<tr>
					<td>网站id</td>
					<td>网站名称</td>
					<td>网站描述</td>
					<td>操&nbsp;&nbsp;作</td>
				</tr>
			</thead>
			<c:forEach var="studyWeb" items="${wlist}" >
			<tr>
				<td>${studyWeb.wid}</td>
				<td>${studyWeb.wname}</td>
				<td>${studyWeb.wdescription}</td>
				<td><a href="${studyWeb.waddress}" target="_blank">进入网站</a></td>
			</tr>	
			</c:forEach>
		</table>	

</body>
</html>