package classe_abstrata;
public class DiaDosNamorados extends CartaoWeb {

	public DiaDosNamorados(String destinatario) {
		super(destinatario);
	}

	@Override
	public void showMessage() {
		System.out.println("Feliz dia dos namorados!\nDestinatário: " + getDestinatario());
	}

}
