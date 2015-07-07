package ligacao_dinamica;

public class Esfera extends FormaTridimensional {

	public Esfera(double base, double altura, double largura) {
		super(base, altura, largura);
		// TODO Auto-generated constructor stub
	}

	private double raio;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getDiametro() {
		return Math.pow(2, this.raio);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Esfera";
	}
}
