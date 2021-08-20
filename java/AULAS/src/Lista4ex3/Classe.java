package Lista4ex3;

public class Classe {
	


	private String  produto;
	private int cod;
	private double valor;

	public Classe(String produto, int cod, double valor) {
		super();
		this.produto = produto;
		this.cod = cod;
		this.valor = valor;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	

	
	
}
