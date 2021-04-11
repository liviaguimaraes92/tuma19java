package entidades;

public abstract class Produto {

	// Atributos
	private String descricao;
	private String codigo;
	private double valorUnitario;
	private int qtdeEstoque;
	//public int comprarItens;

	// Construtores
	public Produto(String descricao, String codigo, double valorUnitario, int qtdeEstoque) {
		super(); // classe m�e
		this.descricao = descricao;
		this.codigo = codigo;
		this.valorUnitario = valorUnitario;
		this.qtdeEstoque = qtdeEstoque;
	}

	// Encapsulamento
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public int getQtdeEstoque() {
		return qtdeEstoque;
	}

	public void setQtdeEstoque(int qtdeEstoque) {
		this.qtdeEstoque = qtdeEstoque;
	}

	// M�todos

	public void incluirEstoque(int valorSerIncluido) {
		this.qtdeEstoque = this.qtdeEstoque + valorSerIncluido;
		// this.qtdeEstoque += valorSerIncluido;
	}

	public void tirarEstoque(int valorSerExcluido) {

		if (this.qtdeEstoque >= valorSerExcluido) {
			this.qtdeEstoque = this.qtdeEstoque - valorSerExcluido;
		} else {
			System.out.println("Estoque indispon�vel");
		}
	}
}