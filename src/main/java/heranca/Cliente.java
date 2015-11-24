package heranca;

public class Cliente extends Pessoa {
	
	private double creditoMaximo;
	private double valorEmDivida;
	
	public Cliente(String nome, String rg, String cpf, int idade, double creditoMaximo, double valorEmDivida) {
		
		super(nome, rg, cpf, idade);
		this.creditoMaximo = creditoMaximo;
		this.valorEmDivida = valorEmDivida;
		
	}
	
	public double getCreditoMaximo() {
		return this.creditoMaximo;
	}
	
	public void setCreditoMaximo(double creditoMaximo) {
		this.creditoMaximo = creditoMaximo;
	}
	
	public double getValorEmDivida() {
		return this.valorEmDivida;
	}
	
	public void setValorEmDivida(double valorEmDivida) {
		this.valorEmDivida = valorEmDivida;
	}
	
	public double obterSaldo() {
		return this.creditoMaximo - this.valorEmDivida;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome do empregado: " + this.getNome() + "\nCPF:" + this.getCpf() + "\nRG:" + this.getRg() + "\nIdade:" + this.getIdade()
		        + "\nCrédito máximo: " + this.getCreditoMaximo() + "\nValor em Dívida: " + this.getValorEmDivida() + "\nSaldo disponível: "
		        + this.obterSaldo();
	}
	
}
