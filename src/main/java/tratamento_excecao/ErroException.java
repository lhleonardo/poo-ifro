package tratamento_excecao;

@SuppressWarnings("serial")
public class ErroException extends Exception {

	public ErroException() {
		super("Erro: ");
	}

	public ErroException(String message) {
		super("Erro: " + message);
	}

}
