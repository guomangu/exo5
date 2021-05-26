package dicotomie;

import java.util.Scanner;

public class dicomytho {

	public static void main(String[] args) {
		//preparation
		//seulement paire ^^
		
		String[] tab = {"hitler","hussein","leopold","pacha","staline","tojo","zedong","zeeee"};

		Scanner sc = new Scanner(System.in);
		System.out.println("Quel dictateur fait le plus gros pet ?");
		String reponse=sc.nextLine();
		
	do {
		
		//cherche dans quel partie du tab est la cible 
		
		int n=tab.length;
		int m=tab.length/2;
		int u=n-m;
		int i=0;
		int lol=0;
		
		for (String s : tab) {
			if (s.equals(reponse)) {
				if (i<m) {
					System.out.println("dans le prems");
					lol=1;
				}else if(i>m){
					System.out.println("dans le secs");
					lol=2;
				}else {
					System.out.println("dans le secs");
					lol=2;
				}
			} else {

			}
			i++;
		}
		
		//distribu le tab principal en 2 plus petit tab
		
		String minitab1[] = new String[m];
		String minitab2[] = new String[u];
		int o=0;
		int w=0;
		if (lol==1) 
		{
			for (int j = 0; j < m; j++) {
				minitab1[j]=tab[j];
				o=m;
			}
		} else if(lol==2)
		{
			for (int j = u; j < n; j++) {
				minitab2[w]=tab[j];
				o=u;
				w++;
			}
		}else
		
		{
			System.out.println("lolol");

		}
		
		//preparation tab pour minitab
		
		boolean qa=false;
		if (lol==2) {
			for (String q : minitab2) {
				if (q==null) {
					qa=true;
				} else {
					qa=false;
				}
			}
		} else {
			for (String q : minitab1) {
				if (q==null) {
					qa=true;
				} else {
					qa=false;
				}
			}
		}
		
		if (qa==true) {
			o--;
		}
		
		
		//remplace tab principal par le petit tab qui contient la cible pour boucle
		
		
		tab = new String[o];
		int z=0;
		if (lol==1) {
			for (String a : minitab1) {
				if (a!=null) {
					tab[z]=a;
					z++;
				} else {
			}
			}
			} else {
			for (String a : minitab2) {
				if (a==null) {
					
				} else {
					tab[z]=a;
					z++;
				}
				
			}
		}
		
	} while (tab.length!=1);
		System.out.println("C'est une reussite vous avez trouver mr. "+tab[0]);
	}
}
