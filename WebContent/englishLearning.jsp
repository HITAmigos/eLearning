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
	
			<h3 align="center">招聘列表</h3>

		
		<table style="text-align:center" border="1" cellspacing="0" align="center" width="100%">
			<thead>
				<tr>
					<td>英语id</td>
					<td>英语名称</td>
					<td>英语内容</td>
					<td>发布时间</td>
					<td>操&nbsp;&nbsp;作</td>
				</tr>
			</thead>
			<c:forEach var="english" items="${elist}" >
			<tr>
				<td>${english.eid}</td>
				<td>${english.ename}</td>
				<td>${english.econtent}</td>
				<td>${english.edate}</td>
				<td><a href="englishLearning_detail.action?english.eid=${ english.eid}">查询</a></td>
			</tr>	
			</c:forEach>
		</table>	

		
</body>
</html>