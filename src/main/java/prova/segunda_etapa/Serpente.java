package prova.segunda_etapa;

public class Serpente extends Animal {

	public Serpente(String nome) {
	    super(nome);
    }

	@Override
	public void mover() {
		System.out.println("Serpente rastejando.");
	}

	@Override
	public String somDeDor() {
		return "Serpente emitindo sons de dor.";
	}

}
