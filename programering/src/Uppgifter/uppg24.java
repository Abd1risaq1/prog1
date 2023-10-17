package Uppgifter;

import java.util.Scanner;

public class uppg24 {

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("ange saifålder" );
		int ålder1 = input.nextInt();
		
		System.out.print("ange abdiålder" );
		int ålder2 = input.nextInt();
		
		System.out.print("ange abduålder" );
		int ålder3 = input.nextInt();
		
		
		double medel = (ålder1+ålder2+ålder3)/2.0;
		System.out.println("medelvärde är" +medel);
		
		
		
	}
}
