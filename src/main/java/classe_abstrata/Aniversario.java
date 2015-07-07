package classe_abstrata;
public class Aniversario extends CartaoWeb {

	public Aniversario(String destinatario) {
		super(destinatario);
	}

	@Override
	public void showMessage() {
		System.out.println("Feliz aniversário!\nDestinatário: " + getDestinatario());
	}

}
