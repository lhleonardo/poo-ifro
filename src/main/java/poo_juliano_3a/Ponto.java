package poo_juliano_3a;

public class Ponto {

	private int x = 0;
	private int y = 0;

	public int getY() {
		return y;
	}

	public void setX(int x) {
		if (x >= 0) {
			this.x = x;
		}
	}

	public void setY(int y) {
		if (y >= 0) {
			this.y = y;
		}
	}

	public int calculaDistancia(int y) {
		int resultado;
		resultado = this.x - y;
		if (resultado > 0) {
			return resultado;
		} else {
			System.out
					.println("Valor negativo encontrado...\nRedondando este numero para ");
			return 0;
		}
	}
}
