package lista4classes;

public class cliente {

	public String nome, cpf, email;
	public int idade;
	public String formaDePagamento;

	public String pagamento(String pagaCom) {
		pagaCom = " ";
		if (formaDePagamento == "1") {
			pagaCom = "Cartão de Crédito";
		} else if (formaDePagamento == "2") {
			pagaCom = "Cartão de Débito";
		} else if (formaDePagamento == "3") {
			pagaCom = "Dinheiro";
		}
		return pagaCom;
	}
}
