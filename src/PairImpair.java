import java.util.Scanner;
public class PairImpair {

	private static Scanner scanner = new Scanner(System.in);

	//fonction affichage paire ou impaire
	private static void bouclePaireImpaire(int type, int min, int max) {
	
		for(int i = min; i <= max; i++) {
			if(type == 1) {
				if(i % 2 == 0)
					System.out.println(i);
			}
			else {
				if(i % 2 != 0)
					System.out.println(i);
			}
		}
	}
	public static void main(String args[]) {
		int i,min, max;
		// Menu choix
		System.out.println(" ------------------------------------------------------ \n" );
		System.out.println("|              Merci de faire votre choix:             |\n" );
		System.out.println("| 1. Afficher les paires de 0 à votre chiffre choisi   |\n" );	
		System.out.println("| 2. Afficher les impaires de 0 à votre chiffre choisi |\n" );
		System.out.println("| 3. Afficher les paires entres deux chiffres donnés   |\n" );	
		System.out.println("| 4. Afficher les paires entres deux chiffres donnés   |\n" );	
		System.out.println("| 0. exit                                              |\n" );
		System.out.println(" ------------------------------------------------------\n");
		System.out.println("C'est à vous: \n" );	
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		if(i < 0 || i > 4) {
			System.out.println("Entrée invitalide" );
			return;
		}
		//selection de la fonction par rapport au choix
		switch(i) {
		case(1):
			System.out.println("De 0 à : \n" );	
		max = sc.nextInt();
		bouclePaireImpaire(1, 0, max);
		break;
		case(2):
			System.out.println("De 0 à : \n" );	
		max = sc.nextInt();
		bouclePaireImpaire(2, 0, max);
		break;
		case(3):
			System.out.println("Départ: \n" );	
		min = sc.nextInt();
		System.out.println("Fin: \n");	
		max = sc.nextInt();
		if(min > max)
			break;
		bouclePaireImpaire(1, min, max);
		break;
		case(4):
			System.out.println("Départ: \n" );	
		min = sc.nextInt();
		System.out.println("Fin: \n");	
		max = sc.nextInt();
		if(min > max)
			break;
		bouclePaireImpaire(2, min, max);
		break;
		case(0):
			System.out.println("bye" );
		break;
		default:
			System.out.println("bye" );
			break;
		}
	}
}