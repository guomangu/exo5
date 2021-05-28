import java.text.DecimalFormat;
import java.util.Scanner;

public class pgcd2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("donner moi votre fraction svp^^");
		String fr=sc.nextLine();
		String tabFr[] = fr.split("/");
		
		System.out.println("");
		
		String result=powa(tabFr);
		System.out.println(result);
		System.out.println("Bonne Journey");
		
	}
	
	public	static String powa(String[] tabFr) {
        System.out.println("POKEBALL GO!");
        String num0=tabFr[0];
        String deno0=tabFr[1];
        
        double num1 = Integer.parseInt(num0);
        double deno1 = Integer.parseInt(deno0);
        
        Double pgcd = wapo(num1,deno1);
        Double num2=num1/pgcd;
        Double deno2=deno1/pgcd;
        
        DecimalFormat modele = new DecimalFormat("0");
        String num3=modele.format(num2);
        String deno3=modele.format(deno2);
        
        String phrase="La fonction simplifier est "+num3+"/"+deno3+" lol.";
		return phrase;
    }

	public	static Double wapo(double num1,double deno1) {
		double p = num1;
		double q = deno1;
		double t=0;
		double a=p;
		double b=q;
		double r=0;
		
		if (p*q!=0) {
			if ( p>q) {   		  	
	            t = a;
	            a = b;
	            b = t;
			}
			
			do{
				r = a % b;
	            a = b;
	            b = r;
			}while(r !=0);
		}
		
		return a;
	}
	
}

