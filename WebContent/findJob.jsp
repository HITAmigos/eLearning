<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="CSS/table.css" type="text/css"></link>
<!-- 引入css文件，不限顺序 -->
    <link rel="stylesheet" href="themes/default/easyui.css" type="text/css"></link>
    <link rel="stylesheet" href="themes/icon.css" type="text/css"></link>
  
  	<!-- 引入js文件，有顺序限制 -->
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/jquery.easyui.min.js"></script>
<script type="text/javascript"> 
	function doSearch(){
	alert("123");
	var search = jQuery("#search").val();
	alert(search);
	$("form").submit();
	}
	
	
	function doAdd(){
		jQuery("#mergeForm").form("clear");
		jQuery("#pageTemplet").val("normal");
		jQuery('#merge-dialog').dialog({
			title : '添加'
		}).dialog('open');
	}
	
	
		
		jQuery('#merge-dialog').dialog({
			width : 366,
			height : 180,
			modal : true,
			collapsible : true,
			maximizable : true,
			closed : true,
			buttons : [ {
				text : '保存',
				iconCls : 'icon-erpbaocun',
				handler : function() {
					saveBut();
				}
			}, {
				text : '关闭',
				iconCls : 'icon-erpexit',
				handler : function() {
					jQuery('#merge-dialog').dialog('close');
				}
			} ]
		});
	
	

	
	function saveBut() {
		if (jQuery('#mergeForm').form('validate') == true) {
			jQuery("#mergeForm").submit();
		}
	}
</script>
<title>findJob</title>
</head>
<body>
	
	<form action="${pageContext.request.contextPath}/findJob_find.action " method="post">
	<!-- 增删改查 -->
	<div>
		工作名：
		<input  id = "search" name="search"  type="text"/>&nbsp;&nbsp;&nbsp;
		<input  id = "find"   name="find" 	 type="button" value="搜索" onclick="doSearch()" />&nbsp;&nbsp;&nbsp;
		<input  id = "add"    name="add" 	 type="button" value="增加" onclick="doAdd()"/>&nbsp;&nbsp;&nbsp;
		<input  id = "del"    name="del" 	 type="button" value="删除" />&nbsp;&nbsp;&nbsp;
			
	</div>
	<script type="text/javascript">
		
	
		function add(){
			var type = ${user.type};
			if(type==0)
			document.getElementById("add").style.display="none";
			}
		function del(){
			var type = ${user.type};
			if(type==0)
			document.getElementById("del").style.display="none";
			}
		function update(){
			var type = ${user.type};
			if(type==0)
			document.getElementById("update").style.display="none";
			}
		add();
		del();
		update();
	</script>

			<h3 align="center">招聘列表</h3>
			
		
		<table style="text-align:center" border="1" cellspacing="0" align="center" width="100%" class="hovertable">
			<thead>
				<tr>
					<td>选择</td>
					<td>序号</td>
					<td>工作名称</td>
					<td>发布时间</td>
					<td>操作</td>
				</tr>
			</thead>
			<c:forEach var="job" items="${list}" >
			<tr onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">
				<td><input id=${ job.jid } name="choose" type="checkbox"/></td>
				<td>${job.jid}</td>
				<td><a href="findJob_detail.action?job.jid=${job.jid }">${job.jname}</a></td>
				<td>${job.jdate}</td>
				<td>修改</td>
			</tr>	
			</c:forEach>
		</table>	
	</form>	
		
	<div id="merge-dialog" class="easyui-dialog" style="padding: 10px 20px">
		<form id="mergeForm" method="post"
			action="${contextPath}/web/grop/cpmn/cpmnadd.do"
			style="width: 100%; height: 100%;">
			<input id="cId" name="id" type="hidden">
			<div class="fitem">
				<label>公司名称:</label> <input id="cname" name="cname"
					class="easyui-validatebox" >
			</div>
			<div class="fitem">
				<label>公司法人:</label> <input id="name" name="name"
					class="easyui-validatebox" >
			</div>
			<div class="fitem">
				<label>公司简介:</label> <input id="intro" name="intro"
					class="easyui-textbox">
			</div>
			<div class="fitem">
				<label>公司产品:</label> <input id="prod" name="prod"
					class="easyui-textbox">
			</div>
		</form>
	</div>
			
			

		
</body>
</html>