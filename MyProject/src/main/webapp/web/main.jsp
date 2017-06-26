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
	//init left menu
	$('#main_menu').tree({
		url:'menu/findAll',
		method:'get',
		animate:true,
		dnd:true,
		onClick:function(node){
			console.log(node);
			if(!node.children.length){
				addTab(node.text,node.ufmCode);
			}else{
				return;
			}
		}
	});
	//add table 
	function addTab(title, url){
		console.log("addTab");
		if ($('#main_tabs').tabs('exists', title)){
			$('#main_tabs').tabs('select', title);
		} else {
			var content = '<iframe scrolling="auto" frameborder="0"  src="'+url+'" style="width:100%;height:100%;"></iframe>';
			$('#main_tabs').tabs('add',{
				title:title,
				content:content,
				closable:true
			});
		}
	};
})

</script>
<body style="height: 100%;overflow-y: hidden;">
	<div class="easyui-layout" style="width: 100%;min-width:600px;height: 90%;min-height: 400px;">
		<div data-options="region:'north'" title="家庭财务管理系统" style="height:50px;" align="right">
			登陆成功。用户名:${name}, 密码:${password}
		</div>
		<div data-options="region:'south'" title="底部" style="height:50px;"></div>
		<div data-options="region:'west'" title="功能菜单" style="width:20%;" id="main_menu"></div>
		<div id="main_tabs" class="easyui-tabs" data-options="region:'center'" style="width:100%;border:0;padding:0;">
		</div>
	</div>
</body>
</html>