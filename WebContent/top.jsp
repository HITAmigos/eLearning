<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>topPart</title>
<style type="text/css">
body{margin:0px;}
.title{
		FONT-SIZE: 18pt;
		FONT-WEIGHT: bold;
		FONT-FAMILY: "黑体";
		color:#00485f ;
	}
a:link{
text-decoration:none;
color:#000099;
}
</style>
<script type="text/javascript">
function show_confirm()
{
var r=confirm("你确定要退出？");
if (r==true)
  {
  document.execCommand("ClearAuthenticationCache");
  		parent.location.href = "login.jsp";
  }
else
  {
  return false;
  }
}
</script>
</head>

<body>
<table width="100%" border="0" cellspacing="0" cellpadding="0" bgcolor="#ffffff">
  <tr>
    <td height="10" style="background-repeat:no-repeat; 
	background-position:left; 
	background-image: url(Images/topbg1.jpg);
	bgcolor="#dddddd" colspan="3">
	</td>
  </tr>
  
  <tr>
    <td width="300" ><img src="Images/logo.png"></td>
	<td width="50"></td>
	<td width="200"></td>
	<td height="80" class=title align=left>欢迎学习</td>
	<td><a  href="#" onclick="show_confirm()" >安全退出</a></td>
  </tr>
  <tr>
    <td height="2" colspan="2"></td>
  </tr>
</table>

<table cellSpacing=0 cellPadding=0 width="100%">
  <tbody>
  <tr>
    <td width="100%" bgColor=#999999 height=3></td></tr>
  </tbody>
</table>
</body>
</html>
