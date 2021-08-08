package EXERCICIOS;

import java.util.Scanner;

public class dW {

	
	public static void main  (String[] args){
		
		Scanner leia = new Scanner (System.in);
		
		
		double nota=0 ,  total =0;
		int quantidadeNota=0;

		
		while(nota != -1){
			System.out.println("Notas :");
			nota= leia.nextDouble();
			
			if (nota <=10 && nota >=0){
			total += nota;
			quantidadeNota++;
		}
			}
	
		double  Media = total / quantidadeNota;
			System.out.println(" A media é  : " + Media );
			
			
			
			
	
	
}}
