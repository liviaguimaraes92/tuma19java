import java.util.Scanner;

public class Modulo1Exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);

		double tempoDuracao;
		double horas;
		double minutos;
		double segundos;

		System.out.print ("Digite o tempo de duração do evento em segundos");
		
		tempoDuracao = leia.nextDouble();

		horas = (tempoDuracao / 3600 );
		minutos = ((tempoDuracao % 3600) / 60);
		segundos = ((tempoDuracao % 3600) % 60);

		System.out.printf("Horas: %.0f Minutos: %.0f Segundos: %.0f",horas,minutos,segundos);
		

	}

}
