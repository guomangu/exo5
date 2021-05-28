package pgcd;

import java.util.Scanner;

public class PlusGrosCacaDamné {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int p,q;
		System.out.print("Entrez le premier nombre : ");
		p = sc.nextInt();
		System.out.print("Entrez le deuxième nombre : ");
		q = sc.nextInt();
	       
		int t=0;
		int a=p;
		int b=q;
		int r=0;
		
		if (p*q!=0) {
			if ( p>q) {   		  	
	            t = a;
	            a = b;
	            b = t;
			}
			
			do{
				r = a % b;
	            a = b;
	            b = r;
			}while(r !=0);
		}	
	  	
		if (p*q==0) {
			System.out.println("Le pgcd n'existe pas lorsque l'un des deux nombres est nul !");
			return;
		}
		
        System.out.println("Le pgcd de "+p+" et de "+q+" est "+a);
	}
}