package entinity;

public class conta {
	public int numero;
	public String cpf;
	public double saldo;
	public boolean ativa;
	//debito - saldo menos valor informado e coloca no saldo
	//credito - saldo mais o valor informado e coloca no saldo

	public void debito(double valor) {
	saldo = saldo - valor;
	}

	public void credito (double valor) {
	saldo = saldo + valor;
	}
}
