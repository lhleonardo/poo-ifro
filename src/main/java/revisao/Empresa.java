package revisao;

import java.util.List;

public class Empresa {
	private String nome;
	private String cnpj;
	private List<Departamento> departamentos;

	public Empresa() {
		super();
	}

	public Empresa(String nome, String cnpj, List<Departamento> departamentos) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.departamentos = departamentos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Departamento> getDepartamentos() {
		return departamentos;
	}

	//adiciona um departamento a lista de departamentos
	public void adicionaDepartamento(Departamento departamento) throws Exception {
		if (departamento != null) {
			this.departamentos.add(departamento);
		} else {
			throw new Exception("Departamento inválido.");
		}
	}

	//adiciona varios departamentos a lista de departamentos
	//pode usar também o this.departamentos.addAll(departamentos)
	public void adicionaDepartamento(List<Departamento> departamentos) throws Exception {
		if (departamentos != null) {
			for (Departamento departamento : departamentos) {
				this.departamentos.add(departamento);
			}
		} else {
			throw new Exception("Departamentos inválidos.");
		}
	}

}
