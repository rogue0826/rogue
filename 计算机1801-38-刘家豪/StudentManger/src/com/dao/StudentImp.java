package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.Student;
import com.util.JDBCUtil;

//负责实现接口中的具体功能  
public class StudentImp implements StudentDao{

	@Override
	public int addStudent(String name, String sex, String subject, int score) {
		int  row = 0; //定义变量 接收数据库中受影响的行数
		String sql = "insert into student (name, sex, subject, score) values (?, ? , ? ,?)";
		Connection connection  =JDBCUtil.getConnection();//数据库连接对象	
		try {
			//执行sql命令的对象
			PreparedStatement statement = connection.prepareStatement(sql);
			//替换问好  
			statement.setString(1, name);
			statement.setString(2, sex);
			statement.setString(3, subject);
			statement.setInt(4, score);
			
			//执行命令  executeUpdate() 增删改都用此命令  返回值是int  是数据库中受影响的行数
		row = statement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}		
		return row;
	}

	@Override
	public int deleteStudent(int number) {
		int  row = 0; //定义变量 接收数据库中受影响的行数
		String sql = "delete from student where number = ?";
		Connection connection  =JDBCUtil.getConnection();//数据库连接对象	
		try {
			//执行sql命令的对象
			PreparedStatement statement = connection.prepareStatement(sql);
			//替换问好  
			statement.setInt(1, number);
			
			//执行命令  executeUpdate() 增删改都用此命令  返回值是int  是数据库中受影响的行数
		row = statement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}		
		return row;
	}

	@Override
	public int updateStudent(int number, String name, String sex,String subject, int score) {
		int  row = 0; //定义变量 接收数据库中受影响的行数
		String sql = "update student set name = ? , sex = ?, subject = ?, score = ? where number = ?";
		Connection connection  =JDBCUtil.getConnection();//数据库连接对象	
		try {
			//执行sql命令的对象
			PreparedStatement statement = connection.prepareStatement(sql);
			//替换问好  
			statement.setString(1, name);
			statement.setString(2, sex);
			statement.setString(3, subject);
			statement.setInt(4, score);
			statement.setInt(5, number);
			//执行命令  executeUpdate() 增删改都用此命令  返回值是int  是数据库中受影响的行数
		row = statement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}		
		return row;
	}

	@Override
	public Student selectOneByNumber(int number) {
		//定义student对象  存储查询到的数据
		Student student = new Student);
		String  sql = "select * from student where number = ?";
		Connection connection = JDBCUtil.getConnection();
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, number);
			//关键-----executeQuery  专门负责执行查询命令   返回是ResultSet 结果集
			ResultSet resultSet =  statement.executeQuery();
			//安全判断
			if (resultSet.next()) {
				//取值
				int num = resultSet.getInt("number");
				String name = resultSet.getString("name");
				String sex = resultSet.getString("sex");
				String subject = resultSet.getString("subject");
				int score = resultSet.getInt("score");
				
				student.setName(name);
				student.setScore(score);
				student.setSex(sex);
				student.setSubject(subject);
				student.setNumber(num);
			}		
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return student;
	}

	@Override
	public ArrayList<Student> selectAll() {
		ArrayList<Student> studentArray = new ArrayList<Student>();
		String  sql = "select * from student";
		Connection connection = JDBCUtil.getConnection();
		try {
			PreparedStatement statement = connection.prepareStatement(sql);		
			//关键-----executeQuery  专门负责执行查询命令   返回是ResultSet 结果集
			ResultSet resultSet =  statement.executeQuery();
		//查询全部数据 所以结果集中 数据条数不确定
			while (resultSet.next()) {
				//取值
				int num = resultSet.getInt("number");
				String name = resultSet.getString("name");
				String sex = resultSet.getString("sex");
				String subject = resultSet.getString("subject");
				int score = resultSet.getInt("score");
				
				Student student = new Student(num, name, sex, subject, score);
				//关键-----
				studentArray.add(student);
				
			}		
		
		}catch(SQLException e){
			e.printStackTrace();
		}
		return null;
	}

}
