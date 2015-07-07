package tratamento_excecao;

public class AritmeticaException extends Exception {

	/**
	 * constante apenas para identificar a classe por um ID
	 */
	private static final long serialVersionUID = 9123222960084364641L;

	public AritmeticaException() {
		// TODO Auto-generated constructor stub
		super();
	}

	public AritmeticaException(String msg) {
		super(msg);
	}

}
