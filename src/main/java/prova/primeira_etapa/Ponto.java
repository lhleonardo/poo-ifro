package prova.primeira_etapa;

public class Ponto {

	private int pontoX;
	private int pontoY;

	public Ponto() {
		this.pontoX = 0;
		this.pontoY = 0;
	}

	public Ponto(int pontoX, int pontoY) {
		super();
		this.pontoX = pontoX;
		this.pontoY = pontoY;
	}

	public int getPontoX() {
		return pontoX;
	}

	public void setPontoX(int pontoX) {
		this.pontoX = pontoX;
	}

	public int getPontoY() {
		return pontoY;
	}

	public void setPontoY(int pontoY) {
		this.pontoY = pontoY;
	}

	@Override
	public String toString() {
		return "(" + pontoX + ", " + pontoY + ")";
	}

}
