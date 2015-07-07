package classe_abstrata;

public abstract class CartaoWeb {

	public CartaoWeb(String destinatario) {
		super();
		this.destinatario = destinatario;
	}

	private String destinatario;

	public abstract void showMessage();

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

}
