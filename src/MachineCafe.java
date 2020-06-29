import java.util.Scanner;

public class MachineCafe {

private static int stockEau = 100;
private String type;
private int eau;

private MachineCafe(String t, int v){
	this.type = t;
	this.eau = v;
}
	public static void router(int i, int stockEau) {
		int cafe;
		//selection de la fonction par rapport au choix
		Scanner ca = new Scanner(System.in);
		switch(i) {
		case(1): //Expresso
			System.out.println(" ------------------------------------------------------ \n" );
		System.out.println("|              Merci de faire votre choix:             |\n" );
		System.out.println("| 1. Court                                             |\n" );	
		System.out.println("| 2. Long                                              |\n" );
		System.out.println(" ------------------------------------------------------\n");
		cafe = ca.nextInt();
		if(cafe < 1 || cafe > 2) {
			System.out.println("Entrée invalide \n" );
			break;
		}
		expresso(cafe);
		break;
		case(2): //CafécAmericain
			System.out.println(" ------------------------------------------------------ \n" );
		System.out.println("|              Merci de faire votre choix:             |\n" );
		System.out.println("| 1. Court                                             |\n" );	
		System.out.println("| 2. Long                                              |\n" );
		System.out.println(" ------------------------------------------------------\n");
		cafe = ca.nextInt();
		if(cafe < 1 || cafe > 2) {
			System.out.println("Entrée invalide \n" );
			break;
		}
		cafeAmericain(cafe);
		break;
		case(3): //Con Leche
			System.out.println(" ------------------------------------------------------ \n" );
		System.out.println("|              Merci de faire votre choix:             |\n" );
		System.out.println("| 1. Court                                             |\n" );	
		System.out.println("| 2. Long                                              |\n" );
		System.out.println(" ------------------------------------------------------\n");
		cafe = ca.nextInt();
		if(cafe < 1 || cafe > 2) {
			System.out.println("Entrée invalide \n" );
			break;
		}
		conLeche(cafe);
		break;
		case(4): //Cappuccino	
			System.out.println(" ------------------------------------------------------ \n" );
		System.out.println("|              Merci de faire votre choix:             |\n" );
		System.out.println("| 1. Court                                             |\n" );	
		System.out.println("| 2. Long                                              |\n" );
		System.out.println(" ------------------------------------------------------\n");
		cafe = ca.nextInt();
		if(cafe < 1 || cafe > 2) {
			System.out.println("Entrée invalide \n" );
			break;
		}
		cappuccino(cafe);
		break;
		case(5): //Mokaccino
		System.out.println(" ------------------------------------------------------ \n" );
		System.out.println("|              Merci de faire votre choix:             |\n" );
		System.out.println("| 1. Court                                             |\n" );	
		System.out.println("| 2. Long                                              |\n" );
		System.out.println(" ------------------------------------------------------\n");
		cafe = ca.nextInt();
		if(cafe < 1 || cafe > 2) {
			System.out.println("Entrée invalide \n" );
			break;
		}
		mokaccino(cafe);
		break;
		default:
			System.out.println("Bonne Journée!" );
			break;
		}
	}
	public static void expresso(int type) 
	{
		int volume;
		switch(type) {
		case(1): //court
			monObj("Expresso", 10);
		break;
		case(2): //long
			monObj("Expresso", 20);
		break;
		default:
			System.out.println("Bonne Journée!" );
			break;
		}
	}
	public static void cafeAmericain(int type) 
	{
		switch(type) {
		case(1): //court
			monObj("Cafe Americain", 20);
		break;
		case(2): //long
			monObj("Cafe Americain", 30);
		break;
		default:
			System.out.println("Bonne Journée!" );
			break;
		}
	}
	public static void conLeche(int type) 
	{
		switch(type) {
		case(1): //court
			monObj("Con Leche", 10);
		break;
		case(2): //long
			monObj("Con Leche", 20);
		break;
		default:
			System.out.println("Bonne Journée!" );
			break;
		}
	}
	public static void cappuccino(int type) 
	{
		int volume;
		switch(type) {
		case(1): //court
			monObj("Cappucino", 5);
		break;
		case(2): //long
			monObj("Cappuccino", 10);
		break;
		default:
			System.out.println("Bonne Journée!" );
			break;
		}
	}
	public static void mokaccino(int type) 
	{
		switch(type) {
		case(1): //court
			 monObj("mokaccino", 2);
		break;
		case(2): //long
			  monObj("mokaccino", 15);
		break;
		default:
			System.out.println("Bonne Journée!" );
			break;
		}
	}
	public static void monObj(String type, int eau) {
		MachineCafe monObj = new MachineCafe(type, eau);
		int volume = monObj.calculEau();
		 stockEau = volume;
			if(volume > 0)
				monObj.trueA();
			else
				monObj.trueF();
	}
	public  int calculEau() {
		int volume = stockEau - eau;
		return volume;
	}
public  void trueA() {
	System.out.println("Votre " + type + " est prét \n \n");
	System.out.println("Volume d'eau restant" + stockEau + "ml \n \n");
}
public  void trueF() { 

	System.out.println("Votre " + type + " ne peut pas être préparé \n \n");
	System.out.println("Volume d'eau restant Insuffisant \n \n");
	System.out.println("merci de remplir le réservoir d'eau. \n \n");
	
}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int i;
		int variable = 0;
		int stockEau = 100;
		// TODO Auto-generated method stub
		do {
			System.out.println(" ------------------------------------------------------ \n" );
			System.out.println("|              Merci de faire votre choix:             |\n" );
			System.out.println("| 1. ESPRESSO                                          |\n" );	
			System.out.println("| 2. CAFÉ AMÉRICAIN                                    |\n" );
			System.out.println("| 3. CON LECHE                                         |\n" );	
			System.out.println("| 4. CAPPUCCINO                                        |\n" );	
			System.out.println("| 5. MOKACCINO                                         |\n" );	
			System.out.println("| 0. Fin de commande                                   |\n" );
			System.out.println(" ------------------------------------------------------\n");
			// scanner
			System.out.println("\n");
			System.out.println(" Votre choix: \n \n");
			i = sc.nextInt();
			System.out.println("\n");
			//condtion de rejet
			if(i < 0 || i > 5) {
				System.out.println("Entrée invalide \n \n" );
				return;
			}
			if(i == 0) {
				System.out.println("Bonne journée! \n \n" );
				return;
			}
			 
			////////////////////
			router(i, stockEau);
		}while(variable < 10);
		sc.close();
	}
}
