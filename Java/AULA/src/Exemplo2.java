import java.util.Locale;
import java.util.Scanner;

public class Exemplo2 

{
	

		public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
        final double HABITANTES = 3;   
        double maiorSalario=0.00; 
        double percentualPessoasSalarioAte100= 0.00;
        double contadorPessoasSalario100 = 0.00;
        double totalSalario = 0;
        double salario;
        double numeroFilhos;
        double totalFilhos = 0;
        double mediaSalario;
        double mediaFilhos;
        //x++ = x = x + 1
        //%s = String
        //%d= int
        //%f= double
        for (int x=1;x<=HABITANTES;x++) {
            //dentro do laço
            System.out.printf("Informe o salário do habitante %d R$ :",x);//comum
            salario = leia.nextDouble();
            System.out.print("Informe a quantidade de filhos: ");
            numeroFilhos = leia.nextDouble();
            System.out.println();
            totalSalario = totalSalario + salario; // totalSalario
        } 
        }
}
