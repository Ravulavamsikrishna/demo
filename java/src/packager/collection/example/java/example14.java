package packager.collection.example.java;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
public class example14 {

	public static void main(String[] args) {
		String a[]= {"10:00","10:01","10:02","10:03","10:04","10:05","10:06","10:07","10:08","10:09","10:10"};
		
		TreeMap q=new TreeMap();
		for(int i=0;i<11;i++) {
			q.put(a[i],i);
			
			
			
		}
		System.out.println(q);
		
		

	}

}
