package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Empresaentidades;
import entities.Funcionario3;

public class CadFun {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		List <Empresaentidades> lista = new ArrayList<>();

		System.out.println ("Cadastro de Funcionarios - Pagamentos");
		System.out.println ("Quantos funcionários serão cadastrados: ");

		int quantidade = leia.nextInt();

		for (int x=1; x<=quantidade; x++) {

		System.out.printf("Funcionario %d\n", x);
	    System.out.print("Digite 1 - Funcionario ou 2 - Terceiro: ");
	    char tipo = leia.next().charAt(0);	
		System.out.println ("Digite o matrícula: ");
		String matricula = leia.next();
		System.out.println ("Digite o nome: ");
		String nome = leia.next();
		System.out.println ("Digite as horas trabalhas: ");
		int horasTrabalhadas = leia.nextInt();
		System.out.println ("Digite o valor por hora: R$: ");
		double valorHora = leia.nextDouble();
		if (tipo == '2') {
		System.out.print ("Digite o valor do adicional: R$ ");
		double adicional = leia.nextDouble();
		lista.add (new Funcionario3 (matricula, nome, horasTrabalhadas, valorHora, adicional));
		} else {
			lista.add(new Empresaentidades (matricula, nome, horasTrabalhadas, valorHora));
		}

		}
		System.out.println();
		System.out.println ("Folha de pagamentos");
		for (Empresaentidades func: lista) {
		System.out.println(func.getNome()+ "salario R$: " +func.totalSalario());
		}

		System.out.println ("Fim do programa.");
		
	}

}
