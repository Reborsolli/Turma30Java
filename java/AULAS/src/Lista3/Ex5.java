package Lista3;
import java.util.Scanner;
public class Ex5 {
	
	public static void main (String [] args) {
		Scanner leia = new Scanner(System.in);
		
	/*Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)*/
		
		int num  , soma=0 ;
			
		
		do { 
			System.out.println("Digite um numero :");
			num = leia.nextInt();
			
			soma= soma + num ;
			
		}
		
		while (num != 0 );
	
		System.out.println(" A soma dos numeros digitos � :" + soma );
	
	}
	
}