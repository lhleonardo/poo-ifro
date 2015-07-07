package prova.segunda_etapa;

public class TestaVacinas {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro("Rex");
		Serpente serpente = new Serpente("Coral");
		Papagaio papagaio = new Papagaio("Jośe");
		
		Veterinario veterinario = new Veterinario();
		veterinario.vacinar(papagaio);
		System.out.println();
		veterinario.vacinar(serpente);
		System.out.println();
		veterinario.vacinar(cachorro);
		
	}
}
