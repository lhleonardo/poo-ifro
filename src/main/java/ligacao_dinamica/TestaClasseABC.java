package ligacao_dinamica;

public class TestaClasseABC {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		a.t();
		b.t();
		c.t(a);
		c.t(b);
	}
	
}
