package classe_abstrata;

import java.lang.reflect.Field;

public class Vendedor extends Funcionario {

	private int comissao;

	public Vendedor(String nome, String matricula, double salarioBase, int comissao) {
		super(nome, matricula, salarioBase);
		this.comissao = comissao;
	}

	@Override
	protected double calculaSalario() {
		return getSalarioBase() + (getSalarioBase() * ((double) this.comissao / 100));
	}

	public int getComissao() {
		return comissao;
	}

	public void setComissao(int comissao) {
		this.comissao = comissao;
	}

	public static void main(String[] args) throws Exception {
		Class<?> c = Vendedor.class;
		Object object = c.getConstructor(new Class[] {}).newInstance();
		Field field = c.getDeclaredField("salarioBase");
		field.setAccessible(true);
		field.set(object, 5000.0);
		System.out.println(((Vendedor) object).getSalarioBase());

	}
}
