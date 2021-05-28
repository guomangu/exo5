import java.util.Scanner;

public class minimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Donne plusieur nombre ma caille");
		String reponse=sc.nextLine();
		String tabLettre[] = reponse.split(" ");
		
		//convertii str en int
		
		int tabNb[ ] = new int[tabLettre.length];
		int z =0;
		for (String s : tabLettre) {
			tabNb[z] = Integer.parseInt(s);
			z++;
		}
		
		//trie minima
		
		int actu;
		int mini;
		int j;
		int temp;
		
		for (actu = 0; actu < tabNb.length; actu++) {
			mini=actu;
			for (j = actu; j < tabNb.length; j++) {
				if (tabNb[j]<tabNb[mini]) {
					mini=j;
				}
				temp=tabNb[actu];
				tabNb[actu]=tabNb[mini];
				tabNb[mini]=temp;
			}
		}
		
		//affiche tabNb trier
		
		for (int o : tabNb) {
			System.out.print(o+" ");
		}
	}
}
