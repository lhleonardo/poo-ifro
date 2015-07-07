package ligacao_dinamica;

import java.util.Arrays;
import java.util.List;

public class TestaFormas {

	public static void main(String[] args) {
		Circulo circulo = new Circulo(3, 10, 3);
		Quadrado quadrado = new Quadrado(10, 10);
		Esfera esfera = new Esfera(20, 30, 2);
		List<Forma> formas = Arrays.asList(circulo, quadrado, esfera);

		for (Forma forma : formas) {

			System.out.println("Objeto: " + forma + "\n"
					+ comparaInstanciaDe(forma));
			System.out.println("");
		}

	}

	/**
	 * @param formas
	 */
	private static String comparaInstanciaDe(Forma forma) {
		if (forma instanceof FormaBidimensional) {
			return "Área Bidimensional: " + forma.calculaArea();
		} else if (forma instanceof FormaTridimensional) {
			FormaTridimensional fm = (FormaTridimensional) forma;
			return "Área Tridimensional: " + fm.calculaArea()
					+ "\nVolume Tridimensional: " + fm.obterVolume();
		}
		return null;
	}
}
