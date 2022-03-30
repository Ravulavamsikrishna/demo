package org.test8.java;

class Example1 {

	int id;
	String name;
	static String college="kits";

	Example1(int i,String n){
		id=i;
		name=n;
	}
	void display() {
		System.out.println(id+"  "+name+" "+college);
	}
	public static void main(String[]args) {
		Example1 a1=new Example1(111,"vamsi");
		Example1 a2=new Example1(78558,"sihs");
		a1.display();
		a2.display();
	}

}
