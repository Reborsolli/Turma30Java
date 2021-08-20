package Lista4ex6;

public class Contas {
	
	public static void main(String[] args) {
		
		
		Classe conta = new Classe("Corrente", 1010,"Maria Da Silva");
		
		
		System.out.println(conta.getTipo() + "\t" + conta.getNomeCliente() + "\t" +conta.getConta() );
	}

}
