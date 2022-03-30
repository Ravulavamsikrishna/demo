package org.test7.java;

public class Example2 {

	int id;
	String name;
	Example2(int i,String n){
		id=i;
		name=n;}
	void display() {
		System.out.println(id+"     "+name);
	}
	public static void main (String[]args) {
		Example2 e3=new Example2(56318,"vamsi krishna");
		Example2 e4=new Example2(34712874,"saran");
		e3.display();
		e4.display();
		
	}
}
