package com.util;

	import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.ConnectionImpl;
	//JDBC--是使用Java代码完成的
	public class JDBCUtil {
		//需要以下步骤
//		1，加载Driver驱动类，来完成对应的操作
//		2，配置数据库账号密码
//		3，设置数据库连接的url(即地址)
//		4，连接数据，并且获取数据库的对象
		
//		1，设置对应的值，
		
//		设置驱动器的位置
	private static final String DRIVER="com.mysql.jdbc.Driver";
	//设置数据库的地址
	private static final String URL="jdbc:mysql://localhost:3306/school?characterEncoding=utf-8&&useSSL=true";
	//设置账号
	private static final String USERNAME="root";
	//设置密码
	private static final String PASSWORD="123456";
	//2加载驱动类
	static{
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	//3，获取连接的对象
	public static ConnectionImpl getConnection(){
		Connection connection=null;
		try {
			connection=DriverManager.getConnection(URL,USERNAME,PASSWORD);
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return null;
	}
	}


