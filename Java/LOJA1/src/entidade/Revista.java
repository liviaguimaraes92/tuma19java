package entidade;

public class Revista extends produto {

	private String editora;

	public Revista(String descricao, String codigo, double valorUnitario, String editora) {
		super(descricao, codigo, valorUnitario);
		this.editora = editora;
	}

	public Revista(String descricao, String codigo, double valorUnitario) {
		super(descricao, codigo, valorUnitario);
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

} 