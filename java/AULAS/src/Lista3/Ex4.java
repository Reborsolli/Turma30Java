package Lista3;
import java.util.Scanner;
public class Ex4 {
	
	public static void main (String [] args) {
		Scanner leia = new Scanner(System.in);

		int idade ;
		char sexo ;
		char opcoes  ; 
		int contadorPessoas = 0;
		final int limite_pessoas=2;
		char op ='S';
		int numeroPcalmas =0 ;
		int numeroMnervosa=0 ;
		int numeroHomensagressivo=0;
		int numeroPnervosa40=0;
		int numeroPcalma18=0 ;
		int numeroOutroscalmas=0;
		
		
		while(contadorPessoas <= limite_pessoas )
		{		
		System.out.print("Digite a idade");
		idade = leia.nextInt();
		System.out.print("Digite 1-feminino / 2-masculino / 3-Outros" );
		sexo  = leia.next().charAt(0);
		System.out.print ("1 calma; 2 nervosa e 3,agressiva");
		opcoes = leia.next().charAt(0);
		contadorPessoas++;
	
		
		if (opcoes =='1') {
			numeroPcalmas++ ;
		}
		if(sexo =='1' && opcoes == '2' ) {
			numeroMnervosa++;
		}
		if(sexo =='2' && opcoes == '3' ) {
			numeroHomensagressivo++;
		}	
		if( sexo =='3' && opcoes == '1' ) {
		  numeroOutroscalmas++;
		}
		 if (opcoes == '2' && idade >40 ) {
			  numeroPnervosa40++;
		  }
		 if( opcoes == '1' && idade <18 ) {
			 numeroPcalma18++;
		 }
		}
		System.out.println ("\nO número de pessoas calmas:" + numeroPcalmas);
		 System.out.println ("\nOnúmero de mulheres nervosas:" + numeroMnervosa) ;
		 System.out.println ("\nO número de homens agressivos:" +numeroHomensagressivo);
		 System.out.println("\nO numero número de outros calmos: " +   numeroOutroscalmas);
		 System.out.println("\nO número de pessoas nervosas com mais de 40 anos:" +   numeroPnervosa40);
		 System.out.println ("\nnúmero de pessoas calmas com menos de 18 anos:"  + numeroPcalma18);
		
		
		
		}}
		
	
		

		
		
		
		
		