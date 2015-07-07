package poo_juliano_3a;

public class TestaCirculo {

	public static void main(String[] args) {
		Circulo c = new Circulo();
		c.setRaio(3.55);
		c.setDiametro(10);
		System.out.println(c.calculaArea());
		System.out.println(c.calculaPerimetro());
	}
}
