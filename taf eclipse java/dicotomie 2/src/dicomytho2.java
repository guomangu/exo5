import java.util.Scanner;

public class dicomytho2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] tabjo = {"hitler","hussein","leopold","pacha","staline","tojo","zedong","zeeee"};

		System.out.println("Quel dictateur fait le plus gros pet ?");
		String joseph=sc.nextLine();
		
		//preparation mini valeur habituelle

        int nombretab = tabjo.length;
        int sec;
        int lol = 0;
        int supra = 0;
        int sectab1 = 0;
        int sectab2 = 0;
        do {
        
        	//definir les taille des tab
        	
            if (supra > 0)
            {
                sec = supra / 2;
                sectab1 = sec;
                sectab2 = supra - sec;
            }
            else
            {
                sec = nombretab / 2;
                sectab1 = sec;
                sectab2 = nombretab - sec;
            }
            
            //remplir mini tab
            
            int i = 0;
            int j = 0;
            int k = 0;
            String tab1[] = new String[sectab1];
    		String tab2[] = new String[sectab2];
    		
            for (String item : tabjo)
            {                
                if (i<sec)
                {
                    tab1[j] = item;
                    j++;
                }
                else
                {
                    tab2[k] = item;
                    k++;
                }
                i++;
            }
            
    		System.out.println("---------------------");

    		//selec minitab avec cible

    		boolean overreact=false;
            String choix = "0";
            for (String item : tab1)
            {
                if (item.equals( joseph))
                {
                    choix = "tab1";
                    overreact=true;
                }
            }
            for (String item : tab2)
            {
                if (item.equals(joseph))
                {
                    choix = "tab2";
                    overreact=true;
                }
            }
            
            //si trouve pas correspondance on arrete maggle
            
            if (overreact==false) {
        		System.out.println("J'ai rien trouver j'active le protocole fantome");
        		return;
			}

            //remplacer bon minitab par tab pricipal pour boucle
            
            if (choix == "tab1")
            {
                tabjo = new String[sectab1];
                
                int l = 0;
                for (String item : tab1)
                {
                    tabjo[l] = item;
            		System.out.println(item);

                    l++;
                }

            }
            else if (choix == "tab2")
            {
                tabjo = new String[sectab2];
                int m = 0;
                for (String item : tab2)
                {
                    tabjo[m] = item;
            		System.out.println(item);

                    m++;
                }
            }

            
            //savoir si sort pour fin ou preparer futur boucle

            supra = tabjo.length;

            if (tabjo.length == 1)
            {
                lol = 1;
                
            }


            
        } while (lol == 0);

        System.out.println();
		System.out.println("trouver beaugoss mtn fait mieux si t'est ma caille");

	}

}
