package packager.org.overriding.java;

class Vehicle{  
	void run(){System.out.println("Vehicle is running");}  
}  
 
public class TaskMain extends Vehicle{  
	void aa() {
		System.out.println("hfgfgh");
	}
	public static void main(String args[]){  
		  
		TaskMain obj = new TaskMain();  
 
		obj.run();  
		obj.aa();
	}  
}  
