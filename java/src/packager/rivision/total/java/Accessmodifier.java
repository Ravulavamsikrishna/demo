package packager.rivision.total.java;


public class Accessmodifier {
	 static int i;
	 int a;
	 Accessmodifier(){
		 System.out.println("this is empty");
	 }
	 Accessmodifier(int i, int a){
		 this();
		 this.i=i;
		 this.a=a;
		 System.out.println(i);
		 this.A();

	 }
	private	void A() {
		//int i=20;
		System.out.println(i+" "+a);

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Accessmodifier H=new Accessmodifier(80,100);
Accessmodifier H1=new Accessmodifier(90,101);
//Accessmodifier H3=new Accessmodifier();

H.A();
H1.A();

	}

}
