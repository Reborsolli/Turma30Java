package lista4;

public class Cliente {

		//ATRIBUTOS
		public String nome;
		public int anoNascimento;
		public int telefone;
		public char status;
		
		//CONSTRUTORES
		
		//MÉTODOS
		public void mostrarNome()
		{
			System.out.println("O nome é: " + nome);
		}
		public void mostrarIdade()
		{
			System.out.println("A idade é: " + (2021 - anoNascimento));
		}
		public void mostrarTelefone()
		{
			System.out.println("O numero de telefone é: " + telefone);
		}
		public void mostrarStatus()
		{
			if (status == 'S')
			{
				System.out.println("Cliente " + nome +", está aprovade!");
			}
			else
			{
				System.out.println("Cliente " + nome +", está reprovade!");
			}
		}}
