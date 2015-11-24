package polimorfismo;

/**
 * @author Leonardo Braz
 *
 */
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Integer numero, String nome) {
		super(numero, nome);
	}

	public void reajustar(double percentual) {
		this.deposita(this.getSaldo() * percentual);
	}

}
