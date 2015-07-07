public class Estoque {

	private String nome;
	private int qtdAtual;
	private int qtdMinima;

	public Estoque(String nome, int qtdAtual, int qtdMinima) {
		super();
		this.nome = nome;
		this.qtdAtual = qtdAtual;
		this.qtdMinima = qtdMinima;
	}

	public Estoque() {
		super();
	}

	public void mudaNome(String nome) {
		this.nome = nome;
	}

	public void mudaQtdMinima(int qtdMinima) {
		if (qtdMinima >= 0) {
			this.qtdMinima = qtdMinima;
		} else {
			throw new IllegalArgumentException("A quantidade mínima não pode ser negativa!");
		}
	}

	public void repor(int quantidade) {
		if (quantidade >= 0) {
			this.qtdAtual = quantidade;
		} else {
			throw new IllegalArgumentException("A quantidade atual não pode ser negativa!");
		}
	}

	public void darBaixa(int qtd) {
		if (qtd >= 0 && this.qtdAtual > qtd) {
			this.qtdAtual -= qtd;
		} else {
			throw new IllegalArgumentException("Valor inválido ou quantidade menor que o valor da baixa!");
		}
	}

	public String mostra() {
		return "Estoque [nome=" + nome + ", qtdAtual=" + qtdAtual + ", qtdMinima=" + qtdMinima + "]";
	}

	public boolean precisaRepor() {
		if (this.qtdMinima > this.qtdAtual)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Estoque produto1 = new Estoque("Martelo", 10, 3);
		Estoque produto2 = new Estoque("Prego", 7, 3);

		produto1.mudaNome("Martelinho");
		produto1.mudaQtdMinima(1);
		produto1.repor(66);

		produto2.mudaNome("Preguinho");
		produto2.mudaQtdMinima(3);
		produto2.repor(1);

		System.out.println(produto1.mostra());
		System.out.println("Produto " + produto1.nome + " precisa repor? " + produto1.precisaRepor());
		System.out.println(produto2.mostra());
		System.out.println("Produto " + produto2.nome + " precisa repor? " + produto2.precisaRepor());
	}
}
