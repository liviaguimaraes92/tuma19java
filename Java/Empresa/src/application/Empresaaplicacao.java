package application;

import java.util.Locale;

import entities.Empresaentidades;
import entities.Funcionario3;

public class Empresaaplicacao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Empresaentidades func1 = new Empresaentidades("2210", "Jo�o", 15, 7.00);
		Funcionario3 terc1 = new Funcionario3("2211", "Maria", 15, 7.00, 12.00);
		
		
		System.out.println ("matr�cula: " +func1.getMatricula() + " funcion�rio: " +func1.getNome()+ " sal�rio: R$ " +func1.totalSalario());
		System.out.println ("matr�cula: " +terc1.getMatricula() + " funcion�rio: " +terc1.getNome()+ " sal�rio: R$ " +terc1.totalSalario());
		

	}

}
