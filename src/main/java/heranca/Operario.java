package heranca;

public class Operario extends Empregado {
	private double valorProducao;
	private double comissao;

	public Operario(String nome, String cpf, String rg, String ctps,
			int horasTrabalhadas, double salarioPorHora, double valorProducao,
			double comissao) {
		super(nome, cpf, rg, ctps, horasTrabalhadas, salarioPorHora);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	@Override
	protected double calculaSalario() {
		// TODO Auto-generated method stub
		return super.calculaSalario() + (valorProducao * (comissao / 100));
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome do empregado: " + this.getNome() + "\nCPF:"
				+ this.getCpf() + "\nRG:" + this.getRg() + "\nCTPS:"
				+ this.getCtps() + "\nHoras Trabalhadas: "
				+ this.getHorasTrabalhadas() + "\nSal�rio por hora:"
				+ this.getSalarioPorHora() + "\nValor de produ��o: "
				+ this.getValorProducao() + "\nComiss�o:" + this.getComissao();
	}

}
