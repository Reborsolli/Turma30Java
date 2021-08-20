package Lista4ex5;

public class Classe {

	
	/*5) Crie uma classe patinete e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto patinete, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/
	
	private String marca;
	private int cod ;
	private double valor ;
	
	public Classe(String marca, int cod, double valor) {
		super();
		this.marca = marca;
		this.cod = cod;
		this.valor = valor;
		
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
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
