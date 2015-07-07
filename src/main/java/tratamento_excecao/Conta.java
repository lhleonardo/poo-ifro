package tratamento_excecao;

public class Conta {
	private String nome;
	private String rg;
	private String cpf;
	private int idade;

	public Conta() {

	}

	public Conta(String nome, String rg, String cpf, int idade) throws WarningException, ErroException,
			InformationException {
		super();
		this.setNome(nome);
		this.setRg(rg);
		this.setIdade(idade);
		this.setCpf(cpf);
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws ErroException {
		if (nome != null) {
			this.nome = nome;
		} else
			throw new ErroException("Informação nula: Nome.");
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) throws WarningException {
		if (rg != null) {
			this.rg = rg;
		} else {
			throw new WarningException("Informação nula: RG.");
		}
	}

	public String getCpf() {
		return cpf;
	}

	private boolean fieldIsNull(Object o) {
		return o == null;
	}

	public void setCpf(String cpf) throws WarningException {
		if (cpf != null) {
			this.cpf = cpf;
		} else {
			throw new WarningException("Informação nula: CPF.");
		}
	}

	public void verificaSeOsCamposEstaoPreenchidos() throws InformationException {
		if (!(fieldIsNull(nome) && fieldIsNull(cpf) && fieldIsNull(rg) && fieldIsNull(idade))) {
			throw new InformationException("Todos os campos estão preenchidos!");
		} else {
			throw new InformationException("Alguns campos não foram preenchidos!");
		}
	}

	public static void main(String[] args) {
		Conta contaNula = null;
		Conta contaPreenchida = null;
		try {
			contaPreenchida = new Conta("Leonardo", "000", "000", 16);
			contaNula = new Conta();
			contaNula.setNome(contaPreenchida.getNome());
			contaNula.setCpf(contaPreenchida.getCpf());
		} catch (WarningException | ErroException | InformationException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			contaNula.verificaSeOsCamposEstaoPreenchidos();
			contaPreenchida.verificaSeOsCamposEstaoPreenchidos();
		} catch (InformationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
