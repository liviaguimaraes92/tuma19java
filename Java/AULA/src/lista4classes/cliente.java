package lista4classes;

public class cliente {

	public String nome, cpf, email;
	public int idade;
	public String formaDePagamento;

	public String pagamento(String pagaCom) {
		pagaCom = " ";
		if (formaDePagamento == "1") {
			pagaCom = "Cart�o de Cr�dito";
		} else if (formaDePagamento == "2") {
			pagaCom = "Cart�o de D�bito";
		} else if (formaDePagamento == "3") {
			pagaCom = "Dinheiro";
		}
		return pagaCom;
	}
}
