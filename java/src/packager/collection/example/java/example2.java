package packager.collection.example.java;
import java.util.ArrayList;
import java.util.LinkedList;
public class example2 {

	public static void main(String[] args) {   
		        ArrayList<Integer> obj = new ArrayList();
		        obj.add(10);
		      obj.add(20);
		        obj.add(30);
		        System.out.println( obj);
		        LinkedList<Integer> tom = new LinkedList(obj);
		        tom.add(1, 5);
		        tom.add(3, 5);
		        tom.add(5, 15);
		        System.out.println(  tom);
		        ArrayList<Integer> arrayList1 = new ArrayList(tom);
		        System.out.println( arrayList1);
		        for(Integer a:tom) {
		        System.out.println(a);
		        }
		        for(Integer b:obj) {
		        	System.out.println(b);
		    }
	}
}
		 

	
