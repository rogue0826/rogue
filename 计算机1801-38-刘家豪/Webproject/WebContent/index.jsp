<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<%
int a=10;
for(int i=1;i<=6;i++){
	int b=111;
	out.print("<h"+i+" style='background-color:pink;'> haha哈哈</h" + i + ">");
}
out.print(a);
%>
<%
out.print(a);
%>
<%=  a %>
<%
//第一种混编在Java中 插入HTML编码需要""
int age=8;
if(age>=18){
	out.print("<div style='background-color:red;width:200px;height:200px;'></div>");
}else{
	       out.print("<div style='background-color:green;width:200px;height:200px;'></div>");
}
%>
<!-- 第二种混编 在HTML里面混编Java -->
<%  for(int i=1; i<=6; i++){ %>
<--此位置HTML编码区域-->
<h<%=i  %>>你好<%=i %></h<%=i %>>
<%} %>
</body>
</html>