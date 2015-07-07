package classe_abstrata;

public abstract class Funcionario {

	private String nome;
	private String matricula;
	private double salarioBase;

	public Funcionario(String nome, String matricula, double salarioBase) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.salarioBase = salarioBase;
	}

	public Funcionario() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	@Override
	public String toString() {
		return "Funcionario (nome=" + nome + ", matricula=" + matricula + ", salario=" + calculaSalario()
		        + ")";
	}

	protected abstract double calculaSalario();
}
