programa
{
	
	funcao inicio()
	{/* O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
consumidor.*/

real CarFab , CarNovo , Dist ,Imp 

		escreva (" Valor Custo de Fabrica")
		leia ( CarFab) 

		Dist = CarFab * 0.28 
		Imp = CarFab * 0.45

		CarNovo = CarFab + Dist + Imp 

		escreva (" Custo de Fabrica " , CarFab , "\n Distribuidor : " , Dist , "\n Impostos :" , Imp ," \nValor Total " , CarNovo )

		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 636; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */