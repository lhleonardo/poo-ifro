package classe_abstrata;

public class Vendedor extends Funcionario {

	private int comissao;

	public Vendedor(String nome, String matricula, double salarioBase, int comissao) {
		super(nome, matricula, salarioBase);
		this.comissao = comissao;
	}

	@Override
	protected double calculaSalario() {
		return getSalarioBase() + (getSalarioBase() * ((double) this.comissao / 100));
	}

	public int getComissao() {
		return comissao;
	}

	public void setComissao(int comissao) {
		this.comissao = comissao;
	}

}
