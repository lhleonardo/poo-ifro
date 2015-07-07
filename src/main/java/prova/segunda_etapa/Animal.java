package prova.segunda_etapa;

public abstract class Animal {

	private String nome;

	public Animal(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public abstract void mover();

	public abstract String somDeDor();

	@Override
	public String toString() {
		return "Animal (nome=" + nome + ")";
	}

}
