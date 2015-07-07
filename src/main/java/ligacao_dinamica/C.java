package ligacao_dinamica;

public class C {
	public void t(A c) {
		System.out.println("Classe C metodo A");
		c.t();
	}

	public void t(B c) {
		System.out.println("Classe C metodo B");
		c.t();
	}
}
