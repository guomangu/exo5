package caracara;

import java.util.Scanner;

public class caractere {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ecrit moi donc une phrase avec un .");
		String reponse=scan.nextLine();
		String tabLettre[] = reponse.split("");
		System.out.println(reponse);
		
		boolean nope=false;
		int i=0;
		for(String s : tabLettre) {
			if (s.equals(".")) {
				nope=true;
			}
			i++;
		}
		
		if (nope=true) {
			System.out.println("Parfait il y a un . on continue");
			if (i<2) {
				System.out.println("Nul la chaine est vide");
				return;
			}
		} else {
			System.out.println("Pas bien il n'y a pas de . on s'arrete");
			return;
		}
		
		System.out.println("donnez une lettre a chercher");
		String search=scan.nextLine();
		int j=0;
		for(String s : tabLettre) {
			if (s.equals(search)) {
				j++;
			}
		}
		System.out.println("La lettre '"+search+"' est presente "+j+" fois.");
		
	}

}
