package EXERCICIOS;

import java.util.Scanner;

public class DoWhile {

	
	public static void main  (String[] args){
		
		Scanner leia = new Scanner (System.in);
		
		
		double notas=0 ,  Totalnotas =0;
		int quantidadeNota=0;

		
		while(notas != -1){
			System.out.println("Notas :");
			notas= leia.nextDouble();
			
			if (notas <=10 && notas >=0){
			Totalnotas += notas;
			quantidadeNota++;
		}
	
		double  Media =Totalnotas / quantidadeNota;
			System.out.println(" A media é  : " + Media );}
			
			
			
			
	
	
}}

