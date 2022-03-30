package packager.exceptionhandiling.java;
import java.util.Scanner;
public class exception10 {

	public static void main(String[] args) {
Scanner scn=new Scanner(System.in);
System.out.println("enter input");
try {
	char c=scn.nextLine().charAt(4);
	System.out.println("character index4:"+c);
}catch(Exception e)
{
	System.out.println("cough Exception");
}


	}

}
