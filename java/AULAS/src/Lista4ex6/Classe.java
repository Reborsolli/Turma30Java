package Lista4ex6;

public class Classe {

	/*
	 * 6) Crie uma classe conta bancaria e apresente os atributos e métodos
	 * referentes esta classe, em seguida crie um objeto conta bancaria, defina as
	 * instancias deste objeto e apresente as informações deste objeto no console.
	 */
	private String tipo;
	private int conta;
	private String nomeCliente;

	public Classe(String tipo, int conta, String nomeCliente) {
		super();
		this.tipo = tipo;
		this.conta = conta;
		this.nomeCliente = nomeCliente;
		
		

	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}


}
