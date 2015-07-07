package tratamento_excecao;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestaFloatExceptions {

	private static Scanner scanner;

	public static double divisao(double numerador, double denominador)
			throws ArithmeticException {

		if (denominador != 0) {
			return numerador / denominador;
		} else
			throw new ArithmeticException("Divisão por zero.");

	}

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int contErro = 0;
		ArrayList<Float> vFloat = new ArrayList<Float>();
		do {
			try {
				System.out.println("Informe um valor decimal: ");
				vFloat.add(scanner.nextFloat());
				System.out.println();
			} catch (InputMismatchException e) {
				scanner.nextLine();
				System.out.println("Valor Inválido, tente novamente.");
				System.out.println("Detalhes Técnicos: " + e.getMessage());
				contErro++;
			} catch (ArithmeticException e) {
				scanner.nextLine();
				System.out.println("Erro aritmético. \nDivisão por zero?");
				System.out.println("Detalhes Técnicos: " + e.getMessage());
				contErro++;
			}
			System.out.println(contErro);
		} while (contErro < 3);

		System.out.println("Numero de tentativas excedidas...");
		System.out.println("Valores: ");

		for (float valor : vFloat) {
			System.out.println(valor);
		}

	}

}
