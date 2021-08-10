programa
{
	
	funcao inicio()
	{

	/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias*/
	
	inteiro anos, meses, dia, Diavivido,Tanos, Tmeses

		escreva ("Total de dias vivido")
		leia(Diavivido)

	Tanos= Diavivido/365
	Tmeses =Diavivido % 365/30
	dia = 365 % 30 % 30

	  /*anos = totalDias / 365
          meses = totalDias % 365 / 30 
          dias = totalDias % 365 % 30*/
	
	escreva ("Você tem  :" +  Tanos )
	escreva(" \nMeses:"  + Tmeses)
	escreva("\n Dias " + dia)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 321; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */