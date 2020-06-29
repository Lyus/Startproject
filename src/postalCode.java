import java.util.Scanner;
import java.text.DecimalFormat;

public class postalCode {
	private String postalCode_;
	private boolean answer;

	private postalCode(String pc){
		this.postalCode_ = pc;

	}
//fonction controle saisie clavier
	public static boolean isNumeric(String str) { 
		  try {  
		    Double.parseDouble(str);  
		    return true;
		  } catch(NumberFormatException e){  
		    return false;  
		  }  
		}
	private void isPostalCode() {
	if(postalCode_.length() > 5)
		System.out.println(postalCode_ + " doit contenir au maximum 5 chiffres");
	else if(postalCode_.length() < 5)
		System.out.println(postalCode_ + " doit contenir au minimum 5 chiffres");
	else
		System.out.println(postalCode_ + " est un code postal valide");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initaliser scanner
		Scanner sc = new Scanner(System.in);
		//Demande du Code Postal
		System.out.println("Merci de renseigner votre code Postal(France)");
		String postalCode_clav = sc.nextLine();
		if(isNumeric(postalCode_clav)) {
			//Initialiser Class
			postalCode em = new postalCode(postalCode_clav);
			//affichage résultat
			em.isPostalCode();
		} else
			System.out.println("Votre saisie comporte de valeures non numériques");

	}

}
