package com.psl.collections;

import java.util.Comparator;
import java.util.Date;



public class Student implements  Comparable<Student>, Comparator<Student>{
	private String name;
	private int age;
	private Date dob;
	
	
	
	public Student() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Student(String name, int age, Date dob) {
		super();
		this.name = name;
		this.age = age;
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", dob=" + dob + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		return true;
	}
	@Override
	public int compare(Student arg0, Student arg1) {
		if(arg0.getDob().compareTo(arg1.getDob())==0){
			return arg0.getName().compareTo(arg1.getName());
		}
		return arg0.getDob().compareTo(arg1.getDob());
	}
	@Override
	public int compareTo(Student arg0) {
		
		if(getAge()<arg0.getAge())
			return -1;
		else if(getAge()==arg0.getAge())
			return 0;
		else
			return 1;
	}
	
	

}
