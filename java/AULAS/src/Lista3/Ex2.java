package Lista3; 

	import java.util.Scanner;
		public class Ex2 {
	
			
			
			public static void main (String [] args) {
				Scanner leia = new Scanner(System.in); 
		

				int  par = 0 , impar = 0 , num  ; 

				for (int x = 1 ; x <= 10 ; x++ ) {
						System.out.print("Numero:");
						num = leia.nextInt();
						
						if (num% 2 ==0) {
							par++;	
						}
		
						else {
							impar++;
						}
				
					}
					System.out.print(" Numeros pares " + par );
					System.out.print(" Numeros Impares " + impar );
					
	}}