package com.basi.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> 
{
	private int id;
	private double per;
	private String name;
	
	public Student(int id,  String name , double per) {
		super();
		this.id = id;
		this.per = per;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPer() {
		return per;
	}
	public void setPer(double per) {
		this.per = per;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", per=" + per + ", name=" + name + "]";
	}
	
	
	
	  @Override public int compareTo(Student o) { return
	  Integer.compare((int)this.getPer(),(int)o.getPer());
	  
	  }
	 
	
	
}

public class ListExample {
	
      

	public static void main(String[] args) {
	
		List<Student> student = new ArrayList<>();
		student.add(new Student(5 , "Suman prasad" , 76));
		student.add(new Student(1 , "Vikash Sharma" , 71));
		student.add(new Student( 4 ,"Rajesh Verma" , 73));
		student.add(new Student(3 , "Sweety Singh", 82));
		student.add(new Student(2 , "Vijay Dan" , 91));
		Collections.sort(student);
		System.out.println(student);
		
		

	}

}
