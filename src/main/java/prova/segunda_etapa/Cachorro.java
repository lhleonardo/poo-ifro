package prova.segunda_etapa;

public class Cachorro extends Animal {

	public Cachorro(String nome) {
	    super(nome);
    }

	@Override
	public void mover() {
		System.out.println("Cachorro andando.");
	}

	@Override
	public String somDeDor() {
		return "Cachorro uivando de dor.";
	}

}
