package classe_abstrata;

public class Assistente extends Funcionario {

	public Assistente(String nome, String matricula, double salarioBase) {
		super(nome, matricula, salarioBase);
	}

	@Override
	protected double calculaSalario() {
		return getSalarioBase();
	}

}
