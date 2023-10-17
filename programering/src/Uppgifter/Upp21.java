package Uppgifter;

import java.util.Scanner;

public class Upp21 {

	public static void main(String[] args) {
		
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("ange basen" );
		int basen = input.nextInt();
		
		System.out.println("ange höjd" );
		int höjd = input.nextInt();
		
		int area= basen*höjd/2;
		
		System.out.println("arean är"+area);
		
		System.out.println("stämmer det?");
		
		
		
		
		
		
		
		
		
		
		input.close();
		
		
		
		
	}
	
}
