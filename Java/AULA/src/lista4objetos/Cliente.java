package lista4objetos;

public class Cliente {
	
	public String nome, cpf, email;
	public int idade;
	public String formaDePagamento;

	public String pagamento() {
			String pagaCom = " ";
		if (formaDePagamento.equals("1")) {
			pagaCom = "Cart�o de Cr�dito";
		} else if (formaDePagamento.equals("2")) {
			pagaCom = "Cart�o de D�bito";
		} else if (formaDePagamento.equals("3")) {
			pagaCom = "Dinheiro";
		}
		return pagaCom;
	}

}
