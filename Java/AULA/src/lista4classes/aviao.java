package lista4classes;

public class aviao {

	public String marca, tipo;
	public String ciaArea;
	public char nacionalInternacional;
	public int anoFabricacao, quantidadeMotores;
	
	public String tipoVoo() {
		String recebeVoo = " ";
		if (nacionalInternacional == '1') {
			recebeVoo = "V�o Nacional";
			} else if (nacionalInternacional == '2') {
			recebeVoo = "V�o internacional";
			}
			return recebeVoo;
		}

}
	