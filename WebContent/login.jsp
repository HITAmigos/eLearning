<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="gb2312"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>�û���¼</title>
<link href="CSS/style.css" rel="stylesheet">
<script language="javascript">
function check(form){
	if (form.name.value==""){
		alert("�������û���!");form.name.focus();return false;
	}
	if (form.pwd.value==""){
		alert("����������!");form.pwd.focus();return false;
	}	
}
</script> 
</head>
<body>
	<div  style="margin:0px; padding:0px;position:absolute;top:0px; width:100%; height:100%; z-index:-1">  
		<img src="Images/relogin.jpg" height="100%" width="100%"/>  
	</div>
	<div class="page-container">
		<h1>��¼</h1>

		<form name="form1" method="post" action="${pageContext.request.contextPath }/login.action">
                
                   	<font >�û�����</font><input name="user.username" type="text" id="inputt" size="27">  <br> <br><br>                  
                   
                           
                    
                         
                    <font>&nbsp;��&nbsp;�룺</font> 
                     <input name="user.password" type="password" id="inputt" size="27">&nbsp;
                   
                     <input name="Submit" type="submit" class="btn_index" value="��¼" onClick="return check(form1)">&nbsp;
                     <input name="Submit3" type="reset" class="btn_index" value="����">&nbsp;
                        
                       
		</form>
    	<table width="100%" height="27"  border="0" cellpadding="0" cellspacing="0">
        	<tr>
          	<td align="center" class="word_login">CopyRight &copy; 2017 <br>eLearning </td>
        	</tr>
    	</table>
	</div>


</body>
</html>