<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html style="height: 100%;">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="css/themes/icon.css">
<link rel="stylesheet" type="text/css" href="css/demo.css">
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery.easyui.min.js"></script>
<title>登录页面</title>
</head>
<script type="text/javascript">
$(function(){
	//init menu
	$('#menu').tree({
		url:'menu/findAll',
		method:'get',
		animate:true,
		dnd:true
	});
})
</script>
<body style="height: 90%;">
	<div class="easyui-layout" style="width: 100%;min-width:600px;height: 90%;min-height: 400px">
		<div id="loginSuc-panel" class="easyui-panel">
		</div>
		<div data-options="region:'north'" title="自己搞着玩" style="height:50px" align="right">
			登陆成功。用户名:${name}, 密码:${password}
		</div>
<!-- 		<div data-options="region:'south',split:true" title="South" style="height:50px;"></div> -->
		<div data-options="region:'east',split:true" title="East" style="width:20%;"></div>
		<div data-options="region:'west',split:true" title="West" style="width:20%;" id="menu">
		</div>
		<div data-options="region:'center',title:'Main Title',iconCls:'icon-ok'">
		</div>
	</div>
</body>
</html>