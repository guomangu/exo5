package tri;

import java.util.Scanner;

public class trieur {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Donne plusieur nombre ma caille");
		String reponse=sc.nextLine();
		String tabLettre[] = reponse.split(" ");
		
		int tabNb[ ] = new int[tabLettre.length];
		int z =0;
		for (String s : tabLettre) {
			tabNb[z] = Integer.parseInt(s);
			z++;
		}
	
		//mdr
          for (int i = 0; i < tabNb.length - 1; i++)  
          {
               int index = i;  
               for (int j = i + 1; j < tabNb.length; j++)
               {
                    if (tabNb[j] < tabNb[index]){ 
                         index = j;
                    }
               }
 
               int min = tabNb[index];
               tabNb[index] = tabNb[i]; 
               tabNb[i] = min;
          }
	     //mdr
		
		for (int o : tabNb) {
			System.out.println(o);
		}
	}

}
