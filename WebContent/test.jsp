<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="${pageContext.request.contextPath }/js/jquery-1.4.4.min.js" ></script>
<script type="text/javascript">
	function test(){
	var jsondata = {
		"content" : "test ajax+json"
	} ;
	//alert(JSON.stringify(jsondata)) ;
	$.ajax({
		//发送数据的方式，POST/GET
		type : "GET" ,
		//请求url，即请求的action，jsp中的js可以使用el表达式，html中就用路径
		url : "${pageContext.request.contextPath}/ajaxTest.action" ,
		//发送的
		data : jsondata, 
		//选择传输的数据的格式
		dataType : "json" ,
		//如果请求成功，并且action执行成功，则会返回到这个success的函数中，函数的返回值data就		     	是action中返回的数据，一般返回的是JSON字符串类型的数据
		success : function(data){
			//看看传回的数据
			alert(data) ;  //   "{ /"returndata/"  :   /" success/"}" 
			//将json字符串转为json对象
			var data=JSON.parse(data) ;   //{"returndata" : "success"}
			//取出显示json对象的value
			alert(data.returndata) ;      //"success"
		}
	}) ;
}
</script>
</head>
<body>
<script type="text/javascript">
	//页面一加载就执行test()方法
	$(document).ready(test()) ;
</script>
	<form action="test.action"  method="post">
		<input type="text" name="username"> 
		<input type="submit" value="提交">
	</form>
	<s:debug></s:debug>
</body>
</html>