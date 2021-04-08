package lista4classes;

public class aviao {

	public String marca, tipo;
	public String ciaArea;
	public char nacionalInternacional;
	public int anoFabricacao, quantidadeMotores;
	
	public String tipoVoo() {
		String recebeVoo = " ";
		if (nacionalInternacional == '1') {
			recebeVoo = "Vôo Nacional";
			} else if (nacionalInternacional == '2') {
			recebeVoo = "Vôo internacional";
			}
			return recebeVoo;
		}

}
	