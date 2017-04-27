<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 引入css文件，不限顺序 -->
    <link rel="stylesheet" href="../themes/default/easyui.css" type="text/css"></link>
    <link rel="stylesheet" href="../themes/icon.css" type="text/css"></link>
  
  	<!-- 引入js文件，有顺序限制 -->
    <script type="text/javascript" src="../js/jquery.min.js"></script>
    <script type="text/javascript" src="../js/jquery.easyui.min.js"></script>
<title>Insert title here</title>
</head>
<body>

	<!-- 
		第一：写一个普通div标签
		第二：提倡为div标签取一个id属性，将来用jquery好定位
		第三：为普通div标签添加easyui组件的样式
			  所有的easyui组件的样式均按如下格式设置：
			  easyui-组件名
		第四：如果要用easyui组件自身的属性时，必须在普通标签上书写data-options属性名,
		      内容为，key:value,key:value,如果value是string类型加引号，外面双引号，
		      则里面单引号	  
		注意：要在普通标签中书写data-options属性的前提是：在普通标签上加class="easyui-组件名" 
			  属性值大小写均可     
	-->
	
	
	<div 
		id="xx" 
		class="easyui-panel" 
		style="width:500px;height:300px;padding:15px"
		title="我的面板"
		data-options="iconCls:'icon-save',collapsible:true,minimizable:false,maximizable:true">
	
		这是我的第一个EasyUI程序
		
	</div>


</body>
</html>