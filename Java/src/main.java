
package studyopedia;


import java.util.Scanner;
package main; 

public class main {
	public static void main(String[] args) {
		int secret = 50; 
		Scanner sc = new Scanner(System.in); 
		System.out.print("Veuillez saisir un nombre : "); 
		int nb = sc.nextInt(); 
		
		if (nb > secret) {
			System.out.println("le numéro que vous avez saisi est supérieur aunuméro secret");
	    } else if (nb < secret) {
	    	System.out.println("le numéro que vous avez saisi est inferieur aunuméro secret");
	    } else {
	    	System.out.println("bravo vous avez gagné le jeux.");
	    }
	}

}
