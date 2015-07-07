package tratamento_excecao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.ArithmeticException;

/**
 *
 * @author Gabriel
 */
public class Exceptions {

	/**
	 * @param args
	 *            the command line arguments
	 */
	// definindo a variável scanner como membro da classe, poupando espaço na
	// memória
	private static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		boolean continua = true;
		do {
			try {

				// mudando os tipos da variável a-b para double, melhorando a
				// sua divisão.
				System.out.println("Numero: ");
				double a = s.nextDouble();
				System.out.println("Divisor: ");
				double b = s.nextDouble();

				double result = a / b;
				continua = false;

				System.out.println("Resultado = " + result);

			}
			// o err serve pra mostrar as letras em vermelho "erro",
			// System.err.println

			// já que está definindo algo genérico para as exceções, não seria
			// mais eficaz usar Exception e1 ?
			// neste caso, o correto seria o uso de Exception ou a criação de
			// dois catch's, criando mensagens personalizadas para o usuário.
			catch (InputMismatchException | ArithmeticException e1) {
				System.err.println("NÃºmero invÃ¡lido, insira outro");
				s.nextLine();// descarta a entrada errada e libera novamente o
								// campo para o usuÃ¡rio
			} finally { // limpa as variÃ¡veis, fecha conexÃµes
				System.out.println("Finally executado!");
			}
		} while (continua);

		// E o número de tentativas?

	}

}
