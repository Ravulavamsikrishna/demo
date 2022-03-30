package org.test9.java.oops.inheritense;

class TestSuper2{


	void eat(){
		System.out.println("eating...");
	}  
}
class Goat extends TestSuper2{ 
	void eat(){
		System.out.println("eating bread...");
	}  
	void bark(){
		System.out.println("barking...");
	}  
	void work(){  
		super.eat();  
		bark();  
	}  
}  
public class Task3{  

	public static void main(String args[]){  
		Goat d=new Goat();  
		d.work();  
		d.eat();
	} 



}

