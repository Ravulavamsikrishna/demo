package packager.exceptionhandiling.java;

public class exception6 {

	public static void main(String[] args) {
		try {
			      int divideByZero = 5 / 0;
			    }

catch (ArithmeticException e) {
			      System.out.println("ArithmeticException => " + e.getMessage());
			    }
			    
			    finally {
			      System.out.println("This is the finally block");
			    }

	}

}
