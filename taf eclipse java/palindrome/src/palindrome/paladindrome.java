package palindrome;

import java.util.Iterator;
import java.util.Scanner;

public class paladindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Donne chaine de cara plz");
		String reponse=sc.nextLine();
		String result = reponse.replaceAll("\\s+","");
		Character[] charObjectArray = result.chars().mapToObj(c -> (char)c).toArray(Character[]::new);

		Character[] tabresultinvers = new Character[result.length()];
		int j=charObjectArray.length-1;
		for (Character x : charObjectArray) {
			tabresultinvers[j]=x;
			j--;
		}
		
		boolean unos=true;
		int z=0;
		for (Character a : tabresultinvers) {
			if (a==charObjectArray[z]) {
				System.out.println("correspond : "+a+" = "+charObjectArray[z]);
			} else {
				System.out.println("nul : "+a+" = "+charObjectArray[z]);

				unos=false;
			}
			z++;
		}
		
		if (unos==true) {
			System.out.println("Vous avez un palindrome monsieur");
		} else {
			System.out.println("Vous avez un r mongars");

		}
	}
}
