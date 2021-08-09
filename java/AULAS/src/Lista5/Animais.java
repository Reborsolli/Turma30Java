package Lista5;

public class Animais {

	 private String nome;	
	 private int idade;
	 if(idade <= 0) {
		 System.out.println("Idade Invalida");
	 }
	 private boolean som; // SN
	

	 	public Animais(String nome, int idade, char som, String atividade) {

	 	this.nome = nome;
	 	this.idade = idade;
	 	this.som = som ;

	 	}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public char getSom() {
			return som;
		}

		public void setSom(char som) {
			this.som = som;
		
		
		}


		}

