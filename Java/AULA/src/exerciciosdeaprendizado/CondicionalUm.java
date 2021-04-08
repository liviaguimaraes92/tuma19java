package exerciciosdeaprendizado;

import java.util.Scanner;

public class CondicionalUm {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int idade;
		String nome;
		
		System.out.printf("Diga sua idade: ");
		idade = leia.nextInt();
		leia.nextLine();		
		System.out.printf("Diga seu nome: ");
		nome = leia.nextLine();
		//System.out.printf("Diga sua idade:" %d ,idade);
		//System.out.printf("Diga seu nome:" %s ,nome);
		
		if (idade >= 18) {
			System.out.printf("\nVocê é maior de idade.");
		}
		else if (idade >=1 && idade < 18)
		{
				System.out.printf("\nVocê é menor de idade.");
			}
		else {
			System.out.printf("\nVocê entrou com uma idade invalida.");
		}
	}

}
