package application;

import java.util.Locale;
import java.util.Scanner;

public class testedeprograma {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
				Locale.setDefault(Locale.US);
				Conta contajoao = new Conta();
				System.out.println ("Digite o número da conta: ");
				contadojoao.numero = leia.nextInt();
				System.out.println("Digite o cpf da conta: ")
				contadojoao.cpf = leia.next();

				System.out.printf("CPF: %s \n" ,contajoao.cpf)
				System.out.printf ("Número conta %d": \n", contajoao.numero);
				System.out.printf("Saldo: %.2f \n" ,contajoao.saldo)
				
	}

}
