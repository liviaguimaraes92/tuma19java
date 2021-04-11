package entidade;

public class Roupas extends produto {
	
	//atributos
	private String marca;

	//construtor
	public Roupas(String descricao, String codigo, double valorUnitario, String marca) {
		super(descricao, codigo, valorUnitario);
		this.marca = marca;
	}
	//encapsulamento
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
		
	
	//metodos
	

}