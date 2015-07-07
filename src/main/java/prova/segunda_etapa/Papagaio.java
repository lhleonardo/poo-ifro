package prova.segunda_etapa;

public class Papagaio extends Animal {

	public Papagaio(String nome) {
		super(nome);
	}

	@Override
	public void mover() {
		System.out.println("Papagaio voando");
	}

	@Override
	public String somDeDor() {
		return "Papagaio gritando de dor";
	}

}
