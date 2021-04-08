import java.util.Scanner;
import java.lang.Math;

public class Modulo1Exercicio4 {


	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
	
		  double a;
		  double b;
		  double c;

		  System.out.println ("A: ");
		  a = leia.nextDouble();

		    System.out.println("B: ");
		  b = leia.nextDouble();
		   
		    System.out.println("C: ");
		  c = leia.nextDouble();
		    
		    double R = Math.pow ((a + b), 2);
		    double S = Math.pow ((b + c), 2);
		    double D = (R + S) / 2;

		    System.out.printf ("O resultado de D é: %.2f",D);
		}
}
