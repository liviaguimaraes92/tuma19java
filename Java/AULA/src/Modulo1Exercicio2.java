import java.util.Scanner;

public class Modulo1Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		       int ano;
		       int mes;
		       int dia;
		       int dias;

		        System.out.println ("H� quantos dias voc� est� vivo?: ");
		        dia = leia.nextInt();
		        ano = dia / 365;
		       	mes = (dia % 365) / 30;
		        dias = (dia % 365) % 30;
		       

		        System.out.println ("Voc� tem "+ano+" anos "+mes+" meses e "+dias+ " dias de vida");


	}

}
