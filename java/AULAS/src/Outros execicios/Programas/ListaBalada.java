package Programas ;



public class ListaBalada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Pessoa primeiroFila = new Pessoa ();
		
		primeiroFila.nome = "Paulo";
		primeiroFila.anoNascimento = 2000;
		
		System.out.println("nome :" + primeiroFila.nome);
		System.out.println("idade:" + (2021 -primeiroFila.anoNascimento));
		System.out.println(primeiroFila.nome + " Idade :" + primeiroFila.calIdade(2021));
	}

}
