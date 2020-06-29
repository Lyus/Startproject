import java.util.Scanner;

public class cafe {
	private double combienVerse;  
	
	private cafe(double cv){
		this.combienVerse = cv;
	
	}
	
	private boolean monCalcul(double prixCafe) {
		if(combienVerse ==  prixCafe) {
			return true;
		}
		else {
			return false;
		}	
	}
	
	//affichage si prix de café = appoint
	private void affichage() {
			System.out.println("Vous avez l'appoint");
	}
	private void affichageDiff(double amount) {
		if(amount > 0)
		System.out.println("Il vous manque " + amount + "€");
		else
			System.out.println("Nous vous remboursons " + amount + "€");
			
}
	
	private double myDiff(double prixCafe){
		
		double diff = prixCafe - combienVerse;
		
		return diff;
	}
	
	public static void main(String[] args) {
		double prixCafe = 15;
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Montant versé:");
double montant = sc.nextDouble();
System.out.println("Montant versé: " + montant + "€");		

cafe myObj = new cafe(montant);


//Vériication si appoint
if(myObj.monCalcul(prixCafe) == true) {
	myObj.affichage();
}
else
{ 
double amount = myObj.myDiff(prixCafe);
	myObj.affichageDiff(amount);
	}
	}
}
