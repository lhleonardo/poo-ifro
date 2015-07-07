package poo_juliano_3a;

public class Conta {
	private String nome;
	private String cpf;
	private double saldo;	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Conta(String nome, String cpf, double saldo) {
		this.nome = nome;
		this.cpf = cpf;
		this.saldo = saldo;
	}

	public void saca(double valor){
		if ((this.saldo > 0) && (this.saldo > valor) ){
			this.saldo -= valor;
		} else System.out.println("Falha ao realizar o saque.\nPossíveis causas: valor inválido ou saldo insuficiente.");
	}
	
	public void deposita(double valor){
		if (valor > 0) { 
			this.saldo += valor;
		} else System.out.println("Valores negativos não são permitidos para depósitos.");
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	public void imprimeSaldo(){
		System.out.println(this.getSaldo());
	}

}

