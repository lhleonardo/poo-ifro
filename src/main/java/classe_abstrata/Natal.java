package classe_abstrata;

public class Natal extends CartaoWeb {

	public Natal(String destinatario) {
		super(destinatario);
	}

	@Override
	public void showMessage() {
		System.out.println("Feliz Natal!\nDestinatário: " + this.getDestinatario());
	}

}
