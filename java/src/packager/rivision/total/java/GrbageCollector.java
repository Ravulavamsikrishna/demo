package packager.rivision.total.java;

	
	
	

public class GrbageCollector {
public	void finalize() {
	System.out.println("garbage collector");
}
	public static void main(String[] args) {
		GrbageCollector tr=new GrbageCollector();
		GrbageCollector tr1=new GrbageCollector();
				
tr=null;
tr1=null;
System.gc();

	}

}
