package Programa;

import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
		
		Scanner leia =new Scanner (System.in);
			int dias, meses , anos , totalDias;
		
		System.out.println("Dias:");
		dias =leia.nextInt();
		System.out.println("Meses:");
		meses = leia.nextInt();
		System.out.println("Anos:");
		anos = leia.nextInt();
		
		
		totalDias = (anos * 360) + (meses * 30 ) + dias;
		
		System.out.println("Total dias :" + totalDias);
				
				
		
				
	}

}
