import java.util.Scanner;

public class Equation {
	public float a, b, c;
	
	public Equation(float a, float b, float c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	void equation() {
		float delta;	

		delta = (b*b) -4*a*c;
		if (delta < 0)
			System.out.println("L'équation n'a aucune solution réelle.");
		else if (delta == 0)
			System.out.println("L'équation n'a qu'une seule solution.");
		else if (delta > 0)
			System.out.println("L'équation a deux solutions différentes.");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a, b, c;

		System.out.println("Donnez les valeurs de a, de b et de c tel que ax²+bx+c=0");
		System.out.println("a =");
		a = sc.nextFloat();
		System.out.println("b =");
		b = sc.nextFloat();
		System.out.println("c =");
		c = sc.nextFloat();
		Equation e = new Equation(a, b, c);
		e.equation();
	}
}