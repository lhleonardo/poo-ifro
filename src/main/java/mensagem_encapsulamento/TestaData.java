package mensagem_encapsulamento;

public class TestaData {

	public static void main(String[] args) {
		
		try{
			Data data = new Data(28, 02, 2015);
			System.out.println("Data atual: "+data.toString());
			data.avancarData();
			System.out.println("Data avan�ada: "+data.toString());
		} catch(IllegalArgumentException e ){
			System.out.println(e.getMessage());
		}
	}

}
