programa
{
	
	funcao inicio()
	{
/*Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
número é par ou ímpar, e se é positivo ou negativo.*/

		inteiro num

		escreva(" Digite um numero ")
		leia (num)

		se ( num == 0){
		escreva( num , " É neutro")

		}
		senao se(num%2 == 1 ){
			se (num < 0)  {
			escreva ( num , " E positivo e par " )}
			senao {
			escreva (num ,"É positivo e impar ")} 

}
	}}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 308; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */