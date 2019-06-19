package com.bean;
//bean---数据模型层   专门存储表中的数据  所以属性设置一般按照表中的字段
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


