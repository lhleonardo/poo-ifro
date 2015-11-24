package heranca;

public class Empregado {
	private String nome;
	private String cpf;
	private String rg;
	private String ctps;
	private int horasTrabalhadas;
	private double salarioPorHora;
	
	public Empregado(String nome, String cpf, String rg, String ctps, int horasTrabalhadas, double salarioPorHora) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.ctps = ctps;
		this.horasTrabalhadas = horasTrabalhadas;
		this.salarioPorHora = salarioPorHora;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
		
	}
	
	public String getRg() {
		return this.rg;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public String getCtps() {
		return this.ctps;
	}
	
	public void setCtps(String ctps) {
		this.ctps = ctps;
	}
	
	public int getHorasTrabalhadas() {
		return this.horasTrabalhadas;
	}
	
	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	public double getSalario() {
		return this.calculaSalario();
	}
	
	public void setSalarioPorHora(double salarioPorHora) {
		this.salarioPorHora = salarioPorHora;
	}
	
	public double getSalarioPorHora() {
		return this.salarioPorHora;
	}
	
	protected double calculaSalario() {
		return this.horasTrabalhadas * this.salarioPorHora;
	}
	
	@Override
	public String toString() {
		return "Nome do empregado: " + this.nome + "\nCPF:" + this.cpf + "\nRG:" + this.rg + "\nCTPS:" + this.ctps
		        + "\nHoras Trabalhadas: " + this.horasTrabalhadas + "\nSalário por hora:" + this.salarioPorHora;
	}
	
}
