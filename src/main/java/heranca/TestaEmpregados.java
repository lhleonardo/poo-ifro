package heranca;

public class TestaEmpregados {
	public static void main(String[] args) {
		Empregado empregado1 = new Empregado("Paulo Guina", "000.000.000-00",
				"0000000", "000000", 200, 4.50);
		Operario empregado2 = new Operario("Jailson Mendes", "000.000.001-01",
				"0000001", "000001", 200, 4.50, 300.0, 40);

		System.out.println("Empregado = ");
		System.out.println(empregado1.toString());
		System.out.println("Salario:" + empregado1.getSalario());

		System.out.println("--------------------------------------");
		System.out.println("Oper�rio = ");
		System.out.println(empregado2.toString());
		System.out.println("Salario: " + empregado2.getSalario());

	}
}
