package ligacao_dinamica;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Conta {

	private String nome;
	private static Set<String> numeroDasContas = new HashSet<String>();
	private String numeroDaConta;
	private double saldo;

	public Conta(String nome, double saldo) {
		this.nome = nome;
		this.adicionaNumeroAConta();
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumeroDaConta() {
		return numeroDaConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void saca(double valor) {
		try {
			sacarValor(valor);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	private void sacarValor(double valor) throws Exception {
		if ((valor > 0) && (this.saldo > valor)) {
			this.saldo -= valor;
		} else
			throw new Exception("Valor inválido ou saldo insuficiente.");
	}

	public void deposita(double valor) {
		try {
			depositaValor(valor);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	private void depositaValor(double valor) throws IllegalArgumentException {
		if (valor < 0)
			throw new IllegalArgumentException("Valor inválido");

		this.saldo += valor;
	}

	private String geraNumeroDaConta() {
		String resultado = null;

		Random gerador = new Random();
		int valor = gerador.nextInt();
		
		if (valor < 0) { 
			valor = valor * -1;
		}
		
		resultado = String.valueOf(valor);
		
		return resultado;

	}
	
	private void adicionaNumeroAConta(){
		String numero = this.geraNumeroDaConta();
		if (getNumeroDasContas().contains(numero) == false){
			this.numeroDaConta = numero;
			getNumeroDasContas().add(numero);
		}
	}

	public String geraExtrato() {
		return this.toString();
	}

	public static Set<String> getNumeroDasContas() {
		return numeroDasContas;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Conta: " + getNome() + '\n' + "Numero: " + getNumeroDaConta() + '\n'
				+ "Saldo: " + getSaldo();
	}

	

}
