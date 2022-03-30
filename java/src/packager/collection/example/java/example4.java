package packager.collection.example.java;
import java.util.LinkedList;
public class example4 {

	public static void main(String[] args) {
		LinkedList w=new LinkedList();
		w.add(54);
		w.add(54);
		w.add(4316);
		w.add(234);
		w.add(87919);
		w.add(8717);
		w.add(null);
		w.add(87196);
		w.add(465256);
		w.add(7045);
		w.add(8902);
		w.remove(4);
		w.addFirst("ewhoqh");
		w.addLast(755);
		w.remove(3);
		w.add(2, 5);
		
		System.out.println(w.contains(435));
		System.out.println(w.contains(8751561));
		
		for(int i=0;i<w.size();i++) {
		System.out.println(w.get(i));
		
//System.out.println(w);
	}

}
}