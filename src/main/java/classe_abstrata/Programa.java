package classe_abstrata;

import java.util.ArrayList;
import java.util.List;

public class Programa {

	public static void main(String[] args) {

		List<CartaoWeb> cartoes = new ArrayList<CartaoWeb>();

		cartoes.add(new Aniversario("Jośe"));
		cartoes.add(new DiaDosNamorados("Maria"));
		cartoes.add(new Natal("Pedro"));
	

		for (CartaoWeb cartao : cartoes) {
			cartao.showMessage();
			System.out.println('\n');
		}

		System.out.println("Depois de remover...");
		
		cartoes.remove(2);
		
		for (CartaoWeb cartao : cartoes) {
			cartao.showMessage();
			System.out.println('\n');
		}
		
	}

}
