package ligacao_dinamica;

public class Forma {

	public Forma(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	private double base;
	private double altura;

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double calculaArea() {
		return base * altura;
	}
}
