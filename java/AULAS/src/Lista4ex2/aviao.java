package Lista4ex2;


public class aviao {

	public static void main(String[] args) 
	{
		// instancias
		Classe2 teste = new Classe2("zezinho", 28, 123);
		
		System.out.print(teste.getNome()+"\t"+ teste.getPontrona()+"\t"+ teste.getNumero());
		teste.setNome("Gol");
	}
}