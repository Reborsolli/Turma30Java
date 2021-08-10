programa
{
	
	funcao inicio()
	{
		/*Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
respectivamente.*/ 

	real N1, N2 , N3 , Media ,TMedia, TN1 , TN2 ,TN3
	
	escreva (" N1 :")
	leia(N1)
	escreva (" N2 :")
	leia(N2)
	escreva (" N3 :")
	leia(N3)
	
	TN1 = N1 * 0.2
	TN2 = N2 * 0.3 
	TN3 = N3 * 0.5 
	Media = TN1 + TN2+ TN3
	
	escreva(" Media " , Media )
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 405; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */