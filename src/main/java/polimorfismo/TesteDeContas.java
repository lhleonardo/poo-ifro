package polimorfismo;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @author Leonardo Braz
 *
 */
public class TesteDeContas {

	private static Scanner scanner;

	public static void main(String[] args) {

		imprimeOpcoesDoMenu();
		scanner = new Scanner(System.in);

		@SuppressWarnings("unused")
		Conta conta = null;

		int opcao = scanner.nextInt();
		switch (opcao) {
			case 2:
				conta = criaContaEspecial();
				break;
			case 3:
				conta = criaContaPoupanca();
				break;
			case 4:
				conta = criaContaComum();
				break;
			default:
				System.out.println("Operação inválida, tente novamente.");
		}

		imprimeConta(conta);
	}

	private static void imprimeConta(Conta conta) {
		System.out.println(conta);
	}

	private static Conta criaContaComum() {
		return new Conta(pegaInt("Informe o numero da conta"), pegaString("Informe o nome da conta"));
	}

	private static Conta criaContaPoupanca() {
		return new ContaPoupanca(pegaInt("Informe o número da conta"), pegaString("Informe o nome da conta."));
	}

	protected static void imprimeOpcoesDoMenu() {
		System.out.println("Menu principal - Escolha uma opção para criação de contas");
		System.out.println("2 - Conta especial");
		System.out.println("3 - Conta poupança");
		System.out.println("4 - Conta comum");
	}

	private static Conta criaContaEspecial() {
		return new ContaEspecial(pegaInt("Informe o número da conta"), pegaString("Informe o nome da conta"),
				pegaDouble("Informe o limite da conta"));
	}

	private static double pegaDouble(String texto) {
		return Double.parseDouble(JOptionPane.showInputDialog(texto));
	}

	private static int pegaInt(String texto) {
		return Integer.parseInt(JOptionPane.showInputDialog(texto));
	}

	private static String pegaString(String texto) {
		return JOptionPane.showInputDialog(texto);
	}

}
