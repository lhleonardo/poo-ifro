package mensagem_encapsulamento;

public class Data {

	private int dia;
	private int mes;
	private int ano;
	private boolean dataValida = false;

	/**
	 * @author Leonardo Braz Verificador de datas simples implementado
	 *         diretamente no construtor. Caso os valores forem incompat�veis, �
	 *         lan�ada uma exce��o.
	 * @param dia
	 * @param mes
	 * @param ano
	 * @throws IllegalArgumentException
	 */

	public Data(int dia, int mes, int ano) throws IllegalArgumentException {
		if ((mes == 11) || (mes == 4) || (mes == 6) || (mes == 9)) {
			if (dia <= 30) {
				this.dia = dia;
				this.mes = mes;
				this.ano = ano;
				this.dataValida = true;
			} else {
				this.dataValida = false;
				throw new IllegalArgumentException(
						"A dia informado � incompat�vel com o m�s.\n" + dia
								+ '/' + mes + '/' + ano);
			}
		} else if ((mes == 1) || (mes == 3) || (mes == 5) || (mes == 12)
				|| (mes == 7) || (mes == 8) || (mes == 10)) {
			if (dia <= 31) {
				this.dia = dia;
				this.mes = mes;
				this.ano = ano;
				this.dataValida = true;
			} else {
				this.dataValida = false;
				throw new IllegalArgumentException(
						"A dia informado � incompat�vel com o m�s.\n" + dia
								+ '/' + mes + '/' + ano);
			}
		} else if (mes == 2) {
			if (ano % 4 == 0) {
				if (dia <= 29) {
					this.dia = dia;
					this.mes = mes;
					this.ano = ano;
					this.dataValida = true;
				} else {
					this.dataValida = false;
					throw new IllegalArgumentException(
							"A dia informado � incompat�vel com o m�s.\n" + dia
									+ '/' + mes + '/' + ano);
				}
			} else if (ano % 4 != 0) {
				if (dia <= 28) {
					this.dia = dia;
					this.mes = mes;
					this.ano = ano;
					this.dataValida = true;
				} else {
					this.dataValida = false;
					throw new IllegalArgumentException(
							"A dia informado � incompat�vel com o m�s.\n" + dia
									+ '/' + mes + '/' + ano);
				}
			}
		}
	}

	public int getDia() {
		return dia;
	}

	/**
	 * @author Leonardo Braz Se o dia est� entre 0 e 31, � considerado v�lido
	 * @param dia
	 */
	public void setDia(int dia) {
		if ((dia <= 31) && (dia > 0)) {
			this.dia = dia;
		}
	}

	public int getMes() {
		return mes;
	}

	/**
	 * @author Leonardo Braz Se o m�s est� entre 1 e 12, � considerado v�lido
	 * @param mes
	 */

	public void setMes(int mes) {
		if ((mes <= 12) && (mes > 0)) {
			this.mes = mes;
		}
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		if (ano > 0) {
			this.ano = ano;
		}
	}

	/**
	 * @author Leonardo Braz Caso o m�s informado seja 4,6,9 ou 11 e estiver no
	 *         dia 30, incrementa o m�s e define o dia como primeiro; Caso o m�s
	 *         informado seja 1,3,5,7,8 ou 10 e estiver no dia 31, incrementa o
	 *         m�s e define o dia como primeiro; Caso o m�s informado for
	 *         Dezembro e estiver no ultimo dia, define o dia e o m�s como 1 e
	 *         incrementa o ano
	 * 
	 *         Em todos os casos, aqueles que n�o estiverem no fim do m�s,
	 *         apenas incrementa o dia.
	 */

	public void avancarData() {
		if (this.dataValida == true) {
			if ((this.mes == 4) || (this.mes == 6) || (this.mes == 9)
					|| (this.mes == 11)) {
				if (this.dia == 30) {
					this.dia = 1;
					this.mes++;
				} else {
					this.dia++;
				}
			} else if ((this.mes == 1) || (this.mes == 3) || (this.mes == 5)
					|| (this.mes == 7) || (this.mes == 8) || (this.mes == 10)) {
				if (this.dia == 31) {
					this.dia = 1;
					this.mes++;
				} else {
					this.dia++;
				}
			} else if (this.mes == 2) {
				if (this.isAnoBissexto(ano) == true) {
					if (this.dia == 29) {
						this.dia = 1;
						this.mes++;
					} else {
						this.dia++;
					}
				} else {
					if (this.dia == 28) {
						this.dia = 1;
						this.mes++;
					} else {
						this.dia++;
						// this.mes ++;
					}
				}
			} else if (this.mes == 12) {
				if (this.dia == 31) {
					this.dia = 1;
					this.mes = 1;
					this.ano++;
				} else {
					this.dia++;
				}
			}
		} else {
			throw new IllegalArgumentException(
					"N�o � permitido avan�ar o dia com a data inv�lida");
		}
	}

	/**
	 * Retorna true se o ano for bissexto, caso contr�rio retorna false
	 * 
	 * @param ano
	 * @return true ou false
	 */

	public boolean isAnoBissexto(int ano) {
		if (ano % 4 == 0) {
			return true;
		} else if ((ano % 4 == 0) && (ano % 100 != 0)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @author Leonardo Braz Retorno da data formatada, realizando override do
	 *         m�todo toString();
	 */

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String dia, mes;

		if ((this.dia > 0) && (this.dia < 10)) {
			dia = '0' + String.valueOf(this.dia);
		} else {
			dia = String.valueOf(this.dia);
		}

		if ((this.mes > 0) && (this.mes < 10)) {
			mes = '0' + String.valueOf(this.mes);
		} else {
			mes = String.valueOf(this.mes);
		}

		return String.valueOf(dia) + '/' + String.valueOf(mes) + '/'
				+ String.valueOf(this.ano);
	}

}
