package revisao;

import java.util.Date;

public class Funcionario {

	private String nome;
	private double salario;
	private Date dataAdmissao;

	public Funcionario(String nome, double salario, Date dataAdmissao) {
		this.nome = nome;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
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

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) throws Exception {
		if (salario >= 0) {
			this.salario = salario;
		} else {
			throw new IllegalArgumentException("O salário não pode ser negativo.");
		}
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public void recebeAumento(int percentual) {
		try {
			setAumento(percentual);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private void setAumento(int percentual) throws Exception {
		if (percentual >= 0) {
			double resultado = this.salario + (this.salario * ((double) percentual / 100));
			this.setSalario(resultado);
		} else {
			throw new IllegalArgumentException("Percentual não pode ser negativo.");
		}
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", salario=" + salario + ", dataAdmissao=" + dataAdmissao + "]";
	}

}
