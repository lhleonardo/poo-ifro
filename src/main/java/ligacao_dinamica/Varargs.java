package ligacao_dinamica;

public class Varargs {

	public void go(int... x) {
		// TODO Auto-generated method stub
		System.out.println("long...");
	}

	public void go(Integer... x) {
		System.out.println("Long....");
	}

	public static void main(String[] args) {
		Varargs varargs = new Varargs();
		short x = 5;
		varargs.go(x,x,x);
	}

}
