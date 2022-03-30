package packager.org.oops.polymorphism.java;

public class TaskMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank d;
		d=new SBI();
		System.out.println("SBI rate of interest"+d.getRateOfInterest());
		d=new ICICI();
		System.out.println("ICICI rate of interest"+d.getRateOfInterest());
		d=new AXIS();
		System.out.println("AXIS rate of interest"+d.getRateOfInterest());



	}

}
