package exerciciosdeaprendizado;

import java.util.Scanner;

public class Modulo1 {

	public static void main(String[] args) {
	Scanner leia = new Scanner (System.in);

	double nota1, nota2, nota3, media; //*double = real
	
	System.out.println("Digite a nota 1: ");
	nota1 = leia.nextDouble();
	System.out.println("Digite a nota 2: ");
	nota2 = leia.nextDouble();
	System.out.println("Digite a nota 3: ");
	nota3 = leia.nextDouble();
	
	media = (nota1+nota2+nota3)/3;
	System.out.printf("Média: %.2f" ,media);
	media = leia.nextDouble();
	}

}
