import java.util.Scanner;

public class Cars {
//initaliser variable
	private String name, mark, model, color;
	private double speed, distance;
	
	private Cars(String n, String ma, String mo, String co, double sp, double di) {
		this.name = n;
		this.mark = ma;
		this.model = mo;
		this.color = co;
		this.speed = sp;
		this.distance = di;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // donner à renseigner
		System.out.println("Merci de renseigner votre nom");
		String name_clavier = sc.nextLine();
		System.out.println("Merci de renseigner votre Marque");
		String mark_clavier = sc.nextLine();
		System.out.println("Merci de renseigner votre Modéle");
		String Model_clavier = sc.nextLine();
		System.out.println("Merci de renseigner votre Couleur");
		String Model_color = sc.nextLine();
		System.out.println("Merci de renseigner votre vitesse");
		double speed_clavier = sc.nextDouble();
		System.out.println("Merci de renseigner la distance à parcourir");
		double distance_clavier = sc.nextDouble();
	
		Cars em = new Cars(name_clavier, mark_clavier, Model_clavier, Model_color, speed_clavier, distance_clavier);
		double time = em.FunctionTime();
	 em.affiche(time);
	}

	
	private double FunctionTime() {
		
		double time = distance/speed; 
		return time;
	}
	
	
	public  void affiche(double time) {
		//calcul salaire net
		System.out.println("Bonjour, " + name);
		System.out.println("Votre voiture est une " + mark +", modéle " + model + " de couleur " + color);
		System.out.println("En roulant à une vitesse de " + speed + "Km/h pour une distance de " + distance +"Km." );
		System.out.println("Vous avez mis " + time + " heures." );
	}
	 
}
