package entities;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	List<Carrinho> carrinho = new ArrayList<>();
	int contador = 0;

	private String nome;
	private String codigo;
	private double valor;
	private int quantidade;

	public Carrinho() {
		super();
	}

	public Carrinho(String nome, String codigo, double valor, int quantidade) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.valor = valor;
		this.quantidade = quantidade;
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

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void entraCarrinho(String nome, String codigo, double valor, int quantidade) {
		if (quantidade == 0) {
			System.out.println("QUANTIDADE NAO PODE SER 0!");
		} else {
			carrinho.add(new Carrinho(nome, codigo, valor, quantidade));

		}
	}

	public void mostraCarrinho() {
		System.out.println();
		System.out.println(" *** CARRINHO ***");
		System.out.println();
		if (carrinho.isEmpty()) {
			System.out.println("O CARRINHO ESTA VAZIO");
		} else {
			for (Carrinho x : carrinho) {
				System.out.printf("%d x %s - %.2f\n", x.getQuantidade(), x.getNome(), x.getValor()); 
			}
		}
	}
	
	public void mostraCarrinhoNF() {
		System.out.println();
		for (Carrinho x : carrinho) {
			System.out.printf("%d x %s - %.2f\n", x.getQuantidade(), x.getNome(), x.getValor()); 
		}
	}

	public void limparCarrinho() {
		carrinho.clear();
	}
}