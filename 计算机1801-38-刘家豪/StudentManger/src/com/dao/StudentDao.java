package com.dao;

import java.util.ArrayList;
	
import com.bean.Student;
//�˽ӿ��ǿ��ٲ鿴��װ����  �൱��˵����Ĺ���
public interface StudentDao {
	
	public int addStudent(String name, String sex, String subject,int score);
	
	public int deleteStudent(int number);
	
	public int updateStudent(int number, String name, String sex, String subject,int score);
	
	//����ѧ�ţ���ѯһ��ѧ��
	public Student selectOneByNumber (int number);
	
	//��ѯȫ��ѧ��
	public ArrayList<Student> selectAll();
	}


