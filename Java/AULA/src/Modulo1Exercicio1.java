import java.util.Scanner;

public class Modulo1Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int ano;
		int mes;
		int dia;
		int diasVivo;

		System.out.println ("Ol�, quantos anos voc� tem?: ");
		ano = leia.nextInt();
		System.out.println ("Quantos meses se passaram desde o seu anivers�rio?: ");
		mes = leia.nextInt();
		System.out.println ("Qual dia este teste esta sendo feito?" );
		dia = leia.nextInt();
		
		diasVivo = (ano * 365) + (mes * 30) + dia;
		
		System.out.println ("Voc� est� vivo h� "+diasVivo+ " dias");


	}

}
