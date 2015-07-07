package revisao;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class TesteEmpresa {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("João", 500.0, Calendar.getInstance().getTime());
		Funcionario f2 = new Funcionario("Marta", 400.0, new Date(2014, 04, 2));
		Funcionario f3 = new Funcionario("Amauri", 1500.0, Calendar.getInstance().getTime());
		Funcionario f4 = new Funcionario("Alberto", 500.0, new Date(2011, 04, 22));
		Funcionario f5 = new Funcionario("Matheus", 2500.0, new Date(2003, 01, 15));

		Departamento dep1 = new Departamento("Vendas");
		dep1.adicionaFuncionario(f1);
		dep1.adicionaFuncionario(f2);
		dep1.adicionaFuncionario(f3);

		Departamento dep2 = new Departamento("Financeiro", Arrays.asList(f4, f5));
		System.out.println("Antes do aumento ");
		dep2.imprimeFuncionarios();
		System.out.println("\nDepois do aumento");
		dep2.aumentoParaOsFuncionariosDe(50);
		dep2.imprimeFuncionarios();

	}
}
