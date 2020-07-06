package speed;


public class SpeedConverter {
long miles;

	private static long toMilesPerHour(double kilometersPerHour) {
	if(kilometersPerHour < 0)
			return -1;
		else {
		long kilometersPerHour_ = (long) Math.round(kilometersPerHour / 1.609);
		long calcul =  kilometersPerHour_  ; 
		return calcul;
		}
	}
	
	private  static void printConversion(double kilometersPerHour) {
		double miles = toMilesPerHour(kilometersPerHour);
		if(miles == -1)
			System.out.println("Valeur Invalide");
		else
		System.out.println(kilometersPerHour +"km/h = " + miles + " mi/h");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] m={
			    {1.5},
			    {10.25},
			    {-5.6},
			    {25.42},
			    {75.114}
			};
		for(int i = 0; i < m.length; i++){
		
		long result = toMilesPerHour(m[i][0]);
		
		System.out.println(result);
		printConversion(m[i][0]);
		}
	}

}
