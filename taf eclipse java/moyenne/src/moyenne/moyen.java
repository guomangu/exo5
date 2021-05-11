package moyenne;

import java.util.Scanner;

public class moyen {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean lol=false;
		do {
			System.out.println("donne des chiffre separés par des espaces");
			String String=scan.nextLine().toLowerCase();
			String tabMots[] = String.split(" ");
			
			int i=0;
			int g=0;
			for(String s : tabMots) {
				int a = Integer.parseInt(s);
				g = g+a;
				i++;
			}
			
			double f = g/i;
			System.out.println("la moyenne est de "+f);
			
			System.out.println("Voulez vous realiser un autre calcul m'voyer ? oui/non");
			String String2=scan.nextLine().toLowerCase();
			if (String2.equals("non")) {
				lol=true;
			}
		} while (lol==false);
		
		System.out.println("TERMINATED");
	}

}
