package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.Student;
import com.util.JDBCUtil;

//����ʵ�ֽӿ��еľ��幦��  
public class StudentImp implements StudentDao{

	@Override
	public int addStudent(String name, String sex, String subject, int score) {
		int  row = 0; //������� �������ݿ�����Ӱ�������
		String sql = "insert into student (name, sex, subject, score) values (?, ? , ? ,?)";
		Connection connection  =JDBCUtil.getConnection();//���ݿ����Ӷ���	
		try {
			//ִ��sql����Ķ���
			PreparedStatement statement = connection.prepareStatement(sql);
			//�滻�ʺ�  
			statement.setString(1, name);
			statement.setString(2, sex);
			statement.setString(3, subject);
			statement.setInt(4, score);
			
			//ִ������  executeUpdate() ��ɾ�Ķ��ô�����  ����ֵ��int  �����ݿ�����Ӱ�������
		row = statement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}		
		return row;
	}

	@Override
	public int deleteStudent(int number) {
		int  row = 0; //������� �������ݿ�����Ӱ�������
		String sql = "delete from student where number = ?";
		Connection connection  =JDBCUtil.getConnection();//���ݿ����Ӷ���	
		try {
			//ִ��sql����Ķ���
			PreparedStatement statement = connection.prepareStatement(sql);
			//�滻�ʺ�  
			statement.setInt(1, number);
			
			//ִ������  executeUpdate() ��ɾ�Ķ��ô�����  ����ֵ��int  �����ݿ�����Ӱ�������
		row = statement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}		
		return row;
	}

	@Override
	public int updateStudent(int number, String name, String sex,String subject, int score) {
		int  row = 0; //������� �������ݿ�����Ӱ�������
		String sql = "update student set name = ? , sex = ?, subject = ?, score = ? where number = ?";
		Connection connection  =JDBCUtil.getConnection();//���ݿ����Ӷ���	
		try {
			//ִ��sql����Ķ���
			PreparedStatement statement = connection.prepareStatement(sql);
			//�滻�ʺ�  
			statement.setString(1, name);
			statement.setString(2, sex);
			statement.setString(3, subject);
			statement.setInt(4, score);
			statement.setInt(5, number);
			//ִ������  executeUpdate() ��ɾ�Ķ��ô�����  ����ֵ��int  �����ݿ�����Ӱ�������
		row = statement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}		
		return row;
	}

	@Override
	public Student selectOneByNumber(int number) {
		//����student����  �洢��ѯ��������
		Student student = new Student);
		String  sql = "select * from student where number = ?";
		Connection connection = JDBCUtil.getConnection();
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, number);
			//�ؼ�-----executeQuery  ר�Ÿ���ִ�в�ѯ����   ������ResultSet �����
			ResultSet resultSet =  statement.executeQuery();
			//��ȫ�ж�
			if (resultSet.next()) {
				//ȡֵ
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
			// TODO �Զ����ɵ� catch ��
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
			//�ؼ�-----executeQuery  ר�Ÿ���ִ�в�ѯ����   ������ResultSet �����
			ResultSet resultSet =  statement.executeQuery();
		//��ѯȫ������ ���Խ������ ����������ȷ��
			while (resultSet.next()) {
				//ȡֵ
				int num = resultSet.getInt("number");
				String name = resultSet.getString("name");
				String sex = resultSet.getString("sex");
				String subject = resultSet.getString("subject");
				int score = resultSet.getInt("score");
				
				Student student = new Student(num, name, sex, subject, score);
				//�ؼ�-----
				studentArray.add(student);
				
			}		
		
		}catch(SQLException e){
			e.printStackTrace();
		}
		return null;
	}

}
