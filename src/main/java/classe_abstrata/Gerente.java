package classe_abstrata;

public class Gerente extends Funcionario {

	public Gerente(String nome, String matricula, double salarioBase) {
		super(nome, matricula, salarioBase);
	}

	@Override
	protected double calculaSalario() {
		return Math.pow(getSalarioBase(), 2);
	}

}
