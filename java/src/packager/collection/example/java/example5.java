package packager.collection.example.java;
import java.util.Iterator;
import java.util.LinkedList;

public class example5 {

	public static void main(String[] args) {
		LinkedList a=new LinkedList();
		a.add(6544);
		a.add(7601);
		a.add(6081);
		a.add(990897);
		a.add(5461);
		a.add(6);
		Iterator i= a.iterator();
		while(i.hasNext()) {
System.out.println(i.next());
	}

}
}