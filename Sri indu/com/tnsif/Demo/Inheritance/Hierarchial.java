package com.tnsif.Demo.Inheritance;
class Aa{
	void display() {
		System.out.println("chandu");
		
	}
}
class Bb extends Aa{
	void display1() {
		System.out.println("Hai");
		
	}
}
class C extends Aa{
	void display2() {
		System.out.println("How are you");
		
	}
}
class D extends Aa{
	void display3() {
		System.out.println("What are you doing");
		
	}
}
public class Hierarchial {

	public static void main(String[] args) {
		Bb nc=new Bb();
		nc.display();
		nc.display1();
		C nc1=new C();
		nc1.display();
		nc1.display2();
		D nc2=new D();
		nc2.display();
		nc2.display3();
		
	}

}
