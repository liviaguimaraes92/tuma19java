import java.util.Scanner;

public class Java1exercicio4 {

	public static void main(String[] args) {

	        Scanner leia = new Scanner(System.in);

	        double numero;

	        System.out.println("Digite um n�mero: ");
	        numero = leia.nextDouble();

	        if (numero %2 == 0) {
	            System.out.println("Esse n�mero � par, e a sua raiz quadrada �: " + Math.sqrt(numero));
	        }
	        else if (numero %2 == 1) {
	            System.out.println("Esse n�mero � �mpar, e o seu quadrado �: " + Math.pow(numero, 2));
	}
	}
}
