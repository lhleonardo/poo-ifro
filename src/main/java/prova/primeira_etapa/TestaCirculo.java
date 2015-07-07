package prova.primeira_etapa;

public class TestaCirculo {

	public static void main(String[] args) {
		Circulo circuloComRaio = new Circulo(15);
		Circulo circuloComPontoERaio = new Circulo(10, new Ponto(3, -4));

		System.out.println("Circulo com Raio");
		circuloComRaio.inflar();
		circuloComRaio.desinflar();
		System.out.println(circuloComRaio);

		circuloComRaio.mover(13, 2);
		System.out.println(circuloComRaio);

		circuloComRaio.mover(new Ponto(-3, -6));
		System.out.println(circuloComRaio);

		System.out.println("Circulo com Ponto e Raio");
		circuloComPontoERaio.inflar();

		circuloComPontoERaio.desinflar();

		System.out.println(circuloComPontoERaio);

		circuloComPontoERaio.mover(16, 3);
		System.out.println(circuloComPontoERaio);

		circuloComPontoERaio.mover(new Ponto(-22, -40));
		System.out.println(circuloComPontoERaio);

	}

}
