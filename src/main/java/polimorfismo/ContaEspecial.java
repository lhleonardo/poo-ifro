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
		builder.append("Conta do ").append(this.getNome()).append("(n�").append(this.getNumero()).append(")").append(" com um limite de ")
		        .append(this.getLimite()).append(" reais");
		return builder.toString();
	}
	
}
