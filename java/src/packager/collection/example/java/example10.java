package packager.collection.example.java;

import java.util.HashSet;
import java.util.Iterator;

public class example10 {

	public static void main(String[] args) {
		HashSet q=new HashSet();
		q.add("vamsi");
		q.add("raghu");
		q.add("kailesh");
		q.add("sai");
		q.add("paenith");
		q.add("kailesh");
		Iterator a=q. iterator();
		while(a.hasNext()) {
			System.out.println(a.next());
		}
		

	}

}
