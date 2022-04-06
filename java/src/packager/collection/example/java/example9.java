package packager.collection.example.java;

import java.util.HashSet;
import java.util.Iterator;

public class example9 {

	public static void main(String[] args) {
	HashSet r=new HashSet();
	r.add(675);
	r.add(897486);
	System.out.println(r.contains(675));
	r.equals(675);
	Iterator a=r.iterator();
	while(a.hasNext()) {
		System.out.println(a.next());
	}

	}

}
