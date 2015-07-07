package tratamento_excecao;

@SuppressWarnings("serial")
public class InformationException extends Exception {

	public InformationException() {
		super("Information:");
	}

	public InformationException(String message) {
		super("Information: " + message);
	}

}
