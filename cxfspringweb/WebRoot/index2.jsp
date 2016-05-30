<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
System.out.println(basePath);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="js/jquery-1.6.2.js"></script>
	<script type="text/javascript">
	/**
		ajax  的xmlHttpRequest 对象可以发送一个http 请求
		我们可以把服务端需要的xml 格式的数据传送到服务端。
		模拟soap 请求。
		
	**/
	var itcast;
	itcast={
			sendMessage:function(){
			var data='<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:q0="http://call.spring.cxf.itcast.cn/" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">';
			data+='<soapenv:Body><q0:makeCaller><arg0>itcast</arg0></q0:makeCaller></soapenv:Body></soapenv:Envelope>';
			$.ajax({
			  url: "ws/makeCallService",
			  data:data,
			  contentType:'text/xml;charset=utf-8',
			  type:"POST",
			  dataType:"xml",
			  success: function(data, textStatus, jqXHR){
			     var text=$(data).find("return").text();
			     $(".message").html(text);
			    // $(".message").show(3000);
			    $(".message").slideDown(3000);
			  }
			});
			},
			hide:function(){
			
				 $(".message").slideUp(3000);
			
			}
	}
	
		
		
	</script>
	
  </head>
  
  <body>
     
   		<input type="button" value="显示" onclick="itcast.sendMessage()"/>
   		<input type="button" value="隐藏" onclick="itcast.hide()"/>
   		<div class="message" style="border-width: 4xp;border-style: solid;border-color: red;width: 400px;height: 400px;display: none;">
   		
   		
   		</div>
  </body>
</html>
