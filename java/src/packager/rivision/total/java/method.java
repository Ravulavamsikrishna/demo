package packager.rivision.total.java;

import java.util.Scanner;

public class method {

	static Scanner scanner = new Scanner(System.in);
	static int a[];

	public static void main(String[] args) {
		a = new int[5];
		insertValues(a);
		printElements(a);

	}

	public static void insertValues(int a[]) {
		for (int i = 0; i < a.length - 1; i++) {

			System.out.println("enter the value");
			a[i] = scanner.nextInt();

		}
	}

	public static void printElements(int a[]) {
		for (int i = 0; i < a.length - 1; i++) {
			System.out.println(a[i]);
		}

	}

}
