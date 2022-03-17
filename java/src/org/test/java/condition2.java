package org.test.java;
import java.util.Scanner;
public class condition2 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
int marks;
System.out.println("enter marks");
 marks=scn.nextInt();
if(marks>=50&&marks<60) {
	System.out.println("d grade");
}else if(marks>=60&&marks<70) {
	System.out.println("c grade");
}else if(marks>=70&&marks<80) {
	System.out.println("b grade");
}else if(marks>=80&&marks<90) {
	System.out.println("a grade");
}else if(marks>=90&&marks<95) {
	System.out.println("destinction");
}else {
	System.out.println("fail");}
}

	}


