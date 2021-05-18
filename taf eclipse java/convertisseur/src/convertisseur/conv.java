package convertisseur;

import java.text.DecimalFormat;
import java.util.Scanner;

public class conv {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("convertisseur degré celcius et farenheit");
		System.out.println("------------------------------------------");
		char mode =' ';
		String test="";
		
		do {
			System.out.println("choisissez le mode de conversion");
			System.out.println("1 - conv celcius vers faren");
			System.out.println("2 - conv faren vers celcius");
		
			test=sc.nextLine();
			mode=test.charAt(0);
			if (mode!='1' && mode!='2' || test.length()>1) {
				System.out.println("Mode Inconnu ! veiller reiterer mdr");
			}
		}while(mode!='1' && mode!='2' || test.length()>1);
		
		if (mode=='1') {
			System.out.println("veillez entrer la temperaature en celcul");
			double a = sc.nextDouble();
			double s = a*(9/5)+32;
			
			DecimalFormat modele = new DecimalFormat("0.00");
			String res=modele.format(s);
			System.out.println("temperature en faren "+res);
		}else {
			System.out.println("veillez entrer la temperaature en faren");
			double a = sc.nextDouble();
			double s = (a-32)*5/9;
			
			DecimalFormat modele = new DecimalFormat("0.00");
			String res=modele.format(s);
			System.out.println("temperature en celcul "+s);
		}
	}
}
