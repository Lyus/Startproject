import java.util.Scanner;

public class Employe {
		//variable initialisées
	private String name;
	private double salaireBrut;
	private double taux;

	
	public Employe(String n, double sb, double t )
	{
this.name = n;
this.salaireBrut = sb;
this.taux = t;
	}
	

	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Merci de remplir votre Nom");
		String name_clavier = sc.nextLine();
		System.out.println("Merci de remplir votre Salaire Brut");
		double salaireBrut_clavier = sc.nextDouble();
		double taux_i = 20;
		Employe em = new Employe(name_clavier, salaireBrut_clavier, taux_i);
		double salaireNet = em.salaireNet();
	 em.affiche(salaireNet);
	
	}
	
	//fonction calcul de la retenue
protected  double salaireNet() {
	double retenues = salaireBrut * (taux/100);
	double salaireNet = salaireBrut - retenues;
	return salaireNet;
}
public  void affiche(double salaireNet) {
	//calcul salaire net
	System.out.println("votre nom est " + name + ", vous êtes payés " + salaireBrut + "€");
	System.out.println("Votre salaire net est " + salaireNet + "€");
}
 

	

}
