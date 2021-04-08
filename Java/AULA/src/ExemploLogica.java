import java.util.Locale;
import java.util.Scanner;

public class ExemploLogica {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in); 
		
		int numero; //numero inteiro
		String nome; // cadeia de caracteres
		boolean vivo; // verdadeiro ou falso - true or false
		char escolha; // sim ou não
		
		//Long numero;
		//Integer valor;
		
		System.out.println("Digite um número:");
		numero = leia.nextInt();
		//leia = numero			
		parImpar (numero);
				System.out.println("Fim de programa");
	}
	
	public static void parImpar (int numero) {

		if ( ((numero&2) == 0 && numero >= 0) ) 
		{
			System.out.println("Número par");
	} 
		else if ( (numero&2) == 1 && numero > 0)
	{
			System.out.println("Número impar");
	} 
	}

}
