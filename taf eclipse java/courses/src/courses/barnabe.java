package courses;

import java.util.Scanner;

public class barnabe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Donne l'argent mdr");
		String reponse=sc.nextLine();
		double a = Integer.parseInt(reponse);
		
		int i=0;
		do {
			a=a/2-1;
			i++;
		} while (a>0);
		
		System.out.println("Il a fait "+i+" magasins pour depense la recette");
	}
}
