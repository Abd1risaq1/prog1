package arrayer;

import java.sql.Array;

public class Arr1 {

	public static void main(String[] args) {
		
		int[] i = new int [5];  // skapar array 5 st pos. skapar ref till denna.
		
		int längd=i.length;  // tar reda  på längden på arrayen
		
		// tilldelar värde till olika pos 1 array
		i[0]=4;
		i[1]=7;
		i[2]=8;
		i[3]=1;
		
		System.out.println(i [0]+" "+i[1] +""+i[2]); // skriv ut var för sig
		System.out.println(Arrays.toString(i));      // skriver ut allt
		
		for(int k=0; k<5   ;k=k+1) {
			System.out.println(i[k]);
			
		}
	
	    }
	
	
		
		
}
