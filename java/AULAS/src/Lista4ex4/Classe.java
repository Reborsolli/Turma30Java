package Lista4ex4;

public class Classe {

	/*4) Crie uma classe funcion�rio e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto funcion�rio, defina as
instancias deste objeto e apresente as informa��es deste objeto no
console.*/
	
	private String nome;
	private int matricula;
	private String cargo ;
	
	public Classe(String nome, int matricula, String cargo) {qe4
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.cargo = cargo;
		
		
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
}
