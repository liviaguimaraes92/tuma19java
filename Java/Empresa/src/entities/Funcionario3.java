package entities;

public class Funcionario3 extends Empresaentidades {

	private double adicional;

	public Funcionario3(String matricula, String nome, double adicional) {
		super(matricula, nome);
		this.adicional = adicional;
	}

	public Funcionario3(String matricula, String nome, int horasTrabalhadas, double valorHora, double adicional) {
		super(matricula, nome, horasTrabalhadas, valorHora);
		this.adicional = adicional;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	@Override
	public double totalSalario() {
		
		return this.horasTrabalhadas*valorHora;
	}
}
