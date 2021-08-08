package lista4;

import java.util.Scanner;

public class inicio {
			
	public static void main(String[] args) {
	/*Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/
	
			//OBJETOS
			Cliente exemplo1 = new Cliente ();
			Scanner leia = new Scanner (System.in);
			
			//ENTRADAS
			exemplo1.nome = "Renata";
			exemplo1.anoNascimento = 1994;
			exemplo1.telefone = 9888888;
			
			//SAÍDAS
			exemplo1.mostrarNome();
			exemplo1.mostrarIdade();
			exemplo1.mostrarTelefone();
			
			//ENTRADAS E SAÍDAS
			System.out.println("O cliente está com debito? Digite 'S' para sim ou 'N' para não: ");
			exemplo1.status = leia.next().toUpperCase().charAt(0);
			exemplo1.mostrarStatus();
		}


}
