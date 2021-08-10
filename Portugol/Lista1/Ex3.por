programa
{
	
	funcao inicio()
	{
	/*Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/


	inteiro segundos, min , hr , seg

	escreva (" Total de segundos : ")
	leia (segundos)

	hr = segundos /3600
	min = segundos % 3600 / 60
	seg = segundos % 3600 % 60 

	escreva ("\n Horas" , hr)
	escreva(" \n Minutos" , min )
	escreva(" \n seg " , seg )

	}}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 440; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */