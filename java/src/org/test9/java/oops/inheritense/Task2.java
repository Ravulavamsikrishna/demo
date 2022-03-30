package org.test9.java.oops.inheritense;

class Animal {
	void Eat() {
		System.out.println("eating");
	}
}
	class Dog extends Animal{ 
		void Bow() {
		System.out.println("bow bow");
		}
	}
	class Task2{
		public static void main(String[]args) {
		
		Dog e1=new Dog();
		
		e1.Bow();
			e1.Eat();
		}
	}

