import java.util.Scanner;

public class Java1exercicio4 {

	public static void main(String[] args) {

	        Scanner leia = new Scanner(System.in);

	        double numero;

	        System.out.println("Digite um número: ");
	        numero = leia.nextDouble();

	        if (numero %2 == 0) {
	            System.out.println("Esse número é par, e a sua raiz quadrada é: " + Math.sqrt(numero));
	        }
	        else if (numero %2 == 1) {
	            System.out.println("Esse número é ímpar, e o seu quadrado é: " + Math.pow(numero, 2));
	}
	}
}
