package Lista5;

public class Animais {

	/*
	 * Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
	 * comportamentos (observe a tabela), utilize os seus conhecimentos e distribua
	 * as características de forma que tudo o que for comum a todos os animais fique
	 * na classe Animal:
	 */

	private String especie;
	private int anoNascimento;

	public Animais(String especie) {
		this.especie = especie;

	}

	public Animais(String especie, int anoNasciment) {
		super();
		this.especie = especie;
		this.anoNascimento = anoNasciment;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	
		
	}

}
