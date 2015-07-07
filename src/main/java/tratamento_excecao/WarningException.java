package tratamento_excecao;

@SuppressWarnings("serial")
public class WarningException extends Exception {

	public WarningException() {
		super("Warning");
	}

	public WarningException(String message) {
		super("Warning: " + message);
	}

}
