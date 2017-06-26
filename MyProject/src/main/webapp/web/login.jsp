<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html style="height: 100%">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="css/themes/icon.css">
<link rel="stylesheet" type="text/css" href="css/demo.css">
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery.easyui.min.js"></script>
<script>
	function submitForm(){
// 		$('#login').form('submit');
		$('#login').submit();
	}
	function clearForm(){
		$('#login').form('clear');
	}
</script>
<title>登录页面</title>
</head>
<body style="height: 90%">
	<div id="login-panel" class="easyui-panel" style="height: 90%">
		<form action="check" id="login" method="post">
	    	<table cellpadding="2" style="width: 100%">
	    		<tr align="center">
	    			<td align="right" style="width: 40%">姓名:</td>
	    			<td align="left" style="width: 60%">
	    				<input class="easyui-textbox" type="text" name="name" data-options="required:true" />
	    			</td>
	    		</tr>
	    		<tr align="center">
	    			<td align="right" style="width: 40%">密码:</td>
	    			<td align="left" style="width: 60%">
	    				<input class="easyui-textbox" type="password" name="password" data-options="required:true" />
	    			</td>
	    		</tr>
	    	</table>
		</form>
	    <div style="text-align:center;padding:5px" align="center">
	    	<div>
		    	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">确认</a>
		    	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">清除</a>
	    	</div>
	    </div>
	</div>
</body>
</html>