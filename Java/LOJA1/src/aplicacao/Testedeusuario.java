package aplicacao;

import java.util.Locale;

import entidade.produto;

public class Testedeusuario {

	public static void main(String[] args) {
		 Locale.setDefault(Locale.US);
		 
		 produto prod1 = new produto("CAMISA", "XL001", 100.25);
		 
		 prod1.setValorUnitario (80);
		 prod1.incluirEstoque(10);
		 System.out.println(prod1.getDescricao()+" RS " +prod1.getValorUnitario()+" estoque " +prod1.getQuantidadeEstoque());
	}

}
