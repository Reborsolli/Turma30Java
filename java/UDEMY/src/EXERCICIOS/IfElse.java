package EXERCICIOS;

  import java.util.Scanner;

   public class IfElse {
	
	public static void main(String[] args) {
	
	 Scanner leia = new Scanner(System.in);
	
			System.out.println("Escreva o dia da semana :");
			String dia = leia.next();
				
			if ( "Domingo".equalsIgnoreCase(dia)) {
					System.out.print("Domingo é dia 1.");
				}
			else if  ("Segunda".equalsIgnoreCase(dia) ) {
			System.out.println( "Segunda é dia 2");
		}
			else if ( "Terça".equalsIgnoreCase(dia)  ) {
			System.out.println( "Terça  é dia 3");
		}
			else if ( "Quarta".equalsIgnoreCase(dia) ) {
			System.out.println( "Quarta  é dia 4");
		}
			else if ( "Quinta".equalsIgnoreCase(dia)  ) {
			System.out.println( "Quinta  é dia 5");
		}
			else if( "Sexta".equalsIgnoreCase(dia) ) {
			System.out.println(" Sexta  é dia 6");
		}
			else if  ("Sabado".equalsIgnoreCase(dia)  )  {
				System.out.println( "Sabado é dia 7");
		}
		}

}
