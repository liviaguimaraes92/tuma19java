import java.util.Locale;
import java.util.Scanner;

public class Javamodulo2questao5 {

	public static void main(String[] args) {
		// Crie um programa que leia um n�mero do teclado 
		// at� que encontre um n�mero igual a zero. 
		// No final, mostre a soma dos n�meros digitados.

		Scanner leia = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		int numero;
		int x=0;
		int somaNumeros = 0;	
			
		do {
		System.out.println ("Digite um n�mero: ");
		numero = leia.nextInt();
		somaNumeros = somaNumeros + numero;
		
		}
						
	    while (numero != 0);
	    	System.out.println ("Soma dos n�meros: " +somaNumeros);
	    }
	}