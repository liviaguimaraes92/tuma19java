package application;

import java.util.Locale;

import entities.Empresaentidades;
import entities.Funcionario3;

public class Empresaaplicacao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Empresaentidades func1 = new Empresaentidades("2210", "João", 15, 7.00);
		Funcionario3 terc1 = new Funcionario3("2211", "Maria", 15, 7.00, 12.00);
		
		
		System.out.println ("matrícula: " +func1.getMatricula() + " funcionário: " +func1.getNome()+ " salário: R$ " +func1.totalSalario());
		System.out.println ("matrícula: " +terc1.getMatricula() + " funcionário: " +terc1.getNome()+ " salário: R$ " +terc1.totalSalario());
		

	}

}
