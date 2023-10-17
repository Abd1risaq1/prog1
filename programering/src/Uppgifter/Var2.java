package Uppgifter;

public class Var2 {

	public static void main(String[] args) {
		String namn = "daniel ";
		String enamn= "andersson";
		
		char förstaB=namn.charAt(1);//bokstav på position
		
		String delAV=namn.substring(0,2);
		int i = namn.lenth();
		int a=namn.indexOf('d');
		
		String total = namn +enamn;
		
		System.out.println(total+" "+ förstaB+""+ delAV);
		
	}
	
	
}
