package com.tnsif.Demo.Inheritance;
class School{
	void schoolname() {
		System.out.println("TS model school");
	}
}
class Teacher extends School{
	void show() {
		System.out.println("Teaching students");
	}
}
class MathsTeacher extends Teacher{
	void show1() {
		System.out.println("Teaches maths");
	}
}
class ScienceTeacher extends Teacher{
	void show2() {
		System.out.println("Teaches Science");
	}
}
public class Hybrid {

	public static void main(String[] args) {
		MathsTeacher mt=new MathsTeacher();
		mt.schoolname();
		mt.show();
		mt.show1();
		ScienceTeacher st=new ScienceTeacher();
		st.schoolname();
		st.show();
		st.show2();
	}

}
