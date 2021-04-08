import java.util.Scanner;

public class Javamodulo2questao4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int  idade;
		char sexo; // (1- feminino 2- masculino 3 - outros)
		char opcao; // (1- calma 2 - nervosa 3 - agressiva)
		int contador = 1;
		char continua = 'S';
		int pessoasCalmas = 0;
		int mulheresNervosas = 0;
		int homensAgressivos = 0;
		int outrosCalmos = 0;
		int pessoasNervosasMais40Anos = 0;
		int pessoasCalmasMenos18Anos = 0;
		
		

		while(continua == 'S' && contador <= 150) {
			System.out.print ("Informe sua idade: ");
			idade = leia.nextInt();
			System.out.print ("Digite 1- feminino 2- masculino 3- outros: ");
			sexo = leia.next().charAt(0);
			System.out.print("Digite: \n1- calmo(a); \n2- nervoso(a); \n3- agressivo(a): ");
			opcao = leia.next().charAt(0);
			if (contador != 150)
			System.out.print("Você deseja fazer a pesquisa S-sim ou N-Não? ");
			continua = leia.next().toUpperCase().charAt(0);
			contador++;
			
			if (opcao == '1') {
				pessoasCalmas++;
			}
			if (sexo == '1' && opcao == '2') {
				mulheresNervosas++;
			}
			if (sexo == '2' && opcao == '3') {
				homensAgressivos++;
			}
			if (sexo == '3' && opcao == '1') {
				outrosCalmos++; 
			}
			if (opcao == '2' && idade >=40) {
				pessoasNervosasMais40Anos ++;
			}
			if (opcao == '1' && idade < 18) {
				pessoasCalmasMenos18Anos++;
			}
		
		}
			System.out.println ("Pessoa calmas: " +pessoasCalmas); 
			System.out.println ("Mulheres nervosas: " +mulheresNervosas);
			System.out.println ("homens agressivos: " +homensAgressivos);
			System.out.println ("Outros calmos: " +outrosCalmos);
			System.out.println ("Pessoas nervosas com mais 40 anos: " +pessoasNervosasMais40Anos);
			System.out.println ("Pessoas calmas menos 18 anos: " +pessoasCalmasMenos18Anos);

			System.out.println ("\nFim do programa"); {
		}
	}
}