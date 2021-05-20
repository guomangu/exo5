package pendu;

import java.util.Scanner;

public class pendaison {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("mot de plus de 4 lettre plz");
		String reponse=sc.nextLine();
		
		if (reponse.length() > 4) {
			System.out.println("pret pour chargement...");
		} else {
			System.out.println("badd");
			return;
		}
		
		int b=0;
		char tab[]=reponse.toCharArray();
		char tab2[]=new char[tab.length];
		for (char a : tab) {
			if (b==0 || b==tab.length-1) {
				System.out.println("chargement...");
				tab2[b]=a;
			}else {
				tab2[b]='_';
			}
			b++;
		}
		
		int c=0;
		String reponse2;
		char chat;
		char simba;
		boolean bo=true;
		do {
			String str = new String(tab2);
			System.out.println(str);
			System.out.println("Donne ce genre de proposition suceptible de marcher plz");
			reponse2=sc.nextLine();
			
			/*
			 * chat=reponse2.toCharArray(); 
			 * simba=chat[0];
			 */
			
			chat= reponse2.charAt(0);
			int e=0;
			for (char d : tab) {
				if (d==chat) {
					tab2[e]=chat;
				}
				e++;
			}
			c++;
			
			bo=true;
			int g=0;
			for (char f : tab) {
				if (f!=tab2[g]) {
					bo=false;
				}
				
				g++;
			}
			
			bo=true;
			
		} while (bo==false && c<6);
				
		if (bo==false) {
			System.out.println("Victoire vous etes un bg");
		}else {
			System.out.println("Losewr^^sweorl");
		}
	}
}
