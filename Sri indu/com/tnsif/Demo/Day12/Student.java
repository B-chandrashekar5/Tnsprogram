package com.tnsif.Demo.Day12;

public class Student implements Comparable<Student> {
	int sid;
	String sName;
	double marks;
	
	public Student(int sid, String sName, double marks) {
		super();
		this.sid = sid;
		this.sName = sName;
		this.marks = marks;
	}
	@Override
	public  String toString(){
		return "Student details >> name="+sName+" " +"sid="+sid+" " +"marks="+marks;
		
	}

	@Override
	public int compareTo(Student o) {
		return this.sName.compareTo(o.sName);
	}
	
	

}