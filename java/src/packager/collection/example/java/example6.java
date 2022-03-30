package packager.collection.example.java;
import java.util.Iterator;
import java.util.LinkedList;
public class example6 {

	public static void main(String[] args) {
		LinkedList s=new LinkedList();
s.add("56");
s.add("56");
s.add(null);
s.add(null);
s.add(65);
s.addLast(56725);
s.add(3, 0);
Iterator t=s.iterator();
while(t.hasNext()) {
	System.out.println(t.next());
}

System.out.println(s);
	}

}
