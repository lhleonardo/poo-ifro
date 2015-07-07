package prova.primeira_etapa;

import java.util.Date;

public class TestaMeme {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		/**
		 * Instancia dos valores em m1 e m2 imprime se o m1 surgiu primeiro que
		 * o m2
		 */
		Meme m1 = new Meme("Jailson", new Date(2015, 03, 25), "Na Vida",
				"O cara do Suco de Laranja", "Video");
		Meme m2 = new Meme("Paulo Guina", new Date(2015, 03, 25),
				"Amor do Jailson", "O cara que não gosta de demora", "Video");

		System.out.print("O " + m1.getNome() + " surgiu depois que o "
				+ m2.getNome() + " ?" + m1.mostraResultado(m2));

	}

}
