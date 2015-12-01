package polimorfismo;

/**
 * @author Leonardo Braz
 *
 */
public class Conta {

	private Integer numero;
	private String nome;
	private double saldo;

	public Conta() {
	}

	public Conta(Integer numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}

	public Integer getNumero() {
		return this.numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Conta do " + this.nome + "(" + this.numero + ") com o saldo de " + this.saldo + " reais.";
	}

	public double getSaldo() {
		return this.saldo;

	}

	public boolean sacar(double valor) {
		if (valor > 0 && valor <= this.saldo) {
			this.saldo -= valor;
			return true;
		} else {
			System.out.println("Valor negativo ou não possui saldo disponível.");
			return false;
		}
	}

	public boolean deposita(double valor) {
		if (valor > 0) {
			this.saldo += valor;
			return true;
		} else {
			System.out.println("Não é possível depositar um valor negativo. Isso não é um saque!");
			return false;
		}
	}

}
