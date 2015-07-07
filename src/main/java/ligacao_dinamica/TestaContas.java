package ligacao_dinamica;

public class TestaContas {

	public static void main(String[] args) {
		Conta c = new Conta("Leonardo", 500.0);
		c.deposita(-300.0);
		System.out.println(c.getSaldo());
	}

}
