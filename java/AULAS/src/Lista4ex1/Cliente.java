package lista4;

public class Cliente {

		//ATRIBUTOS
		public String nome;
		public int anoNascimento;
		public int telefone;
		public char status;
		
		//CONSTRUTORES
		
		//M�TODOS
		public void mostrarNome()
		{
			System.out.println("O nome �: " + nome);
		}
		public void mostrarIdade()
		{
			System.out.println("A idade �: " + (2021 - anoNascimento));
		}
		public void mostrarTelefone()
		{
			System.out.println("O numero de telefone �: " + telefone);
		}
		public void mostrarStatus()
		{
			if (status == 'S')
			{
				System.out.println("Cliente " + nome +", est� aprovade!");
			}
			else
			{
				System.out.println("Cliente " + nome +", est� reprovade!");
			}
		}}
