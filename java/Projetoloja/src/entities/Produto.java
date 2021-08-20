package entities;

public class Produto {
	private String nome;
	private String codigo;
	private double valor;
	private int estoque;

	public Produto() {
		super();
	}

	public Produto(String nome, String codigo) {
		super();
		this.nome = nome;
		this.codigo = codigo;
	}

	public Produto(String nome, String codigo, double valor, int estoque) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.valor = valor;
		if (estoque < 0) {
			this.estoque = 0;
		} else {
			this.estoque = estoque;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getEstoque() {
		return estoque;
	}

	public void retiraEstoque(int decremento) {
		/*
		 * if (decremento > this.estoque) {
		 * System.out.println("QUANTIDADE INDISPONÍVEL"); } else { this.estoque =
		 * this.estoque - decremento; }
		 */
		this.estoque = this.estoque - decremento;
	}

	public void incluiEstoque(int incremento) {
		if (incremento <= 0) {
			System.out.println("QUANTIDADE INVÁLIDA");
		} else {
			this.estoque = this.estoque + incremento;
		}
	}
}