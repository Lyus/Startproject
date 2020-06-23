
public class Tva {

	private double duty_free;
	private double rate, tva_amount;
	
private Tva(double r, double df){
	this.rate = r;
	this.duty_free = df; 
}

//Calcul de la tva arg taux & ht
public double calculTVA() {
	 tva_amount = duty_free *rate/100;
	 return tva_amount;
}
//affichage
public void show(double tva_amount) {
	System.out.println(tva_amount);
}


public static void main(String[] args) {
	Tva[] em = new Tva[3];
	em[0] = new Tva(8000, 20);
	em[1] = new Tva(1000, 19.6);
	em[2] = new Tva(600, 7);
	
	

	for (Tva v : em) {
	v.show(v.calculTVA());
	}
	}
	
}


 