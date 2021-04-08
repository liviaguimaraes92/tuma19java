package lista4objetos;

public class Cliente {
	
	public String nome, cpf, email;
	public int idade;
	public String formaDePagamento;

	public String pagamento() {
			String pagaCom = " ";
		if (formaDePagamento.equals("1")) {
			pagaCom = "Cartão de Crédito";
		} else if (formaDePagamento.equals("2")) {
			pagaCom = "Cartão de Débito";
		} else if (formaDePagamento.equals("3")) {
			pagaCom = "Dinheiro";
		}
		return pagaCom;
	}

}
