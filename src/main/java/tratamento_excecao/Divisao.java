package tratamento_excecao;

public class Divisao {

	public static double divide(int numerador, int denominador) throws AritmeticaException {
		if (denominador == 0)
			throw new AritmeticaException("Divisão por zero");
		return numerador / denominador;
	}

	@SuppressWarnings("unused")
    public static void main(String[] args) {
		try {
			double resultadoDe2por3 = divide(2, 3);
			double resultadoDe1por5 = divide(1, 5);
			double resultadoDe4por0 = divide(4, 0);
		} catch (AritmeticaException e) {
			System.out.println(e.getMessage());
		}

	}
}
