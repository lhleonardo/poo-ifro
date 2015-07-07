package ligacao_dinamica;

public class FormaTridimensional extends Forma {

	public FormaTridimensional(double base, double altura, double largura) {
		super(base, altura);
		this.largura = largura;
	}

	private double largura;

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double obterVolume() {
		return super.calculaArea() * this.largura;
	}

}
