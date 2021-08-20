package Lista4ex2;

import java.util.Scanner;

public class Classe2 {

	// ATRIBUTOS
	private String nome;
	private int pontrona;
	private int numero;
	
	//CONSTRUTORES
	public Classe2(String nome, int pontrona, int numero) {
		super();
		this.nome = nome;
		this.pontrona = pontrona;
		this.numero = numero;
		
	}
	//GET PEGAR - SER MODIFICAR
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPontrona() {
		return pontrona;
	}

	public void setPontrona(int pontrona) {
		this.pontrona = pontrona;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
// CONSTRUTORES
