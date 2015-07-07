package poo_juliano_3a;

public class TestaUrnaEletronica {
	public static void main(String[] args) {

		UrnaEletronica urna = new UrnaEletronica();

		// 6 votos em branco.
		for (int i = 0; i < 6; i++) {
			urna.setVotoBranco();
		}

		// 3 votos nulos.
		for (int i = 0; i < 3; i++) {
			urna.setVotoNulo();
		}

		// 4 votos candidato 123.
		for (int i = 0; i < 4; i++) {
			urna.votar(123);
		}
		// 10 votos para o candidato 2.
		for (int i = 0; i < 10; i++) {
			urna.votar(234);
		}

		// 6 votos para o candidato 3.
		for (int i = 0; i < 6; i++) {
			urna.votar(666);
		}

		// Apresenta o ganhador da suposta eleição.
		urna.getGanhador();

	}

}
