package packager.exceptionhandiling.java;

import java.io.*;
public class exception9 {

	static void doStringOperation() throws NullPointerException{
		try{
			String text = null;

			text = text.replaceAll("/", "-");
		}finally{

			System.out.println("Successfully completed string operation");
		}
	}

	public static void main(String[] args) {
		doStringOperation();
	}
}

