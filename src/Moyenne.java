import java.util.Scanner;

public class Moyenne {
	//variable const
		final static String validUser = "Dupont";
		final static String  validPassword = "test"; 
		
		private double maths, francais, anglais, physique, sport, histGeo;
	private String name, firstName;
		private Moyenne(String na, String fna, double ma, double fr, double ang, double p, double hg, double sp) {
			this.name = na;
			this.firstName = fna;
			this.maths = ma;
			this.francais = fr;
			this.sport = sp;
			this.anglais = ang;
			this.histGeo = hg;
			this.physique = p;		
		}
		
		private double myAverage() {
			double total = maths + francais + sport + physique + anglais + histGeo;
			double average = total / 6;		
			return average;
		}
		
		private void myShow(double result) {
			System.out.println("La moyenne de l'Eleve " + name + " " + firstName + " est de " + result);
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenue dans le Système de notation des éléves:");
		
		System.out.println("Nom d'utilisateur:");
		String user_cla= sc.nextLine();
		//vérification user
		if(!user_cla.equals(validUser)) {
			System.out.println("Nom d'utilisateur inconnu");
			return;
		}
		//vérification mp
		System.out.println("Mot de passe:");
		String pass_cla = sc.nextLine();
		if(!pass_cla.equals(validPassword)) {
			System.out.println("Mot de passe incorrect");
			return;
		}
		System.out.println("Welcome Monsieur " + validUser + " Merci de rentrer les informations de votre Eleves");
		System.out.println("Nom éléve:");
		String name = sc.nextLine();
		System.out.println("Prenom eleve");
		String fname = sc.nextLine();
		System.out.println("Maths:");
		double maths = sc.nextDouble();
		System.out.println("Physique:");
		double physique = sc.nextDouble();
		System.out.println("french:");
		double francais = sc.nextDouble();
		System.out.println("english:");
		double anglais = sc.nextDouble();
		System.out.println("Histoire Geo:");
		double histGeo = sc.nextDouble();
		System.out.println("Sport:");
		double sport = sc.nextDouble();
//initial class
Moyenne em = new Moyenne(name, fname, maths, francais, anglais, physique, histGeo, sport);
		double myAverage = em.myAverage();
	
		em.myShow(myAverage);

	}

}
