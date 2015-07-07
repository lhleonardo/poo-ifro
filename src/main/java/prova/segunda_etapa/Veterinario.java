package prova.segunda_etapa;

public class Veterinario {

	public void vacinar(Animal animal) {
	    if (animal instanceof Serpente) { 
	    	System.out.println("Serpentes não são vacinadas.");
	    	System.out.println("Nome da Serpente: "+ animal.getNome());
	    } else { 
	    	System.out.println("Vacina aplicada com sucesso.");
	    	System.out.println(animal);
	    	System.out.println(animal.somDeDor());
	    }
    }
	
}
