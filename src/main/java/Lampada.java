public class Lampada {

	private boolean ligada = false;

	public void liga() {
		this.ligada = true;
	}

	public void desliga() {
		this.ligada = false;
	}

	public String observa() {
		if (ligada) {
			return "ligada";
		} else {
			return "desligada";
		}
	}

	public static void main(String[] args) {
		Lampada lamp1 = new Lampada();
		Lampada lamp2 = new Lampada();

		lamp1.liga();
		lamp2.desliga();

		System.out.println("Lamp1 = " + lamp1.observa());
		System.out.println("Lamp2 = " + lamp2.observa());
	}

}
