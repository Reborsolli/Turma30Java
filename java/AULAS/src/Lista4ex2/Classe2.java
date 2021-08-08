package Lista4ex2;

import java.util.Scanner;

public class Classe2 {
	public class Aviao {
	
	}

	{
		//OBJETOS
		Scanner leia = new Scanner (System.in);
		
		//ATRIBUTOS
		public String nome;
		public String cor;
		public int numCadeiras;
		public int numFuncionarios;
		public char op;
		public int velocidade = 0;
		
		//CONSTRUTORES
		
		//MÉTODOS
		public void mostrarNome()
		{
			System.out.println("O nome da aeronave é: " + nome);
		}
		public void mostrarCor()
		{
			System.out.println("A cor da aeronave é: " + cor);
		}
		public void mostrarQuantasCadeiras()
		{
			System.out.println("A aeronave tem " + numCadeiras + " cadeiras");
		}
		public void mostrarQuantosFuncionarios()
		{
			System.out.println("A aeronave tem " + numFuncionarios + " funcionários");
		}
		
		public void ligar()
		{	
			System.out.print("\nPara ligar a aeronave digite '1': ");
			op = leia.next().charAt(0);
			if (op == '1')
			{
				System.out.print("Motor ligado!\n");
			}
			else
			{
				System.out.print("Opção inválida!");
			}
		}
		
		public void aumentarVelo()
		{	
			do
			{	
				System.out.print("\nPara aumentar a velocidade digite '1': ");
				op = leia.next().charAt(0);
				if (op == '1') 
				{
					velocidade = velocidade + 50;
					System.out.printf("Aumentando velocidade em 50km, totalizando %dkm!", velocidade);
				}
				else
				{
					System.out.print("Opção inválida");
				}
				
				if (velocidade < 100)
				{	
					System.out.print("\n\nDeseja continuar aumentando a velocidade? para sim digite '1' para não digite '2': ");
					op = leia.next().charAt(0);
				}	
			}
			while (op == '1' && velocidade < 100);
		}
		
		public void decolar()
		{
			System.out.print("\nPara decolar digite '1': ");
			op = leia.next().charAt(0);
			
			if (op == '1') 
			{
				System.out.printf("A aeronave está decolando!");
			}
		}
		
	}
}
