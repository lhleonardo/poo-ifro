package revisao;

import java.util.ArrayList;
import java.util.List;

public class Departamento {

	private String nome;
	private List<Funcionario> funcionarios;
	private static int LIMITE_DE_FUNCIONARIO = 100;

	// recebe o nome e a lista de funcionários já criada
	public Departamento(String nome, List<Funcionario> funcionarios) {
		super();
		this.nome = nome;
		this.funcionarios = funcionarios;
	}

	public Departamento() {
		super();
		this.funcionarios = new ArrayList<>();
	}

	public Departamento(String nome) {
		this.nome = nome;
		this.funcionarios = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	// adiciona um funcionario a lista de funcionarios
	public void adicionaFuncionario(Funcionario e) {
		if (this.funcionarios.size() >= LIMITE_DE_FUNCIONARIO) {
			this.funcionarios.add(e);
		} else {
			throw new ArrayIndexOutOfBoundsException("Departamento chegou ao limite de funcionário.");
		}
	}

	// adiciona vários funcionários a lista de funcionários
	// pode ser usado também o this.funcionarios.addAll(e)
	public void adicionaFuncionario(List<Funcionario> e) {
		if (this.funcionarios.size() >= LIMITE_DE_FUNCIONARIO) {
			for (Funcionario funcionario : e) {
				this.funcionarios.add(funcionario);
			}
		} else
			throw new ArrayIndexOutOfBoundsException("Departamento chegou ao limite de funcionário.");
	}

	public void imprimeFuncionarios() {
		System.out.println(this);
		System.out.println();
		System.out.println("Funcionários: ");
		for (Funcionario funcionario : funcionarios) {
			System.out.println(funcionario);
		}
	}

	public void aumentoParaOsFuncionariosDe(int percentual) {
		for (Funcionario funcionario : funcionarios) {
			funcionario.recebeAumento(percentual);
		}
	}

	@Override
	public String toString() {
		return "Departamento [nome=" + nome + "]";
	}

}
