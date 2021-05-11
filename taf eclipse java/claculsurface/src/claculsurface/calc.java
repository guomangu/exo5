package claculsurface;

import java.util.Scanner;

public class calc {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("balance ton rayon");
		String reponse=scan.nextLine();
		double a = Integer.parseInt(reponse);
		
		System.out.println("balance ton angle");
		String reponseb=scan.nextLine();
		double b = Integer.parseInt(reponseb);
		
		double lol=Math.PI*(Math.pow(a, 2))*b/360;
		
		System.out.println("une surface de secteur circulaire d'angle "+b+" et de rayon "+a+" est egal a "+lol);
		
		System.out.println("--------------------switch exo-------------------------------------");

		System.out.println("balance ton rayon de sphere");
		String reponse4=scan.nextLine();
		double d = Integer.parseInt(reponse4);
		
		double lol2=4*Math.PI*Math.pow(d, 2);
		double lol3=4*Math.PI/3*Math.pow(d, 3);
		
		System.out.println("Le rayon("+d+") du sphere donne un air de "+lol2+" et un volume de "+lol3);

	}

}
