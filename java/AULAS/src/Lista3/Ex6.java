package Lista3;
import java.util.Scanner;
public class Ex6 {
	
	public static void main (String [] args) {
		Scanner leia = new Scanner(System.in);
/*Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/		
		
		int num , multiplos3 , media , soma=0 , contador=0;
		
		do {
			System.out.println("Digite numero :");
		    num = leia.nextInt();
		    		
		    		
			if (num !=0 && num%3 ==0) {
				soma = soma + num;
				contador = contador +1;
		}}
		while(num != 0);
		
			if (num ==0 ) {
				media = soma / contador;
				
				System.out.println(" A media é : " + media);
			}
		
		}
	
	}
	
	
	