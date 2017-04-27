<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>questionList</title>
</head>
<body>
	
			<h3 align="center">题目列表</h3>
	
		
		<table style="text-align:center" border="1" cellspacing="0" align="center" width="100%">
			<thead>
				<tr>
					<td>题目id</td>
					<td>试题名称</td>
					<td>试题内容</td>
					<td>发布时间</td>
					<td>操&nbsp;&nbsp;作</td>
				</tr>
			</thead>
			<c:forEach var="question" items="${qlist}" >
			<tr>
				<td>${question.qid}</td>
				<td>${question.qname}</td>
				<td>${question.qcontent}</td>
				<td>${question.qdate}</td>
				<td><a href="question_detail.action?question.qid=${ question.qid}">查询答案</a></td>
			</tr>	
			</c:forEach>
		</table>	
	
</body>
</html>