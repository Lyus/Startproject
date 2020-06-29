import java.util.Scanner;

public class MaCalculette {
	//Variable
	private char op;
	private double nFirst, nSec;
//construc_
	private MaCalculette(char op, double n1, double n2) {
		this.op = op;
		this.nFirst = n1;
		this.nSec = n2;
	}

//router en fonction du type d'op
	public double monRouter(){
		switch (op) {
		case '+':
			double result_1 = myAdd(nFirst, nSec, op);
			return result_1;
		case '-':
			double result_2 = mySub(nFirst, nSec, op);
			return result_2;
		case '/':
			double result_4 = myMod(nFirst, nSec, op);
			return result_4;
		case '*':
			double result_3 = myMult(nFirst, nSec, op);
			return result_3;
		default:
			System.out.println("Donnée non valide");
			return 0;
		}
	}
	//function Add
	public static double myAdd(double nFirst, double nSec, char op) {

		double result = nFirst + nSec;
		return result;
	}
	//function substrac
	public static double mySub(double nFirst, double nSec, char op) {

		double result = nFirst - nSec;
		return result;
	}
	
	//function Multiplication
	public static double myMult(double nFirst, double nSec, char op) {

		double result = nFirst * nSec;
		return result;
	}
	//function division
	public static double myMod(double nFirst, double nSec, char op) {

		double result = nFirst / nSec;
		return result;
	}


	public static void show(double result, String calcul) {
		System.out.println("votre calcul \n");
		System.out.println(calcul + "\n");
		System.out.println("Resultat \n");
		System.out.println(result + "\n");
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double globalResult = 0;
		double chiffreUn, chiffreDeux;
		char op;
		String calcul = "";
		int boucle = 0;
		do {
			Scanner sc = new Scanner(System.in);
			if(boucle == 0) {

				System.out.println("Chiffre 1 \n");
				chiffreUn = sc.nextDouble();
				System.out.print("Enter an operator (+, -, *, /): \n");
				op = sc.next().charAt(0);
				System.out.println("Chiffre 2 \n");
				chiffreDeux = sc.nextDouble();
				calcul = chiffreUn + " " + op + " " + chiffreDeux;
			}
			else {
				chiffreUn = globalResult;
				System.out.print("Enter an operator (+, -, *, /): \n");
				System.out.print("Attention! Pour afficher le resultat '=': \n");
				op = sc.next().charAt(0);
				if(op == '=') {
					show(globalResult, calcul);
				return;
				}
				else {
					System.out.println("Chiffre 2 \n");
					chiffreDeux = sc.nextDouble();
					calcul = calcul + " " + op + " " + chiffreDeux;
				}
			} // vérification signe
			if(op == '+' || op == '-' || op == '/' || op == '*') {
				if(op == '/' && chiffreUn == 0){
					System.out.println("operation Impossible \n");
					return;
				}
				if(op == '/' && chiffreDeux == 0){
					System.out.println("operation Impossible \n");
					return;
				}
				MaCalculette ca = new MaCalculette(op, chiffreUn, chiffreDeux);
				double result = ca.monRouter();
				System.out.println("Votre Calcul \n");
				System.out.println(calcul + "\n");
				System.out.println("Resultat provisoire: \n");
				System.out.println(result + "\n");
				globalResult = result;
			}
			else {
				System.out.println("erreur signe utilisé \n");
				show(globalResult, calcul);
				return;
			}
			boucle++;
		}while(boucle < 99998 ); //condition sortie boucle
	}
}
