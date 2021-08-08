package Lista3;
import java.util.Scanner;
public class Ex3 {
	
	public static void main (String [] args) {
		
		int idade , menor21 = 0  , maior50 = 0; 
		
		Scanner leia = new Scanner(System.in); 
		System.out.println ("Digite sua idade ");
		idade = leia.nextInt();
				
				while (idade != -99) {
					if( idade <21) {
						menor21 ++;
					}
				 else if (idade >50 ) {
						maior50 ++;
						
					}
					System.out.println ("Digite sua idade ");
					idade = leia.nextInt();
				}
				
		System.out.println( "Quantidade de pessoas menor que 21: " + menor21  );
		System.out.println( "Quantidade de pessoas maior que 50: " + maior50 );
	}
}
