package com.bean;
//bean---����ģ�Ͳ�   ר�Ŵ洢���е�����  ������������һ�㰴�ձ��е��ֶ�
public class Student {
        
	 private int number;
	 private String name;
	 private String sex;
	 private String subject;
	 private int score;
	public Student(int number, String name, String sex, String subject,
			int score) {
		super();
		this.number = number;
		this.name = name;
		this.sex = sex;
		this.subject = subject;
		this.score = score;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [number=" + number + ", name=" + name + ", sex=" + sex
				+ ", subject=" + subject + ", score=" + score + "]";
	}
}


