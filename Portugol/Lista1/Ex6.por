programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
	/*6. Construa um programa em c que, tendo como dados de entrada dois pontos
quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula
que efetua tal cálculo é: 

*/
 real x1 , x2 , y1 , y2 , D , X , Y 

	escreva("X1")
	leia (x1)
	escreva("X2")
	leia (x2)
	escreva("Y1")
	leia (y1)
	escreva("Y2")
	leia (y2)
/*p1 = mat.potencia((x1 - x2), 2)*/
	X =( x1 - x2 ) *  ( x1 - x2 )
	Y =( y1 - y2 ) * ( y1 - y2 )
	/*mat.raiz((p1 + p2), 2)*/
	D = mat.raiz (( X +Y), 2)
	escreva ("Resultado" , D)
	}}
	

	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 557; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */