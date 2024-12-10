package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		method1();
		
		
		
		

	}
	
	public static void method1() {
		System.out.println("****METHOD1 START****");
		method2();
		System.out.println("****METHOD1 START****");
	
	}
	public static void method2() {
		System.out.println("****METHOD2 START****");
		Scanner sc = new Scanner(System.in);
		try {
		String[] vect = sc.nextLine().split(" ");
		int postion = sc.nextInt();
		System.out.println(vect[postion]);
		
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid postion!");
			e.printStackTrace();
			sc.close();
		}
		catch(InputMismatchException e) {
			System.out.println("Input error!");
		}
		
		System.out.println("End of program");
		sc.close();
		System.out.println("****METHOD2 END****");
		
	}

}
