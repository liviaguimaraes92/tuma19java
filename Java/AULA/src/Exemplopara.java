import java.util.Scanner;

public class Exemplopara {

	private static final String Locale = null;

	public static void main(String[] args) {

		Locale.setDefault (Locale.US);
		Scanner leia = new Scanner (System.in);


		final double HABITANTES = 20;
		double salario = 0.00;
		double numeroFilhos = 0;
		double mediaSalario = 0.00;
		double totalSalario = 0.00;
		double mediaFilhos = 0.00;
		double totalFilhos = 0.00;
		double maiorSalario = 0.00;
		double percentualPessoasSalarioAte100 = 0.00;
		double contatorPessoasSalario100 = 0;
		//x++ = x = x + 1
		for (int x=1; x<=HABITANTES; x++) {
			System.out.println ("Informe seu salário: R$ ");
			salario = leia.nextDouble();
			System.out.println ("Informe a quantidade de filhos: ");
			numeroFilhos = leia.nextDouble();
		}


	}

}
