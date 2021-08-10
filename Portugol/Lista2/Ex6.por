programa
{
	
	funcao inicio()
	{
		/*Elabore um sistema que dada a idade de um nadador classifique-o 
		 * em uma das seguintes categorias:
Infantil A = 5 a 7 anos
Infantil B = 8 a 11 anos
Juvenil A = 12 a 13 anos
Juvenil B = 14 a 17 anos
Adultos = Maiores de 18 anos*/
		inteiro InfA , InfB ,  JuvA , JuvB , Adu , Id = 0

		escreva (" Idade :")
		leia (Id)

		se (Id <= 7){
		escreva (" Infantil A")
		}
		senao se (Id <=11)
		escreva (" Infantil B")
		senao se (Id <=13)
		escreva (" Juvenil A")
		senao se (Id <=17)
		escreva (" Juvenil B")
		senao se (Id >=18)
		escreva (" Adultos ")

		
		
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 371; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */