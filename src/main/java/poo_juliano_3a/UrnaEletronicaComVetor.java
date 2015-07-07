package poo_juliano_3a;

public class UrnaEletronicaComVetor {

	private int votoNulo = 0;
	private int votoEmBranco = 0;
	private boolean apurada = false;

	private int candidato1 = 123, contCandidato1 = 0;
	private int candidato2 = 456, contCandidato2 = 0;
	private int candidato3 = 555, contCandidato3 = 0;

	private int[] votos = new int[20];
	private int ultimaPosicao = 0;
	
	

	public boolean isApurada() {
		return apurada;
	}

	public void setApurada(boolean apurada) {
		this.apurada = apurada;
	}

	public int getVotoNulo() {
		return votoNulo;
	}

	public int getVotoEmBranco() {
		return votoEmBranco;
	}

	public int[] getVotos() {
		return votos;
	}

	public void setVotoEmBranco() {
		if (this.apurada != true) {
			this.votoEmBranco++;
		} else {
			System.out.println("Votação apurada.");
		}
	}

	public void setVotoNulo(int votoNulo) {
		if (this.apurada != true) {
			this.votoNulo++;
		} else {
			System.out.println("Votação apurada.");
		}
	}

	private void votar(int candidato) {
		if (this.apurada != true) {
			if (this.ultimaPosicao <= this.votos.length) {
				this.votos[ultimaPosicao] = candidato;
				this.ultimaPosicao++;
			} else {
				System.out.println("Votação máxima ultrapassada.");
			}
		} else {
			System.out.println("Votação apurada.");
		}
	}

	private void getGanhador() {
		for (int i = 0; i < votos.length; i++) {
			if (this.votos[i] == candidato1) {
				contCandidato1++;
			} else if (this.votos[i] == candidato2) {
				contCandidato2++;
			} else if (this.votos[i] == candidato3) {
				contCandidato3++;
			}
		}

		if ((contCandidato1 > contCandidato2)
				&& (contCandidato1 > contCandidato3)) {
			System.out.println("Candidato 1 venceu com " + contCandidato1
					+ " votos.");
		} else if ((contCandidato2 > contCandidato1)
				&& (contCandidato2 > contCandidato3)) {
			System.out.println("Candidato 2 venceu com " + contCandidato2
					+ " votos.");
		} else if ((contCandidato3 > contCandidato2)
				&& (contCandidato3 > contCandidato1)) {
			System.out.println("Candidato 3 venceu com " + contCandidato3
					+ " votos.");
		}

	}

	public static void main(String[] args) {
		UrnaEletronicaComVetor urna = new UrnaEletronicaComVetor();

		for (int i = 0; i < 6; i++) {
			urna.votar(123);
		}

		for (int i = 0; i < 5; i++) {
			urna.votar(456);
		}
		for (int i = 0; i < 8; i++) {
			urna.votar(555);
		}

		urna.getGanhador();
	}

}
