package tratamento_excecao;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Teclado {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int contErro = 0;
		ArrayList<Double> vFloat = new ArrayList<Double>();
		
		do {
			try {
				System.out.println("Informe um valor decimal: ");
				vFloat.add(scanner.nextDouble());
				System.out.println();
			} catch (InputMismatchException e) {
				System.out.println("Valor Inválido, tente novamente.");
				contErro++;
				
				scanner.nextLine();
			}
		} while (contErro < 3);

		System.out.println("Numero de tentativas excedidas...");
		System.out.println("Valores: ");

		for (double valor : vFloat) {
			System.out.println(valor);
		}

	}
}
