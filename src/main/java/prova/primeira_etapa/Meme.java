package prova.primeira_etapa;

import java.util.Date;

public class Meme {

	private String nome;
	private Date dataSurgimento;
	private String localSurgimento;
	private String descricao;
	private String tipoDeMidia;

	public Meme(String nome, Date dataSurgimento, String localSurgimento,
			String descricao, String tipoDeMidia) {
		super();
		this.nome = nome;
		this.dataSurgimento = dataSurgimento;
		this.localSurgimento = localSurgimento;
		this.descricao = descricao;
		this.tipoDeMidia = tipoDeMidia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataSurgimento() {
		return dataSurgimento;
	}

	public void setDataSurgimento(Date dataSurgimento) {
		this.dataSurgimento = dataSurgimento;
	}

	public String getLocalSurgimento() {
		return localSurgimento;
	}

	public void setLocalSurgimento(String localSurgimento) {
		this.localSurgimento = localSurgimento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTipoDeMidia() {
		return tipoDeMidia;
	}

	public void setTipoDeMidia(String tipoDeMidia) {
		this.tipoDeMidia = tipoDeMidia;
	}

	private int compareTo(Meme compare) {
		// se a data (this) for maior que a data recebida (compare) retorna 1
		// se a data (this) for menor que a data recebida (compare) retorna -1
		// se a data (this) for igual a data recebida, retorna 0
		if (this.getDataSurgimento().after(compare.getDataSurgimento())) {
			// futuro
			return 1;
		} else if (this.getDataSurgimento().before(compare.getDataSurgimento())) {
			// passado
			return -1;
		} else {
			// hoje
			return 0;
		}

	}

	public String mostraResultado(Meme m2) {
		// TODO Auto-generated method stub
		switch (this.compareTo(m2)) {
		case 1:
			return "Sim";
		case -1:
			return "Não";
		case 0: 
			return "A mesma data";
		default:
			return "";
		}
	}
	
}
