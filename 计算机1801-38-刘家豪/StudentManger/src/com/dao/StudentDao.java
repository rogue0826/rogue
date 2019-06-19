package com.dao;

import java.util.ArrayList;
	
import com.bean.Student;
//此接口是快速查看封装功能  相当于说明书的功能
public interface StudentDao {
	
	public int addStudent(String name, String sex, String subject,int score);
	
	public int deleteStudent(int number);
	
	public int updateStudent(int number, String name, String sex, String subject,int score);
	
	//按照学号，查询一个学生
	public Student selectOneByNumber (int number);
	
	//查询全部学生
	public ArrayList<Student> selectAll();
	}


