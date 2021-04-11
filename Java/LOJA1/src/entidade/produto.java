package entidade;

public class produto {
	
	//atributos
	private String descricao;
	private String codigo;
	private double valorUnitario;
	private int quantidadeEstoque;

	//construtores
		public produto (String descricao, String codigo, double valorUnitario) {
		super();
		this.descricao = descricao;
		this.codigo = codigo;
		this.valorUnitario = valorUnitario;
	}

		//encapsulamento - getter and  setters
		
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

		public int getQuantidadeEstoque() {
			return quantidadeEstoque;
		}

		public void setQuantidadeEstoque(int quantidadeEstoque) {
			this.quantidadeEstoque = quantidadeEstoque;
		}

		// metodos


		public void incluirEstoque(int valorSerIncluido) {
			this.quantidadeEstoque = this.quantidadeEstoque+ valorSerIncluido;
		}
		
		public void tirarEstoque(int valorSerExcluido) {
			if (this.quantidadeEstoque >= valorSerExcluido) {
			} this.quantidadeEstoque = this.quantidadeEstoque - valorSerExcluido;
			
			}
}

