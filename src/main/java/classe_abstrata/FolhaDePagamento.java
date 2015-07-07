package classe_abstrata;

import java.util.List;

public class FolhaDePagamento {

	private List<Funcionario> funcionarios;

	public FolhaDePagamento(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public String geraFolha() {
		StringBuilder valores = new StringBuilder();

		for (Funcionario funcionario : funcionarios) {
	        valores.append(funcionario + "\n");
        }
		
		return valores.toString();
	}

}
