programa
{
	
	funcao inicio()
	{/*
	Um sistema de equações lineares do tipo:
 pode ser resolvido segundo mostrado abaixo :
     x  ce - bf /Ae -bd  

Y = af -cd
       Ae-bd*/
			real X , Y , A , B, C , D ,E , F 
	escreva ("Digite A :")
	leia (A) 
	escreva ("Digite B :")
	leia (B)
	escreva ("Digite C :")
	leia (C)
	escreva ("Digite D:")
	leia (D)
	escreva ("Digite E:")
	leia (E)	
	escreva ("Digite F:")
	leia (F)

	X= ((C * E) - (B*F)) / ((A * E ) - (B * D))
	Y = ((A *F) - ( C*D))  /((A *E ) - (B * D ))

		escreva (" O valor e X :" , X )
		escreva (" Ovalor de Y : " , Y)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 473; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */