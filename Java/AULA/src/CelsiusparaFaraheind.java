import java.util.Scanner;

public class Temperatura {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double fahrenheit, temperatura;
		
		System.out.println("Digite a temperatura em Fahrenheit: ");
		fahrenheit = leia.nextDouble();
		
		temperatura = (fahrenheit - 32) / 1.8;
		
		System.out.printf("A temperatura em Celsius �: %.2f", temperatura);
		
	}

}
