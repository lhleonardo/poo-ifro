package classe_abstrata;


public class TesteDeFuncionarios {

	public static void main(String[] args) {
		// List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		// funcionarios.add(new Gerente("Marcos", "20120310230123", 750.0));
		// funcionarios.add(new Assistente("Vinicius", "12345678765432", 350.0));
		// funcionarios.add(new Vendedor("Chimbinha", "0987654323456789", 500.0, 20));
		//
		// FolhaDePagamento folha = new FolhaDePagamento(funcionarios);
		// String folhaImpressa = folha.geraFolha();
		//

		Funcionario f = new Gerente("aaa", "aaa", 22);
		
		if (f instanceof Gerente) {
			System.out.println("deu");
		}

		// System.out.println(folhaImpressa);
	}

}
