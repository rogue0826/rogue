<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>编辑数据</title>
<link rel="stylesheet" href="layui/css/layui.css">
</head>
<body>
	<!--   本质就是添加数据 -->
	<form action="" class="layui-form" method="post" >

    <div class="layui-form-item">
        <label class="layui-form-label">姓名</label>
        <div class="layui-input-inline">
            <input type="text" class="layui-input" required lay-verify="required" name="title" placeholder="请重新输入姓名" autocomplete="off" >
        </div>
    </div>
    
    
        <div class="layui-form-item">
        <label class="layui-form-label">单选框</label>
        <div class="layui-input-block">
            <input type="radio" name="sex" value="男" title="男">
            <input type="radio" name="sex" value="女" title="女" checked>
        </div>
    </div>

 

 
	   <div class="layui-form-item">
        <label class="layui-form-label">班级</label>
        <div class="layui-input-inline">
            <input type="text" class="layui-input" required lay-verify="required" name="title" placeholder="请重新输入班级" autocomplete="off" >
        </div>
    </div>
	  
	   <div class="layui-form-item">
        <label class="layui-form-label">成绩</label>
        <div class="layui-input-inline">
            <input type="text" class="layui-input" required lay-verify="required" name="title" placeholder="请重新输入成绩" autocomplete="off" >
        </div>
    </div>

	  <div class="layui-form-item">
      <div class="layui-input-block">
          <button class="layui-btn" lay-submit  lay-filter="formDemo">立即提交</button>

          <button type="reset" class="layui-btn"  layui-btn-primary >重置</button>

      </div>
  </div>
	
	
	
	
</form>
<script src="layui/layui.js"></script>
</body>
</html>
<script>
    layui.use('form', function () {

    });
</script>