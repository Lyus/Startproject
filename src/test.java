import java.util.Scanner;

public class test {
	
    public static void main(java.lang.String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez un nombre: ");
        double nombre1 = sc.nextDouble();
        System.out.println("Saisissez un deuxieme nombre: ");
        double nombre2 = sc.nextDouble();
        System.out.println(" le plus grand = " + Math.max(nombre1, nombre2));
        System.out.println(" le plus petit = " + Math.min(nombre1, nombre2));
    }

}
