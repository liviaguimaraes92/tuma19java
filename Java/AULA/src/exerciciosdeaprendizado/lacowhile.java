package exerciciosdeaprendizado;

import java.util.Scanner;

public class lacowhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.printf ("Diga a sua idade: ");
		idade = leia.nextInt();
		
		while (idade >= 1) {
			System.out.printf ("Diga sua idade %d" ,idade);
		}
			if (idade >= 18) {
				System.out.printf ("Você é de maior.");
			}
			else {
				System.out.printf("Você é de menor.");
			}
			System.out.printf ("Diga a sua idade: ");
			idade = leia.nextInt();
	}

}
