package packager.collection.example.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class example8 {

	public static void main(String[] args) {
		ArrayList<Integer> z=new ArrayList();
z.add(5786);
z.add(758);
z.add(78);
z.add(2, 784);
z.add(4325);
ListIterator c=z.listIterator();
while(c.hasNext())
{
	Object i=c.next();
	System.out.println(i);
}
System.out.println("-------------------------------");
LinkedList x=new LinkedList();
x.add(2287);
x.addFirst(7658);
x.addLast(8765);
x.add(564);
x.add(6);
ListIterator j=x.listIterator();
while(j.hasNext())
{
	Object i=j.next();
	System.out.println(i);
}
System.out.println("-------------------------------");
Vector q=new Vector();
q.add(67);
q.add(87);
q.addElement(856);
q.add(65);
ListIterator y=q.listIterator();
while(y.hasNext())
{
	Object i=y.next();
	System.out.println(i);
}
	}

}
