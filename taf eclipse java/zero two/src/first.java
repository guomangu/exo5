import java.util.Random;
import java.util.Scanner;

public class first {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		int ptA=0;
		int ptB=0;
		
		boolean condition = false;
		do {
			int b = random.nextInt(3 + 0) + 0;
			
			System.out.println("Choisi 0 ou 1 ou 2");
			String reponse=scan.nextLine();
			double a = Integer.parseInt(reponse);
			
			System.out.println("Joueur joue "+a+" Ordi joue "+b);
			
			if (a>b) {
				double cacs = a-b;
				
				if (cacs==2) {
					ptA++;
					System.out.println("Le Joueur marque un point");
				} else {
					ptB++;
					System.out.println("L'ordi marque un point");
				}
			} else if(a<b){
				double cacs = b-a;
				
				if (cacs==2) {
					ptB++;
					System.out.println("L'ordi marque un point");
				} else {
					ptA++;
					System.out.println("Le Joueur marque un point");
				}
			}else {
				double cacs=0;
			}
			
			System.out.println("Le joueur a "+ptA+" points et l'ordi a "+ptB);
			
			if (ptA==10 || ptB==10 || a<0) {
				condition=true;
				if(ptA>ptB) {
					System.out.println("Le joueur a gagner");
				}else {
					System.out.println("L'ordi a gagner");
				}
			}
		} while (condition==false);

	}

}
