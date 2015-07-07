package poo_juliano_3a;

public class TestaConta {

	public static void main(String[] args) {
		Conta c = new Conta("Leonardo","01327621290",300.21);
		//Conta c2 = new Conta("Joao", "12345555555", 100.0);
		
		c.saca(400.0);
		
		System.out.println("");
		
		System.out.println("Saldo antes do depósito:"+c.getSaldo());
		c.deposita(10000);
		System.out.println("Saldo depois do depósito de 10000: "+c.getSaldo());
		c.saca(750.20);
		System.out.println("Saldo depois de sacar 750.20: "+c.getSaldo());
	}

}
