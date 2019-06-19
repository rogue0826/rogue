<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
 <link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css">
</head>
<body>
<a href="http://localhost:8080/StudentManger/studentAdd.jsp">添加数据</a>
<!--   其实本页面就是查询  做表格  table -->
<table class="layui-table">


<tr>
<th class="layui-table-header">学号</th>
<th class="layui-table-header">姓名</th>
<th class="layui-table-header">性别</th>
<th class="layui-table-header">班级</th>
<th class="layui-table-header">分数</th>
<th class="layui-table-header">操作</th>

</tr>

<tr>
<td>body</td>
<td>body</td>
<td>body</td>
<td>body</td>
<td>body</td>
<td>
<a href="http://localhost:8080/StudentManger/studentUpdate.jsp"  class="layui-btn">编辑</a>
<div class="layui-btn">删除</div>
</td>

</tr>

<tr>
<td>body</td>
<td>body</td>
<td>body</td>
<td>body</td>
<td>body</td>
<td>
<a href="http://localhost:8080/StudentManger/studentUpdate.jsp"  class="layui-btn">编辑</a>
<div class="layui-btn">删除</div>

</td>
</tr>

<tr>
<td>body</td>
<td>body</td>
<td>body</td>
<td>body</td>
<td>body</td>
<td>
<a href="http://localhost:8080/StudentManger/studentUpdate.jsp"  class="layui-btn">编辑</a>
<div class="layui-btn">删除</div>

</td>
</tr>

<tr>
<td>body</td>
<td>body</td>
<td>body</td>
<td>body</td>
<td>body</td>
<td>
<a href="http://localhost:8080/StudentManger/studentUpdate.jsp"  class="layui-btn">编辑</a>
<div class="layui-btn">删除</div>

</td>
</tr>

</table>



<script src="layui/layui.js"></script>

</body>
</html>
<script>
    layui.use('form', function () {

    });
</script>
