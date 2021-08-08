package EXERCICIOS;

import java.util.Scanner;

public class While {
	
	public static void main  (String[] args){
		
		Scanner leia = new Scanner (System.in);
		String fale ="";
		
		while (!fale.equalsIgnoreCase("parar") ) {

			System.out.println("Fale :");
			fale = leia.next();
		
	}

}}
