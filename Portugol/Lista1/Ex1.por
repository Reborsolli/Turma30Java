programa
{
	
	funcao inicio()
	{
	/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.*/

inteiro dias, anos, meses , Tdias, Tanos , Tmeses 

	escreva("Digite dia de nacimento :")
	leia(dias)
	escreva(" Meses ")
	leia(meses)
	escreva ("Ano")
	leia (anos)

	Tanos = anos * 365
	Tmeses = meses * 30

	Tdias = Tanos + Tmeses + dias

	escreva (" O total de das vivido na Terra é " , Tdias)

	}
	

	
	
	



		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 363; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */