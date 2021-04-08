package lista4objetos;

import java.util.Locale;

	public class Animalobjeto {

	public static void main(String[] args) {

		 Locale.setDefault(Locale.US);

		Animalcachorro animal1 = new Animalcachorro("mel", 2);
		Animalcavalo animal2 = new Animalcavalo("pocoto", 3);
		Animalpreguica animal3 = new Animalpreguica("livia", 28);
		
		animal1.emitirSom();
		animal2.emitirSom();
		animal3.emitirSom();
	}

}
