package prova.primeira_etapa;

public class Circulo {

	private double raio;
	private Ponto coordenadas;

	public Circulo(double raio, Ponto coordenadas) {
		super();
		this.raio = raio;
		this.coordenadas = coordenadas;
	}

	public Circulo(double raio) {
		super();
		this.raio = raio;
		this.coordenadas = new Ponto();
	}

	public double getRaio() {
		return raio;
	}

	public Ponto getCoordenadas() {
		return coordenadas;
	}

	public void inflar(double raio) {
		if (raio >= 0) {
			this.raio += raio;
		} else {
			throw new IllegalArgumentException("Impossível inflar o circulo com negativo para o raio.");
		}
	}

	public void inflar() {
		this.raio += 1;
	}

	public void desinflar(double raio) throws IllegalArgumentException {
		if (raio >= 0 && this.raio > raio) {
			this.raio = this.raio -= raio;
		} else {
			throw new IllegalArgumentException("O resultado do raio ficou negativo.");
		}
	}

	public void desinflar() throws IllegalArgumentException {
		double previaResultado = this.raio -= 1;
		if (previaResultado >= 0) {
			this.raio = previaResultado;
		} else {
			throw new IllegalArgumentException("O resultado do raio ficou negativo.");

		}
	}

	public void mover() {
		this.coordenadas.setPontoX(0);
		this.coordenadas.setPontoY(0);
	}

	public void mover(int ordenada, int abscissa) {
		this.coordenadas = new Ponto(ordenada, abscissa);
	}

	public void mover(Ponto outroPonto) {
		this.coordenadas = outroPonto;
	}

	public double getArea() {
		return Math.PI * Math.pow(raio, 2);
	}

	@Override
	public String toString() {
		return "Circulo [raio=" + raio + ", coordenadas=" + coordenadas + ", raio = " + getRaio() + "]";
	}

}
