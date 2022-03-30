package org.test9.java.oops.inheritense;

 class programmer {
	 
		float salary=40000;  
	}  
	class Task1 extends programmer{  
		int bonus=10000;  
		public static void main(String args[]){  
			Task1 p=new Task1();  
			System.out.println("Programmer salary is:"+p.salary);  
			System.out.println("Bonus of Programmer is:"+p.bonus);  
		}  
	}  



