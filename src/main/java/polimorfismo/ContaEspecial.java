package polimorfismo;

/**
 * @author Leonardo Braz
 *
 */
public class ContaEspecial extends Conta {

	private double limite;

	public ContaEspecial(Integer numero, String nome, double limite) {
		super(numero, nome);
		this.limite = limite;
	}

	public double getLimite() {
		return this.limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public boolean sacar(double valor) {
		if (valor <= this.limite) {
			return super.sacar(valor);
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaEspecial (getLimite()=").append(this.getLimite()).append(", getNumero()=").append(this.getNumero())
		.append(", getNome()=").append(this.getNome()).append(", getSaldo()=").append(this.getSaldo()).append(")");
		return builder.toString();
	}

}
