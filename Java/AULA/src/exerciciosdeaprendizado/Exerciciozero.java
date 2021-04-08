package exerciciosdeaprendizado;

import java.util.Scanner;

public class Exerciciozero {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int a;
		int b;
		int soma;
		
		System.out.println("Escreva o valor de A: ");
		a = leia.nextInt();
		System.out.println("Escreva o valor de B: ");
		b = leia.nextInt();
		soma = a+b;
		System.out.println("Escreva o valor da soma de A+B: " +soma);
	}

}
