package poo_juliano_3a;

public class Circulo {

	private String nome;
	private double diametro;
	private double raio;

	// construtor comum sem uso de campos
	public Circulo() {
		super();
	}

	// construtor que recebe o raio e o diametro
	public Circulo(double raio, double diametro) {
		super();
		this.raio = raio;
		this.diametro = diametro;
	}

	public double calculaArea() {
		return Math.PI * (this.raio * this.raio);
	}

	public double calculaPerimetro() {
		return 2 * (Math.PI * this.raio);
	}

	public double getDiametro() {
		return diametro;
	}

	public double getRaio() {
		return raio;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
	


