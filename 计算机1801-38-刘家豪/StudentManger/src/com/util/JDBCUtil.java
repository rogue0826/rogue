package com.util;

	import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.ConnectionImpl;
	//JDBC--��ʹ��Java������ɵ�
	public class JDBCUtil {
		//��Ҫ���²���
//		1������Driver�����࣬����ɶ�Ӧ�Ĳ���
//		2���������ݿ��˺�����
//		3���������ݿ����ӵ�url(����ַ)
//		4���������ݣ����һ�ȡ���ݿ�Ķ���
		
//		1�����ö�Ӧ��ֵ��
		
//		������������λ��
	private static final String DRIVER="com.mysql.jdbc.Driver";
	//�������ݿ�ĵ�ַ
	private static final String URL="jdbc:mysql://localhost:3306/school?characterEncoding=utf-8&&useSSL=true";
	//�����˺�
	private static final String USERNAME="root";
	//��������
	private static final String PASSWORD="123456";
	//2����������
	static{
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
	//3����ȡ���ӵĶ���
	public static ConnectionImpl getConnection(){
		Connection connection=null;
		try {
			connection=DriverManager.getConnection(URL,USERNAME,PASSWORD);
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		return null;
	}
	}


