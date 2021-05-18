package caracara2;

import java.util.Arrays;
import java.util.Scanner;

public class caractere2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ecrit moi donc une phrase avec un .");
		String reponse=scan.nextLine();
		String tabLettre[] = reponse.split("");
		System.out.println(reponse);
		
		int tabChiffre[]=new int[tabLettre.length];
		for(int s : tabChiffre) {
			s=0;
		}
		
		String[] uniqueLettre = Arrays.stream(tabLettre).distinct().toArray(String[]::new);
		
		int i=0;
		for(String s : uniqueLettre) {
			for (String d : tabLettre) {
				if (s.equals(d)) {
					tabChiffre[i]=tabChiffre[i]+1;
					//System.out.println(s+" : "+d+" : "+tabChiffre[i]);
				}
			}
			i++;
		}
		
		int k =0;
		for(String b : uniqueLettre) {
			System.out.println("il y a "+tabChiffre[k]+" '"+b+"'.");
			k++;
		}
	}
}
