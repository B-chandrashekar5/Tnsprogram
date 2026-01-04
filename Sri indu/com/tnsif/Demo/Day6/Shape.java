package com.tnsif.Demo.Day6;

public abstract  class Shape {
	int l;
	int b;
	int s;
	
abstract void show();
}
class Rectangle extends Shape{
	public void show() {
		
	}
	
		
		Rectangle()
		{
			
		}
		 Rectangle(int l,int b){
			 
		 }
		public void  setl(int l) {
			this.l=l;
		}
		public  int getl() {
			return l;
		}
		public void setb(int b) {
			this.b=b;
		}
		public int  getb() {
			return b;
		}
		public void calarea() {
			
			int area=l*b;
			System.out.println("AREA:"+area);
		}
		
	}
	

class square extends Shape{
	public void show() {
		
	}

square(){
	
}
square(int s){
	
}
public void sets(int s) {
this.s=s;
}
public  int gets() {
return s;
}
public void calarea() {
int area=s*s;
System.out.println("AREA:"+area);
}
}