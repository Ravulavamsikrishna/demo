package packager.org.oops.obstract.java;

interface interfaceA {
void e();
void c();
void d();
void r();
}
abstract class B implements interfaceA{
	 public void r() {
		 System.out.println("enter");
	 }
}
class W extends B{
	@Override
	public void e() {
		// TODO Auto-generated method stub
		System.out.println("no");
	}

	@Override
	public void c() {
		// TODO Auto-generated method stub
		System.out.println("ooooooooo");
	}

	@Override
	public void d() {
		// TODO Auto-generated method stub
		System.out.println("mmmmmmmmmmm");
	}
 }
