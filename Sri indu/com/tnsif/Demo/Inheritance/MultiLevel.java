package com.tnsif.Demo.Inheritance;
class Classroom{
	void show () {
		System.out.println("Class room consists of benches,projector,board......");
	}
}
class Block extends Classroom{
	void show1() {
		System.out.println("Block consists of different types of classrooms & Labs");
	}
}
class College extends Block{
	void show2() {
		System.out.println("clg consists of multiple blocks");
	}
}
public class MultiLevel {

	public static void main(String[] args) {
		College cn=new College();
		cn.show2();
		cn.show1();
		cn.show();
		
	}

}
