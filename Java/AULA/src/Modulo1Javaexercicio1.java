import java.util.Scanner;

public class Modulo1Javaexercicio1 {

	public static void main(String[] args) {
				
		Scanner leia = new Scanner (System.in);
		
		int numero1; 
		int numero2; 
		int numero3;

		System.out.println("Digite três numeros: ");
		System.out.println("Número 1");
		numero1 = leia.nextInt();
		System.out.println("Número 2");
		numero2 = leia.nextInt();
		System.out.println("Número 3");
		numero3 = leia.nextInt();
        
		if (numero1 > numero2 && numero1 > 3)
		{
			System.out.println("O maior número é" +numero1);

        }

		else if (numero2 > numero1)
		{
        	System.out.println("O número 2" +numero2+ "é o maior ");

        }
		else if (((numero3 >= numero1) (numero3 >= numero1)(numero2 > numero1)))
		{
        	System.out.println("O número 3" +numero3+ "é o maior ");

    }

	}

}
