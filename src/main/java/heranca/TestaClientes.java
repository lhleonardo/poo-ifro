package heranca;

public class TestaClientes {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Leonardo H de Braz", "0000000000", "000.000.000-00", 25, 350.00, 200.00);
		Cliente cliente2 = new Cliente("Fulano Silva Santos", "0000000002", "001.002.003-04", 30, 759.00, 700.00);

		System.out.println(cliente1);
		System.out.println("-----------------------------------------------");
		System.out.println(cliente2);
	}
}
