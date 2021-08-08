package lista4;

import java.util.Scanner;

public class inicio {
			
	public static void main(String[] args) {
	/*Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/
	
		Scanner leia = new Scanner(System.in);

		Cliente cliente1 = new Cliente ();
		
		System.out.println("Nome:");
	    cliente1.nome = leia.next();
	    
	    System.out.println("codigo :");
	    cliente1.codigo= leia.nextInt();
	    
	    System.out.println("ano Nascimento:");
	    cliente1.anoNascimento = leia.nextInt();
	    
	    cliente1.idade(2021);
	    System.out.println("Nome:" + cliente1.nome + "/t Codigo:" + cliente1.codigo);
	    
	}
}
