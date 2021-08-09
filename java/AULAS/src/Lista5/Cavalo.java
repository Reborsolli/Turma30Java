package Lista5;

public class Cavalo extends Animais{
	
	
	private boolean corre;
	public Cavalo(String nome, int idade, char som, String atividade, boolean corre) {
		super(nome, idade, som, atividade);
		this.corre = corre;
	}
	public Cavalo (String nome , int idade , boolean som , boolean corre ) {
		super (nome, idade , som );
		
	}
}
