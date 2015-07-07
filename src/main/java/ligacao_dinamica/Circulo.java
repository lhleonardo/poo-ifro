package ligacao_dinamica;

public class Circulo extends FormaBidimensional {
	

	public Circulo(double base, double altura, double raio) {
		super(base, altura);
		this.raio = raio;
	}

	private double raio;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double getDiametro(){
		return Math.pow(2, this.raio);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Circulo";
	}
}
