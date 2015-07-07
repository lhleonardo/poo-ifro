package poo_juliano_3a;

import java.util.ArrayList;

public class UrnaEletronica {

	private int votoNulo = 0;
	private int votoBranco = 0;
	private boolean isApurado = false;
	//cria uma Lista de numeros inteiros, chamada de votos
	private ArrayList<Integer> votos = new ArrayList<>();
	
	public int getVotoNulo() {
		return votoNulo;
	}
	
	public void setVotoNulo() {
		if (isApurado != true){
			this.votoNulo ++;
		} else System.out.println("votação apurada");
	}
	
	public int getVotoBranco() {
		return votoBranco;
	}
	
	public void setVotoBranco() {
		if (isApurado != true){ 
			this.votoBranco ++;
		}else System.out.println("votação apurada");
	}
	
	public boolean isApurado() {
		return isApurado;
	}
	
	public void setApurado(boolean isApurado) {
		this.isApurado = isApurado;
	}
	
	public void votar(int candidato){
		if (isApurado != true){ 
			//adiciona o numero do candidato na lista, 
			//é a mesma coisa de votos[i]=candidato;
			votos.add(candidato);
		} else System.out.println("votação apurada"); 
	}
	
	public void getGanhador(){
		int numeroCandidato1 = 123, contCandidato1 = 0;
		int numeroCandidato2 = 234, contCandidato2 = 0;
		int numeroCandidato3 = 666, contCandidato3 = 0;
		
		/**
		 * para cada voto dentro da lista de votos, {
		 * 	  se o voto é equivalente ao candidato1, incrementa a contadora
		 * 	  ...		 
		 * }
		 * 
		 */
		for (Integer voto : votos) {
			if (voto == numeroCandidato1){
				contCandidato1 ++;
			} else if (voto == numeroCandidato2){
				contCandidato2++;
			} else if (voto == numeroCandidato3){
				contCandidato3++;
			}
		}
		
		//imprime o ganhador
		if ((contCandidato1 > contCandidato2) && (contCandidato1 > contCandidato3)){
			System.out.println("O candidato1 ganhou com "+contCandidato1+" votos.\nCandidato2 = "+contCandidato2
					+"\nCandidato3="+contCandidato3+"\nVotos em branco= "+votoBranco+"\nVotos nulos = "+votoNulo);
			
		} else if ((contCandidato2 > contCandidato1) && (contCandidato2 > contCandidato3)){
			System.out.println("O candidato2 ganhou com "+contCandidato2+" votos.\nCandidato1 = "+contCandidato1
					+"\nCandidato3="+contCandidato3+"\nVotos em branco= "+votoBranco+"\nVotos nulos = "+votoNulo);
			
		} else if ((contCandidato3 > contCandidato2) && (contCandidato3 > contCandidato1)){
			System.out.println("O candidato3 ganhou com "+contCandidato3+" votos.\nCandidato1 = "+contCandidato1
					+"\nCandidato2="+contCandidato2+"\nVotos em branco= "+votoBranco+"\nVotos nulos = "+votoNulo);
			
		}
		
		
		
		
	}
	
	
	
	
	

}
